CREATE OR REPLACE FUNCTION increment(i integer) 
RETURNS integer AS 
$$
DECLARE
  l_var   INTEGER;
  l_var2  z.custom; 
  l_var3  BIGINT = 1234;
  l_var4  TEXT   = 'my fancy test';
  VAR CONSTANT INTEGER = 123456789;

  l_new_var ALIAS FOR l_var;
  user_id z.my_table.user_id%TYPE;
  my_row z.my_table%ROWTYPE;
BEGIN
END; 
$$ LANGUAGE plpgsql;
