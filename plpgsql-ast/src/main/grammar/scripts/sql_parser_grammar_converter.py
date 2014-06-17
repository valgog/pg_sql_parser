#!/usr/bin/env python
# -*- coding: utf-8 -*-
from __future__ import print_function
from parser_grammar_converter import convert
import sys

def main(input_file):
   print('grammar Sql;')
   print('import SqlKeyWords;\n')
   convert(input_file)

if __name__ == '__main__':
    sys.exit(main(sys.argv[1]))

