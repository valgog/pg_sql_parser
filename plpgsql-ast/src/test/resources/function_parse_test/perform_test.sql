CREATE OR REPLACE FUNCTION perform_test(i integer)
RETURNS integer AS
$$
DECLARE
	a INTEGER;
BEGIN

   PERFORM ft_id
	  FROM t.my_fancy_table
      JOIN t.other_table           ON ot_id   = mft_my_fancy_table_id
 LEFT JOIN z.might_be_there_table  ON mbtt_id = mft_id
     WHERE ft_id = 0
	   AND ft_id2 < 10
	   AND ft_id3 >= 0
	    OR ft_id4 <= ft_id3
	    OR ft_id5  = 'TEXT'
	   AND ft_id5  = '"text with double quotes"'
	    OR ft_id6 LIKE '%t'
	   AND ft_id7 ILIKE '%small'
	   AND ft_id8  = (1 + 3)
	   AND ft_id9 = myArr[0];

PERFORM create_mv('cs_session_page_requests_mv', my_query);

END;
$$
LANGUAGE plpgsql;
