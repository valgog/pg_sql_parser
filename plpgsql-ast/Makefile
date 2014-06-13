GRAMMAR_DIR  = src/main/grammar

SQL_PARSER   = $(GRAMMAR_DIR)/de/zalando/plpgsql/ast/Sql.g4
SQL_KEYWORDS = $(GRAMMAR_DIR)/de/zalando/plpgsql/ast/SqlKeyWords.g4

ORIGINAL_PARSER_GRAMMAR = $(GRAMMAR_DIR)/postgres_grammar/sql_gram.y
ORIGINAL_SQL_KEYWORDS   = $(GRAMMAR_DIR)/postgres_grammar/kwlist.h

MVN_CMD = mvn3
PYTHON_CMD = python

generate: clean $(SQL_PARSER) $(SQL_KEYWORDS)
	$(MVN_CMD) clean install -DskipTests=true 

clean:
	rm -f $(SQL_PARSER)
	rm -f $(SQL_KEYWORDS)
	$(MVN_CMD) clean

$(SQL_PARSER):
	$(PYTHON_CMD) $(GRAMMAR_DIR)/scripts/parser_grammar_converter.py $(ORIGINAL_PARSER_GRAMMAR) > $(SQL_PARSER)
	
$(SQL_KEYWORDS):
	$(PYTHON_CMD) $(GRAMMAR_DIR)/scripts/lexer_grammar_converter.py $(ORIGINAL_SQL_KEYWORDS) > $(SQL_KEYWORDS)