Grammar
=======
- document grammar
- do something about the complex dollar delimited strings, currently we "catch" only the following:  
    $$  
    $function$  
    $BODY$  

Parsing function body
=====================
Currently a function body is read as a string (s_const). The reason for this is that we cannot know during the first
parse what language a function is written in. (The LANGUAGE option may come *after* the function body).

One option is to do a second parse after the first parse, a solution could be:
  
      PARSE SQL
      WALK THROUGH parse tree (using a Listener or a Visitor)
      IF enterFunc_as is called
        IF function language is PLPGSQL
        THEN parse function boday with PlPgSql lexer/parser

Discussion points
=================
- very clear split up in lexer/parser
- design a parser and use an already finished lexer
- provide the tool to convert grammar in the PostgreSQL source code into g4 files for this project
