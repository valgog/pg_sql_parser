CREATE OR REPLACE FUNCTION increment()
RETURNS integer AS
$$
DECLARE
--  b INTEGER;
BEGIN
  SELECT ft_id
      INTO a
    FROM t.my_fancy_table
    JOIN z.here on z.id = t.id
  LEFT JOIN x.here on x.id = t.id

     -- WHERE ft_id = 0;
     ;
END;
$$
LANGUAGE plpgsql;
