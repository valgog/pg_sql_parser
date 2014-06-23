CREATE OR REPLACE FUNCTION increment(i integer)
RETURNS integer AS
$$
DECLARE
BEGIN


	select ft_id , ft_description     INTO a , b	  FROM t.my_fancy_table;

END;
$$
LANGUAGE plpgsql;
