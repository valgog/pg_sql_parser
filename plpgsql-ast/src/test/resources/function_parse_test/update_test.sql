-- test cases are taken from
-- http://www.postgresql.org/docs/9.1/static/sql-update.html
CREATE OR REPLACE FUNCTION update_test(i integer)
RETURNS integer AS
$$
DECLARE
	a INTEGER;
BEGIN
	UPDATE films SET kind = 'Dramatic' WHERE kind = 'Drama';

    UPDATE weather SET temp_lo = temp_lo+1, temp_hi = temp_lo+15, prcp = DEFAULT
     WHERE city = 'San Francisco' AND date = '2003-07-03';


	UPDATE weather SET temp_lo = temp_lo+1, temp_hi = temp_lo+15, prcp = DEFAULT
	  WHERE city = 'San Francisco' AND date = '2003-07-03'
	  RETURNING temp_lo, temp_hi, prcp;


	  UPDATE weather SET (temp_lo, temp_hi, prcp) = (temp_lo+1, temp_lo+15, DEFAULT)
	    WHERE city = 'San Francisco' AND date = '2003-07-03';

	UPDATE employees SET sales_count = sales_count + 1 FROM accounts
	  WHERE accounts.name = 'Acme Corporation'
	  AND employees.id = accounts.sales_person;

	UPDATE employees SET sales_count = sales_count + 1
	WHERE id =  (SELECT sales_person FROM accounts WHERE name = 'Acme Corporation');

    WITH regional_sales AS (
	   SELECT region, SUM(amount) AS total_sales
	     FROM orders
    )
	UPDATE weather
	   SET (temp_lo, temp_hi, prcp) = (temp_lo+1, temp_lo+15, DEFAULT)
	 WHERE city = 'San Francisco' AND date = '2003-07-03';


END;
$$
LANGUAGE plpgsql;
