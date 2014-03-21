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

     INSERT INTO hollywood.films (code, title, did, date_prod, kind)
         VALUES ('T_601', 'Yojimbo', 106, '1961-06-16', 'Drama');

--     INSERT INTO hollywood.films (code, title, did, date_prod, kind)
--         SELECT a,b,c,d,e
--           FROM test;



END;
$$
LANGUAGE plpgsql;
