-- test cases are taken from
-- http://www.postgresql.org/docs/9.1/static/plpgsql-control-structures.html
CREATE OR REPLACE FUNCTION loop_exit_continue_test(i integer)
RETURNS integer AS
$$
DECLARE
	a INTEGER;
BEGIN

LOOP
    -- some computations
    IF count > 0 THEN
        EXIT;  -- exit loop
    END IF;
END LOOP;

LOOP
    -- some computations
    EXIT WHEN count > 0;  -- same result as previous example
END LOOP;

<<ablock>>
LOOP
    -- some computations
    EXIT ablock WHEN count > 0;  -- same result as previous example
END LOOP;


LOOP
    -- some computations
    EXIT ablock WHEN count > 0;  -- same result as previous example
END LOOP ablock;

LOOP
    -- some computations
    EXIT WHEN count > 100;
    CONTINUE WHEN count < 50;
    -- some computations for count IN [50 .. 100]
END LOOP;

END;
$$
LANGUAGE plpgsql;
