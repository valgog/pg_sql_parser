SELECT 1 <+->> 1;

SELECT 1 +-- this is a comment
2;

SELECT 1 &/*this is a coment*/ 2;

SELECT 1 <-> 2;

SELECT 1 >> 3;

SELECT 1 >>? 2;

SELECT 1 >>- 4; -- should be processed as 1 >> -4
