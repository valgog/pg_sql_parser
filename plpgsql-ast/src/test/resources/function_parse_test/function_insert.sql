-- test cases are taken from
-- http://www.postgresql.org/docs/9.1/static/sql-insert.html
CREATE OR REPLACE FUNCTION insert_test(i integer)
RETURNS integer AS
$$
DECLARE
	a INTEGER;
BEGIN
	INSERT INTO films VALUES
    ('UA502', 'Bananas', 105, '1971-07-13', 'Comedy', '82 minutes');

    INSERT INTO films (code, title, did, date_prod, kind)
    VALUES ('T_601', 'Yojimbo', 106, '1961-06-16', 'Drama');

    INSERT INTO films (code, title, did, date_prod, kind) VALUES
    ('B6717', 'Tampopo', 110, '1985-02-10', 'Comedy'),
    ('HG120', 'The Dinner Game', 140, DEFAULT, 'Comedy');

	INSERT INTO films SELECT * FROM tmp_films WHERE date_prod < '2004-05-07';

	INSERT INTO films DEFAULT VALUES;


     INSERT INTO films (code, title, did, date_prod, kind)
          SELECT a,b,c,d,e
            FROM test;

     INSERT INTO films (code, title, did, date_prod, kind)
          SELECT a,b,c,d,e
            FROM z.test;

    INSERT INTO distributors (did, dname) VALUES (DEFAULT, 'XYZ Widgets')
    RETURNING did;

    INSERT INTO distributors (did, dname) VALUES (DEFAULT, 'XYZ Widgets')
    RETURNING did as lala into a;


    INSERT INTO distributors (did, dname) VALUES (DEFAULT, 'XYZ Widgets')
    RETURNING did as lala into strict a;

END;
$$
LANGUAGE plpgsql;
