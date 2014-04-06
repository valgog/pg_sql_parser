-- test cases are taken from
-- http://www.postgresql.org/docs/9.1/static/plpgsql-errors-and-messages.html
CREATE OR REPLACE FUNCTION raise_test(i integer)
RETURNS integer AS
$$
DECLARE
	a INTEGER;
BEGIN

RAISE NOTICE 'Calling cs_create_job(%)', v_job_id;

RAISE 'Duplicate user ID: %', user_id USING ERRCODE = 'unique_violation';

RAISE 'Duplicate user ID: %', user_id USING ERRCODE = '23505';

RAISE division_by_zero;

RAISE SQLSTATE '22012';

RAISE NOTICE 'Nonexistent ID --> %', user_id
      USING HINT = 'Please check your user ID';


END;
$$
LANGUAGE plpgsql;
