#!/usr/bin/env python
# -*- coding: utf-8 -*-
import collections
import operator
import re


def sort_by_precedence(grammar):
    # grammar = read_grammar()
    _, declarations, grammar, _ = split_grammar_file(grammar)
    precedence_by_token, associativity_by_token = parse_associativity_declatations(declarations)
    grammar = remove_comments(grammar)
    productions = find_productions(grammar)

    # for p in productions:
    #     print p

    productions_by_left_side = collections.defaultdict(list)
    for p in productions:
        productions_by_left_side[p.left].append(p)

    set_precedence(productions, precedence_by_token)

    output = ''
    for p in productions:
        pl = productions_by_left_side.pop(p.left, ())
        if pl:
            pl.sort(key=operator.attrgetter('precedence'), reverse=True)
            output = output + '''{}:        {}
    ;

'''.format(p.left, '\n    |   '.join(' '.join(pp.right) for pp in
                    pl))

    return output


def set_precedence(productions, precedence_by_token):
    for p in productions:
        if p.prec:
            p.precedence = precedence_by_token.get(p.prec, -1),
        else:
            p.precedence = tuple(precedence_by_token.get(t, -1) for t in p.right if is_terminal(t))


def is_terminal(token):
    return token[0] in '\'"' or not token.isupper()


def split_grammar_file(grammar):
    return PATTERN_YACC_FILE.search(grammar).group('c_declarations', 'yacc_declarations', 'grammar', 'more_c_code')


def parse_associativity_declatations(declarations):
    precedence_by_token = {}
    associativity_by_token = {}
    for precedence, (associativity, tokens) in enumerate(PATTERN_ASSOCIATIVITY_DECLARATION.findall(declarations)):
        for token in PATTERN_TOKEN.findall(remove_comments(tokens)):
            precedence_by_token[token] = precedence
            associativity_by_token[token] = associativity
    return precedence_by_token, associativity_by_token


def find_productions(grammar):
    grammar = remove_c_in_curly_braces(remove_comments(grammar))
    productions = []

    for left, right in PATTERN_PRODUCTION.findall(grammar):
        for alternative in PATTERN_ALTERNATIVE.findall(right + ';'):
            tokens, prec = PATTERN_TOKEN_LIST.search(alternative).groups()
            productions.append(YaccProduction(left, PATTERN_TOKEN.findall(tokens or ''), prec))

        assert PATTERN_ALTERNATIVE.sub('', right + ';').strip() == ''

    assert PATTERN_PRODUCTION.sub('', grammar).strip() == ''

    return productions


def remove_comments(snippet):
    return PATTERN_BLOCK_COMMENT.sub('', snippet)


def remove_c_in_curly_braces(snippet):
    before = ''
    after = snippet
    while before != after:
        before = after
        after = PATTERN_C_IN_CURLY_BRACES.sub('', before)
    return after


# def read_grammar():
#    with open('gram.y') as grammar_file:
#        return grammar_file.read()

class YaccProduction(object):

    def __init__(self, left, right, prec=None):
        self.left = left
        self.right = right
        self.prec = prec
        self.precedence = ()

    def __str__(self):
        return '{left}: {right}'.format(left=self.left, right=self.right)


### PATTERN FRAGMENTS ###

FRAGMENT_STRING_LITERAL = \
    r'''
    "
    (?:
        \\.                             # a backslash followed by any character ...
    |
        [^\\\"]                         # ... or anything other than a backslash or a double-quote
    )*
    "
'''

FRAGMENT_CHAR_LITERAL = \
    r'''
    '
    (?:
        \\.                             # a backslash followed by any character ...
    |
        [^\\\']                         # ... or anything other than a backslash or a single quote
    )
    '
'''

FRAGMENT_IDENTIFIER = r'''
    [a-zA-Z_]
    [a-zA-Z_0-9]*
'''

FRAGMENT_TOKEN = \
    r'''
    (?:
        {string_literal}
    |
        {char_literal}
    |
        {identifier}
    )
'''.format(string_literal=FRAGMENT_STRING_LITERAL,
        char_literal=FRAGMENT_CHAR_LITERAL, identifier=FRAGMENT_IDENTIFIER)

FRAGMENT_TOKEN_LIST = \
    r'''
    (?:
        {token}
        (?:
            \s+
            {token}
        )*
    )?
    (?:
        \s+
        \%prec
        \s+
        {identifier}
    )?
'''.format(token=FRAGMENT_TOKEN,
        identifier=FRAGMENT_IDENTIFIER)

### PATTERNS ###

PATTERN_YACC_FILE = \
    re.compile(r'''
    (?xms)
    \A
    \s*                                 # allow some whitespace

    # C declarations (optional)
    (?:
        ^\%\{                           # "%{" at the start of a line starts C declarations
        (?P<c_declarations>
            (?:
                .                       # allow everything ...
                (?!^\%\})               # ... except "%}" at the start of a line
            )*
        )
        \n\%\}                          # "%}" at the start of a line ends the C declarations
    )?

    # Yacc declarations
    (?P<yacc_declarations>
        (?:
            .                           # allow everything ...
            (?!^\%\%)                   # ... except "%%" at the start of a line
        )*
    )

    \n\%\%                              # "%%" at the start of a line starts the grammar

    # Grammar
    (?P<grammar>
        (?:
            .                           # allow everything ...
            (?!^\%\%)                   # ... except "%%" at the start of a line
        )*
    )

    \n\%\%                              # "%%" at the start of a line ends the grammar

    # More C code
    (?P<more_c_code>
        .*                              # allow everything
    )

    \Z
'''
               )

PATTERN_ASSOCIATIVITY_DECLARATION = \
    re.compile(r'''
    (?xm)
    ^
    \%
    (?P<associativity>
        left|right|noassoc
    )
    \s+
    (?P<tokens>
        {token_list}
    )
    $
'''.format(token_list=FRAGMENT_TOKEN_LIST))

PATTERN_TOKEN = re.compile(r'''
    (?x)
    {token}
'''.format(token=FRAGMENT_TOKEN))

PATTERN_BLOCK_COMMENT = re.compile(r'''
    (?xs)
    \/\*
    (?:
        (?!\*\/)
        .
    )*
    \*\/
''')

PATTERN_C_IN_CURLY_BRACES = \
    re.compile(r'''
    (?x)
    \{
        (?:
            [^\'\"\{\}]                 # nothing that starts a char or string literal, and no nested curly braces
        |                               # (just delete stuff matching this pattern until nothing matches it anymore)
            %(string_literal)s
        |
            %(char_literal)s
        )*
    \}
'''
                % {'string_literal': FRAGMENT_STRING_LITERAL, 'char_literal': FRAGMENT_CHAR_LITERAL})

PATTERN_PRODUCTION = \
    re.compile(r'''
    (?xm)
    ^
    (?P<left>
        {identifier}
    )
    \s*
    \:
    \s*
    (?P<right>
        {token_list}
        (?:
            \s*
            \|
            \s*
            {token_list}
        )*
    )
    \s*
    (?:
        \;
    |
        (?=^{identifier}\:)             # WORKAROUND: The PostgreSQL grammar is missing a semicolon at the end of
    |                                   # the production generic_set. Assume that productions when a new production
        \Z                              # could start, or at the end of the grammar block.
    )
'''.format(identifier=FRAGMENT_IDENTIFIER,
               token_list=FRAGMENT_TOKEN_LIST))

PATTERN_ALTERNATIVE = \
    re.compile(r'''
    (?x)
    {token_list}
    \s*
    (?:
        \|
    |
        \;
    )
'''.format(token_list=FRAGMENT_TOKEN_LIST))

PATTERN_TOKEN_LIST = \
    re.compile(r'''
    (?x)
    \s*
    (?P<tokens>
        {token}
        (?:
            \s+
            {token}
        )*
    )?
    (?P<prec>
        \s+
        \%prec
        \s+
        {identifier}
    )?
    \s*
'''.format(token=FRAGMENT_TOKEN,
               identifier=FRAGMENT_IDENTIFIER))

### MAIN ENTRYPOINT ###

# if __name__ == '__main__':
#    main()

