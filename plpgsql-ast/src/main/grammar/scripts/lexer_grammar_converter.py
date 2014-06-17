#!/usr/bin/env python
# -*- coding: utf-8 -*-
from __future__ import print_function
import re
import sys
import cStringIO


def toRule(val):
    # ok for now but we could generate an alphabet later on.
    # see http://stackoverflow.com/questions/228730/how-do-i-iterate-through-the-alphabet-in-python
    v = ''
    for c in val:
        v = v + '[' + c.lower() + c.upper() + ']'
    return v


def convert_postgres_keywords(input_file_content):
    p = re.compile('.*PG_KEYWORD.*\\"([a-zA-Z\\_]+)\\"\\s*,\\s*([a-zA-Z\\_]+).*')

    output = ''
    rule_to_def_map = dict()
    
    # collect all rules first to handle rule collisions 
    # -> such a case is resolved with one rule consisting of multiple alternatives
    buffer = cStringIO.StringIO(input_file_content)
    for line in buffer:
        m = p.match(line)
        if m:
            # also print out the original data (we might need it later on)
            output = output + '//' + line
            
            rule = m.group(2)
            if(rule in rule_to_def_map):
               value_list = rule_to_def_map[rule]
               value_list.append(toRule(m.group(1)))
            else:
               value_list = list()
               value_list.append(toRule(m.group(1)))
               rule_to_def_map[rule] = value_list

    # put out collected rule data
    keys = rule_to_def_map.keys()
    
    for key in keys:
       output = output + key + ' : ' + ' | '.join(rule_to_def_map[key]) + ';\n'
    
    return output


def convert(input_file):
    f = open(input_file, 'r')
    input_file_content = f.read()
    converted_content = convert_postgres_keywords(input_file_content)

    print(converted_content)

    return 0
