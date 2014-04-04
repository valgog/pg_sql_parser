-- test cases are taken from
-- http://www.postgresql.org/docs/9.1/static/plpgsql-control-structures.html
CREATE OR REPLACE FUNCTION while_test(i integer)
RETURNS integer AS
$$
DECLARE
	a INTEGER;
BEGIN

WHILE amount_owed > 0 AND gift_certificate_balance > 0 LOOP
    -- some computations here
END LOOP;

WHILE NOT done LOOP
    -- some computations here
END LOOP;

END;
$$
LANGUAGE plpgsql;
