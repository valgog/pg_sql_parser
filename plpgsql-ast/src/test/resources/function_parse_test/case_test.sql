-- test cases are taken from
-- http://www.postgresql.org/docs/9.1/static/plpgsql-control-structures.html
CREATE OR REPLACE FUNCTION case_test(i integer)
RETURNS integer AS
$$
DECLARE
	a INTEGER;
BEGIN

  CASE x
    WHEN 1, 2 THEN
        msg := 'one or two';
    ELSE
        msg := 'other value than one or two';
  END CASE;


  CASE
	    WHEN x BETWEEN 0 AND 10 THEN
	        msg := 'value is between zero and ten';
	    WHEN x BETWEEN 11 AND 20 THEN
	        msg := 'value is between eleven and twenty';
	END CASE;


END;
$$
LANGUAGE plpgsql;
