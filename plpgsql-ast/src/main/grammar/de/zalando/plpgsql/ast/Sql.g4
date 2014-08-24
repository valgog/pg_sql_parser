grammar Sql;
import SqlKeyWords, PlPgSqlKeyWords;

stmtblock:        stmtmulti
    ;

stmtmulti:        stmtmulti ';' stmt
    |   stmt
    ;

stmt:        alterDatabaseStmt
    |   alterDatabaseSetStmt
    |   alterDefaultPrivilegesStmt
    |   alterDomainStmt
    |   alterEnumStmt
    |   alterExtensionStmt
    |   alterExtensionContentsStmt
    |   alterFdwStmt
    |   alterForeignServerStmt
    |   alterForeignTableStmt
    |   alterFunctionStmt
    |   alterGroupStmt
    |   alterObjectSchemaStmt
    |   alterOwnerStmt
    |   alterSeqStmt
    |   alterTableStmt
    |   alterCompositeTypeStmt
    |   alterRoleSetStmt
    |   alterRoleStmt
    |   alterTSConfigurationStmt
    |   alterTSDictionaryStmt
    |   alterUserMappingStmt
    |   alterUserSetStmt
    |   alterUserStmt
    |   analyzeStmt
    |   checkPointStmt
    |   closePortalStmt
    |   clusterStmt
    |   commentStmt
    |   constraintsSetStmt
    |   copyStmt
    |   createAsStmt
    |   createAssertStmt
    |   createCastStmt
    |   createConversionStmt
    |   createDomainStmt
    |   createExtensionStmt
    |   createFdwStmt
    |   createForeignServerStmt
    |   createForeignTableStmt
    |   createFunctionStmt
    |   createGroupStmt
    |   createOpClassStmt
    |   createOpFamilyStmt
    |   alterOpFamilyStmt
    |   createPLangStmt
    |   createSchemaStmt
    |   createSeqStmt
    |   createStmt
    |   createTableSpaceStmt
    |   createTrigStmt
    |   createRoleStmt
    |   createUserStmt
    |   createUserMappingStmt
    |   createdbStmt
    |   deallocateStmt
    |   declareCursorStmt
    |   defineStmt
    |   deleteStmt
    |   discardStmt
    |   doStmt
    |   dropAssertStmt
    |   dropCastStmt
    |   dropFdwStmt
    |   dropForeignServerStmt
    |   dropGroupStmt
    |   dropOpClassStmt
    |   dropOpFamilyStmt
    |   dropOwnedStmt
    |   dropPLangStmt
    |   dropRuleStmt
    |   dropStmt
    |   dropTableSpaceStmt
    |   dropTrigStmt
    |   dropRoleStmt
    |   dropUserStmt
    |   dropUserMappingStmt
    |   dropdbStmt
    |   executeStmt
    |   explainStmt
    |   fetchStmt
    |   grantStmt
    |   grantRoleStmt
    |   indexStmt
    |   insertStmt
    |   listenStmt
    |   loadStmt
    |   lockStmt
    |   notifyStmt
    |   prepareStmt
    |   reassignOwnedStmt
    |   reindexStmt
    |   removeAggrStmt
    |   removeFuncStmt
    |   removeOperStmt
    |   renameStmt
    |   revokeStmt
    |   revokeRoleStmt
    |   ruleStmt
    |   secLabelStmt
    |   selectStmt
    |   transactionStmt
    |   truncateStmt
    |   unlistenStmt
    |   updateStmt
    |   vacuumStmt
    |   variableResetStmt
    |   variableSetStmt
    |   variableShowStmt
    |   viewStmt
    |
    ;

createRoleStmt:        CREATE ROLE roleId opt_with optRoleList
    ;

opt_with:        WITH
    |
    ;

optRoleList:        optRoleList createOptRoleElem
    |
    ;

alterOptRoleList:        alterOptRoleList alterOptRoleElem
    |
    ;

alterOptRoleElem:        PASSWORD sconst
    |   ENCRYPTED PASSWORD sconst
    |   UNENCRYPTED PASSWORD sconst
    |   CONNECTION LIMIT signedIconst
    |   VALID UNTIL sconst
    |   USER name_list
    |   PASSWORD NULL_P
    |   INHERIT
    |   IDENT
    ;

createOptRoleElem:        alterOptRoleElem
    |   SYSID iconst
    |   ADMIN name_list
    |   ROLE name_list
    |   IN_P ROLE name_list
    |   IN_P GROUP_P name_list
    ;

createUserStmt:        CREATE USER roleId opt_with optRoleList
    ;

alterRoleStmt:        ALTER ROLE roleId opt_with alterOptRoleList
    ;

opt_in_database:        IN_P DATABASE database_name
    |
    ;

alterRoleSetStmt:        ALTER ROLE roleId opt_in_database setResetClause
    ;

alterUserStmt:        ALTER USER roleId opt_with alterOptRoleList
    ;

alterUserSetStmt:        ALTER USER roleId setResetClause
    ;

dropRoleStmt:        DROP ROLE name_list
    |   DROP ROLE IF_P EXISTS name_list
    ;

dropUserStmt:        DROP USER name_list
    |   DROP USER IF_P EXISTS name_list
    ;

createGroupStmt:        CREATE GROUP_P roleId opt_with optRoleList
    ;

alterGroupStmt:        ALTER GROUP_P roleId add_drop USER name_list
    ;

add_drop:        ADD_P
    |   DROP
    ;

dropGroupStmt:        DROP GROUP_P name_list
    |   DROP GROUP_P IF_P EXISTS name_list
    ;

createSchemaStmt:        CREATE SCHEMA optSchemaName AUTHORIZATION roleId optSchemaEltList
    |   CREATE SCHEMA colId optSchemaEltList
    ;

optSchemaName:        colId
    |
    ;

optSchemaEltList:        optSchemaEltList schema_stmt
    |
    ;

schema_stmt:        createStmt
    |   indexStmt
    |   createSeqStmt
    |   createTrigStmt
    |   grantStmt
    |   viewStmt
    ;

variableSetStmt:        SET set_rest
    |   SET LOCAL set_rest
    |   SET SESSION set_rest
    ;

set_rest:        TRANSACTION transaction_mode_list
    |   SESSION CHARACTERISTICS AS TRANSACTION transaction_mode_list
    |   set_rest_more
    ;

set_rest_more:        var_name '=' var_list
    |   var_name '=' DEFAULT
    |   var_name TO var_list
    |   var_name TO DEFAULT
    |   var_name FROM CURRENT_P
    |   TIME ZONE zone_value
    |   CATALOG_P sconst
    |   SCHEMA sconst
    |   NAMES opt_encoding
    |   ROLE colId_or_Sconst
    |   SESSION AUTHORIZATION colId_or_Sconst
    |   XML_P OPTION document_or_content
    |   TRANSACTION SNAPSHOT sconst
    |   SESSION AUTHORIZATION DEFAULT
    ;

var_name:        var_name '.' colId
    |   colId
    ;

var_list:        var_list ',' var_value
    |   var_value
    ;

var_value:        opt_boolean_or_string
    |   numericOnly
    ;

iso_level:        READ UNCOMMITTED
    |   READ COMMITTED
    |   REPEATABLE READ
    |   SERIALIZABLE
    ;

opt_boolean_or_string:        colId_or_Sconst
    |   TRUE_P
    |   FALSE_P
    |   ON
    ;

zone_value:        constInterval '(' iconst ')' sconst opt_interval
    |   constInterval sconst opt_interval
    |   sconst
    |   numericOnly
    |   IDENT
    |   DEFAULT
    |   LOCAL
    ;

opt_encoding:        sconst
    |   DEFAULT
    |
    ;

colId_or_Sconst:        colId
    |   sconst
    ;

variableResetStmt:        RESET var_name
    |   RESET TIME ZONE
    |   RESET TRANSACTION ISOLATION LEVEL
    |   RESET SESSION AUTHORIZATION
    |   RESET ALL
    ;

setResetClause:        SET set_rest
    |   variableResetStmt
    ;

functionSetResetClause:        SET set_rest_more
    |   variableResetStmt
    ;

variableShowStmt:        SHOW var_name
    |   SHOW TIME ZONE
    |   SHOW TRANSACTION ISOLATION LEVEL
    |   SHOW SESSION AUTHORIZATION
    |   SHOW ALL
    ;

constraintsSetStmt:        SET CONSTRAINTS constraints_set_list constraints_set_mode
    ;

constraints_set_list:        qualified_name_list
    |   ALL
    ;

constraints_set_mode:        DEFERRED
    |   IMMEDIATE
    ;

checkPointStmt:        CHECKPOINT
    ;

discardStmt:        DISCARD ALL
    |   DISCARD TEMP
    |   DISCARD TEMPORARY
    |   DISCARD PLANS
    ;

alterTableStmt:        ALTER TABLE relation_expr alter_table_cmds
    |   ALTER TABLE IF_P EXISTS relation_expr alter_table_cmds
    |   ALTER INDEX qualified_name alter_table_cmds
    |   ALTER INDEX IF_P EXISTS qualified_name alter_table_cmds
    |   ALTER SEQUENCE qualified_name alter_table_cmds
    |   ALTER SEQUENCE IF_P EXISTS qualified_name alter_table_cmds
    |   ALTER VIEW qualified_name alter_table_cmds
    |   ALTER VIEW IF_P EXISTS qualified_name alter_table_cmds
    ;

alter_table_cmds:        alter_table_cmds ',' alter_table_cmd
    |   alter_table_cmd
    ;

alter_table_cmd:        ALTER opt_column colId opt_set_data TYPE_P typename opt_collate_clause alter_using
    |   ALTER opt_column colId alter_column_default
    |   ALTER opt_column colId SET STATISTICS signedIconst
    |   ALTER opt_column colId SET reloptions
    |   ALTER opt_column colId RESET reloptions
    |   ALTER opt_column colId SET STORAGE colId
    |   DROP opt_column IF_P EXISTS colId opt_drop_behavior
    |   DROP opt_column colId opt_drop_behavior
    |   ALTER opt_column colId alter_generic_options
    |   ALTER opt_column colId DROP NOT NULL_P
    |   ALTER opt_column colId SET NOT NULL_P
    |   DROP CONSTRAINT IF_P EXISTS name opt_drop_behavior
    |   DROP CONSTRAINT name opt_drop_behavior
    |   ADD_P columnDef
    |   ADD_P COLUMN columnDef
    |   ADD_P tableConstraint
    |   VALIDATE CONSTRAINT name
    |   CLUSTER ON name
    |   ENABLE_P TRIGGER name
    |   ENABLE_P ALWAYS TRIGGER name
    |   ENABLE_P REPLICA TRIGGER name
    |   DISABLE_P TRIGGER name
    |   ENABLE_P RULE name
    |   ENABLE_P ALWAYS RULE name
    |   ENABLE_P REPLICA RULE name
    |   DISABLE_P RULE name
    |   INHERIT qualified_name
    |   NO INHERIT qualified_name
    |   OF any_name
    |   OWNER TO roleId
    |   SET TABLESPACE name
    |   SET reloptions
    |   RESET reloptions
    |   alter_generic_options
    |   SET WITH OIDS
    |   SET WITHOUT OIDS
    |   SET WITHOUT CLUSTER
    |   ENABLE_P TRIGGER ALL
    |   ENABLE_P TRIGGER USER
    |   DISABLE_P TRIGGER ALL
    |   DISABLE_P TRIGGER USER
    |   NOT OF
    ;

alter_column_default:        SET DEFAULT a_expr
    |   DROP DEFAULT
    ;

opt_drop_behavior:        CASCADE
    |   RESTRICT
    |
    ;

opt_collate_clause:        COLLATE any_name
    |
    ;

alter_using:        USING a_expr
    |
    ;

reloptions:        '(' reloption_list ')'
    ;

opt_reloptions:        WITH reloptions
    |
    ;

reloption_list:        reloption_list ',' reloption_elem
    |   reloption_elem
    ;

reloption_elem:        colLabel '.' colLabel '=' def_arg
    |   colLabel '.' colLabel
    |   colLabel '=' def_arg
    |   colLabel
    ;

alterCompositeTypeStmt:        ALTER TYPE_P any_name alter_type_cmds
    ;

alter_type_cmds:        alter_type_cmds ',' alter_type_cmd
    |   alter_type_cmd
    ;

alter_type_cmd:        ALTER ATTRIBUTE colId opt_set_data TYPE_P typename opt_collate_clause opt_drop_behavior
    |   ADD_P ATTRIBUTE tableFuncElement opt_drop_behavior
    |   DROP ATTRIBUTE IF_P EXISTS colId opt_drop_behavior
    |   DROP ATTRIBUTE colId opt_drop_behavior
    ;

closePortalStmt:        CLOSE cursor_name
    |   CLOSE ALL
    ;

copyStmt:        COPY opt_binary qualified_name opt_column_list opt_oids copy_from copy_file_name copy_delimiter opt_with copy_options
    |   COPY select_with_parens TO copy_file_name opt_with copy_options
    ;

copy_from:        FROM
    |   TO
    ;

copy_file_name:        sconst
    |   STDIN
    |   STDOUT
    ;

copy_options:        '(' copy_generic_opt_list ')'
    |   copy_opt_list
    ;

copy_opt_list:        copy_opt_list copy_opt_item
    |
    ;

copy_opt_item:        FORCE QUOTE '*'
    |   DELIMITER opt_as sconst
    |   NULL_P opt_as sconst
    |   QUOTE opt_as sconst
    |   ESCAPE opt_as sconst
    |   FORCE QUOTE columnList
    |   FORCE NOT NULL_P columnList
    |   ENCODING sconst
    |   BINARY
    |   OIDS
    |   CSV
    |   HEADER_P
    ;

opt_binary:        BINARY
    |
    ;

opt_oids:        WITH OIDS
    |
    ;

copy_delimiter:        opt_using DELIMITERS sconst
    |
    ;

opt_using:        USING
    |
    ;

copy_generic_opt_list:        copy_generic_opt_list ',' copy_generic_opt_elem
    |   copy_generic_opt_elem
    ;

copy_generic_opt_elem:        colLabel copy_generic_opt_arg
    ;

copy_generic_opt_arg:        '(' copy_generic_opt_arg_list ')'
    |   '*'
    |   opt_boolean_or_string
    |   numericOnly
    |
    ;

copy_generic_opt_arg_list:        copy_generic_opt_arg_list ',' copy_generic_opt_arg_list_item
    |   copy_generic_opt_arg_list_item
    ;

copy_generic_opt_arg_list_item:        opt_boolean_or_string
    ;

createStmt:        CREATE optTemp TABLE qualified_name '(' optTableElementList ')' optInherit optWith onCommitOption optTableSpace
    |   CREATE optTemp TABLE IF_P NOT EXISTS qualified_name '(' optTableElementList ')' optInherit optWith onCommitOption optTableSpace
    |   CREATE optTemp TABLE qualified_name OF any_name optTypedTableElementList optWith onCommitOption optTableSpace
    |   CREATE optTemp TABLE IF_P NOT EXISTS qualified_name OF any_name optTypedTableElementList optWith onCommitOption optTableSpace
    ;

optTemp:        TEMPORARY
    |   TEMP
    |   LOCAL TEMPORARY
    |   LOCAL TEMP
    |   GLOBAL TEMPORARY
    |   GLOBAL TEMP
    |   UNLOGGED
    |
    ;

optTableElementList:        tableElementList
    |
    ;

optTypedTableElementList:        '(' typedTableElementList ')'
    |
    ;

tableElementList:        tableElementList ',' tableElement
    |   tableElement
    ;

typedTableElementList:        typedTableElementList ',' typedTableElement
    |   typedTableElement
    ;

tableElement:        columnDef
    |   tableLikeClause
    |   tableConstraint
    ;

typedTableElement:        columnOptions
    |   tableConstraint
    ;

columnDef:        colId typename create_generic_options colQualList
    ;

columnOptions:        colId WITH OPTIONS colQualList
    ;

colQualList:        colQualList colConstraint
    |
    ;

colConstraint:        CONSTRAINT name colConstraintElem
    |   colConstraintElem
    |   constraintAttr
    |   COLLATE any_name
    ;

colConstraintElem:        CHECK '(' a_expr ')' opt_no_inherit
    |   REFERENCES qualified_name opt_column_list key_match key_actions
    |   UNIQUE opt_definition optConsTableSpace
    |   PRIMARY KEY opt_definition optConsTableSpace
    |   DEFAULT b_expr
    |   NOT NULL_P
    |   NULL_P
    ;

constraintAttr:        DEFERRABLE
    |   NOT DEFERRABLE
    |   INITIALLY DEFERRED
    |   INITIALLY IMMEDIATE
    ;

tableLikeClause:        LIKE qualified_name tableLikeOptionList
    ;

tableLikeOptionList:        tableLikeOptionList INCLUDING tableLikeOption
    |   tableLikeOptionList EXCLUDING tableLikeOption
    |
    ;

tableLikeOption:        DEFAULTS
    |   CONSTRAINTS
    |   INDEXES
    |   STORAGE
    |   COMMENTS
    |   ALL
    ;

tableConstraint:        CONSTRAINT name constraintElem
    |   constraintElem
    ;

constraintElem:        FOREIGN KEY '(' columnList ')' REFERENCES qualified_name opt_column_list key_match key_actions constraintAttributeSpec
    |   UNIQUE '(' columnList ')' opt_definition optConsTableSpace constraintAttributeSpec
    |   PRIMARY KEY '(' columnList ')' opt_definition optConsTableSpace constraintAttributeSpec
    |   CHECK '(' a_expr ')' constraintAttributeSpec
    |   EXCLUDE access_method_clause '(' exclusionConstraintList ')' opt_definition optConsTableSpace exclusionWhereClause constraintAttributeSpec
    |   UNIQUE existingIndex constraintAttributeSpec
    |   PRIMARY KEY existingIndex constraintAttributeSpec
    ;

opt_no_inherit:        NO INHERIT
    |
    ;

opt_column_list:        '(' columnList ')'
    |
    ;

columnList:        columnList ',' columnElem
    |   columnElem
    ;

columnElem:        colId
    ;

key_match:        MATCH FULL
    |   MATCH PARTIAL
    |   MATCH SIMPLE
    |
    ;

exclusionConstraintList:        exclusionConstraintList ',' exclusionConstraintElem
    |   exclusionConstraintElem
    ;

exclusionConstraintElem:        index_elem WITH OPERATOR '(' any_operator ')'
    |   index_elem WITH any_operator
    ;

exclusionWhereClause:        WHERE '(' a_expr ')'
    |
    ;

key_actions:        key_update key_delete
    |   key_delete key_update
    |   key_update
    |   key_delete
    |
    ;

key_update:        ON UPDATE key_action
    ;

key_delete:        ON DELETE_P key_action
    ;

key_action:        NO ACTION
    |   RESTRICT
    |   CASCADE
    |   SET NULL_P
    |   SET DEFAULT
    ;

optInherit:        INHERITS '(' qualified_name_list ')'
    |
    ;

optWith:        WITH reloptions
    |   WITH OIDS
    |   WITHOUT OIDS
    |
    ;

onCommitOption:        ON COMMIT DROP
    |   ON COMMIT DELETE_P ROWS
    |   ON COMMIT PRESERVE ROWS
    |
    ;

optTableSpace:        TABLESPACE name
    |
    ;

optConsTableSpace:        USING INDEX TABLESPACE name
    |
    ;

existingIndex:        USING INDEX index_name
    ;

createAsStmt:        CREATE optTemp TABLE create_as_target AS selectStmt opt_with_data
    ;

create_as_target:        qualified_name opt_column_list optWith onCommitOption optTableSpace
    ;

opt_with_data:        WITH DATA_P
    |   WITH NO DATA_P
    |
    ;

createSeqStmt:        CREATE optTemp SEQUENCE qualified_name optSeqOptList
    ;

alterSeqStmt:        ALTER SEQUENCE qualified_name seqOptList
    |   ALTER SEQUENCE IF_P EXISTS qualified_name seqOptList
    ;

optSeqOptList:        seqOptList
    |
    ;

seqOptList:        seqOptList seqOptElem
    |   seqOptElem
    ;

seqOptElem:        INCREMENT opt_by numericOnly
    |   START opt_with numericOnly
    |   RESTART opt_with numericOnly
    |   CACHE numericOnly
    |   MAXVALUE numericOnly
    |   MINVALUE numericOnly
    |   OWNED BY any_name
    |   CYCLE
    |   NO CYCLE
    |   NO MAXVALUE
    |   NO MINVALUE
    |   RESTART
    ;

opt_by:        BY
    |
    ;

numericOnly:        '-' FCONST
    |   signedIconst
    |   FCONST
    ;

numericOnly_list:        numericOnly_list ',' numericOnly
    |   numericOnly
    ;

createPLangStmt:        CREATE opt_or_replace opt_trusted opt_procedural LANGUAGE colId_or_Sconst HANDLER handler_name opt_inline_handler opt_validator
    |   CREATE opt_or_replace opt_trusted opt_procedural LANGUAGE colId_or_Sconst
    ;

opt_trusted:        TRUSTED
    |
    ;

handler_name:        name attrs
    |   name
    ;

opt_inline_handler:        INLINE_P handler_name
    |
    ;

validator_clause:        VALIDATOR handler_name
    |   NO VALIDATOR
    ;

opt_validator:        validator_clause
    |
    ;

dropPLangStmt:        DROP opt_procedural LANGUAGE colId_or_Sconst opt_drop_behavior
    |   DROP opt_procedural LANGUAGE IF_P EXISTS colId_or_Sconst opt_drop_behavior
    ;

opt_procedural:        PROCEDURAL
    |
    ;

createTableSpaceStmt:        CREATE TABLESPACE name optTableSpaceOwner LOCATION sconst
    ;

optTableSpaceOwner:        OWNER name
    |
    ;

dropTableSpaceStmt:        DROP TABLESPACE name
    |   DROP TABLESPACE IF_P EXISTS name
    ;

createExtensionStmt:        CREATE EXTENSION name opt_with create_extension_opt_list
    |   CREATE EXTENSION IF_P NOT EXISTS name opt_with create_extension_opt_list
    ;

create_extension_opt_list:        create_extension_opt_list create_extension_opt_item
    |
    ;

create_extension_opt_item:        SCHEMA name
    |   VERSION_P colId_or_Sconst
    |   FROM colId_or_Sconst
    ;

alterExtensionStmt:        ALTER EXTENSION name UPDATE alter_extension_opt_list
    ;

alter_extension_opt_list:        alter_extension_opt_list alter_extension_opt_item
    |
    ;

alter_extension_opt_item:        TO colId_or_Sconst
    ;

alterExtensionContentsStmt:        ALTER EXTENSION name add_drop CAST '(' typename AS typename ')'
    |   ALTER EXTENSION name add_drop AGGREGATE func_name aggr_args
    |   ALTER EXTENSION name add_drop opt_procedural LANGUAGE name
    |   ALTER EXTENSION name add_drop OPERATOR any_operator oper_argtypes
    |   ALTER EXTENSION name add_drop OPERATOR CLASS any_name USING access_method
    |   ALTER EXTENSION name add_drop OPERATOR FAMILY any_name USING access_method
    |   ALTER EXTENSION name add_drop COLLATION any_name
    |   ALTER EXTENSION name add_drop CONVERSION_P any_name
    |   ALTER EXTENSION name add_drop DOMAIN_P any_name
    |   ALTER EXTENSION name add_drop FUNCTION function_with_argtypes
    |   ALTER EXTENSION name add_drop SCHEMA name
    |   ALTER EXTENSION name add_drop TABLE any_name
    |   ALTER EXTENSION name add_drop TEXT_P SEARCH PARSER any_name
    |   ALTER EXTENSION name add_drop TEXT_P SEARCH DICTIONARY any_name
    |   ALTER EXTENSION name add_drop TEXT_P SEARCH TEMPLATE any_name
    |   ALTER EXTENSION name add_drop TEXT_P SEARCH CONFIGURATION any_name
    |   ALTER EXTENSION name add_drop SEQUENCE any_name
    |   ALTER EXTENSION name add_drop VIEW any_name
    |   ALTER EXTENSION name add_drop FOREIGN TABLE any_name
    |   ALTER EXTENSION name add_drop FOREIGN DATA_P WRAPPER name
    |   ALTER EXTENSION name add_drop SERVER name
    |   ALTER EXTENSION name add_drop TYPE_P any_name
    ;

createFdwStmt:        CREATE FOREIGN DATA_P WRAPPER name opt_fdw_options create_generic_options
    ;

fdw_option:        HANDLER handler_name
    |   VALIDATOR handler_name
    |   NO HANDLER
    |   NO VALIDATOR
    ;

fdw_options:        fdw_options fdw_option
    |   fdw_option
    ;

opt_fdw_options:        fdw_options
    |
    ;

dropFdwStmt:        DROP FOREIGN DATA_P WRAPPER name opt_drop_behavior
    |   DROP FOREIGN DATA_P WRAPPER IF_P EXISTS name opt_drop_behavior
    ;

alterFdwStmt:        ALTER FOREIGN DATA_P WRAPPER name opt_fdw_options alter_generic_options
    |   ALTER FOREIGN DATA_P WRAPPER name fdw_options
    ;

create_generic_options:        OPTIONS '(' generic_option_list ')'
    |
    ;

generic_option_list:        generic_option_list ',' generic_option_elem
    |   generic_option_elem
    ;

alter_generic_options:        OPTIONS '(' alter_generic_option_list ')'
    ;

alter_generic_option_list:        alter_generic_option_list ',' alter_generic_option_elem
    |   alter_generic_option_elem
    ;

alter_generic_option_elem:        generic_option_elem
    |   SET generic_option_elem
    |   ADD_P generic_option_elem
    |   DROP generic_option_name
    ;

generic_option_elem:        generic_option_name generic_option_arg
    ;

generic_option_name:        colLabel
    ;

generic_option_arg:        sconst
    ;

createForeignServerStmt:        CREATE SERVER name opt_type opt_foreign_server_version FOREIGN DATA_P WRAPPER name create_generic_options
    ;

opt_type:        TYPE_P sconst
    |
    ;

foreign_server_version:        VERSION_P sconst
    |   VERSION_P NULL_P
    ;

opt_foreign_server_version:        foreign_server_version
    |
    ;

dropForeignServerStmt:        DROP SERVER name opt_drop_behavior
    |   DROP SERVER IF_P EXISTS name opt_drop_behavior
    ;

alterForeignServerStmt:        ALTER SERVER name foreign_server_version alter_generic_options
    |   ALTER SERVER name foreign_server_version
    |   ALTER SERVER name alter_generic_options
    ;

createForeignTableStmt:        CREATE FOREIGN TABLE qualified_name optForeignTableElementList SERVER name create_generic_options
    |   CREATE FOREIGN TABLE IF_P NOT EXISTS qualified_name optForeignTableElementList SERVER name create_generic_options
    ;

optForeignTableElementList:        '(' ')'
    |   '(' foreignTableElementList ')'
    ;

foreignTableElementList:        foreignTableElementList ',' foreignTableElement
    |   foreignTableElement
    ;

foreignTableElement:        columnDef
    ;

alterForeignTableStmt:        ALTER FOREIGN TABLE relation_expr alter_table_cmds
    |   ALTER FOREIGN TABLE IF_P EXISTS relation_expr alter_table_cmds
    ;

createUserMappingStmt:        CREATE USER MAPPING FOR auth_ident SERVER name create_generic_options
    ;

auth_ident:        roleId
    |   CURRENT_USER
    |   USER
    ;

dropUserMappingStmt:        DROP USER MAPPING FOR auth_ident SERVER name
    |   DROP USER MAPPING IF_P EXISTS FOR auth_ident SERVER name
    ;

alterUserMappingStmt:        ALTER USER MAPPING FOR auth_ident SERVER name alter_generic_options
    ;

createTrigStmt:        CREATE TRIGGER name triggerActionTime triggerEvents ON qualified_name triggerForSpec triggerWhen EXECUTE PROCEDURE func_name '(' triggerFuncArgs ')'
    |   CREATE CONSTRAINT TRIGGER name AFTER triggerEvents ON qualified_name optConstrFromTable constraintAttributeSpec FOR EACH ROW triggerWhen EXECUTE PROCEDURE func_name '(' triggerFuncArgs ')'
    ;

triggerActionTime:        BEFORE
    |   AFTER
    |   INSTEAD OF
    ;

triggerEvents:        triggerEvents OR triggerOneEvent
    |   triggerOneEvent
    ;

triggerOneEvent:        UPDATE OF columnList
    |   INSERT
    |   DELETE_P
    |   UPDATE
    |   TRUNCATE
    ;

triggerForSpec:        FOR triggerForOptEach triggerForType
    |
    ;

triggerForOptEach:        EACH
    |
    ;

triggerForType:        ROW
    |   STATEMENT
    ;

triggerWhen:        WHEN '(' a_expr ')'
    |
    ;

triggerFuncArgs:        triggerFuncArgs ',' triggerFuncArg
    |   triggerFuncArg
    |
    ;

triggerFuncArg:        iconst
    |   sconst
    |   colLabel
    |   FCONST
    ;

optConstrFromTable:        FROM qualified_name
    |
    ;

constraintAttributeSpec:        constraintAttributeSpec constraintAttributeElem
    |
    ;

constraintAttributeElem:        NOT DEFERRABLE
    |   DEFERRABLE
    |   INITIALLY IMMEDIATE
    |   INITIALLY DEFERRED
    |   NOT VALID
    |   NO INHERIT
    ;

dropTrigStmt:        DROP TRIGGER name ON any_name opt_drop_behavior
    |   DROP TRIGGER IF_P EXISTS name ON any_name opt_drop_behavior
    ;

createAssertStmt:        CREATE ASSERTION name CHECK '(' a_expr ')' constraintAttributeSpec
    ;

dropAssertStmt:        DROP ASSERTION name opt_drop_behavior
    ;

defineStmt:        CREATE TYPE_P any_name AS '(' optTableFuncElementList ')'
    |   CREATE TYPE_P any_name AS ENUM_P '(' opt_enum_val_list ')'
    |   CREATE AGGREGATE func_name aggr_args definition
    |   CREATE AGGREGATE func_name old_aggr_definition
    |   CREATE OPERATOR any_operator definition
    |   CREATE TYPE_P any_name definition
    |   CREATE TYPE_P any_name AS RANGE definition
    |   CREATE TEXT_P SEARCH PARSER any_name definition
    |   CREATE TEXT_P SEARCH DICTIONARY any_name definition
    |   CREATE TEXT_P SEARCH TEMPLATE any_name definition
    |   CREATE TEXT_P SEARCH CONFIGURATION any_name definition
    |   CREATE COLLATION any_name definition
    |   CREATE COLLATION any_name FROM any_name
    |   CREATE TYPE_P any_name
    ;

definition:        '(' def_list ')'
    ;

def_list:        def_list ',' def_elem
    |   def_elem
    ;

def_elem:        colLabel '=' def_arg
    |   colLabel
    ;

def_arg:        func_type
    |   reserved_keyword
    |   qual_all_Op
    |   numericOnly
    |   sconst
    ;

aggr_args:        '(' '*' ')'
    |   '(' type_list ')'
    ;

old_aggr_definition:        '(' old_aggr_list ')'
    ;

old_aggr_list:        old_aggr_list ',' old_aggr_elem
    |   old_aggr_elem
    ;

old_aggr_elem:        IDENT '=' def_arg
    ;

opt_enum_val_list:        enum_val_list
    |
    ;

enum_val_list:        enum_val_list ',' sconst
    |   sconst
    ;

alterEnumStmt:        ALTER TYPE_P any_name ADD_P VALUE_P sconst BEFORE sconst
    |   ALTER TYPE_P any_name ADD_P VALUE_P sconst AFTER sconst
    |   ALTER TYPE_P any_name ADD_P VALUE_P sconst
    ;

createOpClassStmt:        CREATE OPERATOR CLASS any_name opt_default FOR TYPE_P typename USING access_method opt_opfamily AS opclass_item_list
    ;

opclass_item_list:        opclass_item_list ',' opclass_item
    |   opclass_item
    ;

opclass_item:        FUNCTION iconst '(' type_list ')' func_name func_args
    |   OPERATOR iconst any_operator oper_argtypes opclass_purpose opt_recheck
    |   OPERATOR iconst any_operator opclass_purpose opt_recheck
    |   FUNCTION iconst func_name func_args
    |   STORAGE typename
    ;

opt_default:        DEFAULT
    |
    ;

opt_opfamily:        FAMILY any_name
    |
    ;

opclass_purpose:        FOR ORDER BY any_name
    |   FOR SEARCH
    |
    ;

opt_recheck:        RECHECK
    |
    ;

createOpFamilyStmt:        CREATE OPERATOR FAMILY any_name USING access_method
    ;

alterOpFamilyStmt:        ALTER OPERATOR FAMILY any_name USING access_method ADD_P opclass_item_list
    |   ALTER OPERATOR FAMILY any_name USING access_method DROP opclass_drop_list
    ;

opclass_drop_list:        opclass_drop_list ',' opclass_drop
    |   opclass_drop
    ;

opclass_drop:        OPERATOR iconst '(' type_list ')'
    |   FUNCTION iconst '(' type_list ')'
    ;

dropOpClassStmt:        DROP OPERATOR CLASS any_name USING access_method opt_drop_behavior
    |   DROP OPERATOR CLASS IF_P EXISTS any_name USING access_method opt_drop_behavior
    ;

dropOpFamilyStmt:        DROP OPERATOR FAMILY any_name USING access_method opt_drop_behavior
    |   DROP OPERATOR FAMILY IF_P EXISTS any_name USING access_method opt_drop_behavior
    ;

dropOwnedStmt:        DROP OWNED BY name_list opt_drop_behavior
    ;

reassignOwnedStmt:        REASSIGN OWNED BY name_list TO name
    ;

dropStmt:        DROP drop_type IF_P EXISTS any_name_list opt_drop_behavior
    |   DROP drop_type any_name_list opt_drop_behavior
    |   DROP INDEX CONCURRENTLY any_name_list opt_drop_behavior
    |   DROP INDEX CONCURRENTLY IF_P EXISTS any_name_list opt_drop_behavior
    ;

drop_type:        TABLE
    |   SEQUENCE
    |   VIEW
    |   INDEX
    |   FOREIGN TABLE
    |   TYPE_P
    |   DOMAIN_P
    |   COLLATION
    |   CONVERSION_P
    |   SCHEMA
    |   EXTENSION
    |   TEXT_P SEARCH PARSER
    |   TEXT_P SEARCH DICTIONARY
    |   TEXT_P SEARCH TEMPLATE
    |   TEXT_P SEARCH CONFIGURATION
    ;

any_name_list:        any_name_list ',' any_name
    |   any_name
    ;

any_name:        colId attrs
    |   colId
    ;

attrs:        '.' attr_name
    |   attrs '.' attr_name
    ;

truncateStmt:        TRUNCATE opt_table relation_expr_list opt_restart_seqs opt_drop_behavior
    ;

opt_restart_seqs:        CONTINUE_P IDENTITY_P
    |   RESTART IDENTITY_P
    |
    ;

commentStmt:        COMMENT ON CAST '(' typename AS typename ')' IS comment_text
    |   COMMENT ON comment_type any_name IS comment_text
    |   COMMENT ON AGGREGATE func_name aggr_args IS comment_text
    |   COMMENT ON FUNCTION func_name func_args IS comment_text
    |   COMMENT ON OPERATOR any_operator oper_argtypes IS comment_text
    |   COMMENT ON CONSTRAINT name ON any_name IS comment_text
    |   COMMENT ON RULE name ON any_name IS comment_text
    |   COMMENT ON TRIGGER name ON any_name IS comment_text
    |   COMMENT ON OPERATOR CLASS any_name USING access_method IS comment_text
    |   COMMENT ON OPERATOR FAMILY any_name USING access_method IS comment_text
    |   COMMENT ON opt_procedural LANGUAGE any_name IS comment_text
    |   COMMENT ON RULE name IS comment_text
    |   COMMENT ON LARGE_P OBJECT_P numericOnly IS comment_text
    |   COMMENT ON TEXT_P SEARCH PARSER any_name IS comment_text
    |   COMMENT ON TEXT_P SEARCH DICTIONARY any_name IS comment_text
    |   COMMENT ON TEXT_P SEARCH TEMPLATE any_name IS comment_text
    |   COMMENT ON TEXT_P SEARCH CONFIGURATION any_name IS comment_text
    ;

comment_type:        COLUMN
    |   DATABASE
    |   SCHEMA
    |   INDEX
    |   SEQUENCE
    |   TABLE
    |   DOMAIN_P
    |   TYPE_P
    |   VIEW
    |   COLLATION
    |   CONVERSION_P
    |   TABLESPACE
    |   EXTENSION
    |   ROLE
    |   FOREIGN TABLE
    |   SERVER
    |   FOREIGN DATA_P WRAPPER
    ;

comment_text:        sconst
    |   NULL_P
    ;

secLabelStmt:        SECURITY LABEL opt_provider ON security_label_type any_name IS security_label
    |   SECURITY LABEL opt_provider ON AGGREGATE func_name aggr_args IS security_label
    |   SECURITY LABEL opt_provider ON FUNCTION func_name func_args IS security_label
    |   SECURITY LABEL opt_provider ON opt_procedural LANGUAGE any_name IS security_label
    |   SECURITY LABEL opt_provider ON LARGE_P OBJECT_P numericOnly IS security_label
    ;

opt_provider:        FOR colId_or_Sconst
    |
    ;

security_label_type:        COLUMN
    |   DATABASE
    |   FOREIGN TABLE
    |   SCHEMA
    |   SEQUENCE
    |   TABLE
    |   DOMAIN_P
    |   ROLE
    |   TABLESPACE
    |   TYPE_P
    |   VIEW
    ;

security_label:        sconst
    |   NULL_P
    ;

fetchStmt:        FETCH fetch_args
    |   MOVE fetch_args
    ;

fetch_args:        ABSOLUTE_P signedIconst opt_from_in cursor_name
    |   RELATIVE_P signedIconst opt_from_in cursor_name
    |   signedIconst opt_from_in cursor_name
    |   FORWARD signedIconst opt_from_in cursor_name
    |   BACKWARD signedIconst opt_from_in cursor_name
    |   from_in cursor_name
    |   NEXT opt_from_in cursor_name
    |   PRIOR opt_from_in cursor_name
    |   FIRST_P opt_from_in cursor_name
    |   LAST_P opt_from_in cursor_name
    |   ALL opt_from_in cursor_name
    |   FORWARD opt_from_in cursor_name
    |   FORWARD ALL opt_from_in cursor_name
    |   BACKWARD opt_from_in cursor_name
    |   BACKWARD ALL opt_from_in cursor_name
    |   cursor_name
    ;

from_in:        FROM
    |   IN_P
    ;

opt_from_in:        from_in
    |
    ;

grantStmt:        GRANT privileges ON privilege_target TO grantee_list opt_grant_grant_option
    ;

revokeStmt:        REVOKE privileges ON privilege_target FROM grantee_list opt_drop_behavior
    |   REVOKE GRANT OPTION FOR privileges ON privilege_target FROM grantee_list opt_drop_behavior
    ;

privileges:        ALL '(' columnList ')'
    |   ALL PRIVILEGES '(' columnList ')'
    |   privilege_list
    |   ALL
    |   ALL PRIVILEGES
    ;

privilege_list:        privilege_list ',' privilege
    |   privilege
    ;

privilege:        colId opt_column_list
    |   SELECT opt_column_list
    |   REFERENCES opt_column_list
    |   CREATE opt_column_list
    ;

privilege_target:        qualified_name_list
    |   TABLE qualified_name_list
    |   SEQUENCE qualified_name_list
    |   FOREIGN DATA_P WRAPPER name_list
    |   FOREIGN SERVER name_list
    |   FUNCTION function_with_argtypes_list
    |   DATABASE name_list
    |   DOMAIN_P any_name_list
    |   LANGUAGE name_list
    |   LARGE_P OBJECT_P numericOnly_list
    |   SCHEMA name_list
    |   TABLESPACE name_list
    |   TYPE_P any_name_list
    |   ALL TABLES IN_P SCHEMA name_list
    |   ALL SEQUENCES IN_P SCHEMA name_list
    |   ALL FUNCTIONS IN_P SCHEMA name_list
    ;

grantee_list:        grantee_list ',' grantee
    |   grantee
    ;

grantee:        roleId
    |   GROUP_P roleId
    ;

opt_grant_grant_option:        WITH GRANT OPTION
    |
    ;

function_with_argtypes_list:        function_with_argtypes_list ',' function_with_argtypes
    |   function_with_argtypes
    ;

function_with_argtypes:        func_name func_args
    ;

grantRoleStmt:        GRANT privilege_list TO name_list opt_grant_admin_option opt_granted_by
    ;

revokeRoleStmt:        REVOKE privilege_list FROM name_list opt_granted_by opt_drop_behavior
    |   REVOKE ADMIN OPTION FOR privilege_list FROM name_list opt_granted_by opt_drop_behavior
    ;

opt_grant_admin_option:        WITH ADMIN OPTION
    |
    ;

opt_granted_by:        GRANTED BY roleId
    |
    ;

alterDefaultPrivilegesStmt:        ALTER DEFAULT PRIVILEGES defACLOptionList defACLAction
    ;

defACLOptionList:        defACLOptionList defACLOption
    |
    ;

defACLOption:        IN_P SCHEMA name_list
    |   FOR ROLE name_list
    |   FOR USER name_list
    ;

defACLAction:        GRANT privileges ON defacl_privilege_target TO grantee_list opt_grant_grant_option
    |   REVOKE privileges ON defacl_privilege_target FROM grantee_list opt_drop_behavior
    |   REVOKE GRANT OPTION FOR privileges ON defacl_privilege_target FROM grantee_list opt_drop_behavior
    ;

defacl_privilege_target:        TABLES
    |   FUNCTIONS
    |   SEQUENCES
    |   TYPES_P
    ;

indexStmt:        CREATE opt_unique INDEX opt_concurrently opt_index_name ON qualified_name access_method_clause '(' index_params ')' opt_reloptions optTableSpace where_clause
    ;

opt_unique:        UNIQUE
    |
    ;

opt_concurrently:        CONCURRENTLY
    |
    ;

opt_index_name:        index_name
    |
    ;

access_method_clause:        USING access_method
    |
    ;

index_params:        index_params ',' index_elem
    |   index_elem
    ;

index_elem:        '(' a_expr ')' opt_collate opt_class opt_asc_desc opt_nulls_order
    |   colId opt_collate opt_class opt_asc_desc opt_nulls_order
    |   func_expr opt_collate opt_class opt_asc_desc opt_nulls_order
    ;

opt_collate:        COLLATE any_name
    |
    ;

opt_class:        any_name
    |   USING any_name
    |
    ;

opt_asc_desc:        ASC
    |   DESC
    |
    ;

opt_nulls_order:        NULLS_FIRST
    |   NULLS_LAST
    |
    ;

createFunctionStmt:        CREATE opt_or_replace FUNCTION func_name func_args_with_defaults RETURNS TABLE '(' table_func_column_list ')' createfunc_opt_list opt_definition
    |   CREATE opt_or_replace FUNCTION func_name func_args_with_defaults RETURNS func_return createfunc_opt_list opt_definition
    |   CREATE opt_or_replace FUNCTION func_name func_args_with_defaults createfunc_opt_list opt_definition
    ;

opt_or_replace:        OR REPLACE
    |
    ;

func_args:        '(' ')'
    |   '(' func_args_list ')'
    ;

func_args_list:        func_args_list ',' func_arg
    |   func_arg
    ;

func_args_with_defaults:        '(' ')'
    |   '(' func_args_with_defaults_list ')'
    ;

func_args_with_defaults_list:        func_args_with_defaults_list ',' func_arg_with_default
    |   func_arg_with_default
    ;

func_arg:        arg_class param_name func_type
    |   param_name arg_class func_type
    |   param_name func_type
    |   arg_class func_type
    |   func_type
    ;

arg_class:        IN_P
    |   OUT_P
    |   INOUT
    |   IN_P OUT_P
    |   VARIADIC
    ;

param_name:        type_function_name
    ;

func_return:        func_type
    ;

func_type:        type_function_name attrs '%' TYPE_P
    |   SETOF type_function_name attrs '%' TYPE_P
    |   typename
    ;

func_arg_with_default:        func_arg '=' a_expr
    |   func_arg DEFAULT a_expr
    |   func_arg
    ;

createfunc_opt_list:        createfunc_opt_list createfunc_opt_item
    |   createfunc_opt_item
    ;

common_func_opt_item:        COST numericOnly
    |   ROWS numericOnly
    |   functionSetResetClause
    |   CALLED ON NULL_P INPUT_P
    |   RETURNS NULL_P ON NULL_P INPUT_P
    |   STRICT_P
    |   IMMUTABLE
    |   STABLE
    |   VOLATILE
    |   EXTERNAL SECURITY DEFINER
    |   EXTERNAL SECURITY INVOKER
    |   SECURITY DEFINER
    |   SECURITY INVOKER
    |   LEAKPROOF
    |   NOT LEAKPROOF
    ;

createfunc_opt_item:        AS func_as
    |   LANGUAGE colId_or_Sconst
    |   common_func_opt_item
    |   WINDOW
    ;

func_as:        sconst ',' sconst
    |   sconst
    ;

opt_definition:        WITH definition
    |
    ;

table_func_column:        param_name func_type
    ;

table_func_column_list:        table_func_column_list ',' table_func_column
    |   table_func_column
    ;

alterFunctionStmt:        ALTER FUNCTION function_with_argtypes alterfunc_opt_list opt_restrict
    ;

alterfunc_opt_list:        alterfunc_opt_list common_func_opt_item
    |   common_func_opt_item
    ;

opt_restrict:        RESTRICT
    |
    ;

removeFuncStmt:        DROP FUNCTION func_name func_args opt_drop_behavior
    |   DROP FUNCTION IF_P EXISTS func_name func_args opt_drop_behavior
    ;

removeAggrStmt:        DROP AGGREGATE func_name aggr_args opt_drop_behavior
    |   DROP AGGREGATE IF_P EXISTS func_name aggr_args opt_drop_behavior
    ;

removeOperStmt:        DROP OPERATOR any_operator oper_argtypes opt_drop_behavior
    |   DROP OPERATOR IF_P EXISTS any_operator oper_argtypes opt_drop_behavior
    ;

oper_argtypes:        '(' typename ')'
    |   '(' NONE ',' typename ')'
    |   '(' typename ',' NONE ')'
    |   '(' typename ',' typename ')'
    ;

any_operator:        colId '.' any_operator
    |   all_Op
    ;

doStmt:        DO dostmt_opt_list
    ;

dostmt_opt_list:        dostmt_opt_list dostmt_opt_item
    |   dostmt_opt_item
    ;

dostmt_opt_item:        sconst
    |   LANGUAGE colId_or_Sconst
    ;

createCastStmt:        CREATE CAST '(' typename AS typename ')' WITH FUNCTION function_with_argtypes cast_context
    |   CREATE CAST '(' typename AS typename ')' WITHOUT FUNCTION cast_context
    |   CREATE CAST '(' typename AS typename ')' WITH INOUT cast_context
    ;

cast_context:        AS IMPLICIT_P
    |   AS ASSIGNMENT
    |
    ;

dropCastStmt:        DROP CAST opt_if_exists '(' typename AS typename ')' opt_drop_behavior
    ;

opt_if_exists:        IF_P EXISTS
    |
    ;

reindexStmt:        REINDEX reindex_type qualified_name opt_force
    |   REINDEX SYSTEM_P name opt_force
    |   REINDEX DATABASE name opt_force
    ;

reindex_type:        INDEX
    |   TABLE
    ;

opt_force:        FORCE
    |
    ;

renameStmt:        ALTER TABLE relation_expr RENAME opt_column name TO name
    |   ALTER TABLE IF_P EXISTS relation_expr RENAME opt_column name TO name
    |   ALTER FOREIGN TABLE relation_expr RENAME opt_column name TO name
    |   ALTER FOREIGN TABLE IF_P EXISTS relation_expr RENAME opt_column name TO name
    |   ALTER TYPE_P any_name RENAME ATTRIBUTE name TO name opt_drop_behavior
    |   ALTER AGGREGATE func_name aggr_args RENAME TO name
    |   ALTER DOMAIN_P any_name RENAME CONSTRAINT name TO name
    |   ALTER opt_procedural LANGUAGE name RENAME TO name
    |   ALTER OPERATOR CLASS any_name USING access_method RENAME TO name
    |   ALTER OPERATOR FAMILY any_name USING access_method RENAME TO name
    |   ALTER TABLE relation_expr RENAME CONSTRAINT name TO name
    |   ALTER TRIGGER name ON qualified_name RENAME TO name
    |   ALTER COLLATION any_name RENAME TO name
    |   ALTER CONVERSION_P any_name RENAME TO name
    |   ALTER DATABASE database_name RENAME TO database_name
    |   ALTER DOMAIN_P any_name RENAME TO name
    |   ALTER FOREIGN DATA_P WRAPPER name RENAME TO name
    |   ALTER FUNCTION function_with_argtypes RENAME TO name
    |   ALTER GROUP_P roleId RENAME TO roleId
    |   ALTER SCHEMA name RENAME TO name
    |   ALTER SERVER name RENAME TO name
    |   ALTER TABLE relation_expr RENAME TO name
    |   ALTER TABLE IF_P EXISTS relation_expr RENAME TO name
    |   ALTER SEQUENCE qualified_name RENAME TO name
    |   ALTER SEQUENCE IF_P EXISTS qualified_name RENAME TO name
    |   ALTER VIEW qualified_name RENAME TO name
    |   ALTER VIEW IF_P EXISTS qualified_name RENAME TO name
    |   ALTER INDEX qualified_name RENAME TO name
    |   ALTER INDEX IF_P EXISTS qualified_name RENAME TO name
    |   ALTER FOREIGN TABLE relation_expr RENAME TO name
    |   ALTER FOREIGN TABLE IF_P EXISTS relation_expr RENAME TO name
    |   ALTER ROLE roleId RENAME TO roleId
    |   ALTER USER roleId RENAME TO roleId
    |   ALTER TABLESPACE name RENAME TO name
    |   ALTER TABLESPACE name SET reloptions
    |   ALTER TABLESPACE name RESET reloptions
    |   ALTER TEXT_P SEARCH PARSER any_name RENAME TO name
    |   ALTER TEXT_P SEARCH DICTIONARY any_name RENAME TO name
    |   ALTER TEXT_P SEARCH TEMPLATE any_name RENAME TO name
    |   ALTER TEXT_P SEARCH CONFIGURATION any_name RENAME TO name
    |   ALTER TYPE_P any_name RENAME TO name
    ;

opt_column:        COLUMN
    |
    ;

opt_set_data:        SET DATA_P
    |
    ;

alterObjectSchemaStmt:        ALTER AGGREGATE func_name aggr_args SET SCHEMA name
    |   ALTER OPERATOR any_operator oper_argtypes SET SCHEMA name
    |   ALTER OPERATOR CLASS any_name USING access_method SET SCHEMA name
    |   ALTER OPERATOR FAMILY any_name USING access_method SET SCHEMA name
    |   ALTER COLLATION any_name SET SCHEMA name
    |   ALTER CONVERSION_P any_name SET SCHEMA name
    |   ALTER DOMAIN_P any_name SET SCHEMA name
    |   ALTER EXTENSION any_name SET SCHEMA name
    |   ALTER FUNCTION function_with_argtypes SET SCHEMA name
    |   ALTER TABLE relation_expr SET SCHEMA name
    |   ALTER TABLE IF_P EXISTS relation_expr SET SCHEMA name
    |   ALTER TEXT_P SEARCH PARSER any_name SET SCHEMA name
    |   ALTER TEXT_P SEARCH DICTIONARY any_name SET SCHEMA name
    |   ALTER TEXT_P SEARCH TEMPLATE any_name SET SCHEMA name
    |   ALTER TEXT_P SEARCH CONFIGURATION any_name SET SCHEMA name
    |   ALTER SEQUENCE qualified_name SET SCHEMA name
    |   ALTER SEQUENCE IF_P EXISTS qualified_name SET SCHEMA name
    |   ALTER VIEW qualified_name SET SCHEMA name
    |   ALTER VIEW IF_P EXISTS qualified_name SET SCHEMA name
    |   ALTER FOREIGN TABLE relation_expr SET SCHEMA name
    |   ALTER FOREIGN TABLE IF_P EXISTS relation_expr SET SCHEMA name
    |   ALTER TYPE_P any_name SET SCHEMA name
    ;

alterOwnerStmt:        ALTER AGGREGATE func_name aggr_args OWNER TO roleId
    |   ALTER opt_procedural LANGUAGE name OWNER TO roleId
    |   ALTER OPERATOR any_operator oper_argtypes OWNER TO roleId
    |   ALTER OPERATOR CLASS any_name USING access_method OWNER TO roleId
    |   ALTER OPERATOR FAMILY any_name USING access_method OWNER TO roleId
    |   ALTER COLLATION any_name OWNER TO roleId
    |   ALTER CONVERSION_P any_name OWNER TO roleId
    |   ALTER DATABASE database_name OWNER TO roleId
    |   ALTER DOMAIN_P any_name OWNER TO roleId
    |   ALTER FUNCTION function_with_argtypes OWNER TO roleId
    |   ALTER LARGE_P OBJECT_P numericOnly OWNER TO roleId
    |   ALTER SCHEMA name OWNER TO roleId
    |   ALTER TYPE_P any_name OWNER TO roleId
    |   ALTER TABLESPACE name OWNER TO roleId
    |   ALTER TEXT_P SEARCH DICTIONARY any_name OWNER TO roleId
    |   ALTER TEXT_P SEARCH CONFIGURATION any_name OWNER TO roleId
    |   ALTER FOREIGN DATA_P WRAPPER name OWNER TO roleId
    |   ALTER SERVER name OWNER TO roleId
    ;

ruleStmt:        CREATE opt_or_replace RULE name AS ON event TO qualified_name where_clause DO opt_instead ruleActionList
    ;

ruleActionList:        '(' ruleActionMulti ')'
    |   ruleActionStmt
    |   NOTHING
    ;

ruleActionMulti:        ruleActionMulti ';' ruleActionStmtOrEmpty
    |   ruleActionStmtOrEmpty
    ;

ruleActionStmt:        selectStmt
    |   insertStmt
    |   updateStmt
    |   deleteStmt
    |   notifyStmt
    ;

ruleActionStmtOrEmpty:        ruleActionStmt
    |
    ;

event:        SELECT
    |   UPDATE
    |   DELETE_P
    |   INSERT
    ;

opt_instead:        INSTEAD
    |   ALSO
    |
    ;

dropRuleStmt:        DROP RULE name ON any_name opt_drop_behavior
    |   DROP RULE IF_P EXISTS name ON any_name opt_drop_behavior
    ;

notifyStmt:        NOTIFY colId notify_payload
    ;

notify_payload:        ',' sconst
    |
    ;

listenStmt:        LISTEN colId
    ;

unlistenStmt:        UNLISTEN '*'
    |   UNLISTEN colId
    ;

transactionStmt:        BEGIN_P opt_transaction transaction_mode_list_or_empty
    |   ROLLBACK opt_transaction TO SAVEPOINT colId
    |   ROLLBACK opt_transaction TO colId
    |   ABORT_P opt_transaction
    |   START TRANSACTION transaction_mode_list_or_empty
    |   COMMIT opt_transaction
    |   END_P opt_transaction
    |   ROLLBACK opt_transaction
    |   SAVEPOINT colId
    |   RELEASE SAVEPOINT colId
    |   RELEASE colId
    |   PREPARE TRANSACTION sconst
    |   COMMIT PREPARED sconst
    |   ROLLBACK PREPARED sconst
    ;

opt_transaction:        WORK
    |   TRANSACTION
    |
    ;

transaction_mode_item:        ISOLATION LEVEL iso_level
    |   READ ONLY
    |   READ WRITE
    |   DEFERRABLE
    |   NOT DEFERRABLE
    ;

transaction_mode_list:        transaction_mode_list ',' transaction_mode_item
    |   transaction_mode_list transaction_mode_item
    |   transaction_mode_item
    ;

transaction_mode_list_or_empty:        transaction_mode_list
    |
    ;

viewStmt:        CREATE optTemp VIEW qualified_name opt_column_list opt_reloptions AS selectStmt opt_check_option
    |   CREATE OR REPLACE optTemp VIEW qualified_name opt_column_list opt_reloptions AS selectStmt opt_check_option
    ;

opt_check_option:        WITH CHECK OPTION
    |   WITH CASCADED CHECK OPTION
    |   WITH LOCAL CHECK OPTION
    |
    ;

loadStmt:        LOAD file_name
    ;

createdbStmt:        CREATE DATABASE database_name opt_with createdb_opt_list
    ;

createdb_opt_list:        createdb_opt_list createdb_opt_item
    |
    ;

createdb_opt_item:        TABLESPACE opt_equal name
    |   LOCATION opt_equal sconst
    |   TEMPLATE opt_equal name
    |   ENCODING opt_equal sconst
    |   ENCODING opt_equal iconst
    |   LC_COLLATE_P opt_equal sconst
    |   LC_CTYPE_P opt_equal sconst
    |   CONNECTION LIMIT opt_equal signedIconst
    |   OWNER opt_equal name
    |   TABLESPACE opt_equal DEFAULT
    |   LOCATION opt_equal DEFAULT
    |   TEMPLATE opt_equal DEFAULT
    |   ENCODING opt_equal DEFAULT
    |   LC_COLLATE_P opt_equal DEFAULT
    |   LC_CTYPE_P opt_equal DEFAULT
    |   OWNER opt_equal DEFAULT
    ;

opt_equal:        '='
    |
    ;

alterDatabaseStmt:        ALTER DATABASE database_name opt_with alterdb_opt_list
    |   ALTER DATABASE database_name SET TABLESPACE name
    ;

alterDatabaseSetStmt:        ALTER DATABASE database_name setResetClause
    ;

alterdb_opt_list:        alterdb_opt_list alterdb_opt_item
    |
    ;

alterdb_opt_item:        CONNECTION LIMIT opt_equal signedIconst
    ;

dropdbStmt:        DROP DATABASE database_name
    |   DROP DATABASE IF_P EXISTS database_name
    ;

createDomainStmt:        CREATE DOMAIN_P any_name opt_as typename colQualList
    ;

alterDomainStmt:        ALTER DOMAIN_P any_name DROP CONSTRAINT name opt_drop_behavior
    |   ALTER DOMAIN_P any_name DROP CONSTRAINT IF_P EXISTS name opt_drop_behavior
    |   ALTER DOMAIN_P any_name alter_column_default
    |   ALTER DOMAIN_P any_name ADD_P tableConstraint
    |   ALTER DOMAIN_P any_name VALIDATE CONSTRAINT name
    |   ALTER DOMAIN_P any_name DROP NOT NULL_P
    |   ALTER DOMAIN_P any_name SET NOT NULL_P
    ;

opt_as:        AS
    |
    ;

alterTSDictionaryStmt:        ALTER TEXT_P SEARCH DICTIONARY any_name definition
    ;

alterTSConfigurationStmt:        ALTER TEXT_P SEARCH CONFIGURATION any_name ALTER MAPPING FOR name_list REPLACE any_name WITH any_name
    |   ALTER TEXT_P SEARCH CONFIGURATION any_name ADD_P MAPPING FOR name_list WITH any_name_list
    |   ALTER TEXT_P SEARCH CONFIGURATION any_name ALTER MAPPING FOR name_list WITH any_name_list
    |   ALTER TEXT_P SEARCH CONFIGURATION any_name ALTER MAPPING REPLACE any_name WITH any_name
    |   ALTER TEXT_P SEARCH CONFIGURATION any_name DROP MAPPING FOR name_list
    |   ALTER TEXT_P SEARCH CONFIGURATION any_name DROP MAPPING IF_P EXISTS FOR name_list
    ;

createConversionStmt:        CREATE opt_default CONVERSION_P any_name FOR sconst TO sconst FROM any_name
    ;

clusterStmt:        CLUSTER opt_verbose qualified_name cluster_index_specification
    |   CLUSTER opt_verbose index_name ON qualified_name
    |   CLUSTER opt_verbose
    ;

cluster_index_specification:        USING index_name
    |
    ;

vacuumStmt:        VACUUM '(' vacuum_option_list ')' qualified_name opt_name_list
    |   VACUUM '(' vacuum_option_list ')'
    |   VACUUM opt_full opt_freeze opt_verbose qualified_name
    |   VACUUM opt_full opt_freeze opt_verbose analyzeStmt
    |   VACUUM opt_full opt_freeze opt_verbose
    ;

vacuum_option_list:        vacuum_option_list ',' vacuum_option_elem
    |   vacuum_option_elem
    ;

vacuum_option_elem:        analyze_keyword
    |   VERBOSE
    |   FREEZE
    |   FULL
    ;

analyzeStmt:        analyze_keyword opt_verbose qualified_name opt_name_list
    |   analyze_keyword opt_verbose
    ;

analyze_keyword:        ANALYZE
    |   ANALYSE
    ;

opt_verbose:        VERBOSE
    |
    ;

opt_full:        FULL
    |
    ;

opt_freeze:        FREEZE
    |
    ;

opt_name_list:        '(' name_list ')'
    |
    ;

explainStmt:        EXPLAIN '(' explain_option_list ')' explainableStmt
    |   EXPLAIN analyze_keyword opt_verbose explainableStmt
    |   EXPLAIN explainableStmt
    |   EXPLAIN VERBOSE explainableStmt
    ;

explainableStmt:        selectStmt
    |   insertStmt
    |   updateStmt
    |   deleteStmt
    |   declareCursorStmt
    |   createAsStmt
    |   executeStmt
    ;

explain_option_list:        explain_option_list ',' explain_option_elem
    |   explain_option_elem
    ;

explain_option_elem:        explain_option_name explain_option_arg
    ;

explain_option_name:        colId
    |   analyze_keyword
    |   VERBOSE
    ;

explain_option_arg:        opt_boolean_or_string
    |   numericOnly
    |
    ;

prepareStmt:        PREPARE name prep_type_clause AS preparableStmt
    ;

prep_type_clause:        '(' type_list ')'
    |
    ;

preparableStmt:        selectStmt
    |   insertStmt
    |   updateStmt
    |   deleteStmt
    ;

executeStmt:        CREATE optTemp TABLE create_as_target AS EXECUTE name execute_param_clause opt_with_data
    |   EXECUTE name execute_param_clause
    ;

execute_param_clause:        '(' expr_list ')'
    |
    ;

deallocateStmt:        DEALLOCATE name
    |   DEALLOCATE PREPARE name
    |   DEALLOCATE ALL
    |   DEALLOCATE PREPARE ALL
    ;

insertStmt:        opt_with_clause INSERT INTO qualified_name insert_rest returning_clause
    ;

insert_rest:        '(' insert_column_list ')' selectStmt
    |   selectStmt
    |   DEFAULT VALUES
    ;

insert_column_list:        insert_column_list ',' insert_column_item
    |   insert_column_item
    ;

insert_column_item:        colId opt_indirection
    ;

returning_clause:        RETURNING target_list into_clause
    |
    ;

deleteStmt:        opt_with_clause DELETE_P FROM relation_expr_opt_alias using_clause where_or_current_clause returning_clause into_clause
    ;

using_clause:        USING from_list
    |
    ;

lockStmt:        LOCK_P opt_table relation_expr_list opt_lock opt_nowait
    ;

opt_lock:        IN_P lock_type MODE
    |
    ;

lock_type:        ACCESS SHARE
    |   ROW SHARE
    |   ROW EXCLUSIVE
    |   SHARE UPDATE EXCLUSIVE
    |   SHARE
    |   SHARE ROW EXCLUSIVE
    |   EXCLUSIVE
    |   ACCESS EXCLUSIVE
    ;

opt_nowait:        NOWAIT
    |
    ;

updateStmt:        opt_with_clause UPDATE relation_expr_opt_alias SET set_clause_list from_clause where_or_current_clause returning_clause into_clause
    ;

set_clause_list:        set_clause_list ',' set_clause
    |   set_clause
    ;

set_clause:        single_set_clause
    |   multiple_set_clause
    ;

single_set_clause:        set_target '=' ctext_expr
    ;

multiple_set_clause:        '(' set_target_list ')' '=' ctext_row
    ;

set_target:        colId opt_indirection
    ;

set_target_list:        set_target_list ',' set_target
    |   set_target
    ;

declareCursorStmt:        DECLARE cursor_name cursor_options CURSOR opt_hold FOR selectStmt
    ;

cursor_name:        name
    ;

cursor_options:        cursor_options NO SCROLL
    |   cursor_options SCROLL
    |   cursor_options BINARY
    |   cursor_options INSENSITIVE
    |
    ;

opt_hold:
    |   WITH HOLD
    |   WITHOUT HOLD
    ;

selectStmt:        select_no_parens
    |   select_with_parens
    ;

select_with_parens:
       '(' select_no_parens ')'
       | '(' select_with_parens ')'
       | select_with_parens UNION opt_all     select_clause
       | select_with_parens INTERSECT opt_all select_clause
       | select_with_parens EXCEPT opt_all    select_clause
     ;


select_no_parens:        with_clause select_clause opt_sort_clause for_locking_clause opt_select_limit into_clause
    |   with_clause select_clause opt_sort_clause select_limit opt_for_locking_clause
    |   select_clause opt_sort_clause for_locking_clause opt_select_limit  into_clause
    |   select_clause opt_sort_clause select_limit  into_clause opt_for_locking_clause
    |   with_clause select_clause sort_clause
    |   select_clause sort_clause
    |   with_clause select_clause
    |   simple_select
    ;

select_clause:        simple_select
    |   select_with_parens
    ;

// TODO: adapted manually for INTO placement
simple_select:
       SELECT opt_distinct target_list
       into_clause from_clause where_clause
       group_clause having_clause window_clause
       |
       SELECT opt_distinct target_list
       from_clause into_clause where_clause
       group_clause having_clause window_clause
       |
       SELECT opt_distinct target_list
       from_clause where_clause into_clause
       group_clause having_clause window_clause
       | values_clause
       | TABLE relation_expr
       | simple_select      UNION     opt_all  select_clause
       | simple_select      INTERSECT opt_all  select_clause
       | simple_select      EXCEPT    opt_all  select_clause
     ;


with_clause:        WITH cte_list
    |   WITH RECURSIVE cte_list
    ;

cte_list:        cte_list ',' common_table_expr
    |   common_table_expr
    ;

common_table_expr:        name opt_name_list AS '(' preparableStmt ')'
    ;

opt_with_clause:        with_clause
    |
    ;

into_clause:  INTO STRICT_P? optTempTableName
    |         INTO STRICT_P? into_clause_arguments
    |
    ;

into_clause_arguments: into_clause_argument (',' into_clause_argument)*   ;

into_clause_argument : qualified_name ;

optTempTableName:        TEMPORARY opt_table qualified_name
    |   TEMP opt_table qualified_name
    |   LOCAL TEMPORARY opt_table qualified_name
    |   LOCAL TEMP opt_table qualified_name
    |   GLOBAL TEMPORARY opt_table qualified_name
    |   GLOBAL TEMP opt_table qualified_name
    |   UNLOGGED opt_table qualified_name
    |   TABLE qualified_name
    |   qualified_name
    ;

opt_table:        TABLE
    |
    ;

opt_all:        ALL
    |   DISTINCT
    |
    ;

opt_distinct:        DISTINCT ON '(' expr_list ')'
    |   DISTINCT
    |   ALL
    |
    ;

opt_sort_clause:        sort_clause
    |
    ;

sort_clause:        ORDER BY sortby_list
    ;

sortby_list:        sortby_list ',' sortby
    |   sortby
    ;

sortby:        a_expr USING qual_all_Op opt_nulls_order
    |   a_expr opt_asc_desc opt_nulls_order
    ;

select_limit:        limit_clause offset_clause
    |   offset_clause limit_clause
    |   limit_clause
    |   offset_clause
    ;

opt_select_limit:  select_limit
                |
                ;

limit_clause:        LIMIT select_limit_value ',' select_offset_value
    |   FETCH first_or_next opt_select_fetch_first_value row_or_rows ONLY
    |   LIMIT select_limit_value
    ;

offset_clause:        OFFSET select_offset_value2 row_or_rows
    |   OFFSET select_offset_value
    ;

select_limit_value:        a_expr
    |   ALL
    ;

select_offset_value:        a_expr
    ;

opt_select_fetch_first_value:        '(' a_expr ')'
    |   signedIconst
    |
    ;

select_offset_value2:        c_expr
    ;

row_or_rows:        ROW
    |   ROWS
    ;

first_or_next:        FIRST_P
    |   NEXT
    ;

group_clause:        GROUP_P BY expr_list
    |
    ;

having_clause:        HAVING a_expr
    |
    ;

for_locking_clause:        for_locking_items
    |   FOR READ ONLY
    ;

opt_for_locking_clause:        for_locking_clause
    |
    ;

for_locking_items:        for_locking_items for_locking_item
    |   for_locking_item
    ;

for_locking_item:        FOR UPDATE locked_rels_list opt_nowait
    |   FOR SHARE locked_rels_list opt_nowait
    ;

locked_rels_list:        OF qualified_name_list
    |
    ;

values_clause:        values_clause ',' ctext_row
    |   VALUES ctext_row
    ;

from_clause:        FROM from_list
    |
    ;

from_list:        from_list ',' table_ref
    |   table_ref
    ;

table_ref : joined_table
            | table_ref2
            ;

 table_ref2:    relation_expr
       | relation_expr alias_clause
       | func_table
       | func_table alias_clause
       | func_table AS '(' tableFuncElementList ')'
       | func_table AS colId '(' tableFuncElementList ')'
       | func_table colId '(' tableFuncElementList ')'
       | select_with_parens
       | select_with_parens alias_clause
     ;


joined_table:
        '(' table_ref ')' alias_clause?
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


alias_clause:        AS colId '(' name_list ')'
    |   colId '(' name_list ')'
    |   AS colId
    |   colId
    ;

join_type:        FULL join_outer
    |   LEFT join_outer
    |   RIGHT join_outer
    |   INNER_P
    ;

join_outer:        OUTER_P
    |
    ;

join_qual:        USING '(' name_list ')'
    |   ON a_expr
    ;

relation_expr:        ONLY '(' qualified_name ')'
    |   qualified_name '*'
    |   qualified_name
    |   ONLY qualified_name
    ;

relation_expr_list:        relation_expr_list ',' relation_expr
    |   relation_expr
    ;

relation_expr_opt_alias:        relation_expr colId
    |   relation_expr AS colId
    |   relation_expr
    ;

func_table:        func_expr
    ;

where_clause:        WHERE a_expr
    |
    ;

where_or_current_clause:        WHERE a_expr
    |   WHERE CURRENT_P OF cursor_name
    |
    ;

optTableFuncElementList:        tableFuncElementList
    |
    ;

tableFuncElementList:        tableFuncElementList ',' tableFuncElement
    |   tableFuncElement
    ;

tableFuncElement:        colId typename opt_collate_clause
    ;

typename:        simpleTypename ARRAY '[' iconst ']'
    |   SETOF simpleTypename ARRAY '[' iconst ']'
    |   simpleTypename opt_array_bounds
    |   SETOF simpleTypename opt_array_bounds
    |   simpleTypename ARRAY
    |   SETOF simpleTypename ARRAY
    ;

opt_array_bounds:        opt_array_bounds '[' ']'
    |   opt_array_bounds '[' iconst ']'
    |
    ;

simpleTypename:        constInterval '(' iconst ')' opt_interval
    |   constInterval opt_interval
    |   genericType
    |   numeric
    |   bit
    |   character_
    |   constDatetime
    ;

constTypename:        numeric
    |   constBit
    |   constCharacter
    |   constDatetime
    ;

genericType:        type_function_name attrs opt_type_modifiers
    |   type_function_name opt_type_modifiers
    ;

opt_type_modifiers:        '(' expr_list ')'
    |
    ;

numeric:        FLOAT_P opt_float
    |   DECIMAL_P opt_type_modifiers
    |   DEC opt_type_modifiers
    |   NUMERIC opt_type_modifiers
    |   INT_P
    |   INTEGER
    |   SMALLINT
    |   BIGINT
    |   REAL
    |   DOUBLE_P PRECISION
    |   BOOLEAN_P
    ;

opt_float:        '(' iconst ')'
    |
    ;

bit:        bitWithLength
    |   bitWithoutLength
    ;

constBit:        bitWithLength
    |   bitWithoutLength
    ;

bitWithLength:        BIT opt_varying '(' expr_list ')'
    ;

bitWithoutLength:        BIT opt_varying
    ;

character_:        characterWithLength
    |   characterWithoutLength
    ;

constCharacter:        characterWithLength
    |   characterWithoutLength
    ;

characterWithLength:        character '(' iconst ')' opt_charset
    ;

characterWithoutLength:        character opt_charset
    ;

character:        CHARACTER opt_varying
    |   CHAR_P opt_varying
    |   NATIONAL CHARACTER opt_varying
    |   NATIONAL CHAR_P opt_varying
    |   NCHAR opt_varying
    |   VARCHAR
    ;

opt_varying:        VARYING
    |
    ;

opt_charset:        CHARACTER SET colId
    |
    ;

constDatetime:        TIMESTAMP '(' iconst ')' opt_timezone
    |   TIME '(' iconst ')' opt_timezone
    |   TIMESTAMP opt_timezone
    |   TIME opt_timezone
    ;

constInterval:        INTERVAL
    ;

opt_timezone:        WITH_TIME ZONE
    |   WITHOUT TIME ZONE
    |
    ;

opt_interval:        interval_second
    |   DAY_P TO interval_second
    |   HOUR_P TO interval_second
    |   MINUTE_P TO interval_second
    |   YEAR_P
    |   MONTH_P
    |   DAY_P
    |   HOUR_P
    |   MINUTE_P
    |   YEAR_P TO MONTH_P
    |   DAY_P TO HOUR_P
    |   DAY_P TO MINUTE_P
    |   HOUR_P TO MINUTE_P
    |
    ;

interval_second:        SECOND_P '(' iconst ')'
    |   SECOND_P
    ;

a_expr:        a_expr '^' a_expr
    |   a_expr '*' a_expr
    |   a_expr '/' a_expr
    |   a_expr '%' a_expr
    |   a_expr '+' a_expr
    |   a_expr '-' a_expr
    |   a_expr '=' a_expr
    |   a_expr '<' a_expr
    |   a_expr '>' a_expr
    |   a_expr '||' a_expr
    |   a_expr LIKE a_expr ESCAPE a_expr
    |   a_expr NOT LIKE a_expr ESCAPE a_expr
    |   a_expr ILIKE a_expr ESCAPE a_expr
    |   a_expr NOT ILIKE a_expr ESCAPE a_expr
    |   a_expr SIMILAR TO a_expr ESCAPE a_expr
    |   a_expr NOT SIMILAR TO a_expr ESCAPE a_expr
    |   a_expr TYPECAST typename
    |   a_expr COLLATE any_name
    |   a_expr AND a_expr
    |   a_expr OR a_expr
    |   a_expr LIKE a_expr
    |   a_expr NOT LIKE a_expr
    |   a_expr ILIKE a_expr
    |   a_expr NOT ILIKE a_expr
    |   row OVERLAPS row
    |   a_expr IN_P in_expr
    |   a_expr NOT IN_P in_expr
    |   c_expr
    |   a_expr AT TIME ZONE a_expr
    |   '+' a_expr
    |   '-' a_expr
    |   a_expr qual_Op a_expr
    |   qual_Op a_expr
    |   a_expr qual_Op
    |   NOT a_expr
    |   a_expr SIMILAR TO a_expr
    |   a_expr NOT SIMILAR TO a_expr
    |   a_expr IS NULL_P
    |   a_expr ISNULL
    |   a_expr IS NOT NULL_P
    |   a_expr NOTNULL
    |   a_expr IS TRUE_P
    |   a_expr IS NOT TRUE_P
    |   a_expr IS FALSE_P
    |   a_expr IS NOT FALSE_P
    |   a_expr IS UNKNOWN
    |   a_expr IS NOT UNKNOWN
    |   a_expr IS DISTINCT FROM a_expr
    |   a_expr IS NOT DISTINCT FROM a_expr
    |   a_expr IS OF '(' type_list ')'
    |   a_expr IS NOT OF '(' type_list ')'
    |   a_expr BETWEEN opt_asymmetric b_expr AND b_expr
    |   a_expr NOT BETWEEN opt_asymmetric b_expr AND b_expr
    |   a_expr BETWEEN SYMMETRIC b_expr AND b_expr
    |   a_expr NOT BETWEEN SYMMETRIC b_expr AND b_expr
    |   a_expr subquery_Op sub_type select_with_parens
    |   a_expr subquery_Op sub_type '(' a_expr ')'
    |   UNIQUE select_with_parens
    |   a_expr IS DOCUMENT_P
    |   a_expr IS NOT DOCUMENT_P
    ;

b_expr:        b_expr '^' b_expr
    |   b_expr '*' b_expr
    |   b_expr '/' b_expr
    |   b_expr '%' b_expr
    |   b_expr '+' b_expr
    |   b_expr '-' b_expr
    |   b_expr '=' b_expr
    |   b_expr '<' b_expr
    |   b_expr '>' b_expr
    |   b_expr TYPECAST typename
    |   c_expr
    |   '+' b_expr
    |   '-' b_expr
    |   b_expr qual_Op b_expr
    |   qual_Op b_expr
    |   b_expr qual_Op
    |   b_expr IS DISTINCT FROM b_expr
    |   b_expr IS NOT DISTINCT FROM b_expr
    |   b_expr IS OF '(' type_list ')'
    |   b_expr IS NOT OF '(' type_list ')'
    |   b_expr IS DOCUMENT_P
    |   b_expr IS NOT DOCUMENT_P
    ;

c_expr:        '(' a_expr ')' opt_indirection
    |   columnref
    |   aexprConst
    |   PARAM opt_indirection
    |   case_expr
    |   func_expr
    |   select_with_parens
    |   EXISTS select_with_parens
    |   ARRAY select_with_parens
    |   ARRAY array_expr
    |   array_expr
    |   row
    ;

func_expr:        COLLATION FOR '(' a_expr ')'
    |   CURRENT_TIME '(' iconst ')'
    |   CURRENT_TIMESTAMP '(' iconst ')'
    |   LOCALTIME '(' iconst ')'
    |   LOCALTIMESTAMP '(' iconst ')'
    |   EXTRACT '(' extract_list ')'
    |   OVERLAY '(' overlay_list ')'
    |   POSITION '(' position_list ')'
    |   SUBSTRING '(' substr_list ')'
    |   TRIM '(' BOTH trim_list ')'
    |   TRIM '(' LEADING trim_list ')'
    |   TRIM '(' TRAILING trim_list ')'
    |   TRIM '(' trim_list ')'
    |   COALESCE '(' expr_list ')'
    |   GREATEST '(' expr_list ')'
    |   LEAST '(' expr_list ')'
    |   XMLCONCAT '(' expr_list ')'
    |   XMLELEMENT '(' NAME_P colLabel ')'
    |   XMLFOREST '(' xml_attribute_list ')'
    |   XMLPI '(' NAME_P colLabel ')'
    |   CAST '(' a_expr AS typename ')'
    |   TREAT '(' a_expr AS typename ')'
    |   XMLEXISTS '(' c_expr xmlexists_argument ')'
    |   NULLIF '(' a_expr ',' a_expr ')'
    |   XMLELEMENT '(' NAME_P colLabel ',' xml_attributes ')'
    |   XMLELEMENT '(' NAME_P colLabel ',' expr_list ')'
    |   XMLPARSE '(' document_or_content a_expr xml_whitespace_option ')'
    |   XMLPI '(' NAME_P colLabel ',' a_expr ')'
    |   XMLSERIALIZE '(' document_or_content a_expr AS simpleTypename ')'
    |   XMLROOT '(' a_expr ',' xml_root_version opt_xml_root_standalone ')'
    |   XMLELEMENT '(' NAME_P colLabel ',' xml_attributes ',' expr_list ')'
    |   func_name '(' ')' over_clause
    |   func_name '(' '*' ')' over_clause
    |   func_name '(' func_arg_list ')' over_clause
    |   func_name '(' VARIADIC func_arg_expr ')' over_clause
    |   func_name '(' func_arg_list sort_clause ')' over_clause
    |   func_name '(' ALL func_arg_list opt_sort_clause ')' over_clause
    |   func_name '(' DISTINCT func_arg_list opt_sort_clause ')' over_clause
    |   func_name '(' func_arg_list ',' VARIADIC func_arg_expr ')' over_clause
    |   CURRENT_DATE
    |   CURRENT_TIME
    |   CURRENT_TIMESTAMP
    |   LOCALTIME
    |   LOCALTIMESTAMP
    |   CURRENT_ROLE
    |   CURRENT_USER
    |   SESSION_USER
    |   USER
    |   CURRENT_CATALOG
    |   CURRENT_SCHEMA
    ;

xml_root_version:        VERSION_P a_expr
    |   VERSION_P NO VALUE_P
    ;

opt_xml_root_standalone:        ',' STANDALONE_P YES_P
    |   ',' STANDALONE_P NO
    |   ',' STANDALONE_P NO VALUE_P
    |
    ;

xml_attributes:        XMLATTRIBUTES '(' xml_attribute_list ')'
    ;

xml_attribute_list:        xml_attribute_list ',' xml_attribute_el
    |   xml_attribute_el
    ;

xml_attribute_el:        a_expr AS colLabel
    |   a_expr
    ;

document_or_content:        DOCUMENT_P
    |   CONTENT_P
    ;

xml_whitespace_option:        PRESERVE WHITESPACE_P
    |   STRIP_P WHITESPACE_P
    |
    ;

xmlexists_argument:        PASSING c_expr
    |   PASSING c_expr BY REF
    |   PASSING BY REF c_expr
    |   PASSING BY REF c_expr BY REF
    ;

window_clause:        WINDOW window_definition_list
    |
    ;

window_definition_list:        window_definition_list ',' window_definition
    |   window_definition
    ;

window_definition:        colId AS window_specification
    ;

over_clause:        OVER window_specification
    |   OVER colId
    |
    ;

window_specification:        '(' opt_existing_window_name opt_partition_clause opt_sort_clause opt_frame_clause ')'
    ;

opt_existing_window_name:        colId
    |
    ;

opt_partition_clause:        PARTITION BY expr_list
    |
    ;

opt_frame_clause:        RANGE frame_extent
    |   ROWS frame_extent
    |
    ;

frame_extent:        BETWEEN frame_bound AND frame_bound
    |   frame_bound
    ;

frame_bound:        a_expr PRECEDING
    |   a_expr FOLLOWING
    |   UNBOUNDED PRECEDING
    |   UNBOUNDED FOLLOWING
    |   CURRENT_P ROW
    ;

row:        ROW '(' ')'
    |   ROW '(' expr_list ')'
    |   '(' expr_list ',' a_expr ')'
    ;

sub_type:        ANY
    |   SOME
    |   ALL
    ;

all_Op:        Op
    |   mathOp
    ;

mathOp:        '^'
    |   '*'
    |   '/'
    |   '%'
    |   '+'
    |   '-'
    |   '='
    |   '<'
    |   '>'
    ;

qual_Op:        OPERATOR '(' any_operator ')'
    |   Op
    ;

qual_all_Op:        OPERATOR '(' any_operator ')'
    |   all_Op
    ;

subquery_Op:        OPERATOR '(' any_operator ')'
    |   all_Op
    |   LIKE
    |   NOT LIKE
    |   ILIKE
    |   NOT ILIKE
    ;

expr_list:        expr_list ',' a_expr
    |   a_expr
    ;

func_arg_list:        func_arg_list ',' func_arg_expr
    |   func_arg_expr
    ;

func_arg_expr:        param_name COLON_EQUALS a_expr
    |   a_expr
    ;

type_list:        type_list ',' typename
    |   typename
    ;

array_expr:        '[' ']'
    |   '[' expr_list ']'
    |   '[' array_expr_list ']'
    ;

array_expr_list:        array_expr_list ',' array_expr
    |   array_expr
    ;

extract_list:        extract_arg FROM a_expr
    |
    ;

extract_arg:        sconst
    |   IDENT
    |   YEAR_P
    |   MONTH_P
    |   DAY_P
    |   HOUR_P
    |   MINUTE_P
    |   SECOND_P
    ;

overlay_list:        a_expr overlay_placing substr_from substr_for
    |   a_expr overlay_placing substr_from
    ;

overlay_placing:        PLACING a_expr
    ;

position_list:        b_expr IN_P b_expr
    |
    ;

substr_list:        a_expr substr_from substr_for
    |   a_expr substr_for substr_from
    |   a_expr substr_from
    |   a_expr substr_for
    |   expr_list
    |
    ;

substr_from:        FROM a_expr
    ;

substr_for:        FOR a_expr
    ;

trim_list:        a_expr FROM expr_list
    |   FROM expr_list
    |   expr_list
    ;

in_expr:        '(' expr_list ')'
    |   select_with_parens
    ;

case_expr:        CASE case_arg when_clause_list case_default END_P
    ;

when_clause_list:        when_clause_list when_clause
    |   when_clause
    ;

when_clause:        WHEN a_expr THEN a_expr
    ;

case_default:        ELSE a_expr
    |
    ;

case_arg:        a_expr
    |
    ;

columnref:        colId indirection
    |   colId
    ;

indirection_el:        '.' '*'
    |   '.' attr_name
    |   '[' a_expr ']'
    |   '[' a_expr ':' a_expr ']'
    ;

indirection:        indirection indirection_el
    |   indirection_el
    ;

opt_indirection:        opt_indirection indirection_el
    |
    ;

opt_asymmetric:        ASYMMETRIC
    |
    ;

ctext_expr:        a_expr
    |   DEFAULT
    ;

ctext_expr_list:        ctext_expr_list ',' ctext_expr
    |   ctext_expr
    ;

ctext_row:        '(' ctext_expr_list ')'
    ;

target_list:        target_list ',' target_el
    |   target_el
    ;

target_el:        '*'
    |   a_expr AS colLabel
    |   a_expr IDENT
    |   a_expr
    ;

qualified_name_list:        qualified_name_list ',' qualified_name
    |   qualified_name
    ;

qualified_name:        colId indirection
    |   colId
    ;

name_list:        name_list ',' name
    |   name
    ;

name:        colId
    ;

database_name:        colId
    ;

access_method:        colId
    ;

attr_name:        colLabel
    ;

index_name:        colId
    ;

file_name:        sconst
    ;

func_name:        colId indirection
    |   type_function_name
    ;

aexprConst:        constInterval '(' iconst ')' sconst opt_interval
    |   func_name '(' func_arg_list ')' sconst
    |   constInterval sconst opt_interval
    |   func_name sconst
    |   constTypename sconst
    |   iconst
    |   sconst
    |   FCONST
    |   BCONST
    |   XCONST
    |   TRUE_P
    |   FALSE_P
    |   NULL_P
    ;

iconst:        ICONST
    ;

sconst:        SCONST
    ;

roleId:        colId
    ;

signedIconst:        '+' iconst
    |   '-' iconst
    |   iconst
    ;

colId:        unreserved_keyword
    |   col_name_keyword
    |   IDENT
    ;

type_function_name:        unreserved_keyword
    |   type_func_name_keyword
    |   IDENT
    ;

colLabel:        unreserved_keyword
    |   col_name_keyword
    |   type_func_name_keyword
    |   reserved_keyword
    |   IDENT
    ;

unreserved_keyword:        ABORT_P
    |   ABSOLUTE_P
    |   ACCESS
    |   ACTION
    |   ADD_P
    |   ADMIN
    |   AFTER
    |   AGGREGATE
    |   ALSO
    |   ALTER
    |   ALWAYS
    |   ASSERTION
    |   ASSIGNMENT
    |   AT
    |   ATTRIBUTE
    |   BACKWARD
    |   BEFORE
    |   BEGIN_P
    |   BY
    |   CACHE
    |   CALLED
    |   CASCADE
    |   CASCADED
    |   CATALOG_P
    |   CHAIN
    |   CHARACTERISTICS
    |   CHECKPOINT
    |   CLASS
    |   CLOSE
    |   CLUSTER
    |   COMMENT
    |   COMMENTS
    |   COMMIT
    |   COMMITTED
    |   CONFIGURATION
    |   CONNECTION
    |   CONSTRAINTS
    |   CONTENT_P
    |   CONTINUE_P
    |   CONVERSION_P
    |   COPY
    |   COST
    |   CSV
    |   CURRENT_P
    |   CURSOR
    |   CYCLE
    |   DATA_P
    |   DATABASE
    |   DAY_P
    |   DEALLOCATE
    |   DECLARE
    |   DEFAULTS
    |   DEFERRED
    |   DEFINER
    |   DELETE_P
    |   DELIMITER
    |   DELIMITERS
    |   DICTIONARY
    |   DISABLE_P
    |   DISCARD
    |   DOCUMENT_P
    |   DOMAIN_P
    |   DOUBLE_P
    |   DROP
    |   EACH
    |   ENABLE_P
    |   ENCODING
    |   ENCRYPTED
    |   ENUM_P
    |   ESCAPE
    |   EXCLUDE
    |   EXCLUDING
    |   EXCLUSIVE
    |   EXECUTE
    |   EXPLAIN
    |   EXTENSION
    |   EXTERNAL
    |   FAMILY
    |   FIRST_P
    |   FOLLOWING
    |   FORCE
    |   FORWARD
    |   FUNCTION
    |   FUNCTIONS
    |   GLOBAL
    |   GRANTED
    |   HANDLER
    |   HEADER_P
    |   HOLD
    |   HOUR_P
    |   IDENTITY_P
    |   IF_P
    |   IMMEDIATE
    |   IMMUTABLE
    |   IMPLICIT_P
    |   INCLUDING
    |   INCREMENT
    |   INDEX
    |   INDEXES
    |   INHERIT
    |   INHERITS
    |   INLINE_P
    |   INPUT_P
    |   INSENSITIVE
    |   INSERT
    |   INSTEAD
    |   INVOKER
    |   ISOLATION
    |   KEY
    |   LABEL
    |   LANGUAGE
    |   LARGE_P
    |   LAST_P
    |   LC_COLLATE_P
    |   LC_CTYPE_P
    |   LEAKPROOF
    |   LEVEL
    |   LISTEN
    |   LOAD
    |   LOCAL
    |   LOCATION
    |   LOCK_P
    |   MAPPING
    |   MATCH
    |   MAXVALUE
    |   MINUTE_P
    |   MINVALUE
    |   MODE
    |   MONTH_P
    |   MOVE
    |   NAME_P
    |   NAMES
    |   NEXT
    |   NO
    |   NOTHING
    |   NOTIFY
    |   NOWAIT
    |   NULLS_P
    |   OBJECT_P
    |   OF
    |   OFF
    |   OIDS
    |   OPERATOR
    |   OPTION
    |   OPTIONS
    |   OWNED
    |   OWNER
    |   PARSER
    |   PARTIAL
    |   PARTITION
    |   PASSING
    |   PASSWORD
    |   PLANS
    |   PRECEDING
    |   PREPARE
    |   PREPARED
    |   PRESERVE
    |   PRIOR
    |   PRIVILEGES
    |   PROCEDURAL
    |   PROCEDURE
    |   QUOTE
    |   RANGE
    |   READ
    |   REASSIGN
    |   RECHECK
    |   RECURSIVE
    |   REF
    |   REINDEX
    |   RELATIVE_P
    |   RELEASE
    |   RENAME
    |   REPEATABLE
    |   REPLACE
    |   REPLICA
    |   RESET
    |   RESTART
    |   RESTRICT
    |   RETURNS
    |   REVOKE
    |   ROLE
    |   ROLLBACK
    |   ROWS
    |   RULE
    |   SAVEPOINT
    |   SCHEMA
    |   SCROLL
    |   SEARCH
    |   SECOND_P
    |   SECURITY
    |   SEQUENCE
    |   SEQUENCES
    |   SERIALIZABLE
    |   SERVER
    |   SESSION
    |   SET
    |   SHARE
    |   SHOW
    |   SIMPLE
    |   SNAPSHOT
    |   STABLE
    |   STANDALONE_P
    |   START
    |   STATEMENT
    |   STATISTICS
    |   STDIN
    |   STDOUT
    |   STORAGE
    |   STRICT_P
    |   STRIP_P
    |   SYSID
    |   SYSTEM_P
    |   TABLES
    |   TABLESPACE
    |   TEMP
    |   TEMPLATE
    |   TEMPORARY
    |   TEXT_P
    |   TRANSACTION
    |   TRIGGER
    |   TRUNCATE
    |   TRUSTED
    |   TYPE_P
    |   TYPES_P
    |   UNBOUNDED
    |   UNCOMMITTED
    |   UNENCRYPTED
    |   UNKNOWN
    |   UNLISTEN
    |   UNLOGGED
    |   UNTIL
    |   UPDATE
    |   VACUUM
    |   VALID
    |   VALIDATE
    |   VALIDATOR
    |   VALUE_P
    |   VARYING
    |   VERSION_P
    |   VIEW
    |   VOLATILE
    |   WHITESPACE_P
    |   WITHOUT
    |   WORK
    |   WRAPPER
    |   WRITE
    |   XML_P
    |   YEAR_P
    |   YES_P
    |   ZONE
    
    |   K_QUERY
    |   K_ALIAS
    |   ARRAY
    |   K_BACKWARD
    |   K_CONSTANT
    |   K_CURRENT
    |   K_CURSOR
    |   K_DEBUG
    |   K_DETAIL
    |   K_DUMP
//    |   K_ERRCODE
    |   K_ERROR
    |   K_FIRST
    |   K_FORWARD
    |   K_HINT
    |   K_INFO
    |   IS
    |   K_LAST
    |   K_LOG
    |   K_MESSAGE
    |   K_MESSAGE_TEXT
    |   K_NEXT
    |   K_NO
    |   K_NOTICE
    |   K_OPTION
    |   K_PG_EXCEPTION_CONTEXT
    |   K_PG_EXCEPTION_DETAIL
    |   K_PG_EXCEPTION_HINT
    |   K_PRIOR
    |   K_QUERY
    |   K_RELATIVE
    |   K_RESULT_OID
    |   K_RETURNED_SQLSTATE
    |   K_REVERSE
    |   K_ROW_COUNT
    |   K_ROWTYPE
    |   K_SCROLL
    |   K_SLICE
//    |   K_SQLSTATE
    |   K_STACKED
    |   TYPE_P
    |   K_USE_COLUMN
    |   K_USE_VARIABLE
    |   K_VARIABLE_CONFLICT
    |   K_WARNING
    ;

col_name_keyword:        BETWEEN
    |   BIGINT
    |   BIT
    |   BOOLEAN_P
    |   CHAR_P
    |   CHARACTER
    |   COALESCE
    |   DEC
    |   DECIMAL_P
    |   EXISTS
    |   EXTRACT
    |   FLOAT_P
    |   GREATEST
    |   INOUT
    |   INT_P
    |   INTEGER
    |   INTERVAL
    |   LEAST
    |   NATIONAL
    |   NCHAR
    |   NONE
    |   NULLIF
    |   NUMERIC
    |   OUT_P
    |   OVERLAY
    |   POSITION
    |   PRECISION
    |   REAL
    |   ROW
    |   SETOF
    |   SMALLINT
    |   SUBSTRING
    |   TIME
    |   TIMESTAMP
    |   TREAT
    |   TRIM
    |   VALUES
    |   VARCHAR
    |   XMLATTRIBUTES
    |   XMLCONCAT
    |   XMLELEMENT
    |   XMLEXISTS
    |   XMLFOREST
    |   XMLPARSE
    |   XMLPI
    |   XMLROOT
    |   XMLSERIALIZE
    ;

type_func_name_keyword:        AUTHORIZATION
    |   BINARY
    |   COLLATION
    |   CONCURRENTLY
    |   CROSS
    |   CURRENT_SCHEMA
    |   FREEZE
    |   FULL
    |   ILIKE
    |   INNER_P
    |   IS
    |   ISNULL
    |   JOIN
    |   LEFT
    |   LIKE
    |   NATURAL
    |   NOTNULL
    |   OUTER_P
    |   OVER
    |   OVERLAPS
    |   RIGHT
    |   SIMILAR
    |   VERBOSE
    ;

reserved_keyword:        ALL
    |   ANALYSE
    |   ANALYZE
    |   AND
    |   ANY
    |   ARRAY
    |   AS
    |   ASC
    |   ASYMMETRIC
    |   BOTH
    |   CASE
    |   CAST
    |   CHECK
    |   COLLATE
    |   COLUMN
    |   CONSTRAINT
    |   CREATE
    |   CURRENT_CATALOG
    |   CURRENT_DATE
    |   CURRENT_ROLE
    |   CURRENT_TIME
    |   CURRENT_TIMESTAMP
    |   CURRENT_USER
    |   DEFAULT
    |   DEFERRABLE
    |   DESC
    |   DISTINCT
    |   DO
    |   ELSE
    |   END_P
    |   EXCEPT
    |   FALSE_P
    |   FETCH
    |   FOR
    |   FOREIGN
    |   FROM
    |   GRANT
    |   GROUP_P
    |   HAVING
    |   IN_P
    |   INITIALLY
    |   INTERSECT
    |   INTO
    |   LEADING
    |   LIMIT
    |   LOCALTIME
    |   LOCALTIMESTAMP
    |   NOT
    |   NULL_P
    |   OFFSET
    |   ON
    |   ONLY
    |   OR
    |   ORDER
    |   PLACING
    |   PRIMARY
    |   REFERENCES
    |   RETURNING
    |   SELECT
    |   SESSION_USER
    |   SOME
    |   SYMMETRIC
    |   TABLE
    |   THEN
    |   TO
    |   TRAILING
    |   TRUE_P
    |   UNION
    |   UNIQUE
    |   USER
    |   USING
    |   VARIADIC
    |   WHEN
    |   WHERE
    |   WINDOW
    |   WITH
    ;


