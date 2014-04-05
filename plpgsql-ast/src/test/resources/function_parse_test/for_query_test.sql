-- test cases are taken from
-- http://www.postgresql.org/docs/9.1/static/plpgsql-control-structures.html
-- WITHOUT ORDER BY
CREATE OR REPLACE FUNCTION for_query_test(i integer)
RETURNS integer AS
$$
DECLARE
	a INTEGER;
BEGIN


FOR mviews IN SELECT * FROM cs_materialized_views
LOOP
END LOOP;

FOR mviews IN (SELECT * FROM cs_materialized_views)
LOOP
END LOOP;

FOR mviews IN ((SELECT * FROM cs_materialized_views))
LOOP
END LOOP;


END;
$$
LANGUAGE plpgsql;
