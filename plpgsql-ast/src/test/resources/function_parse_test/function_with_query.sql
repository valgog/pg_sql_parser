CREATE OR REPLACE FUNCTION increment(i integer) 
RETURNS integer AS 
$$ 
DECLARE
	a INTEGER;
BEGIN
	SELECT ft_id
      INTO a
	  FROM t.my_fancy_table
	 WHERE ft_id = 0
	   AND ft_id2 < 10
	   AND ft_id3 >= 0
	   OR ft_id4 <= ft_id3
	   OR ft_id5  = 'TEXT'
	  AND ft_id5  = '"text with double quotes"'
	   OR ft_id6 LIKE '%t'
	  AND ft_id7 ILIKE '%small'
	  AND ft_id8  = (1 + 3)
	  AND ft_id9 = myArr[0]
    LIMIT 1 ;
END; 
$$ 
LANGUAGE plpgsql;
