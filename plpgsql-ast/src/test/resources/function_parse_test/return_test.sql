CREATE OR REPLACE FUNCTION return_test(i integer)
RETURNS integer AS
$$
DECLARE
	a INTEGER;
BEGIN
	RETURN;
	RETURN a;
	RETURN NEXT a;
	RETURN QUERY select col from tab;
	RETURN QUERY EXECUTE $$select col from tab$$;
END;
$$
LANGUAGE plpgsql;
