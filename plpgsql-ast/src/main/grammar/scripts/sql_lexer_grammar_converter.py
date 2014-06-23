#!/usr/bin/python
# -*- coding: utf-8 -*-

from __future__ import print_function
from lexer_grammar_converter import convert
import sys


def main(input_file):

    header = \
        """
lexer grammar SqlKeyWords;

import PgSqlLexer;

NULLS_FIRST : NULLS_P T_whitespace+ FIRST_P ;
NULLS_LAST  : NULLS_P T_whitespace+ LAST_P ;
WITH_TIME : WITH T_whitespace+ TIME;
"""

    print(header)
    convert(input_file)

    return 0


if __name__ == '__main__':
    sys.exit(main(sys.argv[1]))

