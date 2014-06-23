CREATE OR REPLACE FUNCTION increment()
RETURNS integer AS
$$
DECLARE

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

	a = 2^1;
	a = a^b^i^2;

	arr = arr[1];
	arr = arr[i];


	arr[i] = i;
	arr[2] = i;
	arr[ funcCall(a) ] = 12334;

END;
$$
LANGUAGE plpgsql;
