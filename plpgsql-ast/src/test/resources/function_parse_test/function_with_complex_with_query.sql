/*
 * Test is taken from
 * http://www.postgresql.org/docs/9.1/static/queries-with.html
 * in a modified version
 */
CREATE OR REPLACE FUNCTION function_with_complex_with_query(i integer)
RETURNS integer AS
$$
DECLARE
	a INTEGER;
BEGIN
	WITH regional_sales AS (
	        SELECT region, SUM(amount) AS total_sales
	        FROM orders
	     ), top_regions AS (
	        SELECT region
	        FROM regional_sales
	        WHERE total_sales > (SELECT SUM(total_sales)/10 FROM regional_sales)
	     )
	SELECT region,
	       product,
	       SUM(quantity) AS product_units,
	       SUM(amount) AS product_sales
	FROM orders
	WHERE region IN (SELECT region FROM top_regions);
END;
$$
LANGUAGE plpgsql;
