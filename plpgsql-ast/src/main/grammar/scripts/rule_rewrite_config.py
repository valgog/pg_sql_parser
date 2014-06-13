#!/usr/bin/env python
# -*- coding: utf-8 -*-

'''
Rule rewrite definitions to resolve problems regarding Mutual Left Recursion.
TODO: automate these resolutions.
'''  # mapping: rule_name => replacement

rule_replacement_map = dict()

# ============= table_ref =============

rule_replacement_map['table_ref'] = \
    """table_ref : joined_table
 \
           | table_ref2
 \
           ;

 \
table_ref2:    relation_expr
 \
      | relation_expr alias_clause
 \
      | func_table
 \
      | func_table alias_clause
 \
      | func_table AS '(' tableFuncElementList ')'
 \
      | func_table AS colId '(' tableFuncElementList ')'
 \
      | func_table colId '(' tableFuncElementList ')'
 \
      | select_with_parens
 \
      | select_with_parens alias_clause
 \
    ;

"""

# ============= joined_table =============

rule_replacement_map['joined_table'] = \
    """joined_table:
 \
       '(' joined_table ')' alias_clause?
 \
        | table_ref2 CROSS JOIN table_ref
 \
        | table_ref2 join_type JOIN table_ref join_qual
 \
        | table_ref2 JOIN table_ref join_qual
 \
        | table_ref2 NATURAL join_type JOIN table_ref
 \
        | table_ref2 NATURAL JOIN table_ref
 \
        | joined_table CROSS JOIN table_ref
 \
        | joined_table join_type JOIN table_ref join_qual
 \
        | joined_table JOIN table_ref join_qual
 \
        | joined_table NATURAL join_type JOIN table_ref
 \
        | joined_table NATURAL JOIN table_ref
 \
    ;

"""

# ============ simple_select ================

rule_replacement_map['simple_select'] = \
    """simple_select:
 \
      SELECT opt_distinct target_list
 \
      into_clause from_clause where_clause
 \
      group_clause having_clause window_clause
 \
      | values_clause
 \
      | TABLE relation_expr
 \
      | simple_select      UNION     opt_all  select_clause
 \
      | simple_select      INTERSECT opt_all  select_clause
 \
      | simple_select      EXCEPT    opt_all  select_clause
 \
    ;

"""

# ============= select_with_parens ==========
rule_replacement_map['select_with_parens'] = \
    """select_with_parens:
 \
      '(' select_no_parens ')'
 \
      | '(' select_with_parens ')'
 \
      | select_with_parens UNION opt_all     select_clause
 \
      | select_with_parens INTERSECT opt_all select_clause
 \
      | select_with_parens EXCEPT opt_all    select_clause
 \
    ;

"""
