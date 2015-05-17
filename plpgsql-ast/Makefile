
GRAMMAR_DIR  = src/main/grammar

SQL_PARSER   = $(GRAMMAR_DIR)/de/zalando/plpgsql/ast/Sql.g4
SQL_KEYWORDS = $(GRAMMAR_DIR)/de/zalando/plpgsql/ast/SqlKeyWords.g4
SQL_LEXER    = $(GRAMMAR_DIR)/de/zalando/plpgsql/ast/PgSqlLexer.g4

PLPGSQL_PARSER   = $(GRAMMAR_DIR)/de/zalando/plpgsql/ast/PlPgSql.g4.tmp
PLPGSQL_KEYWORDS = $(GRAMMAR_DIR)/de/zalando/plpgsql/ast/PlPgSqlKeyWords.g4.tmp

ORIGINAL_SQL_PARSER_GRAMMAR = $(GRAMMAR_DIR)/postgres_grammar/sql_gram.y
ORIGINAL_SQL_KEYWORDS   = $(GRAMMAR_DIR)/postgres_grammar/kwlist.h

ORIGINAL_PLPGSQL_PARSER_GRAMMAR = $(GRAMMAR_DIR)/postgres_grammar/plpgsql_gram.y
ORIGINAL_PLPGSQL_KEYWORDS       = $(GRAMMAR_DIR)/postgres_grammar/pl_scanner.c


ifeq ($(shell uname -s),Darwin)
ANTLR_JAR = /usr/local/Cellar/antlr/4.5/antlr-4.5-complete.jar
else # Linux
ANTLR_JAR = /usr/local/lib/antlr-4.2.2-complete.jar
endif

PYTHON_CMD = python
MVN_CMD = mvn
ANTLR_CMD := java -jar $(ANTLR_JAR)
GRUN_CMD := java -cp $(ANTLR_JAR) org.antlr.v4.runtime.misc.TestRig

generate: $(SQL_PARSER) $(SQL_KEYWORDS) $(SQL_LEXER) $(PLPGSQL_PARSER) $(PLPGSQL_KEYWORDS)
	$(MVN_CMD) install -DskipTests=true

clean:
	rm -f $(SQL_PARSER)
	rm -f $(SQL_KEYWORDS)
	rm -f $(PLPGSQL_PARSER)
	rm -f $(PLPGSQL_KEYWORDS)
	$(MVN_CMD) -o -q clean

$(SQL_PARSER):
	$(PYTHON_CMD) $(GRAMMAR_DIR)/scripts/sql_parser_grammar_converter.py $(ORIGINAL_SQL_PARSER_GRAMMAR) > $(SQL_PARSER)

$(SQL_KEYWORDS):
	$(PYTHON_CMD) $(GRAMMAR_DIR)/scripts/sql_lexer_grammar_converter.py $(ORIGINAL_SQL_KEYWORDS) > $(SQL_KEYWORDS)

$(PLPGSQL_PARSER):
	$(PYTHON_CMD) $(GRAMMAR_DIR)/scripts/plpgsql_parser_grammar_converter.py $(ORIGINAL_PLPGSQL_PARSER_GRAMMAR) > $(PLPGSQL_PARSER)

$(PLPGSQL_KEYWORDS):
	$(PYTHON_CMD) $(GRAMMAR_DIR)/scripts/plpgsql_lexer_grammar_converter.py $(ORIGINAL_PLPGSQL_KEYWORDS) > $(PLPGSQL_KEYWORDS)


test: generate
	$(MVN_CMD) -o install
