-- test cases are taken from
-- http://www.postgresql.org/docs/9.1/static/plpgsql-control-structures.html
CREATE OR REPLACE FUNCTION foreach_test(i integer)
RETURNS integer AS
$$
DECLARE
	a INTEGER;
BEGIN

  FOREACH x IN ARRAY arr
  LOOP
    s := s + x;
  END LOOP;

  FOREACH x SLICE 1 IN ARRAY arr
  LOOP
    s := s + x;
  END LOOP;


END;
$$
LANGUAGE plpgsql;
