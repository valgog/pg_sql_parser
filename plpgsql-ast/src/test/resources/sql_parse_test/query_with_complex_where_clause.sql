  SELECT ft_id
      INTO a
      FROM t.my_fancy_table
      JOIN t.other_table           ON ot_id   = mft_my_fancy_table_id
 LEFT JOIN z.might_be_there_table  ON mbtt_id = mft_id
     WHERE ft_id = 1 -- PROBLEM: maybe something with numbers...
