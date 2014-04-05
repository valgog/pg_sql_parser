-- test cases are taken from
-- http://www.postgresql.org/docs/9.1/static/plpgsql-statements.html
CREATE OR REPLACE FUNCTION get_diangostics_test(i integer)
RETURNS integer AS
$$
DECLARE
	a INTEGER;
BEGIN
   GET DIAGNOSTICS integer_var = ROW_COUNT;

   GET DIAGNOSTICS integer_var = ROW_COUNT, var2 = ROW_COUNT;

END;
$$
LANGUAGE plpgsql;
