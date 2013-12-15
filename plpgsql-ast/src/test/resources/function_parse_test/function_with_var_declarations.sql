CREATE OR REPLACE FUNCTION increment(i integer) 
RETURNS integer AS 
$$
DECLARE
  l_var   INTEGER;
  l_var2  z.custom; 
  l_var3  BIGINT = 1234;
  l_var4  TEXT   = 'my fancy test';
  VAR CONSTANT INTEGER = 123456789;
BEGIN
END; 
$$ LANGUAGE plpgsql;
