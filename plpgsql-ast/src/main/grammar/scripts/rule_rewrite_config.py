'''
Rule rewrite definitions to resolve problems regarding Mutual Left Recursion.
TODO: automate these resolutions.
'''

rule_replacement_map = dict() # mapping: rule_name => replacement

# ============= table_ref =============


rule_replacement_map['table_ref']  = "table_ref : joined_table\n \
           | table_ref2\n \
           ;\n\n \
table_ref2:	relation_expr\n \
      | relation_expr alias_clause\n \
      | func_table\n \
      | func_table alias_clause\n \
      | func_table AS '(' tableFuncElementList ')'\n \
      | func_table AS colId '(' tableFuncElementList ')'\n \
      | func_table colId '(' tableFuncElementList ')'\n \
      | select_with_parens\n \
      | select_with_parens alias_clause\n \
    ;\n\n"

# ============= joined_table =============

rule_replacement_map['joined_table'] = "joined_table:\n \
       '(' joined_table ')' alias_clause?\n \
        | table_ref2 CROSS JOIN table_ref\n \
        | table_ref2 join_type JOIN table_ref join_qual\n \
        | table_ref2 JOIN table_ref join_qual\n \
        | table_ref2 NATURAL join_type JOIN table_ref\n \
        | table_ref2 NATURAL JOIN table_ref\n \
        | joined_table CROSS JOIN table_ref\n \
        | joined_table join_type JOIN table_ref join_qual\n \
        | joined_table JOIN table_ref join_qual\n \
        | joined_table NATURAL join_type JOIN table_ref\n \
        | joined_table NATURAL JOIN table_ref\n \
    ;\n\n"

# ============ simple_select ================

rule_replacement_map['simple_select'] = "simple_select:\n \
      SELECT opt_distinct target_list\n \
      into_clause from_clause where_clause\n \
      group_clause having_clause window_clause\n \
      | values_clause\n \
      | TABLE relation_expr\n \
      | simple_select      UNION     opt_all  select_clause\n \
      | simple_select      INTERSECT opt_all  select_clause\n \
      | simple_select      EXCEPT    opt_all  select_clause\n \
    ;\n\n"


# ============= select_with_parens ==========
rule_replacement_map['select_with_parens'] = "select_with_parens:\n \
      '(' select_no_parens ')'\n \
      | '(' select_with_parens ')'\n \
      | select_with_parens UNION opt_all     select_clause\n \
      | select_with_parens INTERSECT opt_all select_clause\n \
      | select_with_parens EXCEPT opt_all    select_clause\n \
    ;\n\n"
