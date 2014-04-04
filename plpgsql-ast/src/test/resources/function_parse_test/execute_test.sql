CREATE OR REPLACE FUNCTION execute_test(i integer)
RETURNS integer AS
$$
DECLARE
	a INTEGER;
BEGIN

	EXECUTE 'SELECT num from b.test';

	EXECUTE 'SELECT num from b.test' INTO a;

    EXECUTE 'SELECT num from b.test' INTO STRICT a;

END;
$$
LANGUAGE plpgsql;
