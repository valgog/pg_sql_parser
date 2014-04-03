-- test cases are taken from
-- http://www.postgresql.org/docs/9.1/static/sql-delete.html
CREATE OR REPLACE FUNCTION delete_test(i integer)
RETURNS integer AS
$$
DECLARE
	a INTEGER;
BEGIN

  DELETE FROM films USING producers
   WHERE producer_id = producers.id AND producers.name = 'foo';

  DELETE FROM films
    WHERE producer_id IN (SELECT id FROM producers WHERE name = 'foo');

  DELETE FROM films WHERE kind <> 'Musical';


  DELETE FROM films;

  DELETE FROM tasks WHERE status = 'DONE' RETURNING *;


END;
$$
LANGUAGE plpgsql;
