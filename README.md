pg_sql_parser
=============

The aim of this project is to provide a PostgreSQL SQL and PL/pgSQL grammars (ANTLR4) to enable code analysis of Postgres stored procedures in Java and Python.

This is work in progress or even an experiment for now.

METHOD
======
We create grammar files for a lexer and a parser. ANTLR4 can turn these into java classes for us. We can then use these classes to parse the source code.
Having a basic grasp of parsing and ANTLR4 is very valuable in getting started.

GOALS
=====
For this project we have a few different goals, they are here listed in order
of ease of expected implementation:

- Identify relations that are being mentioned (and therefore probably used) in the stored procedures.
- Reformat source code

REFERENCES
==========
We are not the only one having this idea. There are multiple projects dead and alive which are attempting the same thing. We will list a few as reference, to learn from other's mistakes and ideas.

**An ANTLR 4 lexer for PostgreSQL**  
https://github.com/tunnelvisionlabs/antlr4-grammar-postgresql   
Last activity: 4 days ago (September 2014)  

**pg-parser**  
https://github.com/claesjac/pg-parser  
Last activity: 3 years ago (2011)  

Discussion: **exporting raw parser**  
http://postgresql.1045698.n5.nabble.com/exporting-raw-parser-td2018442.html  
Last activity: 4 years ago (2010)  

**pgFormatter**  
https://github.com/darold/pgFormatter  
Last activity: 14 days ago (September 2014)  

BUGS
====
Issue 670
-----------
- ANTLR 4.2.2 Can parse our .g4 files, but cannot generate Python code.
- ANTLR 4.4 Cannot parse our .g4 files, but can generate Pyton code.  
https://github.com/antlr/antlr4/issues/670

