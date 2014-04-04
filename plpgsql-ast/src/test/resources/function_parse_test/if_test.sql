-- test cases are taken from
-- http://www.postgresql.org/docs/9.1/static/sql-delete.html
CREATE OR REPLACE FUNCTION if_test(i integer)
RETURNS integer AS
$$
DECLARE
	a INTEGER;
BEGIN

  IF TRUE THEN END IF;


  IF TRUE
  THEN
    DELETE FROM films USING producers
       WHERE producer_id = producers.id AND producers.name = 'foo';
  END IF;


  IF TRUE
  THEN
    DELETE FROM films USING producers
       WHERE producer_id = producers.id AND producers.name = 'foo';
  ELSE
    IF TRUE THEN END IF;
  END IF;


  IF a > b
  THEN
    DELETE FROM films USING producers
       WHERE producer_id = producers.id AND producers.name = 'foo';
  ELSIF a = b
  THEN
      DELETE FROM films ;
  ELSE
    IF TRUE THEN END IF;
  END IF;

END;
$$
LANGUAGE plpgsql;
