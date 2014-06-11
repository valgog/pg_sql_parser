  WITH regional_sales AS (
          SELECT ps_id as test  from zcep_data.parcel_service
       ),
       top_regions AS (
          SELECT ps_id as test from zcep_data.parcel_service
          where ps_id > (SELECT SUM(total_sales) / 10 FROM regional_sales)
       )
  SELECT *
  FROM zcep_data.parcel_service
  WHERE ps_id IN (SELECT test FROM regional_sales);