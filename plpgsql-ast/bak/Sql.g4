grammar Sql;

import SqlKeyWords;

/*
 *	The target production for the whole parse.
 */
stmtblock:	stmtmulti
    ;

/* the thrashing around here is to discard "empty" statements... */
stmtmulti:	stmtmulti ';' stmt
      | stmt
    ;

stmt :
      alterDatabaseStmt
      | alterDatabaseSetStmt
      | alterDefaultPrivilegesStmt
      | alterDomainStmt
      | alterEnumStmt
      | alterExtensionStmt
      | alterExtensionContentsStmt
      | alterFdwStmt
      | alterForeignServerStmt
      | alterForeignTableStmt
      | alterFunctionStmt
      | alterGroupStmt
      | alterObjectSchemaStmt
      | alterOwnerStmt
      | alterSeqStmt
      | alterTableStmt
      | alterCompositeTypeStmt
      | alterRoleSetStmt
      | alterRoleStmt
      | alterTSConfigurationStmt
      | alterTSDictionaryStmt
      | alterUserMappingStmt
      | alterUserSetStmt
      | alterUserStmt
      | analyzeStmt
      | checkPointStmt
      | closePortalStmt
      | clusterStmt
      | commentStmt
      | constraintsSetStmt
      | copyStmt
      | createAsStmt
      | createAssertStmt
      | createCastStmt
      | createConversionStmt
      | createDomainStmt
      | createExtensionStmt
      | createFdwStmt
      | createForeignServerStmt
      | createForeignTableStmt
      | createFunctionStmt
      | createGroupStmt
      | createOpClassStmt
      | createOpFamilyStmt
      | alterOpFamilyStmt
      | createPLangStmt
      | createSchemaStmt
      | createSeqStmt
      | createStmt
      | createTableSpaceStmt
      | createTrigStmt
      | createRoleStmt
      | createUserStmt
      | createUserMappingStmt
      | createdbStmt
      | deallocateStmt
      | declareCursorStmt
      | defineStmt
      | deleteStmt
      | discardStmt
      | doStmt
      | dropAssertStmt
      | dropCastStmt
      | dropFdwStmt
      | dropForeignServerStmt
      | dropGroupStmt
      | dropOpClassStmt
      | dropOpFamilyStmt
      | dropOwnedStmt
      | dropPLangStmt
      | dropruleStmt
      | dropStmt
      | dropTableSpaceStmt
      | dropTrigStmt
      | dropRoleStmt
      | dropUserStmt
      | dropUserMappingStmt
      | dropdbStmt
      | executeStmt
      | explainStmt
      | fetchStmt
      | grantStmt
      | grantRoleStmt
      | indexStmt
      | insertStmt
      | listenStmt
      | loadStmt
      | lockStmt
      | notifyStmt
      | prepareStmt
      | reassignOwnedStmt
      | reindexStmt
      | removeAggrStmt
      | removeFuncStmt
      | removeOperStmt
      | renameStmt
      | revokeStmt
      | revokeRoleStmt
      | ruleStmt
      | secLabelStmt
      | selectStmt
      | transactionStmt
      | truncateStmt
      | unlistenStmt
      | updateStmt
      | vacuumStmt
      | variableResetStmt
      | variableSetStmt
      | variableShowStmt
      | viewStmt
      | /*EMPTY*/
    ;

/*****************************************************************************
 *
 * create a new Postgres DBMS role
 *
 *****************************************************************************/

createRoleStmt:
      CREATE ROLE roleId opt_with optRoleList
    ;

opt_with:	WITH
    | /*EMPTY*/
    ;



/*
 * Options for CREATE ROLE and ALTER ROLE (also used by CREATE/ALTER USER
 * for backwards compatibility).  Note: the only option required by SQL99
 * is "WITH ADMIN name".
 */
optRoleList:
      optRoleList createOptRoleElem
      | /* EMPTY */
    ;

alteroptRoleList:
      alteroptRoleList alterOptRoleElem
      | /* EMPTY */
    ;

alterOptRoleElem:
      PASSWORD sConst
      | PASSWORD NULL_P
      | ENCRYPTED PASSWORD sConst
      | UNENCRYPTED PASSWORD sConst
      | INHERIT
      | CONNECTION LIMIT signedIconst
      | VALID UNTIL sConst
      | USER name_list
      | IDENT
      ;


createOptRoleElem: alterOptRoleElem
      | SYSID iConst
      | ADMIN name_list
      | ROLE name_list
      | IN_P ROLE name_list
      | IN_P GROUP_P name_list
    ;


/*****************************************************************************
 *
 * create a new Postgres DBMS user (role with implied login ability)
 *
 *****************************************************************************/

createUserStmt:
      CREATE USER roleId WITH? optRoleList

    ;


/*****************************************************************************
 *
 * alter a postgresql DBMS role
 *
 *****************************************************************************/

alterRoleStmt:
      ALTER ROLE roleId WITH? alteroptRoleList

    ;

opt_in_database:
         /* EMPTY */
      | IN_P DATABASE database_name
    ;

alterRoleSetStmt:
      ALTER ROLE roleId opt_in_database setResetClause

    ;


/*****************************************************************************
 *
 * alter a postgresql DBMS user
 *
 *****************************************************************************/

alterUserStmt:
      ALTER USER roleId WITH? alteroptRoleList

    ;


alterUserSetStmt:
      ALTER USER roleId setResetClause

      ;


/*****************************************************************************
 *
 * drop a postgresql DBMS role
 *
 * XXX Ideally this would have CASCADE/RESTRICT options, but since a role
 * might own objects in multiple databases, there is presently no way to
 * implement either cascading or restricting.  Caveat DBA.
 *****************************************************************************/

dropRoleStmt:
      DROP ROLE name_list

      | DROP ROLE IF_P EXISTS name_list

      ;

/*****************************************************************************
 *
 * drop a postgresql DBMS user
 *
 * XXX Ideally this would have CASCADE/RESTRICT options, but since a user
 * might own objects in multiple databases, there is presently no way to
 * implement either cascading or restricting.  Caveat DBA.
 *****************************************************************************/

dropUserStmt:
      DROP USER name_list

      | DROP USER IF_P EXISTS name_list

      ;


/*****************************************************************************
 *
 * create a postgresql group (role without login ability)
 *
 *****************************************************************************/

createGroupStmt:
      CREATE GROUP_P roleId WITH? optRoleList
    ;


/*****************************************************************************
 *
 * alter a postgresql group
 *
 *****************************************************************************/

alterGroupStmt:
      ALTER GROUP_P roleId add_drop USER name_list
    ;

add_drop:	ADD_P
      | DROP
    ;


/*****************************************************************************
 *
 * drop a postgresql group
 *
 * XXX see above notes about cascading DROP USER; groups have same problem.
 *****************************************************************************/

dropGroupStmt:
      DROP GROUP_P name_list
      | DROP GROUP_P IF_P EXISTS name_list
    ;


/*****************************************************************************
 *
 * Manipulate a schema
 *
 *****************************************************************************/

createSchemaStmt:
      CREATE SCHEMA optSchemaName AUTHORIZATION roleId optSchemaEltList
      | CREATE SCHEMA colId optSchemaEltList
    ;

optSchemaName:
      colId
      | /* EMPTY */
    ;

optSchemaEltList:
      optSchemaEltList schema_stmt
      | /* EMPTY */
    ;

/*
 *	schema_stmt are the ones that can show up inside a CREATE SCHEMA
 *	statement (in addition to by themselves).
 */
schema_stmt:
      createStmt
      | indexStmt
      | createSeqStmt
      | createTrigStmt
      | grantStmt
      | viewStmt
    ;


/*****************************************************************************
 *
 * Set PG internal variable
 *	  SET name TO 'var_value'
 * Include SQL92 syntax (thomas 1997-10-22):
 *	  SET TIME ZONE 'var_value'
 *
 *****************************************************************************/

variableSetStmt:
      SET set_rest
      | SET LOCAL set_rest
      | SET SESSION set_rest
    ;

set_rest:
      TRANSACTION transaction_mode_list
      | SESSION CHARACTERISTICS AS TRANSACTION transaction_mode_list
      | set_rest_more
      ;

set_rest_more:	/* Generic SET syntaxes: */
      var_name TO var_list
      | var_name '=' var_list
      | var_name TO DEFAULT
      | var_name '=' DEFAULT
      | var_name FROM CURRENT_P
      /* Special syntaxes mandated by SQL standard: */
      | TIME ZONE zone_value
      | CATALOG_P sConst
      | SCHEMA sConst
      | NAMES opt_encoding
      | ROLE colId_or_Sconst
      | SESSION AUTHORIZATION colId_or_Sconst
      | SESSION AUTHORIZATION DEFAULT
      | XML_P OPTION document_or_content
      /* Special syntaxes invented by PostgreSQL: */
      | TRANSACTION SNAPSHOT sConst
    ;

var_name:	colId
      | var_name '.' colId
    ;

var_list:	var_value
      | var_list ',' var_value
    ;

var_value:	opt_boolean_or_string
      | numericOnly
    ;

iso_level:	READ UNCOMMITTED
      | READ COMMITTED
      | REPEATABLE READ
      | SERIALIZABLE
    ;

opt_boolean_or_string:
      TRUE_P
      | FALSE_P
      | ON
      /*
       * OFF is also accepted as a boolean value, but is handled
       * by the colId rule below. The action for booleans and strings
       * is the same, so we don't need to distinguish them here.
       */
      | colId_or_Sconst
    ;

/* Timezone values can be:
 * - a string such as 'pst8pdt'
 * - an identifier such as "pst8pdt"
 * - an integer or floating point number
 * - a time interval per SQL99
 * colId gives reduce/reduce errors against constInterval and LOCAL,
 * so use IDENT (meaning we reject anything that is a key word).
 */
zone_value:
      sConst
      | IDENT
      | constInterval sConst opt_interval
      | constInterval '(' iConst ')' sConst opt_interval
      | numericOnly
      | DEFAULT
      | LOCAL
    ;

opt_encoding:
      sConst
      | DEFAULT
      | /*EMPTY*/
    ;

colId_or_Sconst:
      colId
      | sConst
    ;

variableResetStmt:
      RESET var_name
      | RESET TIME ZONE
      | RESET TRANSACTION ISOLATION LEVEL
      | RESET SESSION AUTHORIZATION
      | RESET ALL
    ;

/* setResetClause allows SET or RESET without LOCAL */
setResetClause:
      SET set_rest
      | variableResetStmt
    ;

/* setResetClause allows SET or RESET without LOCAL */
functionsetResetClause:
      SET set_rest_more
      | variableResetStmt
    ;


variableShowStmt:
      SHOW var_name
      | SHOW TIME ZONE
      | SHOW TRANSACTION ISOLATION LEVEL
      | SHOW SESSION AUTHORIZATION
      | SHOW ALL
    ;


constraintsSetStmt:
      SET CONSTRAINTS constraints_set_list constraints_set_mode
    ;

constraints_set_list:
      ALL
      | qualified_name_list
    ;

constraints_set_mode:
      DEFERRED
      | IMMEDIATE
    ;


/*
 * Checkpoint statement
 */
checkPointStmt:
      CHECKPOINT
    ;


/*****************************************************************************
 *
 * DISCARD
 *
 *****************************************************************************/

discardStmt:
      DISCARD ALL
      | DISCARD TEMP
      | DISCARD TEMPORARY
      | DISCARD PLANS
    ;


/*****************************************************************************
 *
 *	ALTER [ TABLE | INDEX | SEQUENCE | VIEW ] variations
 *
 * Note: we accept all subcommands for each of the four variants, and sort
 * out what's really legal at execution time.
 *****************************************************************************/

alterTableStmt:
      ALTER TABLE relation_expr alter_table_cmds
    |	ALTER TABLE IF_P EXISTS relation_expr alter_table_cmds
    |	ALTER INDEX qualified_name alter_table_cmds
    |	ALTER INDEX IF_P EXISTS qualified_name alter_table_cmds
    |	ALTER SEQUENCE qualified_name alter_table_cmds
    |	ALTER SEQUENCE IF_P EXISTS qualified_name alter_table_cmds
    |	ALTER VIEW qualified_name alter_table_cmds
    |	ALTER VIEW IF_P EXISTS qualified_name alter_table_cmds
    ;

alter_table_cmds:
      alter_table_cmd
      | alter_table_cmds ',' alter_table_cmd
    ;

alter_table_cmd:
      /* ALTER TABLE <name> ADD <coldef> */
      ADD_P columnDef
      /* ALTER TABLE <name> ADD COLUMN <coldef> */
      | ADD_P COLUMN columnDef
      /* ALTER TABLE <name> ALTER [COLUMN] <colname>  */
      | ALTER opt_column colId alter_column_default
      /* ALTER TABLE <name> ALTER [COLUMN] <colname> DROP NOT NULL */
      | ALTER opt_column colId DROP NOT NULL_P
      /* ALTER TABLE <name> ALTER [COLUMN] <colname> SET NOT NULL */
      | ALTER opt_column colId SET NOT NULL_P
      /* ALTER TABLE <name> ALTER [COLUMN] <colname> SET STATISTICS <signedIconst> */
      | ALTER opt_column colId SET STATISTICS signedIconst
      /* ALTER TABLE <name> ALTER [COLUMN] <colname> SET ( column_parameter = value [, ... ] ) */
      | ALTER opt_column colId SET reloptions
      /* ALTER TABLE <name> ALTER [COLUMN] <colname> SET ( column_parameter = value [, ... ] ) */
      | ALTER opt_column colId RESET reloptions
      /* ALTER TABLE <name> ALTER [COLUMN] <colname> SET STORAGE <storagemode> */
      | ALTER opt_column colId SET STORAGE colId
      /* ALTER TABLE <name> DROP [COLUMN] IF EXISTS <colname> [RESTRICT|CASCADE] */
      | DROP opt_column IF_P EXISTS colId opt_drop_behavior
      /* ALTER TABLE <name> DROP [COLUMN] <colname> [RESTRICT|CASCADE] */
      | DROP opt_column colId opt_drop_behavior
      /*
       * ALTER TABLE <name> ALTER [COLUMN] <colname> [SET DATA] TYPE <typename>
       *		[ USING <expression> ]
       */
      | ALTER opt_column colId opt_set_data TYPE_P typename opt_collate_clause alter_using
      /* ALTER FOREIGN TABLE <name> ALTER [COLUMN] <colname> OPTIONS */
      | ALTER opt_column colId alter_generic_options
      /* ALTER TABLE <name> ADD CONSTRAINT ... */
      | ADD_P tableConstraint
      /* ALTER TABLE <name> VALIDATE CONSTRAINT ... */
      | VALIDATE CONSTRAINT name
      /* ALTER TABLE <name> DROP CONSTRAINT IF EXISTS <name> [RESTRICT|CASCADE] */
      | DROP CONSTRAINT IF_P EXISTS name opt_drop_behavior
      /* ALTER TABLE <name> DROP CONSTRAINT <name> [RESTRICT|CASCADE] */
      | DROP CONSTRAINT name opt_drop_behavior
      /* ALTER TABLE <name> SET WITH OIDS  */
      | SET WITH OIDS
      /* ALTER TABLE <name> SET WITHOUT OIDS  */
      | SET WITHOUT OIDS
      /* ALTER TABLE <name> CLUSTER ON <indexname> */
      | CLUSTER ON name
      /* ALTER TABLE <name> SET WITHOUT CLUSTER */
      | SET WITHOUT CLUSTER
      /* ALTER TABLE <name> ENABLE TRIGGER <trig> */
      | ENABLE_P TRIGGER name
      /* ALTER TABLE <name> ENABLE ALWAYS TRIGGER <trig> */
      | ENABLE_P ALWAYS TRIGGER name
      /* ALTER TABLE <name> ENABLE REPLICA TRIGGER <trig> */
      | ENABLE_P REPLICA TRIGGER name
      /* ALTER TABLE <name> ENABLE TRIGGER ALL */
      | ENABLE_P TRIGGER ALL
      /* ALTER TABLE <name> ENABLE TRIGGER USER */
      | ENABLE_P TRIGGER USER
      /* ALTER TABLE <name> DISABLE TRIGGER <trig> */
      | DISABLE_P TRIGGER name
      /* ALTER TABLE <name> DISABLE TRIGGER ALL */
      | DISABLE_P TRIGGER ALL
      /* ALTER TABLE <name> DISABLE TRIGGER USER */
      | DISABLE_P TRIGGER USER
      /* ALTER TABLE <name> ENABLE RULE <rule> */
      | ENABLE_P RULE name
      /* ALTER TABLE <name> ENABLE ALWAYS RULE <rule> */
      | ENABLE_P ALWAYS RULE name
      /* ALTER TABLE <name> ENABLE REPLICA RULE <rule> */
      | ENABLE_P REPLICA RULE name
      /* ALTER TABLE <name> DISABLE RULE <rule> */
      | DISABLE_P RULE name
      /* ALTER TABLE <name> INHERIT <parent> */
      | INHERIT qualified_name
      /* ALTER TABLE <name> NO INHERIT <parent> */
      | NO INHERIT qualified_name
      /* ALTER TABLE <name> OF <type_name> */
      | OF any_name
      /* ALTER TABLE <name> NOT OF */
      | NOT OF
      /* ALTER TABLE <name> OWNER TO roleId */
      | OWNER TO roleId
      /* ALTER TABLE <name> SET TABLESPACE <tablespacename> */
      | SET TABLESPACE name
      /* ALTER TABLE <name> SET (...) */
      | SET reloptions
      /* ALTER TABLE <name> RESET (...) */
      | RESET reloptions
      | alter_generic_options
    ;

alter_column_default:
      SET DEFAULT a_expr
      | DROP DEFAULT
    ;

opt_drop_behavior:
      CASCADE
      | RESTRICT
      | /* EMPTY */
    ;

opt_collate_clause:
      COLLATE any_name
      | /* EMPTY */
    ;

alter_using:
      USING a_expr
      | /* EMPTY */
    ;

reloptions:
      '(' reloption_list ')'
    ;

opt_reloptions:		WITH reloptions
       |		/* EMPTY */
    ;

reloption_list:
      reloption_elem
      | reloption_list ',' reloption_elem
    ;

/* This should match def_elem and also allow qualified names */
reloption_elem:
      colLabel '=' def_arg
      | colLabel
      | colLabel '.' colLabel '=' def_arg
      | colLabel '.' colLabel
    ;


/*****************************************************************************
 *
 *	ALTER TYPE
 *
 * really variants of the ALTER TABLE subcommands with different spellings
 *****************************************************************************/

alterCompositeTypeStmt:
      ALTER TYPE_P any_name alter_type_cmds
      ;

alter_type_cmds:
      alter_type_cmd
      | alter_type_cmds ',' alter_type_cmd
    ;

alter_type_cmd:
      /* ALTER TYPE <name> ADD ATTRIBUTE <coldef> [RESTRICT|CASCADE] */
      ADD_P ATTRIBUTE tableFuncElement opt_drop_behavior
      /* ALTER TYPE <name> DROP ATTRIBUTE IF EXISTS <attname> [RESTRICT|CASCADE] */
      | DROP ATTRIBUTE IF_P EXISTS colId opt_drop_behavior
      /* ALTER TYPE <name> DROP ATTRIBUTE <attname> [RESTRICT|CASCADE] */
      | DROP ATTRIBUTE  colId opt_drop_behavior
      /* ALTER TYPE <name> ALTER ATTRIBUTE <attname> [SET DATA] TYPE <typename> [RESTRICT|CASCADE] */
      | ALTER ATTRIBUTE colId opt_set_data TYPE_P typename opt_collate_clause opt_drop_behavior
    ;


/*****************************************************************************
 *
 *		QUERY :
 *				close <portalname>
 *
 *****************************************************************************/

closePortalStmt:
      CLOSE cursor_name
      | CLOSE ALL
    ;


/*****************************************************************************
 *
 *		QUERY :
 *				COPY relname [(columnList)] FROM/TO file [WITH] [(options)]
 *				COPY ( SELECT ... ) TO file [WITH] [(options)]
 *
 *				In the preferred syntax the options are comma-separated
 *				and use generic identifiers instead of keywords.  The pre-9.0
 *				syntax had a hard-wired, space-separated set of options.
 *
 *				Really old syntax, from versions 7.2 and prior:
 *				COPY [ BINARY ] table [ WITH OIDS ] FROM/TO file
 *					[ [ USING ] DELIMITERS 'delimiter' ] ]
 *					[ WITH NULL AS 'null string' ]
 *				This option placement is not supported with COPY (SELECT...).
 *
 *****************************************************************************/

copyStmt:	COPY opt_binary qualified_name opt_column_list opt_oids
      copy_from copy_file_name copy_delimiter WITH? copy_options
      | COPY select_with_parens TO copy_file_name WITH? copy_options
    ;

copy_from:
      FROM
      | TO
    ;

/*
 * copy_file_name NULL indicates stdio is used. Whether stdin or stdout is
 * used depends on the direction. (It really doesn't make sense to copy from
 * stdout. We silently correct the "typo".)		 - AY 9/94
 */
copy_file_name:
      sConst
      | STDIN
      | STDOUT
    ;

copy_options: copy_opt_list
      | '(' copy_generic_opt_list ')'
    ;

/* old COPY option syntax */
copy_opt_list:
      copy_opt_list copy_opt_item
      | /* EMPTY */
    ;

copy_opt_item:
      BINARY
      | OIDS
      | DELIMITER opt_as sConst
      | NULL_P opt_as sConst
      | CSV
      | HEADER_P
      | QUOTE opt_as sConst
      | ESCAPE opt_as sConst
      | FORCE QUOTE columnList
      | FORCE QUOTE '*'
      | FORCE NOT NULL_P columnList
      | ENCODING sConst
    ;

/* The following exist for backward compatibility with very old versions */

opt_binary:
      BINARY
      | /*EMPTY*/
    ;

opt_oids:
      WITH OIDS
      | /*EMPTY*/
    ;

copy_delimiter:
      opt_using DELIMITERS sConst
      | /*EMPTY*/
    ;

opt_using:
      USING
      | /*EMPTY*/
    ;

/* new COPY option syntax */
copy_generic_opt_list:
      copy_generic_opt_elem
      | copy_generic_opt_list ',' copy_generic_opt_elem
    ;

copy_generic_opt_elem:
      colLabel copy_generic_opt_arg
    ;

copy_generic_opt_arg:
      opt_boolean_or_string
      | numericOnly
      | '*'
      | '(' copy_generic_opt_arg_list ')'
      | /* EMPTY */
    ;

copy_generic_opt_arg_list:
        copy_generic_opt_arg_list_item
      | copy_generic_opt_arg_list ',' copy_generic_opt_arg_list_item
    ;

/* beware of emitting non-string list elements here; see commands/define.c */
copy_generic_opt_arg_list_item:
      opt_boolean_or_string
    ;


/*****************************************************************************
 *
 *		QUERY :
 *				CREATE TABLE relname
 *
 *****************************************************************************/

createStmt:	CREATE optTemp TABLE qualified_name '(' opttableElementList ')'
      optInherit optWith onCommitOption optTableSpace
    | CREATE optTemp TABLE IF_P NOT EXISTS qualified_name '('
      opttableElementList ')' optInherit optWith onCommitOption
      optTableSpace
    | CREATE optTemp TABLE qualified_name OF any_name
      opttypedtableElementList optWith onCommitOption optTableSpace
    | CREATE optTemp TABLE IF_P NOT EXISTS qualified_name OF any_name
      opttypedtableElementList optWith onCommitOption optTableSpace
    ;

/*
 * Redundancy here is needed to avoid shift/reduce conflicts,
 * since TEMP is not a reserved word.  See also optTempTableName.
 *
 * NOTE: we accept both GLOBAL and LOCAL options.  They currently do nothing,
 * but future versions might consider GLOBAL to request SQL-spec-compliant
 * temp table behavior, so warn about that.  Since we have no modules the
 * LOCAL keyword is really meaningless; furthermore, some other products
 * implement LOCAL as meaning the same as our default temp table behavior,
 * so we'll probably continue to treat LOCAL as a noise word.
 */
optTemp:	TEMPORARY
      | TEMP
      | LOCAL TEMPORARY
      | LOCAL TEMP
      | GLOBAL TEMPORARY
      | GLOBAL TEMP
      | UNLOGGED
      | /*EMPTY*/
    ;

opttableElementList:
      tableElementList
      | /*EMPTY*/
    ;

opttypedtableElementList:
      '(' typedtableElementList ')'
      | /*EMPTY*/
    ;

tableElementList:
      tableElement
      | tableElementList ',' tableElement
    ;

typedtableElementList:
      typedtableElement
      | typedtableElementList ',' typedtableElement
    ;

tableElement:
      columnDef
      | tableLikeClause
      | tableConstraint
    ;

typedtableElement:
      columnOptions
      | tableConstraint
    ;

columnDef:	colId typename create_generic_options colQualList
    ;

columnOptions:	colId WITH OPTIONS colQualList
    ;

colQualList:
      colQualList colConstraint
      | /*EMPTY*/
    ;

colConstraint:
      CONSTRAINT name colconstraintElem
      | colconstraintElem
      | constraintAttr
      | COLLATE any_name
    ;

/* DEFAULT NULL is already the default for Postgres.
 * But define it here and carry it forward into the system
 * to make it explicit.
 * - thomas 1998-09-13
 *
 * WITH NULL and NULL are not SQL92-standard syntax elements,
 * so leave them out. Use DEFAULT NULL to explicitly indicate
 * that a column may have that value. WITH NULL leads to
 * shift/reduce conflicts with WITH TIME ZONE anyway.
 * - thomas 1999-01-08
 *
 * DEFAULT expression must be b_expr not a_expr to prevent shift/reduce
 * conflict on NOT (since NOT might start a subsequent NOT NULL constraint,
 * or be part of a_expr NOT LIKE or similar constructs).
 */
colconstraintElem:
      NOT NULL_P
      | NULL_P
      | UNIQUE opt_definition optConsTableSpace
      | PRIMARY KEY opt_definition optConsTableSpace
      | CHECK '(' a_expr ')' opt_no_inherit
      | DEFAULT b_expr
      | REFERENCES qualified_name opt_column_list key_match key_actions
    ;

/*
 * constraintAttr represents constraint attributes, which we parse as if
 * they were independent constraint clauses, in order to avoid shift/reduce
 * conflicts (since NOT might start either an independent NOT NULL clause
 * or an attribute).  parse_utilcmd.c is responsible for attaching the
 * attribute information to the preceding "real" constraint node, and for
 * complaining if attribute clauses appear in the wrong place or wrong
 * combinations.
 *
 * See also constraintAttributeSpec, which can be used in places where
 * there is no parsing conflict.  (Note: currently, NOT VALID and NO INHERIT
 * are allowed clauses in constraintAttributeSpec, but not here.  Someday we
 * might need to allow them here too, but for the moment it doesn't seem
 * useful in the statements that use constraintAttr.)
 */
constraintAttr:
      DEFERRABLE
      | NOT DEFERRABLE
      | INITIALLY DEFERRED
      | INITIALLY IMMEDIATE
    ;


tableLikeClause:
      LIKE qualified_name tableLikeOptionList
    ;

tableLikeOptionList:
        tableLikeOptionList INCLUDING tableLikeOption
        | tableLikeOptionList EXCLUDING tableLikeOption
        | /* EMPTY */
    ;

tableLikeOption:
        DEFAULTS
        | CONSTRAINTS
        | INDEXES
        | STORAGE
        | COMMENTS
        | ALL
    ;


/* constraintElem specifies constraint syntax which is not embedded into
 *	a column definition. colconstraintElem specifies the embedded form.
 * - thomas 1997-12-03
 */
tableConstraint:
      CONSTRAINT name constraintElem
      | constraintElem
    ;

constraintElem:
      CHECK '(' a_expr ')' constraintAttributeSpec
      | UNIQUE '(' columnList ')' opt_definition optConsTableSpace
        constraintAttributeSpec
      | UNIQUE existingIndex constraintAttributeSpec
      | PRIMARY KEY '(' columnList ')' opt_definition optConsTableSpace
        constraintAttributeSpec
      | PRIMARY KEY existingIndex constraintAttributeSpec
      | EXCLUDE access_method_clause '(' exclusionConstraintList ')'
        opt_definition optConsTableSpace exclusionWhereClause
        constraintAttributeSpec
      | FOREIGN KEY '(' columnList ')' REFERENCES qualified_name
        opt_column_list key_match key_actions constraintAttributeSpec
    ;

opt_no_inherit:	NO INHERIT
      | /* EMPTY */
    ;

opt_column_list:
      '(' columnList ')'
      | /*EMPTY*/
    ;

columnList:
      columnElem
      | columnList ',' columnElem
    ;

columnElem: colId
    ;

key_match:  MATCH FULL
    | MATCH PARTIAL
    | MATCH SIMPLE
    | /*EMPTY*/
    ;

exclusionConstraintList:
      exclusionconstraintElem
      | exclusionConstraintList ',' exclusionconstraintElem
    ;

exclusionconstraintElem: index_elem WITH any_operator
      /* allow OPERATOR() decoration for the benefit of ruleutils.c */
      | index_elem WITH OPERATOR '(' any_operator ')'
    ;

exclusionWhereClause:
      WHERE '(' a_expr ')'
      | /*EMPTY*/
    ;

/*
 * We combine the update and delete actions into one value temporarily
 * for simplicity of parsing, and then break them down again in the
 * calling production.  update is in the left 8 bits, delete in the right.
 * Note that NOACTION is the default.
 */
key_actions:
      key_update
      | key_delete
      | key_update key_delete
      | key_delete key_update
      | /*EMPTY*/
    ;

key_update: ON UPDATE key_action
    ;

key_delete: ON DELETE_P key_action
    ;

key_action:
      NO ACTION
      | RESTRICT
      | CASCADE
      | SET NULL_P
      | SET DEFAULT
    ;

optInherit: INHERITS '(' qualified_name_list ')'
      | /*EMPTY*/
    ;

/* WITH (options) is preferred, WITH OIDS and WITHOUT OIDS are legacy forms */
optWith:
      WITH reloptions
      | WITH OIDS
      | WITHOUT OIDS
      | /*EMPTY*/
    ;

onCommitOption:  ON COMMIT DROP
      | ON COMMIT DELETE_P ROWS
      | ON COMMIT PRESERVE ROWS
      | /*EMPTY*/
    ;

optTableSpace:   TABLESPACE name
      | /*EMPTY*/
    ;

optConsTableSpace:   USING INDEX TABLESPACE name
      | /*EMPTY*/
    ;

existingIndex:   USING INDEX index_name
    ;


/*****************************************************************************
 *
 *		QUERY :
 *				CREATE TABLE relname AS selectStmt [ WITH [NO] DATA ]
 *
 *
 * Note: SELECT ... INTO is a now-deprecated alternative for this.
 *
 *****************************************************************************/

createAsStmt:
    CREATE optTemp TABLE create_as_target AS selectStmt opt_with_data
    ;

create_as_target:
      qualified_name opt_column_list optWith onCommitOption optTableSpace
    ;

opt_with_data:
      WITH DATA_P
      | WITH NO DATA_P
      | /*EMPTY*/
    ;


/*****************************************************************************
 *
 *		QUERY :
 *				CREATE SEQUENCE seqname
 *				ALTER SEQUENCE seqname
 *
 *****************************************************************************/

createSeqStmt:
      CREATE optTemp SEQUENCE qualified_name optseqOptList
    ;

alterSeqStmt:
      ALTER SEQUENCE qualified_name seqOptList
      | ALTER SEQUENCE IF_P EXISTS qualified_name seqOptList
    ;

optseqOptList: seqOptList
      | /*EMPTY*/
    ;

seqOptList: seqOptElem
      | seqOptList seqOptElem
    ;

seqOptElem: CACHE numericOnly
      | CYCLE
      | NO CYCLE
      | INCREMENT opt_by numericOnly
      | MAXVALUE numericOnly
      | MINVALUE numericOnly
      | NO MAXVALUE
      | NO MINVALUE
      | OWNED BY any_name
      | START WITH? numericOnly
      | RESTART
      | RESTART WITH? numericOnly
    ;

opt_by:		BY
      | /* empty */
    ;

numericOnly:
      FCONST
      | '-' FCONST
      | signedIconst
    ;

numericOnly_list:	numericOnly
        | numericOnly_list ',' numericOnly
    ;

/*****************************************************************************
 *
 *		QUERIES :
 *				CREATE [OR REPLACE] [TRUSTED] [PROCEDURAL] LANGUAGE ...
 *				DROP [PROCEDURAL] LANGUAGE ...
 *
 *****************************************************************************/

createPLangStmt:
      CREATE opt_or_replace opt_trusted opt_procedural LANGUAGE colId_or_Sconst
      | CREATE opt_or_replace opt_trusted opt_procedural LANGUAGE colId_or_Sconst
        HANDLER handler_name opt_inline_handler opt_validator
    ;

opt_trusted:
      TRUSTED
      | /*EMPTY*/
    ;

/* This ought to be just func_name, but that causes reduce/reduce conflicts
 * (CREATE LANGUAGE is the only place where func_name isn't followed by '(').
 * Work around by using simple names, instead.
 */
handler_name:
      name
      | name attrs
    ;

opt_inline_handler:
      INLINE_P handler_name
      | /*EMPTY*/
    ;

validator_clause:
      VALIDATOR handler_name
      | NO VALIDATOR
    ;

opt_validator:
      validator_clause
      | /*EMPTY*/
    ;

dropPLangStmt:
      DROP opt_procedural LANGUAGE colId_or_Sconst opt_drop_behavior
      | DROP opt_procedural LANGUAGE IF_P EXISTS colId_or_Sconst opt_drop_behavior
    ;

opt_procedural:
      PROCEDURAL
      | /*EMPTY*/
    ;

/*****************************************************************************
 *
 *		QUERY:
 *             CREATE TABLESPACE tablespace LOCATION '/path/to/tablespace/'
 *
 *****************************************************************************/

createTableSpaceStmt: CREATE TABLESPACE name optTableSpaceOwner LOCATION sConst
    ;

optTableSpaceOwner: OWNER name
      | /*EMPTY */
    ;

/*****************************************************************************
 *
 *		QUERY :
 *				DROP TABLESPACE <tablespace>
 *
 *		No need for drop behaviour as we cannot implement dependencies for
 *		objects in other databases; we can only support RESTRICT.
 *
 ****************************************************************************/

dropTableSpaceStmt: DROP TABLESPACE name
        |  DROP TABLESPACE IF_P EXISTS name
    ;

/*****************************************************************************
 *
 *		QUERY:
 *             CREATE EXTENSION extension
 *             [ WITH ] [ SCHEMA schema ] [ VERSION version ] [ FROM oldversion ]
 *
 *****************************************************************************/

createExtensionStmt: CREATE EXTENSION name WITH? create_extension_opt_list
        | CREATE EXTENSION IF_P NOT EXISTS name WITH? create_extension_opt_list
    ;

create_extension_opt_list:
      create_extension_opt_list create_extension_opt_item
      | /* EMPTY */
    ;

create_extension_opt_item:
      SCHEMA name
      | VERSION_P colId_or_Sconst
      | FROM colId_or_Sconst
    ;

/*****************************************************************************
 *
 * ALTER EXTENSION name UPDATE [ TO version ]
 *
 *****************************************************************************/

alterExtensionStmt: ALTER EXTENSION name UPDATE alter_extension_opt_list
    ;

alter_extension_opt_list:
      alter_extension_opt_list alter_extension_opt_item
      | /* EMPTY */
    ;

alter_extension_opt_item:
      TO colId_or_Sconst
    ;

/*****************************************************************************
 *
 * ALTER EXTENSION name ADD/DROP object-identifier
 *
 *****************************************************************************/

alterExtensionContentsStmt:
      ALTER EXTENSION name add_drop AGGREGATE func_name aggr_args
      | ALTER EXTENSION name add_drop CAST '(' typename AS typename ')'
      | ALTER EXTENSION name add_drop COLLATION any_name
      | ALTER EXTENSION name add_drop CONVERSION_P any_name
      | ALTER EXTENSION name add_drop DOMAIN_P any_name
      | ALTER EXTENSION name add_drop FUNCTION function_with_argtypes
      | ALTER EXTENSION name add_drop opt_procedural LANGUAGE name
      | ALTER EXTENSION name add_drop OPERATOR any_operator oper_argtypes
      | ALTER EXTENSION name add_drop OPERATOR CLASS any_name USING access_method
      | ALTER EXTENSION name add_drop OPERATOR FAMILY any_name USING access_method
      | ALTER EXTENSION name add_drop SCHEMA name
      | ALTER EXTENSION name add_drop TABLE any_name
      | ALTER EXTENSION name add_drop TEXT_P SEARCH PARSER any_name
      | ALTER EXTENSION name add_drop TEXT_P SEARCH DICTIONARY any_name
      | ALTER EXTENSION name add_drop TEXT_P SEARCH TEMPLATE any_name
      | ALTER EXTENSION name add_drop TEXT_P SEARCH CONFIGURATION any_name
      | ALTER EXTENSION name add_drop SEQUENCE any_name
      | ALTER EXTENSION name add_drop VIEW any_name
      | ALTER EXTENSION name add_drop FOREIGN TABLE any_name
      | ALTER EXTENSION name add_drop FOREIGN DATA_P WRAPPER name
      | ALTER EXTENSION name add_drop SERVER name
      | ALTER EXTENSION name add_drop TYPE_P any_name
    ;

/*****************************************************************************
 *
 *		QUERY:
 *             CREATE FOREIGN DATA WRAPPER name options
 *
 *****************************************************************************/

createFdwStmt: CREATE FOREIGN DATA_P WRAPPER name opt_fdw_options create_generic_options
    ;

fdw_option:
      HANDLER handler_name
      | NO HANDLER
      | VALIDATOR handler_name
      | NO VALIDATOR
    ;

fdw_options:
      fdw_option
      | fdw_options fdw_option
    ;

opt_fdw_options:
      fdw_options
      | /*EMPTY*/
    ;

/*****************************************************************************
 *
 *		QUERY :
 *				DROP FOREIGN DATA WRAPPER name
 *
 ****************************************************************************/

dropFdwStmt: DROP FOREIGN DATA_P WRAPPER name opt_drop_behavior
        |  DROP FOREIGN DATA_P WRAPPER IF_P EXISTS name opt_drop_behavior
    ;

/*****************************************************************************
 *
 *		QUERY :
 *				ALTER FOREIGN DATA WRAPPER name options
 *
 ****************************************************************************/

alterFdwStmt: ALTER FOREIGN DATA_P WRAPPER name opt_fdw_options alter_generic_options
      | ALTER FOREIGN DATA_P WRAPPER name fdw_options
    ;

/* Options definition for CREATE FDW, SERVER and USER MAPPING */
create_generic_options:
      OPTIONS '(' generic_option_list ')'
      | /*EMPTY*/
    ;

generic_option_list:
      generic_option_elem
      | generic_option_list ',' generic_option_elem
    ;

/* Options definition for ALTER FDW, SERVER and USER MAPPING */
alter_generic_options:
      OPTIONS	'(' alter_generic_option_list ')'
    ;

alter_generic_option_list:
      alter_generic_option_elem
      | alter_generic_option_list ',' alter_generic_option_elem
    ;

alter_generic_option_elem:
      generic_option_elem
      | SET generic_option_elem
      | ADD_P generic_option_elem
      | DROP generic_option_name
    ;

generic_option_elem:
      generic_option_name generic_option_arg
    ;

generic_option_name:
        colLabel
    ;

/* We could use def_arg here, but the spec only requires string literals */
generic_option_arg:
        sConst
    ;

/*****************************************************************************
 *
 *		QUERY:
 *             CREATE SERVER name [TYPE] [VERSION] [OPTIONS]
 *
 *****************************************************************************/

createForeignServerStmt: CREATE SERVER name opt_type opt_foreign_server_version
             FOREIGN DATA_P WRAPPER name create_generic_options
    ;

opt_type:
      TYPE_P sConst
      | /*EMPTY*/
    ;


foreign_server_version:
      VERSION_P sConst
    |	VERSION_P NULL_P
    ;

opt_foreign_server_version:
      foreign_server_version
      | /*EMPTY*/
    ;

/*****************************************************************************
 *
 *		QUERY :
 *				DROP SERVER name
 *
 ****************************************************************************/

dropForeignServerStmt: DROP SERVER name opt_drop_behavior
        |  DROP SERVER IF_P EXISTS name opt_drop_behavior
    ;

/*****************************************************************************
 *
 *		QUERY :
 *				ALTER SERVER name [VERSION] [OPTIONS]
 *
 ****************************************************************************/

alterForeignServerStmt: ALTER SERVER name foreign_server_version alter_generic_options
      | ALTER SERVER name foreign_server_version
      | ALTER SERVER name alter_generic_options
    ;

/*****************************************************************************
 *
 *		QUERY:
 *             CREATE FOREIGN TABLE relname (...) SERVER name (...)
 *
 *****************************************************************************/

createForeignTableStmt:
    CREATE FOREIGN TABLE qualified_name
      optforeigntableElementList
      SERVER name create_generic_options
    | CREATE FOREIGN TABLE IF_P NOT EXISTS qualified_name
      optforeigntableElementList
      SERVER name create_generic_options
    ;

optforeigntableElementList:
      '(' foreigntableElementList ')'
      | '(' ')'
    ;

foreigntableElementList:
      foreigntableElement
      | foreigntableElementList ',' foreigntableElement
    ;

foreigntableElement:
      columnDef
    ;

/*****************************************************************************
 *
 *		QUERY:
 *             ALTER FOREIGN TABLE relname [...]
 *
 *****************************************************************************/

alterForeignTableStmt:
      ALTER FOREIGN TABLE relation_expr alter_table_cmds
      | ALTER FOREIGN TABLE IF_P EXISTS relation_expr alter_table_cmds
    ;

/*****************************************************************************
 *
 *		QUERY:
 *             CREATE USER MAPPING FOR auth_ident SERVER name [OPTIONS]
 *
 *****************************************************************************/

createUserMappingStmt: CREATE USER MAPPING FOR auth_ident SERVER name create_generic_options

    ;

/* User mapping authorization identifier */
auth_ident:
      CURRENT_USER
    |	USER
    |	roleId
    ;

/*****************************************************************************
 *
 *		QUERY :
 *				DROP USER MAPPING FOR auth_ident SERVER name
 *
 ****************************************************************************/

dropUserMappingStmt: DROP USER MAPPING FOR auth_ident SERVER name
        |  DROP USER MAPPING IF_P EXISTS FOR auth_ident SERVER name
    ;

/*****************************************************************************
 *
 *		QUERY :
 *				ALTER USER MAPPING FOR auth_ident SERVER name OPTIONS
 *
 ****************************************************************************/

alterUserMappingStmt: ALTER USER MAPPING FOR auth_ident SERVER name alter_generic_options
    ;

/*****************************************************************************
 *
 *		QUERIES :
 *				CREATE TRIGGER ...
 *				DROP TRIGGER ...
 *
 *****************************************************************************/

createTrigStmt:
      CREATE TRIGGER name triggerActionTime triggerEvents ON
      qualified_name triggerForSpec triggerWhen
      EXECUTE PROCEDURE func_name '(' triggerFuncArgs ')'
      | CREATE CONSTRAINT TRIGGER name AFTER triggerEvents ON
      qualified_name optConstrFromTable constraintAttributeSpec
      FOR EACH ROW triggerWhen
      EXECUTE PROCEDURE func_name '(' triggerFuncArgs ')'
    ;

triggerActionTime:
      BEFORE
      | AFTER
      | INSTEAD OF
    ;

triggerEvents:
      triggerOneEvent
      | triggerEvents OR triggerOneEvent
    ;

triggerOneEvent:
      INSERT
      | DELETE_P
      | UPDATE
      | UPDATE OF columnList
      | TRUNCATE
    ;

triggerForSpec:
      FOR triggerForOptEach triggerForType
      | /* EMPTY */
    ;

triggerForOptEach:
      EACH
      | /*EMPTY*/
    ;

triggerForType:
      ROW
      | STATEMENT
    ;

triggerWhen:
      WHEN '(' a_expr ')'
      | /*EMPTY*/
    ;

triggerFuncArgs:
      triggerFuncArg
      | triggerFuncArgs ',' triggerFuncArg
      | /*EMPTY*/
    ;

triggerFuncArg:
      iConst
      | FCONST
      | sConst
      | colLabel
    ;

optConstrFromTable:
      FROM qualified_name
      | /*EMPTY*/
    ;

constraintAttributeSpec:
      /*EMPTY*/
      | constraintAttributeSpec constraintAttributeElem
    ;

constraintAttributeElem:
      NOT DEFERRABLE
      | DEFERRABLE
      | INITIALLY IMMEDIATE
      | INITIALLY DEFERRED
      | NOT VALID
      | NO INHERIT
    ;


dropTrigStmt:
      DROP TRIGGER name ON any_name opt_drop_behavior
      | DROP TRIGGER IF_P EXISTS name ON any_name opt_drop_behavior
    ;


/*****************************************************************************
 *
 *		QUERIES :
 *				CREATE ASSERTION ...
 *				DROP ASSERTION ...
 *
 *****************************************************************************/

createAssertStmt:
      CREATE ASSERTION name CHECK '(' a_expr ')'
      constraintAttributeSpec
    ;

dropAssertStmt:
      DROP ASSERTION name opt_drop_behavior
    ;


/*****************************************************************************
 *
 *		QUERY :
 *				define (aggregate,operator,type)
 *
 *****************************************************************************/

defineStmt:
      CREATE AGGREGATE func_name aggr_args definition
      | CREATE AGGREGATE func_name old_aggr_definition
      | CREATE OPERATOR any_operator definition
      | CREATE TYPE_P any_name definition
      | CREATE TYPE_P any_name
      | CREATE TYPE_P any_name AS '(' opttableFuncElementList ')'
      | CREATE TYPE_P any_name AS ENUM_P '(' opt_enum_val_list ')'
      | CREATE TYPE_P any_name AS RANGE definition
      | CREATE TEXT_P SEARCH PARSER any_name definition
      | CREATE TEXT_P SEARCH DICTIONARY any_name definition
      | CREATE TEXT_P SEARCH TEMPLATE any_name definition
      | CREATE TEXT_P SEARCH CONFIGURATION any_name definition
      | CREATE COLLATION any_name definition
      | CREATE COLLATION any_name FROM any_name
    ;

definition: '(' def_list ')'
    ;

def_list:	def_elem
      | def_list ',' def_elem
    ;

def_elem:	colLabel '=' def_arg
      | colLabel
    ;

/* Note: any simple identifier will be returned as a type name! */
def_arg:	func_type
      | reserved_keyword
      | qual_all_Op
      | numericOnly
      | sConst
    ;

aggr_args:	'(' type_list ')'
      | '(' '*' ')'
    ;

old_aggr_definition: '(' old_aggr_list ')'
    ;

old_aggr_list: old_aggr_elem
      | old_aggr_list ',' old_aggr_elem
    ;

/*
 * Must use IDENT here to avoid reduce/reduce conflicts; fortunately none of
 * the item names needed in old aggregate definitions are likely to become
 * SQL keywords.
 */
old_aggr_elem:  IDENT '=' def_arg
    ;

opt_enum_val_list:
    enum_val_list
    | /*EMPTY*/
    ;

enum_val_list:	sConst
      | enum_val_list ',' sConst
    ;

/*****************************************************************************
 *
 *	ALTER TYPE enumtype ADD ...
 *
 *****************************************************************************/

alterEnumStmt:
    ALTER TYPE_P any_name ADD_P VALUE_P sConst
     | ALTER TYPE_P any_name ADD_P VALUE_P sConst BEFORE sConst
     | ALTER TYPE_P any_name ADD_P VALUE_P sConst AFTER sConst
     ;


/*****************************************************************************
 *
 *		QUERIES :
 *				CREATE OPERATOR CLASS ...
 *				CREATE OPERATOR FAMILY ...
 *				ALTER OPERATOR FAMILY ...
 *				DROP OPERATOR CLASS ...
 *				DROP OPERATOR FAMILY ...
 *
 *****************************************************************************/

createOpClassStmt:
      CREATE OPERATOR CLASS any_name opt_default FOR TYPE_P typename
      USING access_method opt_opfamily AS opclass_item_list
    ;

opclass_item_list:
      opclass_item
      | opclass_item_list ',' opclass_item
    ;

opclass_item:
      OPERATOR iConst any_operator opclass_purpose opt_recheck
      | OPERATOR iConst any_operator oper_argtypes opclass_purpose
        opt_recheck
      | FUNCTION iConst func_name func_args
      | FUNCTION iConst '(' type_list ')' func_name func_args
      | STORAGE typename
    ;

opt_default:	DEFAULT
      | /*EMPTY*/
    ;

opt_opfamily:	FAMILY any_name
      | /*EMPTY*/
    ;

opclass_purpose: FOR SEARCH
      | FOR ORDER BY any_name
      | /*EMPTY*/
    ;

opt_recheck:	RECHECK
      | /*EMPTY*/
    ;


createOpFamilyStmt:
      CREATE OPERATOR FAMILY any_name USING access_method
    ;

alterOpFamilyStmt:
      ALTER OPERATOR FAMILY any_name USING access_method ADD_P opclass_item_list
      | ALTER OPERATOR FAMILY any_name USING access_method DROP opclass_drop_list
    ;

opclass_drop_list:
      opclass_drop
      | opclass_drop_list ',' opclass_drop
    ;

opclass_drop:
      OPERATOR iConst '(' type_list ')'
      | FUNCTION iConst '(' type_list ')'
    ;


dropOpClassStmt:
      DROP OPERATOR CLASS any_name USING access_method opt_drop_behavior
      | DROP OPERATOR CLASS IF_P EXISTS any_name USING access_method opt_drop_behavior
    ;

dropOpFamilyStmt:
      DROP OPERATOR FAMILY any_name USING access_method opt_drop_behavior
      | DROP OPERATOR FAMILY IF_P EXISTS any_name USING access_method opt_drop_behavior
    ;


/*****************************************************************************
 *
 *		QUERY:
 *
 *		DROP OWNED BY username [, username ...] [ RESTRICT | CASCADE ]
 *		REASSIGN OWNED BY username [, username ...] TO username
 *
 *****************************************************************************/
dropOwnedStmt:
      DROP OWNED BY name_list opt_drop_behavior
    ;

reassignOwnedStmt:
      REASSIGN OWNED BY name_list TO name
    ;

/*****************************************************************************
 *
 *		QUERY:
 *
 *		DROP itemtype [ IF EXISTS ] itemname [, itemname ...]
 *           [ RESTRICT | CASCADE ]
 *
 *****************************************************************************/

dropStmt:	DROP drop_type IF_P EXISTS any_name_list opt_drop_behavior
      | DROP drop_type any_name_list opt_drop_behavior
      | DROP INDEX CONCURRENTLY any_name_list opt_drop_behavior
      | DROP INDEX CONCURRENTLY IF_P EXISTS any_name_list opt_drop_behavior
    ;


drop_type:	TABLE
      | SEQUENCE
      | VIEW
      | INDEX
      | FOREIGN TABLE
      | TYPE_P
      | DOMAIN_P
      | COLLATION
      | CONVERSION_P
      | SCHEMA
      | EXTENSION
      | TEXT_P SEARCH PARSER
      | TEXT_P SEARCH DICTIONARY
      | TEXT_P SEARCH TEMPLATE
      | TEXT_P SEARCH CONFIGURATION
    ;

any_name_list:
      any_name
      | any_name_list ',' any_name
    ;

any_name:	colId
      | colId attrs
    ;

attrs:		'.' attr_name
      | attrs '.' attr_name
    ;


/*****************************************************************************
 *
 *		QUERY:
 *				truncate table relname1, relname2, ...
 *
 *****************************************************************************/

truncateStmt:
      TRUNCATE opt_table relation_expr_list opt_restart_seqs opt_drop_behavior
    ;

opt_restart_seqs:
      CONTINUE_P IDENTITY_P
      | RESTART IDENTITY_P
      | /* EMPTY */
    ;

/*****************************************************************************
 *
 *	The COMMENT ON statement can take different forms based upon the type of
 *	the object associated with the comment. The form of the statement is:
 *
 *	COMMENT ON [ [ DATABASE | DOMAIN | INDEX | SEQUENCE | TABLE | TYPE | VIEW |
 *				   COLLATION | CONVERSION | LANGUAGE | OPERATOR CLASS |
 *				   LARGE OBJECT | CAST | COLUMN | SCHEMA | TABLESPACE |
 *				   EXTENSION | ROLE | TEXT SEARCH PARSER |
 *				   TEXT SEARCH DICTIONARY | TEXT SEARCH TEMPLATE |
 *				   TEXT SEARCH CONFIGURATION | FOREIGN TABLE |
 *				   FOREIGN DATA WRAPPER | SERVER ] <objname> |
 *				 AGGREGATE <aggname> (arg1, ...) |
 *				 FUNCTION <funcname> (arg1, arg2, ...) |
 *				 OPERATOR <op> (leftoperand_typ, rightoperand_typ) |
 *				 TRIGGER <triggername> ON <relname> |
 *				 CONSTRAINT <constraintname> ON <relname> |
 *				 RULE <rulename> ON <relname> ]
 *			   IS 'text'
 *
 *****************************************************************************/

commentStmt:
      COMMENT ON comment_type any_name IS comment_text
      | COMMENT ON AGGREGATE func_name aggr_args IS comment_text
      | COMMENT ON FUNCTION func_name func_args IS comment_text
      | COMMENT ON OPERATOR any_operator oper_argtypes IS comment_text
      | COMMENT ON CONSTRAINT name ON any_name IS comment_text
      | COMMENT ON RULE name ON any_name IS comment_text
      | COMMENT ON RULE name IS comment_text
      | COMMENT ON TRIGGER name ON any_name IS comment_text
      | COMMENT ON OPERATOR CLASS any_name USING access_method IS comment_text
      | COMMENT ON OPERATOR FAMILY any_name USING access_method IS comment_text
      | COMMENT ON LARGE_P OBJECT_P numericOnly IS comment_text
      | COMMENT ON CAST '(' typename AS typename ')' IS comment_text
      | COMMENT ON opt_procedural LANGUAGE any_name IS comment_text
      | COMMENT ON TEXT_P SEARCH PARSER any_name IS comment_text
      | COMMENT ON TEXT_P SEARCH DICTIONARY any_name IS comment_text
      | COMMENT ON TEXT_P SEARCH TEMPLATE any_name IS comment_text
      | COMMENT ON TEXT_P SEARCH CONFIGURATION any_name IS comment_text
    ;

comment_type:
      COLUMN
      | DATABASE
      | SCHEMA
      | INDEX
      | SEQUENCE
      | TABLE
      | DOMAIN_P
      | TYPE_P
      | VIEW
      | COLLATION
      | CONVERSION_P
      | TABLESPACE
      | EXTENSION
      | ROLE
      | FOREIGN TABLE
      | SERVER
      | FOREIGN DATA_P WRAPPER
    ;

comment_text:
      sConst
      | NULL_P
    ;


/*****************************************************************************
 *
 *  SECURITY LABEL [FOR <provider>] ON <object> IS <label>
 *
 *  As with COMMENT ON, <object> can refer to various types of database
 *  objects (e.g. TABLE, COLUMN, etc.).
 *
 *****************************************************************************/

secLabelStmt:
      SECURITY LABEL opt_provider ON security_label_type any_name
      IS security_label
      | SECURITY LABEL opt_provider ON AGGREGATE func_name aggr_args
        IS security_label
      | SECURITY LABEL opt_provider ON FUNCTION func_name func_args
        IS security_label
      | SECURITY LABEL opt_provider ON LARGE_P OBJECT_P numericOnly
        IS security_label
      | SECURITY LABEL opt_provider ON opt_procedural LANGUAGE any_name
        IS security_label
    ;

opt_provider:	FOR colId_or_Sconst
        | /* empty */
    ;

security_label_type:
      COLUMN
      | DATABASE
      | FOREIGN TABLE
      | SCHEMA
      | SEQUENCE
      | TABLE
      | DOMAIN_P
      | ROLE
      | TABLESPACE
      | TYPE_P
      | VIEW
    ;

security_label:	sConst
        | NULL_P
    ;

/*****************************************************************************
 *
 *		QUERY:
 *			fetch/move
 *
 *****************************************************************************/

fetchStmt:	FETCH fetch_args
      | MOVE fetch_args
    ;

fetch_args:	cursor_name
      | from_in cursor_name
      | NEXT opt_from_in cursor_name
      | PRIOR opt_from_in cursor_name
      | FIRST_P opt_from_in cursor_name
      | LAST_P opt_from_in cursor_name
      | ABSOLUTE_P signedIconst opt_from_in cursor_name
      | RELATIVE_P signedIconst opt_from_in cursor_name
      | signedIconst opt_from_in cursor_name
      | ALL opt_from_in cursor_name
      | FORWARD opt_from_in cursor_name
      | FORWARD signedIconst opt_from_in cursor_name
      | FORWARD ALL opt_from_in cursor_name
      | BACKWARD opt_from_in cursor_name
      | BACKWARD signedIconst opt_from_in cursor_name
      | BACKWARD ALL opt_from_in cursor_name
    ;

from_in:	FROM
      | IN_P
    ;

opt_from_in:	from_in
      | /* EMPTY */
    ;


/*****************************************************************************
 *
 * GRANT and REVOKE statements
 *
 *****************************************************************************/

grantStmt:	GRANT privileges ON privilege_target TO grantee_list
      opt_grant_grant_option
    ;

revokeStmt:
      REVOKE privileges ON privilege_target
      FROM grantee_list opt_drop_behavior
      | REVOKE GRANT OPTION FOR privileges ON privilege_target
      FROM grantee_list opt_drop_behavior
    ;


/*
 * Privilege names are represented as strings; the validity of the privilege
 * names gets checked at execution.  This is a bit annoying but we have little
 * choice because of the syntactic conflict with lists of role names in
 * GRANT/REVOKE.  What's more, we have to call out in the "privilege"
 * production any reserved keywords that need to be usable as privilege names.
 */

/* either ALL [PRIVILEGES] or a list of individual privileges */
privileges: privilege_list
      | ALL
      | ALL PRIVILEGES
      | ALL '(' columnList ')'
      | ALL PRIVILEGES '(' columnList ')'
    ;

privilege_list:	privilege
      | privilege_list ',' privilege
    ;

privilege:	SELECT opt_column_list
    | REFERENCES opt_column_list
    | CREATE opt_column_list
    | colId opt_column_list
    ;


/* Don't bother trying to fold the first two rules into one using
 * opt_table.  You're going to get conflicts.
 */
privilege_target:
      qualified_name_list
      | TABLE qualified_name_list
      | SEQUENCE qualified_name_list
      | FOREIGN DATA_P WRAPPER name_list
      | FOREIGN SERVER name_list
      | FUNCTION function_with_argtypes_list
      | DATABASE name_list
      | DOMAIN_P any_name_list
      | LANGUAGE name_list
      | LARGE_P OBJECT_P numericOnly_list
      | SCHEMA name_list
      | TABLESPACE name_list
      | TYPE_P any_name_list
      | ALL TABLES IN_P SCHEMA name_list
      | ALL SEQUENCES IN_P SCHEMA name_list
      | ALL FUNCTIONS IN_P SCHEMA name_list
    ;


grantee_list:
      grantee
      | grantee_list ',' grantee
    ;

grantee:	roleId
      | GROUP_P roleId
    ;


opt_grant_grant_option:
      WITH GRANT OPTION
      | /*EMPTY*/
    ;

function_with_argtypes_list:
      function_with_argtypes
      | function_with_argtypes_list ',' function_with_argtypes

    ;

function_with_argtypes:
      func_name func_args
    ;

/*****************************************************************************
 *
 * GRANT and REVOKE ROLE statements
 *
 *****************************************************************************/

grantRoleStmt:
      GRANT privilege_list TO name_list opt_grant_admin_option opt_granted_by
    ;

revokeRoleStmt:
      REVOKE privilege_list FROM name_list opt_granted_by opt_drop_behavior
      | REVOKE ADMIN OPTION FOR privilege_list FROM name_list opt_granted_by opt_drop_behavior
    ;

opt_grant_admin_option: WITH ADMIN OPTION
      | /*EMPTY*/
    ;

opt_granted_by: GRANTED BY roleId
      | /*EMPTY*/
    ;

/*****************************************************************************
 *
 * ALTER DEFAULT PRIVILEGES statement
 *
 *****************************************************************************/

alterDefaultPrivilegesStmt:
      ALTER DEFAULT PRIVILEGES defACLOptionList defACLAction
    ;

defACLOptionList:
      defACLOptionList defACLOption
      | /* EMPTY */
    ;

defACLOption:
      IN_P SCHEMA name_list
      | FOR ROLE name_list
      | FOR USER name_list
    ;

/*
 * This should match GRANT/REVOKE, except that individual target objects
 * are not mentioned and we only allow a subset of object types.
 */
defACLAction:
      GRANT privileges ON defacl_privilege_target TO grantee_list
      opt_grant_grant_option
      | REVOKE privileges ON defacl_privilege_target
      FROM grantee_list opt_drop_behavior
      | REVOKE GRANT OPTION FOR privileges ON defacl_privilege_target
      FROM grantee_list opt_drop_behavior
    ;

defacl_privilege_target:
      TABLES
      | FUNCTIONS
      | SEQUENCES
      | TYPES_P
    ;


/*****************************************************************************
 *
 *		QUERY: CREATE INDEX
 *
 * Note: we cannot put TABLESPACE clause after WHERE clause unless we are
 * willing to make TABLESPACE a fully reserved word.
 *****************************************************************************/

indexStmt:	CREATE opt_unique INDEX opt_concurrently opt_index_name
      ON qualified_name access_method_clause '(' index_params ')'
      opt_reloptions optTableSpace where_clause
    ;

opt_unique:
      UNIQUE
      | /*EMPTY*/
    ;

opt_concurrently:
      CONCURRENTLY
      | /*EMPTY*/
    ;

opt_index_name:
      index_name
      | /*EMPTY*/
    ;

access_method_clause:
      USING access_method
      | /*EMPTY*/
    ;

index_params:	index_elem
      | index_params ',' index_elem
    ;

/*
 * Index attributes can be either simple column references, or arbitrary
 * expressions in parens.  For backwards-compatibility reasons, we allow
 * an expression that's just a function call to be written without parens.
 */
index_elem:	colId opt_collate opt_class opt_asc_desc opt_nulls_order
      | func_expr opt_collate opt_class opt_asc_desc opt_nulls_order
      | '(' a_expr ')' opt_collate opt_class opt_asc_desc opt_nulls_order
    ;

opt_collate: COLLATE any_name
      | /*EMPTY*/
    ;

opt_class:	any_name
      | USING any_name
      | /*EMPTY*/
    ;

opt_asc_desc: ASC
      | DESC
      | /*EMPTY*/
    ;

opt_nulls_order: NULLS_FIRST
      | NULLS_LAST
      | /*EMPTY*/
    ;


/*****************************************************************************
 *
 *		QUERY:
 *				create [or replace] function <fname>
 *						[(<type-1> )]
 *						returns <type-r>
 *						as <filename or code in language as appropriate>
 *						language <lang> [with parameters]
 *
 *****************************************************************************/

createFunctionStmt:
          CREATE opt_or_replace? FUNCTION func_name func_args_with_defaults    RETURNS func_return                          createfunc_opt_list  opt_definition
        | CREATE opt_or_replace? FUNCTION func_name func_args_with_defaults    RETURNS TABLE '(' table_func_column_list ')' createfunc_opt_list  opt_definition
        | CREATE opt_or_replace? FUNCTION func_name func_args_with_defaults                                                 createfunc_opt_list  opt_definition
        ;

opt_or_replace:
      OR REPLACE
      | /*EMPTY*/
    ;

func_args:	'(' func_args_list ')'
      | '(' ')'
    ;

func_args_list:
      func_arg
      | func_args_list ',' func_arg
    ;

/*
 * func_args_with_defaults is separate because we only want to accept
 * defaults in CREATE FUNCTION, not in ALTER etc.
 */
func_args_with_defaults:
    '(' func_args_with_defaults_list ')'
    | '(' ')'
    ;

func_args_with_defaults_list:
    func_arg_with_default
    | func_args_with_defaults_list ',' func_arg_with_default

    ;

/*
 * The style with arg_class first is SQL99 standard, but Oracle puts
 * param_name first; accept both since it's likely people will try both
 * anyway.  Don't bother trying to save productions by letting arg_class
 * have an empty alternative ... you'll get shift/reduce conflicts.
 *
 * We can catch over-specified arguments here if we want to,
 * but for now better to silently swallow typmod, etc.
 * - thomas 2000-03-22
 */
func_arg:
      arg_class param_name func_type
      | param_name arg_class func_type
      | param_name func_type
      | arg_class func_type
      | func_type
    ;

/* INOUT is SQL99 standard, IN OUT is for Oracle compatibility */
arg_class:	IN_P
      | OUT_P
      | INOUT
      | IN_P OUT_P
      | VARIADIC
    ;

/*
 * Ideally param_name should be colId, but that causes too many conflicts.
 */
param_name:	type_function_name
    ;

func_return:
      func_type
    ;

/*
 * We would like to make the %TYPE productions here be colId attrs etc,
 * but that causes reduce/reduce conflicts.  type_function_name
 * is next best choice.
 */
func_type:	typename
      | type_function_name attrs '%' TYPE_P
      | SETOF type_function_name attrs '%' TYPE_P
    ;

func_arg_with_default:
    func_arg
    | func_arg DEFAULT a_expr
    | func_arg '=' a_expr
    ;


createfunc_opt_list:
      /* Must be at least one to prevent conflict */
      createfunc_opt_item
      | createfunc_opt_list createfunc_opt_item
  ;

/*
 * Options common to both CREATE FUNCTION and ALTER FUNCTION
 */
common_func_opt_item:
      CALLED ON NULL_P INPUT_P
      | RETURNS NULL_P ON NULL_P INPUT_P
      | STRICT_P
      | IMMUTABLE
      | STABLE
      | VOLATILE
      | EXTERNAL SECURITY DEFINER
      | EXTERNAL SECURITY INVOKER
      | SECURITY DEFINER
      | SECURITY INVOKER
      | LEAKPROOF
      | NOT LEAKPROOF
      | COST numericOnly
      | ROWS numericOnly
      | functionsetResetClause
    ;

createfunc_opt_item:
      AS func_as
      | LANGUAGE colId_or_Sconst
      | WINDOW
      | common_func_opt_item
    ;

func_as:	sConst
      | sConst ',' sConst
    ;

opt_definition:
      WITH definition
      | /*EMPTY*/
    ;

table_func_column:	param_name func_type
    ;

table_func_column_list:
      table_func_column
      | table_func_column_list ',' table_func_column
    ;

/*****************************************************************************
 * ALTER FUNCTION
 *
 * RENAME and OWNER subcommands are already provided by the generic
 * ALTER infrastructure, here we just specify alterations that can
 * only be applied to functions.
 *
 *****************************************************************************/
alterFunctionStmt:
      ALTER FUNCTION function_with_argtypes alterfunc_opt_list opt_restrict
    ;

alterfunc_opt_list:
      /* At least one option must be specified */
      common_func_opt_item
      | alterfunc_opt_list common_func_opt_item
    ;

/* Ignored, merely for SQL compliance */
opt_restrict:
      RESTRICT
      | /* EMPTY */
    ;


/*****************************************************************************
 *
 *		QUERY:
 *
 *		DROP FUNCTION funcname (arg1, arg2, ...) [ RESTRICT | CASCADE ]
 *		DROP AGGREGATE aggname (arg1, ...) [ RESTRICT | CASCADE ]
 *		DROP OPERATOR opname (leftoperand_typ, rightoperand_typ) [ RESTRICT | CASCADE ]
 *
 *****************************************************************************/

removeFuncStmt:
      DROP FUNCTION func_name func_args opt_drop_behavior
      | DROP FUNCTION IF_P EXISTS func_name func_args opt_drop_behavior
    ;

removeAggrStmt:
      DROP AGGREGATE func_name aggr_args opt_drop_behavior
      | DROP AGGREGATE IF_P EXISTS func_name aggr_args opt_drop_behavior
    ;

removeOperStmt:
      DROP OPERATOR any_operator oper_argtypes opt_drop_behavior
      | DROP OPERATOR IF_P EXISTS any_operator oper_argtypes opt_drop_behavior
    ;

oper_argtypes:
      '(' typename ')'
      | '(' typename ',' typename ')'
      | '(' NONE ',' typename ')'					/* left unary */
      | '(' typename ',' NONE ')'					/* right unary */
    ;

any_operator:
      all_Op
      | colId '.' any_operator
    ;

/*****************************************************************************
 *
 *		DO <anonymous code block> [ LANGUAGE language ]
 *
 * We use a defElem list for future extensibility, and to allow flexibility
 * in the clause order.
 *
 *****************************************************************************/

doStmt: DO dostmt_opt_list
    ;

dostmt_opt_list:
      dostmt_opt_item
      | dostmt_opt_list dostmt_opt_item
    ;

dostmt_opt_item:
      sConst
      | LANGUAGE colId_or_Sconst
    ;

/*****************************************************************************
 *
 *		CREATE CAST / DROP CAST
 *
 *****************************************************************************/

createCastStmt: CREATE CAST '(' typename AS typename ')'
          WITH FUNCTION function_with_argtypes cast_context
      | CREATE CAST '(' typename AS typename ')'
          WITHOUT FUNCTION cast_context
      | CREATE CAST '(' typename AS typename ')'
          WITH INOUT cast_context
    ;

cast_context:  AS IMPLICIT_P
    | AS ASSIGNMENT
    | /*EMPTY*/
    ;


dropCastStmt: DROP CAST opt_if_exists '(' typename AS typename ')' opt_drop_behavior
    ;

opt_if_exists: IF_P EXISTS
    | /*EMPTY*/
    ;


/*****************************************************************************
 *
 *		QUERY:
 *
 *		REINDEX type <name> [FORCE]
 *
 * FORCE no longer does anything, but we accept it for backwards compatibility
 *****************************************************************************/

reindexStmt:
      REINDEX reindex_type qualified_name opt_force
      | REINDEX SYSTEM_P name opt_force
      | REINDEX DATABASE name opt_force
    ;

reindex_type:
      INDEX
      | TABLE
    ;

opt_force:	FORCE
      | /* EMPTY */
    ;


/*****************************************************************************
 *
 * ALTER THING name RENAME TO newname
 *
 *****************************************************************************/

renameStmt: ALTER AGGREGATE func_name aggr_args RENAME TO name
      | ALTER COLLATION any_name RENAME TO name
      | ALTER CONVERSION_P any_name RENAME TO name
      | ALTER DATABASE database_name RENAME TO database_name
      | ALTER DOMAIN_P any_name RENAME TO name
      | ALTER DOMAIN_P any_name RENAME CONSTRAINT name TO name
      | ALTER FOREIGN DATA_P WRAPPER name RENAME TO name
      | ALTER FUNCTION function_with_argtypes RENAME TO name
      | ALTER GROUP_P roleId RENAME TO roleId
      | ALTER opt_procedural LANGUAGE name RENAME TO name
      | ALTER OPERATOR CLASS any_name USING access_method RENAME TO name
      | ALTER OPERATOR FAMILY any_name USING access_method RENAME TO name
      | ALTER SCHEMA name RENAME TO name
      | ALTER SERVER name RENAME TO name
      | ALTER TABLE relation_expr RENAME TO name
      | ALTER TABLE IF_P EXISTS relation_expr RENAME TO name
      | ALTER SEQUENCE qualified_name RENAME TO name
      | ALTER SEQUENCE IF_P EXISTS qualified_name RENAME TO name
      | ALTER VIEW qualified_name RENAME TO name
      | ALTER VIEW IF_P EXISTS qualified_name RENAME TO name
      | ALTER INDEX qualified_name RENAME TO name
      | ALTER INDEX IF_P EXISTS qualified_name RENAME TO name
      | ALTER FOREIGN TABLE relation_expr RENAME TO name
      | ALTER FOREIGN TABLE IF_P EXISTS relation_expr RENAME TO name
      | ALTER TABLE relation_expr RENAME opt_column name TO name
      | ALTER TABLE IF_P EXISTS relation_expr RENAME opt_column name TO name
      | ALTER TABLE relation_expr RENAME CONSTRAINT name TO name
      | ALTER FOREIGN TABLE relation_expr RENAME opt_column name TO name
      | ALTER FOREIGN TABLE IF_P EXISTS relation_expr RENAME opt_column name TO name
      | ALTER TRIGGER name ON qualified_name RENAME TO name
      | ALTER ROLE roleId RENAME TO roleId
      | ALTER USER roleId RENAME TO roleId
      | ALTER TABLESPACE name RENAME TO name
      | ALTER TABLESPACE name SET reloptions
      | ALTER TABLESPACE name RESET reloptions
      | ALTER TEXT_P SEARCH PARSER any_name RENAME TO name
      | ALTER TEXT_P SEARCH DICTIONARY any_name RENAME TO name
      | ALTER TEXT_P SEARCH TEMPLATE any_name RENAME TO name
      | ALTER TEXT_P SEARCH CONFIGURATION any_name RENAME TO name
      | ALTER TYPE_P any_name RENAME TO name
      | ALTER TYPE_P any_name RENAME ATTRIBUTE name TO name opt_drop_behavior
    ;

opt_column: COLUMN
      | /*EMPTY*/
    ;

opt_set_data: SET DATA_P
      | /*EMPTY*/
    ;

/*****************************************************************************
 *
 * ALTER THING name SET SCHEMA name
 *
 *****************************************************************************/

alterObjectSchemaStmt:
      ALTER AGGREGATE func_name aggr_args SET SCHEMA name
      | ALTER COLLATION any_name SET SCHEMA name
      | ALTER CONVERSION_P any_name SET SCHEMA name
      | ALTER DOMAIN_P any_name SET SCHEMA name
      | ALTER EXTENSION any_name SET SCHEMA name
      | ALTER FUNCTION function_with_argtypes SET SCHEMA name
      | ALTER OPERATOR any_operator oper_argtypes SET SCHEMA name
      | ALTER OPERATOR CLASS any_name USING access_method SET SCHEMA name
      | ALTER OPERATOR FAMILY any_name USING access_method SET SCHEMA name
      | ALTER TABLE relation_expr SET SCHEMA name
      | ALTER TABLE IF_P EXISTS relation_expr SET SCHEMA name
      | ALTER TEXT_P SEARCH PARSER any_name SET SCHEMA name
      | ALTER TEXT_P SEARCH DICTIONARY any_name SET SCHEMA name
      | ALTER TEXT_P SEARCH TEMPLATE any_name SET SCHEMA name
      | ALTER TEXT_P SEARCH CONFIGURATION any_name SET SCHEMA name
      | ALTER SEQUENCE qualified_name SET SCHEMA name
      | ALTER SEQUENCE IF_P EXISTS qualified_name SET SCHEMA name
      | ALTER VIEW qualified_name SET SCHEMA name
      | ALTER VIEW IF_P EXISTS qualified_name SET SCHEMA name
      | ALTER FOREIGN TABLE relation_expr SET SCHEMA name
      | ALTER FOREIGN TABLE IF_P EXISTS relation_expr SET SCHEMA name
      | ALTER TYPE_P any_name SET SCHEMA name
    ;

/*****************************************************************************
 *
 * ALTER THING name OWNER TO newname
 *
 *****************************************************************************/

alterOwnerStmt: ALTER AGGREGATE func_name aggr_args OWNER TO roleId
      | ALTER COLLATION any_name OWNER TO roleId
      | ALTER CONVERSION_P any_name OWNER TO roleId
      | ALTER DATABASE database_name OWNER TO roleId
      | ALTER DOMAIN_P any_name OWNER TO roleId
      | ALTER FUNCTION function_with_argtypes OWNER TO roleId
      | ALTER opt_procedural LANGUAGE name OWNER TO roleId
      | ALTER LARGE_P OBJECT_P numericOnly OWNER TO roleId
      | ALTER OPERATOR any_operator oper_argtypes OWNER TO roleId
      | ALTER OPERATOR CLASS any_name USING access_method OWNER TO roleId
      | ALTER OPERATOR FAMILY any_name USING access_method OWNER TO roleId
      | ALTER SCHEMA name OWNER TO roleId
      | ALTER TYPE_P any_name OWNER TO roleId
      | ALTER TABLESPACE name OWNER TO roleId
      | ALTER TEXT_P SEARCH DICTIONARY any_name OWNER TO roleId
      | ALTER TEXT_P SEARCH CONFIGURATION any_name OWNER TO roleId
      | ALTER FOREIGN DATA_P WRAPPER name OWNER TO roleId
      | ALTER SERVER name OWNER TO roleId
    ;


/*****************************************************************************
 *
 *		QUERY:	Define Rewrite Rule
 *
 *****************************************************************************/

ruleStmt:	CREATE opt_or_replace RULE name AS
      ON event TO qualified_name where_clause
      DO opt_instead ruleActionList
    ;

ruleActionList:
      NOTHING
      | ruleActionStmt
      | '(' ruleActionMulti ')'
    ;

/* the thrashing around here is to discard "empty" statements... */
ruleActionMulti:
      ruleActionMulti ';' ruleActionStmtOrEmpty
      | ruleActionStmtOrEmpty
    ;

ruleActionStmt:
      selectStmt
      | insertStmt
      | updateStmt
      | deleteStmt
      | notifyStmt
    ;

ruleActionStmtOrEmpty:
      ruleActionStmt
      |	/*EMPTY*/
    ;

event:		SELECT
      | UPDATE
      | DELETE_P
      | INSERT
     ;

opt_instead:
      INSTEAD
      | ALSO
      | /*EMPTY*/
    ;


dropruleStmt:
      DROP RULE name ON any_name opt_drop_behavior
      | DROP RULE IF_P EXISTS name ON any_name opt_drop_behavior
    ;


/*****************************************************************************
 *
 *		QUERY:
 *				NOTIFY <identifier> can appear both in rule bodies and
 *				as a query-level command
 *
 *****************************************************************************/

notifyStmt: NOTIFY colId notify_payload
    ;

notify_payload:
      ',' sConst
      | /*EMPTY*/
    ;

listenStmt: LISTEN colId
    ;

unlistenStmt:
      UNLISTEN colId
      | UNLISTEN '*'
    ;


/*****************************************************************************
 *
 *		Transactions:
 *
 *		BEGIN / COMMIT / ROLLBACK
 *		(also older versions END / ABORT)
 *
 *****************************************************************************/

transactionStmt:
      ABORT_P opt_transaction
      | BEGIN_P opt_transaction transaction_mode_list_or_empty
      | START TRANSACTION transaction_mode_list_or_empty
      | COMMIT opt_transaction
      | END_P opt_transaction
      | ROLLBACK opt_transaction
      | SAVEPOINT colId
      | RELEASE SAVEPOINT colId
      | RELEASE colId
      | ROLLBACK opt_transaction TO SAVEPOINT colId
      | ROLLBACK opt_transaction TO colId
      | PREPARE TRANSACTION sConst
      | COMMIT PREPARED sConst
      | ROLLBACK PREPARED sConst
    ;

opt_transaction:	WORK
      | TRANSACTION
      | /*EMPTY*/
    ;

transaction_mode_item:
      ISOLATION LEVEL iso_level
      | READ ONLY
      | READ WRITE
      | DEFERRABLE
      | NOT DEFERRABLE
    ;

/* Syntax with commas is SQL-spec, without commas is Postgres historical */
transaction_mode_list:
      transaction_mode_item
      | transaction_mode_list ',' transaction_mode_item
      | transaction_mode_list transaction_mode_item
    ;

transaction_mode_list_or_empty:
      transaction_mode_list
      | /* EMPTY */
    ;


/*****************************************************************************
 *
 *	QUERY:
 *		CREATE [ OR REPLACE ] [ TEMP ] VIEW <viewname> '('target-list ')'
 *			AS <query> [ WITH [ CASCADED | LOCAL ] CHECK OPTION ]
 *
 *****************************************************************************/

viewStmt: CREATE optTemp VIEW qualified_name opt_column_list opt_reloptions
        AS selectStmt opt_check_option
    | CREATE OR REPLACE optTemp VIEW qualified_name opt_column_list opt_reloptions
        AS selectStmt opt_check_option
    ;

opt_check_option:
    WITH CHECK OPTION
    | WITH CASCADED CHECK OPTION
    | WITH LOCAL CHECK OPTION
    | /* EMPTY */
    ;

/*****************************************************************************
 *
 *		QUERY:
 *				LOAD "filename"
 *
 *****************************************************************************/

loadStmt:	LOAD file_name
    ;


/*****************************************************************************
 *
 *		CREATE DATABASE
 *
 *****************************************************************************/

createdbStmt:
      CREATE DATABASE database_name WITH? createdb_opt_list
    ;

createdb_opt_list:
      createdb_opt_list createdb_opt_item
      | /* EMPTY */
    ;

createdb_opt_item:
      TABLESPACE opt_equal name
      | TABLESPACE opt_equal DEFAULT
      | LOCATION opt_equal sConst
      | LOCATION opt_equal DEFAULT
      | TEMPLATE opt_equal name
      | TEMPLATE opt_equal DEFAULT
      | ENCODING opt_equal sConst
      | ENCODING opt_equal iConst
      | ENCODING opt_equal DEFAULT
      | LC_COLLATE_P opt_equal sConst
      | LC_COLLATE_P opt_equal DEFAULT
      | LC_CTYPE_P opt_equal sConst
      | LC_CTYPE_P opt_equal DEFAULT
      | CONNECTION LIMIT opt_equal signedIconst
      | OWNER opt_equal name
      | OWNER opt_equal DEFAULT
    ;

/*
 *	Though the equals sign doesn't match other WITH options, pg_dump uses
 *	equals for backward compatibility, and it doesn't seem worth removing it.
 */
opt_equal:	'='
      | /*EMPTY*/
    ;


/*****************************************************************************
 *
 *		ALTER DATABASE
 *
 *****************************************************************************/

alterDatabaseStmt:
      ALTER DATABASE database_name WITH? alterdb_opt_list
      | ALTER DATABASE database_name SET TABLESPACE name
    ;

alterDatabaseSetStmt:
      ALTER DATABASE database_name setResetClause
    ;


alterdb_opt_list:
      alterdb_opt_list alterdb_opt_item
      | /* EMPTY */
    ;

alterdb_opt_item:
      CONNECTION LIMIT opt_equal signedIconst
    ;


/*****************************************************************************
 *
 *		DROP DATABASE [ IF EXISTS ]
 *
 * This is implicitly CASCADE, no need for drop behavior
 *****************************************************************************/

dropdbStmt: DROP DATABASE database_name
      | DROP DATABASE IF_P EXISTS database_name
    ;


/*****************************************************************************
 *
 * Manipulate a domain
 *
 *****************************************************************************/

createDomainStmt:
      CREATE DOMAIN_P any_name opt_as typename colQualList
    ;

alterDomainStmt:
      /* ALTER DOMAIN <domain>  */
      ALTER DOMAIN_P any_name alter_column_default
      /* ALTER DOMAIN <domain> DROP NOT NULL */
      | ALTER DOMAIN_P any_name DROP NOT NULL_P
      /* ALTER DOMAIN <domain> SET NOT NULL */
      | ALTER DOMAIN_P any_name SET NOT NULL_P
      /* ALTER DOMAIN <domain> ADD CONSTRAINT ... */
      | ALTER DOMAIN_P any_name ADD_P tableConstraint
      /* ALTER DOMAIN <domain> DROP CONSTRAINT <name> [RESTRICT|CASCADE] */
      | ALTER DOMAIN_P any_name DROP CONSTRAINT name opt_drop_behavior
      /* ALTER DOMAIN <domain> DROP CONSTRAINT IF EXISTS <name> [RESTRICT|CASCADE] */
      | ALTER DOMAIN_P any_name DROP CONSTRAINT IF_P EXISTS name opt_drop_behavior
      /* ALTER DOMAIN <domain> VALIDATE CONSTRAINT <name> */
      | ALTER DOMAIN_P any_name VALIDATE CONSTRAINT name
      ;

opt_as:		AS
      | /* EMPTY */
    ;


/*****************************************************************************
 *
 * Manipulate a text search dictionary or configuration
 *
 *****************************************************************************/

alterTSDictionaryStmt:
      ALTER TEXT_P SEARCH DICTIONARY any_name definition
    ;

alterTSConfigurationStmt:
      ALTER TEXT_P SEARCH CONFIGURATION any_name ADD_P MAPPING FOR name_list WITH any_name_list
      | ALTER TEXT_P SEARCH CONFIGURATION any_name ALTER MAPPING FOR name_list WITH any_name_list
      | ALTER TEXT_P SEARCH CONFIGURATION any_name ALTER MAPPING REPLACE any_name WITH any_name
      | ALTER TEXT_P SEARCH CONFIGURATION any_name ALTER MAPPING FOR name_list REPLACE any_name WITH any_name
      | ALTER TEXT_P SEARCH CONFIGURATION any_name DROP MAPPING FOR name_list
      | ALTER TEXT_P SEARCH CONFIGURATION any_name DROP MAPPING IF_P EXISTS FOR name_list
    ;


/*****************************************************************************
 *
 * Manipulate a conversion
 *
 *		CREATE [DEFAULT] CONVERSION <conversion_name>
 *		FOR <encoding_name> TO <encoding_name> FROM <func_name>
 *
 *****************************************************************************/

createConversionStmt:
      CREATE opt_default CONVERSION_P any_name FOR sConst
      TO sConst FROM any_name
    ;

/*****************************************************************************
 *
 *		QUERY:
 *				CLUSTER [VERBOSE] <qualified_name> [ USING <index_name> ]
 *				CLUSTER [VERBOSE]
 *				CLUSTER [VERBOSE] <index_name> ON <qualified_name> (for pre-8.3)
 *
 *****************************************************************************/

clusterStmt:
      CLUSTER opt_verbose qualified_name cluster_index_specification
      | CLUSTER opt_verbose
      /* kept for pre-8.3 compatibility */
      | CLUSTER opt_verbose index_name ON qualified_name
    ;

cluster_index_specification:
      USING index_name
      | /*EMPTY*/
    ;


/*****************************************************************************
 *
 *		QUERY:
 *				VACUUM
 *				ANALYZE
 *
 *****************************************************************************/

vacuumStmt: VACUUM opt_full opt_freeze opt_verbose
      | VACUUM opt_full opt_freeze opt_verbose qualified_name
      | VACUUM opt_full opt_freeze opt_verbose analyzeStmt
      | VACUUM '(' vacuum_option_list ')'
      | VACUUM '(' vacuum_option_list ')' qualified_name opt_name_list
    ;

vacuum_option_list:
      vacuum_option_elem
      | vacuum_option_list ',' vacuum_option_elem
    ;

vacuum_option_elem:
      analyze_keyword
      | VERBOSE
      | FREEZE
      | FULL
    ;

analyzeStmt:
      analyze_keyword opt_verbose
      | analyze_keyword opt_verbose qualified_name opt_name_list
    ;

analyze_keyword:
      ANALYZE
      | ANALYSE /* British */
    ;

opt_verbose:
      VERBOSE
      | /*EMPTY*/
    ;

opt_full:	FULL
      | /*EMPTY*/
    ;

opt_freeze: FREEZE
      | /*EMPTY*/
    ;

opt_name_list:
      '(' name_list ')'
      | /*EMPTY*/
    ;


/*****************************************************************************
 *
 *		QUERY:
 *				EXPLAIN [ANALYZE] [VERBOSE] query
 *				EXPLAIN ( options ) query
 *
 *****************************************************************************/

explainStmt:
    EXPLAIN explainableStmt
    | EXPLAIN analyze_keyword opt_verbose explainableStmt
    | EXPLAIN VERBOSE explainableStmt
    | EXPLAIN '(' explain_option_list ')' explainableStmt
    ;

explainableStmt:
      selectStmt
      | insertStmt
      | updateStmt
      | deleteStmt
      | declareCursorStmt
      | createAsStmt
      | executeStmt					/* by default all are $$=$1 */
    ;

explain_option_list:
      explain_option_elem
      | explain_option_list ',' explain_option_elem
    ;

explain_option_elem:
      explain_option_name explain_option_arg
    ;

explain_option_name:
      colId
      | analyze_keyword
      | VERBOSE
    ;

explain_option_arg:
      opt_boolean_or_string
      | numericOnly
      | /* EMPTY */
    ;

/*****************************************************************************
 *
 *		QUERY:
 *				PREPARE <plan_name> [(args, ...)] AS <query>
 *
 *****************************************************************************/

prepareStmt: PREPARE name prep_type_clause AS preparableStmt
    ;

prep_type_clause: '(' type_list ')'
        | /* EMPTY */
    ;

preparableStmt:
      selectStmt
      | insertStmt
      | updateStmt
      | deleteStmt
    ;

/*****************************************************************************
 *
 * EXECUTE <plan_name> [(params, ...)]
 * CREATE TABLE <name> AS EXECUTE <plan_name> [(params, ...)]
 *
 *****************************************************************************/

executeStmt: EXECUTE name execute_param_clause
      | CREATE optTemp TABLE create_as_target AS
        EXECUTE name execute_param_clause opt_with_data
    ;

execute_param_clause: '(' expr_list ')'
          | /* EMPTY */
          ;

/*****************************************************************************
 *
 *		QUERY:
 *				DEALLOCATE [PREPARE] <plan_name>
 *
 *****************************************************************************/

deallocateStmt: DEALLOCATE name
        | DEALLOCATE PREPARE name
        | DEALLOCATE ALL
        | DEALLOCATE PREPARE ALL
    ;

/*****************************************************************************
 *
 *		QUERY:
 *				INSERT STATEMENTS
 *
 *****************************************************************************/

insertStmt:
      opt_with_clause INSERT INTO qualified_name insert_rest returning_clause
    ;

insert_rest:
      selectStmt
      | '(' insert_column_list ')' selectStmt
      | DEFAULT VALUES
    ;

insert_column_list:
      insert_column_item
      | insert_column_list ',' insert_column_item
    ;

insert_column_item:
      colId opt_indirection
    ;

returning_clause:
      RETURNING target_list
      | /* EMPTY */
    ;


/*****************************************************************************
 *
 *		QUERY:
 *				DELETE STATEMENTS
 *
 *****************************************************************************/

deleteStmt: opt_with_clause DELETE_P FROM relation_expr_opt_alias
      using_clause where_or_current_clause returning_clause
    ;

using_clause:
        USING from_list
      | /*EMPTY*/
    ;


/*****************************************************************************
 *
 *		QUERY:
 *				LOCK TABLE
 *
 *****************************************************************************/

lockStmt:	LOCK_P opt_table relation_expr_list opt_lock opt_nowait
    ;

opt_lock:	IN_P lock_type MODE
      | /*EMPTY*/
    ;

lock_type:	ACCESS SHARE
      | ROW SHARE
      | ROW EXCLUSIVE
      | SHARE UPDATE EXCLUSIVE
      | SHARE
      | SHARE ROW EXCLUSIVE
      | EXCLUSIVE
      | ACCESS EXCLUSIVE
    ;

opt_nowait:	NOWAIT
      | /*EMPTY*/
    ;


/*****************************************************************************
 *
 *		QUERY:
 *				updateStmt (UPDATE)
 *
 *****************************************************************************/

updateStmt: opt_with_clause UPDATE relation_expr_opt_alias
      SET set_clause_list
      from_clause
      where_or_current_clause
      returning_clause
    ;

set_clause_list:
      set_clause
      | set_clause_list ',' set_clause
    ;

set_clause:
      single_set_clause
      | multiple_set_clause
    ;

single_set_clause:
      set_target '=' ctext_expr
    ;

multiple_set_clause:
      '(' set_target_list ')' '=' ctext_row
    ;

set_target:
      colId opt_indirection
    ;

set_target_list:
      set_target
      | set_target_list ',' set_target
    ;


/*****************************************************************************
 *
 *		QUERY:
 *				CURSOR STATEMENTS
 *
 *****************************************************************************/
declareCursorStmt: DECLARE cursor_name cursor_options CURSOR opt_hold FOR selectStmt
    ;

cursor_name:	name
    ;

cursor_options: /*EMPTY*/
      | cursor_options NO SCROLL
      | cursor_options SCROLL
      | cursor_options BINARY
      | cursor_options INSENSITIVE
    ;

opt_hold: /* EMPTY */
      | WITH HOLD
      | WITHOUT HOLD
    ;

/*****************************************************************************
 *
 *		QUERY:
 *				SELECT STATEMENTS
 *
 *****************************************************************************/

/* A complete SELECT statement looks like this.
 *
 * The rule returns either a single selectStmt node or a tree of them,
 * representing a set-operation tree.
 *
 * There is an ambiguity when a sub-SELECT is within an a_expr and there
 * are excess parentheses: do the parentheses belong to the sub-SELECT or
 * to the surrounding a_expr?  We don't really care, but bison wants to know.
 * To resolve the ambiguity, we are careful to define the grammar so that
 * the decision is staved off as long as possible: as long as we can keep
 * absorbing parentheses into the sub-SELECT, we will do so, and only when
 * it's no longer possible to do that will we decide that parens belong to
 * the expression.	For example, in "SELECT (((SELECT 2)) + 3)" the extra
 * parentheses are treated as part of the sub-select.  The necessity of doing
 * it that way is shown by "SELECT (((SELECT 2)) UNION SELECT 2)".	Had we
 * parsed "((SELECT 2))" as an a_expr, it'd be too late to go back to the
 * SELECT viewpoint when we see the UNION.
 *
 * This approach is implemented by defining a nonterminal select_with_parens,
 * which represents a SELECT with at least one outer layer of parentheses,
 * and being careful to use select_with_parens, never '(' selectStmt ')',
 * in the expression grammar.  We will then have shift-reduce conflicts
 * which we can resolve in favor of always treating '(' <select> ')' as
 * a select_with_parens.  To resolve the conflicts, the productions that
 * conflict with the select_with_parens productions are manually given
 * precedences lower than the precedence of ')', thereby ensuring that we
 * shift ')' (and then reduce to select_with_parens) rather than trying to
 * reduce the inner <select> nonterminal to something else.  We use UMINUS
 * precedence for this, which is a fairly arbitrary choice.
 *
 * To be able to define select_with_parens itself without ambiguity, we need
 * a nonterminal select_no_parens that represents a SELECT structure with no
 * outermost parentheses.  This is a little bit tedious, but it works.
 *
 * In non-expression contexts, we use selectStmt which can represent a SELECT
 * with or without outer parentheses.
 */

selectStmt: select_no_parens			// %prec UMINUS
      | select_with_parens		// %prec UMINUS
    ;

select_with_parens:
      '(' select_no_parens ')'
      | '(' select_with_parens ')'
      | select_with_parens UNION opt_all     select_clause
      | select_with_parens INTERSECT opt_all select_clause
      | select_with_parens EXCEPT opt_all    select_clause
    ;


/*
 * This rule parses the equivalent of the standard's <query expression>.
 * The duplicative productions are annoying, but hard to get rid of without
 * creating shift/reduce conflicts.
 *
 *	FOR UPDATE/SHARE may be before or after LIMIT/OFFSET.
 *	In <=7.2.X, LIMIT/OFFSET had to be after FOR UPDATE
 *	We now support both orderings, but prefer LIMIT/OFFSET before FOR UPDATE/SHARE
 *	2002-08-28 bjm
 */
select_no_parens:
      simple_select
      | select_clause sort_clause
      | select_clause opt_sort_clause for_locking_clause opt_select_limit
      | select_clause opt_sort_clause select_limit opt_for_locking_clause
      | with_clause select_clause
      | with_clause select_clause sort_clause
      | with_clause select_clause opt_sort_clause for_locking_clause opt_select_limit
      | with_clause select_clause opt_sort_clause select_limit opt_for_locking_clause
    ;

select_clause:
      simple_select
      | select_with_parens
    ;

/*
 * This rule parses SELECT statements that can appear within set operations,
 * including UNION, INTERSECT and EXCEPT.  '(' and ')' can be used to specify
 * the ordering of the set operations.	Without '(' and ')' we want the
 * operations to be ordered per the precedence specs at the head of this file.
 *
 * As with select_no_parens, simple_select cannot have outer parentheses,
 * but can have parenthesized subclauses.
 *
 * Note that sort clauses cannot be included at this level --- SQL92 requires
 *		SELECT foo UNION SELECT bar ORDER BY baz
 * to be parsed as
 *		(SELECT foo UNION SELECT bar) ORDER BY baz
 * not
 *		SELECT foo UNION (SELECT bar ORDER BY baz)
 * Likewise for WITH, FOR UPDATE and LIMIT.  Therefore, those clauses are
 * described as part of the select_no_parens production, not simple_select.
 * This does not limit functionality, because you can reintroduce these
 * clauses inside parentheses.
 *
 * NOTE: only the leftmost component selectStmt should have INTO.
 * However, this is not checked by the grammar; parse analysis must check it.
 */
simple_select:
      SELECT opt_distinct target_list
      into_clause from_clause where_clause
      group_clause having_clause window_clause
      | values_clause
      | TABLE relation_expr
      | simple_select      UNION     opt_all  select_clause
      | simple_select      INTERSECT opt_all  select_clause
      | simple_select      EXCEPT    opt_all  select_clause
    ;

/*
 * SQL standard WITH clause looks like:
 *
 * WITH [ RECURSIVE ] <query name> [ (<column>,...) ]
 *		AS (query) [ SEARCH or CYCLE clause ]
 *
 * We don't currently support the SEARCH or CYCLE clause.
 */
with_clause:
    WITH cte_list
    | WITH RECURSIVE cte_list
    ;

cte_list:
    common_table_expr
    | cte_list ',' common_table_expr
    ;

common_table_expr:  name opt_name_list AS '(' preparableStmt ')'
    ;

opt_with_clause:
    with_clause
    | /*EMPTY*/
    ;

into_clause:
      INTO optTempTableName
      | /*EMPTY*/
    ;

/*
 * Redundancy here is needed to avoid shift/reduce conflicts,
 * since TEMP is not a reserved word.  See also optTemp.
 */
optTempTableName:
      TEMPORARY opt_table qualified_name
      | TEMP opt_table qualified_name
      | LOCAL TEMPORARY opt_table qualified_name
      | LOCAL TEMP opt_table qualified_name
      | GLOBAL TEMPORARY opt_table qualified_name
      | GLOBAL TEMP opt_table qualified_name
      | UNLOGGED opt_table qualified_name
      | TABLE qualified_name
      | qualified_name
    ;

opt_table:	TABLE
      | /*EMPTY*/
    ;

opt_all:	ALL
      | DISTINCT
      | /*EMPTY*/
    ;

/* We use (NIL) as a placeholder to indicate that all target expressions
 * should be placed in the DISTINCT list during parsetree analysis.
 */
opt_distinct:
      DISTINCT
      | DISTINCT ON '(' expr_list ')'
      | ALL
      | /*EMPTY*/
    ;

opt_sort_clause:
      sort_clause
      | /*EMPTY*/
    ;

sort_clause:
      ORDER BY sortby_list
    ;

sortby_list:
      sortby
      | sortby_list ',' sortby
    ;

sortby:		a_expr USING qual_all_Op opt_nulls_order
      | a_expr opt_asc_desc opt_nulls_order
    ;


select_limit:
      limit_clause offset_clause
      | offset_clause limit_clause
      | limit_clause
      | offset_clause
    ;

opt_select_limit:
      select_limit
      | /* EMPTY */
    ;

limit_clause:
      LIMIT select_limit_value
      | LIMIT select_limit_value ',' select_offset_value
      /* SQL:2008 syntax */
      | FETCH first_or_next opt_select_fetch_first_value row_or_rows ONLY
    ;

offset_clause:
      OFFSET select_offset_value
      /* SQL:2008 syntax */
      | OFFSET select_offset_value2 row_or_rows
    ;

select_limit_value:
      a_expr
      | ALL
    ;

select_offset_value:
      a_expr
    ;

/*
 * Allowing full expressions without parentheses causes various parsing
 * problems with the trailing ROW/ROWS key words.  SQL only calls for
 * constants, so we allow the rest only with parentheses.  If omitted,
 * default to 1.
 */
opt_select_fetch_first_value:
      signedIconst
      | '(' a_expr ')'
      | /*EMPTY*/
    ;

/*
 * Again, the trailing ROW/ROWS in this case prevent the full expression
 * syntax.  c_expr is the best we can do.
 */
select_offset_value2:
      c_expr
    ;

/* noise words */
row_or_rows: ROW
      | ROWS
    ;

first_or_next: FIRST_P
      | NEXT
    ;


group_clause:
      GROUP_P BY expr_list
      | /*EMPTY*/
    ;

having_clause:
      HAVING a_expr
      | /*EMPTY*/
    ;

for_locking_clause:
      for_locking_items
      | FOR READ ONLY
    ;

opt_for_locking_clause:
      for_locking_clause
      | /* EMPTY */
    ;

for_locking_items:
      for_locking_item
      | for_locking_items for_locking_item
    ;

for_locking_item:
      FOR UPDATE locked_rels_list opt_nowait
      | FOR SHARE locked_rels_list opt_nowait
    ;

locked_rels_list:
      OF qualified_name_list
      | /* EMPTY */
    ;


values_clause:
      VALUES ctext_row
      | values_clause ',' ctext_row
    ;


/*****************************************************************************
 *
 *	clauses common to all Optimizable Stmts:
 *		from_clause		- allow list of both JOIN expressions and table names
 *		where_clause	- qualifications for joins or restrictions
 *
 *****************************************************************************/

from_clause:
      FROM from_list
      | /*EMPTY*/
    ;

from_list:
      table_ref
      | from_list ',' table_ref
    ;

/*
 * table_ref is where an alias clause can be attached.	Note we cannot make
 * alias_clause have an empty production because that causes parse conflicts
 * between table_ref := '(' joined_table ')' alias_clause
 * and joined_table := '(' joined_table ')'.  So, we must have the
 * redundant-looking productions here instead.
 */
/* table_ref:	relation_expr
      | relation_expr alias_clause
      | func_table
      | func_table alias_clause
      | func_table AS '(' tableFuncElementList ')'
      | func_table AS colId '(' tableFuncElementList ')'
      | func_table colId '(' tableFuncElementList ')'
      | select_with_parens
      | select_with_parens alias_clause
      | joined_table
      | '(' joined_table ')' alias_clause
    ;
*/

table_ref : joined_table
          | table_ref2
          ;

table_ref2:	relation_expr
      | relation_expr alias_clause
      | func_table
      | func_table alias_clause
      | func_table AS '(' tableFuncElementList ')'
      | func_table AS colId '(' tableFuncElementList ')'
      | func_table colId '(' tableFuncElementList ')'
      | select_with_parens
      | select_with_parens alias_clause
    ;



/*
 * It may seem silly to separate joined_table from table_ref, but there is
 * method in SQL92's madness: if you don't do it this way you get reduce-
 * reduce conflicts, because it's not clear to the parser generator whether
 * to expect alias_clause after ')' or not.  For the same reason we must
 * treat 'JOIN' and 'join_type JOIN' separately, rather than allowing
 * join_type to expand to empty; if we try it, the parser generator can't
 * figure out when to reduce an empty join_type right after table_ref.
 *
 * Note that a CROSS JOIN is the same as an unqualified
 * INNER JOIN, and an INNER JOIN/ON has the same shape
 * but a qualification expression to limit membership.
 * A NATURAL JOIN implicitly matches column names between
 * tables and the shape is determined by which columns are
 * in common. We'll collect columns during the later transformations.
 */
/*
joined_table:
       '(' joined_table ')'
        | table_ref CROSS JOIN table_ref
        | table_ref join_type JOIN table_ref join_qual
        | table_ref JOIN table_ref join_qual
        | table_ref NATURAL join_type JOIN table_ref
        | table_ref NATURAL JOIN table_ref
    ;
*/


joined_table:
       '(' joined_table ')' alias_clause?
        | table_ref2 CROSS JOIN table_ref
        | table_ref2 join_type JOIN table_ref join_qual
        | table_ref2 JOIN table_ref join_qual
        | table_ref2 NATURAL join_type JOIN table_ref
        | table_ref2 NATURAL JOIN table_ref
        | joined_table CROSS JOIN table_ref
        | joined_table join_type JOIN table_ref join_qual
        | joined_table JOIN table_ref join_qual
        | joined_table NATURAL join_type JOIN table_ref
        | joined_table NATURAL JOIN table_ref
    ;


alias_clause:
      AS colId '(' name_list ')'
      | AS colId
      | colId '(' name_list ')'
      | colId
    ;

join_type:	FULL join_outer
      | LEFT join_outer
      | RIGHT join_outer
      | INNER_P
    ;

/* OUTER is just noise... */
join_outer: OUTER_P
      | /*EMPTY*/
    ;

/* JOIN qualification clauses
 * Possibilities are:
 *	USING ( column list ) allows only unqualified column names,
 *						  which must match between tables.
 *	ON expr allows more general qualifications.
 *
 * We return USING as a List node, while an ON-expr will not be a List.
 */

join_qual:	USING '(' name_list ')'
      | ON a_expr
    ;


relation_expr:
      qualified_name
      | qualified_name '*'
      | ONLY qualified_name
      | ONLY '(' qualified_name ')'
    ;


relation_expr_list:
      relation_expr
      | relation_expr_list ',' relation_expr
    ;


/*
 * Given "UPDATE foo set set ...", we have to decide without looking any
 * further ahead whether the first "set" is an alias or the UPDATE's SET
 * keyword.  Since "set" is allowed as a column name both interpretations
 * are feasible.  We resolve the shift/reduce conflict by giving the first
 * relation_expr_opt_alias production a higher precedence than the SET token
 * has, causing the parser to prefer to reduce, in effect assuming that the
 * SET is not an alias.
 */
relation_expr_opt_alias: relation_expr				//	// %prec UMINUS
      | relation_expr colId
      | relation_expr AS colId
    ;


func_table: func_expr
    ;


where_clause:
      WHERE a_expr
      | /*EMPTY*/
    ;

/* variant for UPDATE and DELETE */
where_or_current_clause:
      WHERE a_expr
      | WHERE CURRENT_P OF cursor_name
      | /*EMPTY*/
    ;


opttableFuncElementList:
      tableFuncElementList
      | /*EMPTY*/
    ;

tableFuncElementList:
      tableFuncElement
      | tableFuncElementList ',' tableFuncElement
    ;

tableFuncElement:	colId typename opt_collate_clause
    ;

/*****************************************************************************
 *
 *	Type syntax
 *		SQL92 introduces a large amount of type-specific syntax.
 *		Define individual clauses to handle these cases, and use
 *		 the generic case to handle regular type-extensible Postgres syntax.
 *		- thomas 1997-10-10
 *
 *****************************************************************************/

typename:	simpletypename opt_array_bounds
      | SETOF simpletypename opt_array_bounds
      /* SQL standard syntax, currently only one-dimensional */
      | simpletypename ARRAY '[' iConst ']'
      | SETOF simpletypename ARRAY '[' iConst ']'
      | simpletypename ARRAY
      | SETOF simpletypename ARRAY
    ;

opt_array_bounds:
      opt_array_bounds '[' ']'
      | opt_array_bounds '[' iConst ']'
      | /*EMPTY*/
    ;

simpletypename:
      genericType
      | numeric
      | bit
      | character
      | constDatetime
      | constInterval opt_interval
      | constInterval '(' iConst ')' opt_interval
    ;

/* We have a separate consttypename to allow defaulting fixed-length
 * types such as CHAR() and BIT() to an unspecified length.
 * SQL9x requires that these default to a length of one, but this
 * makes no sense for constructs like CHAR 'hi' and BIT '0101',
 * where there is an obvious better choice to make.
 * Note that constInterval is not included here since it must
 * be pushed up higher in the rules to accommodate the postfix
 * options (e.g. INTERVAL '1' YEAR). Likewise, we have to handle
 * the generic-type-name case in AExprConst to avoid premature
 * reduce/reduce conflicts against function names.
 */
consttypename:
      numeric
      | constbit
      | constcharacter
      | constDatetime
    ;

/*
 * genericType covers all type names that don't have special syntax mandated
 * by the standard, including qualified names.  We also allow type modifiers.
 * To avoid parsing conflicts against function invocations, the modifiers
 * have to be shown as expr_list here, but parse analysis will only accept
 * constants for them.
 */
genericType:
      type_function_name opt_type_modifiers
      | type_function_name attrs opt_type_modifiers
    ;

opt_type_modifiers: '(' expr_list ')'
          | /* EMPTY */
    ;

/*
 * SQL92 numeric data types
 */
numeric:	INT_P
      | INTEGER
      | SMALLINT
      | BIGINT
      | REAL
      | FLOAT_P opt_float
      | DOUBLE_P PRECISION
      | DECIMAL_P opt_type_modifiers
      | DEC opt_type_modifiers
      | NUMERIC opt_type_modifiers
      | BOOLEAN_P
    ;

opt_float:	'(' iConst ')'
      | /*EMPTY*/
    ;

/*
 * SQL92 bit-field data types
 * The following implements BIT() and BIT VARYING().
 */
bit:		bitWithLength
      | bitWithoutLength
    ;

/* constbit is like bit except "BIT" defaults to unspecified length */
/* See notes for constcharacter, which addresses same issue for "CHAR" */
constbit:	bitWithLength
      | bitWithoutLength
    ;

bitWithLength:
      BIT opt_varying '(' expr_list ')'
    ;

bitWithoutLength:
      BIT opt_varying
    ;


/*
 * SQL92 character data types
 * The following implements CHAR() and VARCHAR().
 */
character:  characterWithLength
      | characterWithoutLength
    ;

constcharacter:  characterWithLength
      | characterWithoutLength
    ;

characterWithLength:  character_def '(' iConst ')' opt_charset
    ;

characterWithoutLength:	 character_def opt_charset
    ;

character_def:	CHARACTER opt_varying
      | CHAR_P opt_varying
      | VARCHAR
      | NATIONAL CHARACTER opt_varying
      | NATIONAL CHAR_P opt_varying
      | NCHAR opt_varying
    ;

opt_varying:
      VARYING
      | /*EMPTY*/
    ;

opt_charset:
      CHARACTER SET colId
      | /*EMPTY*/
    ;

/*
 * SQL92 date/time types
 */
constDatetime:
      TIMESTAMP '(' iConst ')' opt_timezone
      | TIMESTAMP opt_timezone
      | TIME '(' iConst ')' opt_timezone
      | TIME opt_timezone
    ;

constInterval:
      INTERVAL
    ;

opt_timezone:
      WITH_TIME ZONE
      | WITHOUT TIME ZONE
      | /*EMPTY*/
    ;

opt_interval:
      YEAR_P
      | MONTH_P
      | DAY_P
      | HOUR_P
      | MINUTE_P
      | interval_second
      | YEAR_P TO MONTH_P
      | DAY_P TO HOUR_P
      | DAY_P TO MINUTE_P
      | DAY_P TO interval_second
      | HOUR_P TO MINUTE_P
      | HOUR_P TO interval_second
      | MINUTE_P TO interval_second
      | /*EMPTY*/
    ;

interval_second:
      SECOND_P
      | SECOND_P '(' iConst ')'
    ;


/*****************************************************************************
 *
 *	expression grammar
 *
 *****************************************************************************/

/*
 * General expressions
 * This is the heart of the expression syntax.
 *
 * We have two expression types: a_expr is the unrestricted kind, and
 * b_expr is a subset that must be used in some places to avoid shift/reduce
 * conflicts.  For example, we can't do BETWEEN as "BETWEEN a_expr AND a_expr"
 * because that use of AND conflicts with AND as a boolean operator.  So,
 * b_expr is used in BETWEEN and we remove boolean keywords from b_expr.
 *
 * Note that '(' a_expr ')' is a b_expr, so an unrestricted expression can
 * always be used by surrounding it with parens.
 *
 * c_expr is all the productions that are common to a_expr and b_expr;
 * it's factored out just to eliminate redundant coding.
 */
a_expr:		c_expr
      | a_expr TYPECAST typename
      | a_expr COLLATE any_name
      | a_expr AT TIME ZONE a_expr			// %prec AT
    /*
     * These operators must be called out explicitly in order to make use
     * of bison's automatic operator-precedence handling.  All other
     * operator names are handled by the generic productions using "Op",
     * below; and all those operators will have the same precedence.
     *
     * If you add more explicitly-known operators, be sure to add them
     * also to b_expr and to the mathOp list above.
     */
      | '+' a_expr					// %prec UMINUS
      | '-' a_expr					// %prec UMINUS
      | a_expr '+' a_expr
      | a_expr '-' a_expr
      | a_expr '*' a_expr
      | a_expr '/' a_expr
      | a_expr '%' a_expr
      | a_expr '^' a_expr
      | a_expr '<' a_expr
      | a_expr '>' a_expr
      | a_expr '=' a_expr
      | a_expr '>=' a_expr
      | a_expr '<=' a_expr
      | a_expr qual_Op a_expr				// %prec Op
      | qual_Op a_expr					// %prec Op
      | a_expr qual_Op					// %prec POSTFIXOP
      | a_expr AND a_expr
      | a_expr OR a_expr
      | NOT a_expr
      | a_expr LIKE a_expr
      | a_expr LIKE a_expr ESCAPE a_expr
      | a_expr NOT LIKE a_expr
      | a_expr NOT LIKE a_expr ESCAPE a_expr
      | a_expr ILIKE a_expr
      | a_expr ILIKE a_expr ESCAPE a_expr
      | a_expr NOT ILIKE a_expr
      | a_expr NOT ILIKE a_expr ESCAPE a_expr
      | a_expr SIMILAR TO a_expr				// %prec SIMILAR
      | a_expr SIMILAR TO a_expr ESCAPE a_expr
      | a_expr NOT SIMILAR TO a_expr			// %prec SIMILAR
      | a_expr NOT SIMILAR TO a_expr ESCAPE a_expr
      /* NullTest clause
       * Define SQL92-style Null test clause.
       * Allow two forms described in the standard:
       *	a IS NULL
       *	a IS NOT NULL
       * Allow two SQL extensions
       *	a ISNULL
       *	a NOTNULL
       */
      | a_expr IS NULL_P							// %prec IS
      | a_expr ISNULL
      | a_expr IS NOT NULL_P						// %prec IS
      | a_expr NOTNULL
      | row OVERLAPS row
      | a_expr IS TRUE_P							// %prec IS
      | a_expr IS NOT TRUE_P						// %prec IS
      | a_expr IS FALSE_P							// %prec IS
      | a_expr IS NOT FALSE_P						// %prec IS
      | a_expr IS UNKNOWN							// %prec IS
      | a_expr IS NOT UNKNOWN						// %prec IS
      | a_expr IS DISTINCT FROM a_expr			// %prec IS
      | a_expr IS NOT DISTINCT FROM a_expr		// %prec IS
      | a_expr IS OF '(' type_list ')'			// %prec IS
      | a_expr IS NOT OF '(' type_list ')'		// %prec IS
      /*
       *	Ideally we would not use hard-wired operators below but
       *	instead use opclasses.  However, mixed data types and other
       *	issues make this difficult:
       *	http://archives.postgresql.org/pgsql-hackers/2008-08/msg01142.php
       */
      | a_expr BETWEEN opt_asymmetric b_expr AND b_expr		// %prec BETWEEN
      | a_expr NOT BETWEEN opt_asymmetric b_expr AND b_expr	// %prec BETWEEN
      | a_expr BETWEEN SYMMETRIC b_expr AND b_expr			// %prec BETWEEN
      | a_expr NOT BETWEEN SYMMETRIC b_expr AND b_expr		// %prec BETWEEN
      | a_expr IN_P in_expr
      | a_expr NOT IN_P in_expr
      | a_expr subquery_Op sub_type select_with_parens	// %prec Op
      | a_expr subquery_Op sub_type '(' a_expr ')'	//	%prec Op
      | UNIQUE select_with_parens
      | a_expr IS DOCUMENT_P				//	%prec IS
      | a_expr IS NOT DOCUMENT_P			//	%prec IS
    ;

/*
 * Restricted expressions
 *
 * b_expr is a subset of the complete expression syntax defined by a_expr.
 *
 * Presently, AND, NOT, IS, and IN are the a_expr keywords that would
 * cause trouble in the places where b_expr is used.  For simplicity, we
 * just eliminate all the boolean-keyword-operator productions from b_expr.
 */
b_expr:		c_expr
      | b_expr TYPECAST typename
      | '+' b_expr					// %prec UMINUS
      | '-' b_expr					// %prec UMINUS
      | b_expr '+' b_expr
      | b_expr '-' b_expr
      | b_expr '*' b_expr
      | b_expr '/' b_expr
      | b_expr '%' b_expr
      | b_expr '^' b_expr
      | b_expr '<' b_expr
      | b_expr '>' b_expr
      | b_expr '=' b_expr
      | b_expr qual_Op b_expr				 // %prec Op
      | qual_Op b_expr					// %prec Op
      | b_expr qual_Op					// %prec POSTFIXOP
      | b_expr IS DISTINCT FROM b_expr	//	%prec IS
      | b_expr IS NOT DISTINCT FROM b_expr //	%prec IS
      | b_expr IS OF '(' type_list ')'	//	%prec IS
      | b_expr IS NOT OF '(' type_list ')'	// %prec IS
      | b_expr IS DOCUMENT_P		//			%prec IS
      | b_expr IS NOT DOCUMENT_P	//			%prec IS
    ;

/*
 * Productions that can be used in both a_expr and b_expr.
 *
 * Note: productions that refer recursively to a_expr or b_expr mostly
 * cannot appear here.	However, it's OK to refer to a_exprs that occur
 * inside parentheses, such as function arguments; that cannot introduce
 * ambiguity to the b_expr syntax.
 */
c_expr:		columnref
      | aexprConst
      | PARAM opt_indirection
      | '(' a_expr ')' opt_indirection
      | case_expr
      | func_expr
      | select_with_parens			//%prec UMINUS
      | EXISTS select_with_parens
      | ARRAY select_with_parens
      | ARRAY array_expr
      | row
    ;

/*
 * func_expr is split out from c_expr just so that we have a classification
 * for "everything that is a function call or looks like one".  This isn't
 * very important, but it saves us having to document which variants are
 * legal in the backwards-compatible functional-index syntax for CREATE INDEX.
 * (Note that many of the special SQL functions wouldn't actually make any
 * sense as functional index entries, but we ignore that consideration here.)
 */
func_expr:	func_name '(' ')' over_clause
      | func_name '(' func_arg_list ')' over_clause
      | func_name '(' VARIADIC func_arg_expr ')' over_clause
      | func_name '(' func_arg_list ',' VARIADIC func_arg_expr ')' over_clause
      | func_name '(' func_arg_list sort_clause ')' over_clause
      | func_name '(' ALL func_arg_list opt_sort_clause ')' over_clause
      | func_name '(' DISTINCT func_arg_list opt_sort_clause ')' over_clause
      | func_name '(' '*' ')' over_clause
      | COLLATION FOR '(' a_expr ')'
      | CURRENT_DATE
      | CURRENT_TIME
      | CURRENT_TIME '(' iConst ')'
      | CURRENT_TIMESTAMP
      | CURRENT_TIMESTAMP '(' iConst ')'
      | LOCALTIME
      | LOCALTIME '(' iConst ')'
      | LOCALTIMESTAMP
      | LOCALTIMESTAMP '(' iConst ')'
      | CURRENT_ROLE
      | CURRENT_USER
      | SESSION_USER
      | USER
      | CURRENT_CATALOG
      | CURRENT_SCHEMA
      | CAST '(' a_expr AS typename ')'
      | EXTRACT '(' extract_list ')'
      | OVERLAY '(' overlay_list ')'
      | POSITION '(' position_list ')'
      | SUBSTRING '(' substr_list ')'
      | TREAT '(' a_expr AS typename ')'
      | TRIM '(' BOTH trim_list ')'
      | TRIM '(' LEADING trim_list ')'
      | TRIM '(' TRAILING trim_list ')'
      | TRIM '(' trim_list ')'
      | NULLIF '(' a_expr ',' a_expr ')'
      | COALESCE '(' expr_list ')'
      | GREATEST '(' expr_list ')'
      | LEAST '(' expr_list ')'
      | XMLCONCAT '(' expr_list ')'
      | XMLELEMENT '(' NAME_P colLabel ')'
      | XMLELEMENT '(' NAME_P colLabel ',' xml_attributes ')'
      | XMLELEMENT '(' NAME_P colLabel ',' expr_list ')'
      | XMLELEMENT '(' NAME_P colLabel ',' xml_attributes ',' expr_list ')'
      | XMLEXISTS '(' c_expr xmlexists_argument ')'
      | XMLFOREST '(' xml_attribute_list ')'
      | XMLPARSE '(' document_or_content a_expr xml_whitespace_option ')'
      | XMLPI '(' NAME_P colLabel ')'
      | XMLPI '(' NAME_P colLabel ',' a_expr ')'
      | XMLROOT '(' a_expr ',' xml_root_version opt_xml_root_standalone ')'
      | XMLSERIALIZE '(' document_or_content a_expr AS simpletypename ')'
    ;

/*
 * SQL/XML support
 */
xml_root_version: VERSION_P a_expr
      | VERSION_P NO VALUE_P
    ;

opt_xml_root_standalone: ',' STANDALONE_P YES_P
      | ',' STANDALONE_P NO
      | ',' STANDALONE_P NO VALUE_P
      | /*EMPTY*/
    ;

xml_attributes: XMLATTRIBUTES '(' xml_attribute_list ')'
    ;

xml_attribute_list:	xml_attribute_el
      | xml_attribute_list ',' xml_attribute_el
    ;

xml_attribute_el: a_expr AS colLabel
      | a_expr
    ;

document_or_content: DOCUMENT_P
      | CONTENT_P
    ;

xml_whitespace_option: PRESERVE WHITESPACE_P
      | STRIP_P WHITESPACE_P
      | /*EMPTY*/
    ;

/* We allow several variants for SQL and other compatibility. */
xmlexists_argument:
      PASSING c_expr
      | PASSING c_expr BY REF
      | PASSING BY REF c_expr
      | PASSING BY REF c_expr BY REF
    ;


/*
 * Window Definitions
 */
window_clause:
      WINDOW window_definition_list
      | /*EMPTY*/
    ;

window_definition_list:
      window_definition
      | window_definition_list ',' window_definition

    ;

window_definition:
      colId AS window_specification
    ;

over_clause: OVER window_specification
      | OVER colId
      | /*EMPTY*/

    ;

window_specification: '(' opt_existing_window_name opt_partition_clause
            opt_sort_clause opt_frame_clause ')'
    ;

/*
 * If we see PARTITION, RANGE, or ROWS as the first token after the '('
 * of a window_specification, we want the assumption to be that there is
 * no existing_window_name; but those keywords are unreserved and so could
 * be colIds.  We fix this by making them have the same precedence as IDENT
 * and giving the empty production here a slightly higher precedence, so
 * that the shift/reduce conflict is resolved in favor of reducing the rule.
 * These keywords are thus precluded from being an existing_window_name but
 * are not reserved for any other purpose.
 */
opt_existing_window_name: colId
      | /*EMPTY*/				// %prec Op
    ;

opt_partition_clause: PARTITION BY expr_list
      | /*EMPTY*/
    ;

/*
 * For frame clauses, we return a WindowDef, but only some fields are used:
 * frameOptions, startOffset, and endOffset.
 *
 * This is only a subset of the full SQL:2008 frame_clause grammar.
 * We don't support <window frame exclusion> yet.
 */
opt_frame_clause:
      RANGE frame_extent
      | ROWS frame_extent
      | /*EMPTY*/
    ;

frame_extent: frame_bound
      | BETWEEN frame_bound AND frame_bound
    ;

/*
 * This is used for both frame start and frame end, with output set up on
 * the assumption it's frame start; the frame_extent productions must reject
 * invalid cases.
 */
frame_bound:
      UNBOUNDED PRECEDING
      | UNBOUNDED FOLLOWING
      | CURRENT_P ROW
      | a_expr PRECEDING
      | a_expr FOLLOWING
    ;


/*
 * Supporting nonterminals for expressions.
 */

/* Explicit row production.
 *
 * SQL99 allows an optional ROW keyword, so we can now do single-element rows
 * without conflicting with the parenthesized a_expr production.  Without the
 * ROW keyword, there must be more than one a_expr inside the parens.
 */
row:		ROW '(' expr_list ')'
      | ROW '(' ')'
      | '(' expr_list ',' a_expr ')'
    ;

sub_type:	ANY
      | SOME
      | ALL
    ;

Op : 'TODO';

all_Op:		Op
      | mathOp
    ;

mathOp:		 '+'
      | '-'
      | '*'
      | '/'
      | '%'
      | '^'
      | '<'
      | '>'
      | '='
    ;

qual_Op:	Op
      | OPERATOR '(' any_operator ')'
    ;

qual_all_Op:
      all_Op
      | OPERATOR '(' any_operator ')'
    ;

subquery_Op:
      all_Op
      | OPERATOR '(' any_operator ')'
      | LIKE
      | NOT LIKE
      | ILIKE
      | NOT ILIKE
/* cannot put SIMILAR TO here, because SIMILAR TO is a hack.
 * the regular expression is preprocessed by a function (similar_escape),
 * and the ~ operator for posix regular expressions is used.
 *        x SIMILAR TO y     ->    x ~ similar_escape(y)
 * this transformation is made on the fly by the parser upwards.
 * however the SubLink structure which handles any/some/all stuff
 * is not ready for such a thing.
 */
      ;

expr_list:	a_expr
      | expr_list ',' a_expr
    ;

/* function arguments can have names */
func_arg_list:  func_arg_expr
      | func_arg_list ',' func_arg_expr
    ;

func_arg_expr:  a_expr
      | param_name COLON_EQUALS a_expr
    ;

type_list:	typename
      | type_list ',' typename
    ;

array_expr: '[' expr_list ']'
      | '[' array_expr_list ']'
      | '[' ']'
    ;

array_expr_list: array_expr
      | array_expr_list ',' array_expr
    ;


extract_list:
      extract_arg FROM a_expr
      | /*EMPTY*/
    ;

/* Allow delimited string sConst in extract_arg as an SQL extension.
 * - thomas 2001-04-12
 */
extract_arg:
      IDENT
      | YEAR_P
      | MONTH_P
      | DAY_P
      | HOUR_P
      | MINUTE_P
      | SECOND_P
      | sConst
    ;

/* OVERLAY() arguments
 * SQL99 defines the OVERLAY() function:
 * o overlay(text placing text from int for int)
 * o overlay(text placing text from int)
 * and similarly for binary strings
 */
overlay_list:
      a_expr overlay_placing substr_from substr_for
      | a_expr overlay_placing substr_from
    ;

overlay_placing:
      PLACING a_expr
    ;

/* position_list uses b_expr not a_expr to avoid conflict with general IN */

position_list:
      b_expr IN_P b_expr
      | /*EMPTY*/
    ;

/* SUBSTRING() arguments
 * SQL9x defines a specific syntax for arguments to SUBSTRING():
 * o substring(text from int for int)
 * o substring(text from int) get entire string from starting point "int"
 * o substring(text for int) get first "int" characters of string
 * o substring(text from pattern) get entire string matching pattern
 * o substring(text from pattern for escape) same with specified escape char
 * We also want to support generic substring functions which accept
 * the usual generic list of arguments. So we will accept both styles
 * here, and convert the SQL9x style to the generic list for further
 * processing. - thomas 2000-11-28
 */
substr_list:
      a_expr substr_from substr_for
      | a_expr substr_for substr_from
      | a_expr substr_from
      | a_expr substr_for
      | expr_list
      | /*EMPTY*/
    ;

substr_from:
      FROM a_expr
    ;

substr_for: FOR a_expr
    ;

trim_list:	a_expr FROM expr_list
      | FROM expr_list
      | expr_list
    ;

in_expr:	select_with_parens
      | '(' expr_list ')'
    ;

/*
 * Define SQL92-style case clause.
 * - Full specification
 *	CASE WHEN a = b THEN c ... ELSE d END
 * - Implicit argument
 *	CASE a WHEN b THEN c ... ELSE d END
 */
case_expr:	CASE case_arg when_clause_list case_default END_P
    ;

when_clause_list:
      /* There must be at least one */
      when_clause
      | when_clause_list when_clause
    ;

when_clause:
      WHEN a_expr THEN a_expr
    ;

case_default:
      ELSE a_expr
      | /*EMPTY*/
    ;

case_arg:	a_expr
      | /*EMPTY*/
    ;

columnref:	colId
      | colId indirection
         ;

indirection_el:
      '.' attr_name
      | '.' '*'
      | '[' a_expr ']'
      | '[' a_expr ':' a_expr ']'
        ;

indirection:
      indirection_el
      | indirection indirection_el
    ;

opt_indirection:
      /*EMPTY*/
      | opt_indirection indirection_el
    ;

opt_asymmetric: ASYMMETRIC
      | /*EMPTY*/
    ;

/*
 * The SQL spec defines "contextually typed value expressions" and
 * "contextually typed row value constructors", which for our purposes
 * are the same as "a_expr" and "row" except that DEFAULT can appear at
 * the top level.
 */

ctext_expr:
      a_expr
      | DEFAULT
    ;

ctext_expr_list:
      ctext_expr
      | ctext_expr_list ',' ctext_expr
    ;

/*
 * We should allow ROW '(' ctext_expr_list ')' too, but that seems to require
 * making VALUES a fully reserved word, which will probably break more apps
 * than allowing the noise-word is worth.
 */
ctext_row: '(' ctext_expr_list ')'
    ;


/*****************************************************************************
 *
 *	target list for SELECT
 *
 *****************************************************************************/

target_list:
      target_el
      | target_list ',' target_el
    ;

target_el:	a_expr AS colLabel
      /*
       * We support omitting AS only for column labels that aren't
       * any known keyword.  There is an ambiguity against postfix
       * operators: is "a ! b" an infix expression, or a postfix
       * expression and a column label?  We prefer to resolve this
       * as an infix expression, which we accomplish by assigning
       * IDENT a precedence higher than POSTFIXOP.
       */
      | a_expr IDENT
      | a_expr
      | '*'
        ;


/*****************************************************************************
 *
 *	Names and constants
 *
 *****************************************************************************/

qualified_name_list:
      qualified_name
      | qualified_name_list ',' qualified_name
    ;

/*
 * The production for a qualified relation name has to exactly match the
 * production for a qualified func_name, because in a FROM clause we cannot
 * tell which we are parsing until we see what comes after it ('(' for a
 * func_name, something else for a relation). Therefore we allow 'indirection'
 * which may contain subscripts, and reject that case in the C code.
 */
qualified_name:
      colId
      | colId indirection
    ;

name_list:	name
         | name_list ',' name
         ;


name:		colId;

database_name:
      colId;

access_method:
      colId;

attr_name:	colLabel;

index_name: colId;

file_name:	sConst;

/*
 * The production for a qualified func_name has to exactly match the
 * production for a qualified columnref, because we cannot tell which we
 * are parsing until we see what comes after it ('(' or sConst for a func_name,
 * anything else for a columnref).  Therefore we allow 'indirection' which
 * may contain subscripts, and reject that case in the C code.  (If we
 * ever implement SQL99-like methods, such syntax may actually become legal!)
 */
func_name:	type_function_name
      | colId indirection
    ;


/*
 * Constants
 */
aexprConst: iConst
      | FCONST
      | sConst
      | BCONST
      | XCONST
      | func_name sConst
      | func_name '(' func_arg_list ')' sConst
      | consttypename sConst
      | constInterval sConst opt_interval
      | constInterval '(' iConst ')' sConst opt_interval
      | TRUE_P
      | FALSE_P
      | NULL_P
    ;

iConst:		ICONST;
sConst:		SCONST;
roleId:		colId;

signedIconst: iConst
      | '+' iConst
      | '-' iConst
    ;

/*
 * Name classification hierarchy.
 *
 * IDENT is the lexeme returned by the lexer for identifiers that match
 * no known keyword.  In most cases, we can accept certain keywords as
 * names, not only IDENTs.	We prefer to accept as many such keywords
 * as possible to minimize the impact of "reserved words" on programmers.
 * So, we divide names into several possible classes.  The classification
 * is chosen in part to make keywords acceptable as names wherever possible.
 */

/* Column identifier --- names that can be column, table, etc names.
 */
colId:		IDENT
      | unreserved_keyword
      | col_name_keyword
    ;

/* Type/function identifier --- names that can be type or function names.
 */
type_function_name:	IDENT
      | unreserved_keyword
      | type_func_name_keyword
    ;

/* Column label --- allowed labels in "AS" clauses.
 * This presently includes *all* Postgres keywords.
 */
colLabel:	IDENT
      | unreserved_keyword
      | col_name_keyword
      | type_func_name_keyword
      | reserved_keyword
    ;


/*
 * Keyword category lists.  Generally, every keyword present in
 * the Postgres grammar should appear in exactly one of these lists.
 *
 * Put a new keyword into the first list that it can go into without causing
 * shift or reduce conflicts.  The earlier lists define "less reserved"
 * categories of keywords.
 *
 * Make sure that each keyword's category in kwlist.h matches where
 * it is listed here.  (Someday we may be able to generate these lists and
 * kwlist.h's table from a common master list.)
 */

/* "Unreserved" keywords --- available for use as any kind of name.
 */
unreserved_keyword:
        ABORT_P
      | ABSOLUTE_P
      | ACCESS
      | ACTION
      | ADD_P
      | ADMIN
      | AFTER
      | AGGREGATE
      | ALSO
      | ALTER
      | ALWAYS
      | ASSERTION
      | ASSIGNMENT
      | AT
      | ATTRIBUTE
      | BACKWARD
      | BEFORE
      | BEGIN_P
      | BY
      | CACHE
      | CALLED
      | CASCADE
      | CASCADED
      | CATALOG_P
      | CHAIN
      | CHARACTERISTICS
      | CHECKPOINT
      | CLASS
      | CLOSE
      | CLUSTER
      | COMMENT
      | COMMENTS
      | COMMIT
      | COMMITTED
      | CONFIGURATION
      | CONNECTION
      | CONSTRAINTS
      | CONTENT_P
      | CONTINUE_P
      | CONVERSION_P
      | COPY
      | COST
      | CSV
      | CURRENT_P
      | CURSOR
      | CYCLE
      | DATA_P
      | DATABASE
      | DAY_P
      | DEALLOCATE
      | DECLARE
      | DEFAULTS
      | DEFERRED
      | DEFINER
      | DELETE_P
      | DELIMITER
      | DELIMITERS
      | DICTIONARY
      | DISABLE_P
      | DISCARD
      | DOCUMENT_P
      | DOMAIN_P
      | DOUBLE_P
      | DROP
      | EACH
      | ENABLE_P
      | ENCODING
      | ENCRYPTED
      | ENUM_P
      | ESCAPE
      | EXCLUDE
      | EXCLUDING
      | EXCLUSIVE
      | EXECUTE
      | EXPLAIN
      | EXTENSION
      | EXTERNAL
      | FAMILY
      | FIRST_P
      | FOLLOWING
      | FORCE
      | FORWARD
      | FUNCTION
      | FUNCTIONS
      | GLOBAL
      | GRANTED
      | HANDLER
      | HEADER_P
      | HOLD
      | HOUR_P
      | IDENTITY_P
      | IF_P
      | IMMEDIATE
      | IMMUTABLE
      | IMPLICIT_P
      | INCLUDING
      | INCREMENT
      | INDEX
      | INDEXES
      | INHERIT
      | INHERITS
      | INLINE_P
      | INPUT_P
      | INSENSITIVE
      | INSERT
      | INSTEAD
      | INVOKER
      | ISOLATION
      | KEY
      | LABEL
      | LANGUAGE
      | LARGE_P
      | LAST_P
      | LC_COLLATE_P
      | LC_CTYPE_P
      | LEAKPROOF
      | LEVEL
      | LISTEN
      | LOAD
      | LOCAL
      | LOCATION
      | LOCK_P
      | MAPPING
      | MATCH
      | MAXVALUE
      | MINUTE_P
      | MINVALUE
      | MODE
      | MONTH_P
      | MOVE
      | NAME_P
      | NAMES
      | NEXT
      | NO
      | NOTHING
      | NOTIFY
      | NOWAIT
      | NULLS_P
      | OBJECT_P
      | OF
      | OFF
      | OIDS
      | OPERATOR
      | OPTION
      | OPTIONS
      | OWNED
      | OWNER
      | PARSER
      | PARTIAL
      | PARTITION
      | PASSING
      | PASSWORD
      | PLANS
      | PRECEDING
      | PREPARE
      | PREPARED
      | PRESERVE
      | PRIOR
      | PRIVILEGES
      | PROCEDURAL
      | PROCEDURE
      | QUOTE
      | RANGE
      | READ
      | REASSIGN
      | RECHECK
      | RECURSIVE
      | REF
      | REINDEX
      | RELATIVE_P
      | RELEASE
      | RENAME
      | REPEATABLE
      | REPLACE
      | REPLICA
      | RESET
      | RESTART
      | RESTRICT
      | RETURNS
      | REVOKE
      | ROLE
      | ROLLBACK
      | ROWS
      | RULE
      | SAVEPOINT
      | SCHEMA
      | SCROLL
      | SEARCH
      | SECOND_P
      | SECURITY
      | SEQUENCE
      | SEQUENCES
      | SERIALIZABLE
      | SERVER
      | SESSION
      | SET
      | SHARE
      | SHOW
      | SIMPLE
      | SNAPSHOT
      | STABLE
      | STANDALONE_P
      | START
      | STATEMENT
      | STATISTICS
      | STDIN
      | STDOUT
      | STORAGE
      | STRICT_P
      | STRIP_P
      | SYSID
      | SYSTEM_P
      | TABLES
      | TABLESPACE
      | TEMP
      | TEMPLATE
      | TEMPORARY
      | TEXT_P
      | TRANSACTION
      | TRIGGER
      | TRUNCATE
      | TRUSTED
      | TYPE_P
      | TYPES_P
      | UNBOUNDED
      | UNCOMMITTED
      | UNENCRYPTED
      | UNKNOWN
      | UNLISTEN
      | UNLOGGED
      | UNTIL
      | UPDATE
      | VACUUM
      | VALID
      | VALIDATE
      | VALIDATOR
      | VALUE_P
      | VARYING
      | VERSION_P
      | VIEW
      | VOLATILE
      | WHITESPACE_P
      | WITHOUT
      | WORK
      | WRAPPER
      | WRITE
      | XML_P
      | YEAR_P
      | YES_P
      | ZONE
    ;

/* Column identifier --- keywords that can be column, table, etc names.
 *
 * Many of these keywords will in fact be recognized as type or function
 * names too; but they have special productions for the purpose, and so
 * can't be treated as "generic" type or function names.
 *
 * The type names appearing here are not usable as function names
 * because they can be followed by '(' in typename productions, which
 * looks too much like a function call for an LR(1) parser.
 */
col_name_keyword:
        BETWEEN
      | BIGINT
      | BIT
      | BOOLEAN_P
      | CHAR_P
      | CHARACTER
      | COALESCE
      | DEC
      | DECIMAL_P
      | EXISTS
      | EXTRACT
      | FLOAT_P
      | GREATEST
      | INOUT
      | INT_P
      | INTEGER
      | INTERVAL
      | LEAST
      | NATIONAL
      | NCHAR
      | NONE
      | NULLIF
      | NUMERIC
      | OUT_P
      | OVERLAY
      | POSITION
      | PRECISION
      | REAL
      | ROW
      | SETOF
      | SMALLINT
      | SUBSTRING
      | TIME
      | TIMESTAMP
      | TREAT
      | TRIM
      | VALUES
      | VARCHAR
      | XMLATTRIBUTES
      | XMLCONCAT
      | XMLELEMENT
      | XMLEXISTS
      | XMLFOREST
      | XMLPARSE
      | XMLPI
      | XMLROOT
      | XMLSERIALIZE
    ;

/* Type/function identifier --- keywords that can be type or function names.
 *
 * Most of these are keywords that are used as operators in expressions;
 * in general such keywords can't be column names because they would be
 * ambiguous with variables, but they are unambiguous as function identifiers.
 *
 * Do not include POSITION, SUBSTRING, etc here since they have explicit
 * productions in a_expr to support the goofy SQL9x argument syntax.
 * - thomas 2000-11-28
 */
type_func_name_keyword:
        AUTHORIZATION
      | BINARY
      | COLLATION
      | CONCURRENTLY
      | CROSS
      | CURRENT_SCHEMA
      | FREEZE
      | FULL
      | ILIKE
      | INNER_P
      | IS
      | ISNULL
      | JOIN
      | LEFT
      | LIKE
      | NATURAL
      | NOTNULL
      | OUTER_P
      | OVER
      | OVERLAPS
      | RIGHT
      | SIMILAR
      | VERBOSE
    ;

/* Reserved keyword --- these keywords are usable only as a colLabel.
 *
 * Keywords appear here if they could not be distinguished from variable,
 * type, or function names in some contexts.  Don't put things here unless
 * forced to.
 */
reserved_keyword:
        ALL
      | ANALYSE
      | ANALYZE
      | AND
      | ANY
      | ARRAY
      | AS
      | ASC
      | ASYMMETRIC
      | BOTH
      | CASE
      | CAST
      | CHECK
      | COLLATE
      | COLUMN
      | CONSTRAINT
      | CREATE
      | CURRENT_CATALOG
      | CURRENT_DATE
      | CURRENT_ROLE
      | CURRENT_TIME
      | CURRENT_TIMESTAMP
      | CURRENT_USER
      | DEFAULT
      | DEFERRABLE
      | DESC
      | DISTINCT
      | DO
      | ELSE
      | END_P
      | EXCEPT
      | FALSE_P
      | FETCH
      | FOR
      | FOREIGN
      | FROM
      | GRANT
      | GROUP_P
      | HAVING
      | IN_P
      | INITIALLY
      | INTERSECT
      | INTO
      | LEADING
      | LIMIT
      | LOCALTIME
      | LOCALTIMESTAMP
      | NOT
      | NULL_P
      | OFFSET
      | ON
      | ONLY
      | OR
      | ORDER
      | PLACING
      | PRIMARY
      | REFERENCES
      | RETURNING
      | SELECT
      | SESSION_USER
      | SOME
      | SYMMETRIC
      | TABLE
      | THEN
      | TO
      | TRAILING
      | TRUE_P
      | UNION
      | UNIQUE
      | USER
      | USING
      | VARIADIC
      | WHEN
      | WHERE
      | WINDOW
      | WITH
    ;

