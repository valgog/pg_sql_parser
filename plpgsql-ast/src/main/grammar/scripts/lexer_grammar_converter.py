from __future__ import print_function
import re
import sys
import cStringIO



def convert_escapes(rule_def):

  if rule_def.startswith('[') or rule_def.endswith(']'):
     return rule_def

  matches =  re.findall('\\\\\W', rule_def)

  if matches:
    output = rule_def
    for match in matches:
      substitute = match.replace('\\', '')
      output     = output.replace(match, '\'' + substitute + '\' ')

    return output
  else:
    return rule_def



def convert_strings(rule_def):
  matches = re.findall('\".*?\"', rule_def)

  if matches:
    output = rule_def
    for match in matches:
      substitute = match.replace('"', '\'')
      output     = output.replace(match, substitute)

    return output
  else:
    return rule_def


def convert_yacc_rule_def(rule_def):
    converted = convert_yacc_rule_specifications(rule_def)
    converted = convert_strings(converted)
    converted = convert_escapes(converted)

    return converted

def convert_yacc_rule_specifications(rule_def):
  matches = re.findall('{.*?}[+*?]?', rule_def)

  if matches:
    output = rule_def
    for match in matches:
       substitute = match.replace('{', ' ')
       substitute = substitute.replace('}+', ' ')
       substitute = substitute.replace('}*', ' ')
       substitute = substitute.replace('}?', ' ')
       substitute = substitute.replace('}' , ' ')
       substitute = substitute.upper()
       output     = output.replace(match, substitute)

    return output
  else:
    return rule_def


def parse_scan_l_file(input_file_content):
  output       = ''
  isInRuleZone = False

  pattern_yacc_rule = re.compile('([a-z_]+)\\s+(.*)')

  buffer = cStringIO.StringIO(input_file_content)
  for line in buffer:
    if line.startswith('%}'):
      isInRuleZone = True
    elif line.startswith('%%'):
      return output
    elif isInRuleZone:
        m = pattern_yacc_rule.match(line)
        if m:
           output = output + m.group(1).upper() + ' : ' +  convert_yacc_rule_def(m.group(2)) + ';\n'


def toRule(val):
    # ok for now but we could generate an alphabet later on.
    # see http://stackoverflow.com/questions/228730/how-do-i-iterate-through-the-alphabet-in-python
  v = ''
  for c in val:
     v =  v + '[' + c.lower() + c.upper() + ']'
  return v


def convert_postgres_keywords(input_file_content):
  p = re.compile( '.*PG_KEYWORD.*\\"([a-zA-Z\\_]+)\\"\\s*,\\s*([a-zA-Z\\_]+).*')

  output = ''
  buffer = cStringIO.StringIO(input_file_content)
  for line in buffer:
    m = p.match(line)
    if(m):
      output = output + '//' + line
      output = output + m.group(2) + ' : ' + toRule(m.group(1)) + ';\n\n'

  return output


def main(input_file):
  f = open(input_file, 'r')
  input_file_content = f.read()
  converted_content  = convert_postgres_keywords(input_file_content)

  # TODO switch for scan.l file
  converted_content = parse_scan_l_file(input_file_content)

  converted_content = """
lexer grammar SqlKeyWords;

import PgSqlLexer;

NULLS_FIRST : NULLS_P T_whitespace+ FIRST_P ;
NULLS_LAST  : NULLS_P T_whitespace+ LAST_P ;
WITH_TIME : WITH T_whitespace+ TIME;
""" + converted_content;

  print(converted_content)

  return 0


if __name__ == '__main__':
    sys.exit(main(sys.argv[1]))






