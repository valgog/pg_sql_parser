CREATE OR REPLACE FUNCTION increment(i integer) 
RETURNS integer AS 
$$ 
DECLARE
	a INTEGER;
	t TEXT;
	b boolean;
BEGIN
	a = i;
	a = 0;
	i = i + 1;
	i = i - 1;
	i = i * 1;
	i = i % 1;
	t = 'hello world';  -- String Test
	b = t like 'hello';
	b = t Ilike 'hello';
	b = t similar to 'my fancy test';
	
	a = a + 1 + (1 * 2);

END; 
$$ 
LANGUAGE plpgsql;
