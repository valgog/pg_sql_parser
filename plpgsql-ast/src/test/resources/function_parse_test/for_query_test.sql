select pl_id, pl_dynamic_location_id, dl_barcode, pl_batch_id,b_v1_id, b_status, b_commission_type, pl_status, pl_created, pl_printed, pl_scanned, plp_id, plp_commission_id, c_order_id,c_type, c_status, plp_status, plp_created, plp_printed
from zal_data.print_list
LEFT JOIN zal_data.dynamic_location    ON dl_id             = pl_dynamic_location_id
LEFT JOIN zal_data.batch               ON b_id              = pl_batch_id
LEFT JOIN zal_data.print_list_position ON plp_print_list_id = pl_id
LEFT JOIN zal_data.commission          ON c_id              = plp_commission_id
where pl_status != 'PRINTED'
--and pl_created >= timestamp '2013-03-11 00:00:00'
--and dl_type = 'CART'
--order by pl_created DESC, pl_id
--LIMIT 100
