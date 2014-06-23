CREATE OR REPLACE FUNCTION function_with_declarations(
    p_limit                             integer,
    p_shipment_number                   TEXT[],
    OUT result_status_id                SMALLINT,
    OUT result_status_msg               text
) RETURNS RECORD AS
$$
DECLARE
    header_ids                  bigint[];
    commissions                 commission[];
    l_commission                commission;
    l_commission_write_result   RECORD;
    l_loop_index                SMALLINT;
    l_exported_order_ids        TEXT[];
    l_error_message             TEXT;
    l_commission_ids            bigint[];
    l_commission_id             bigint;
    l_outbound_tour_required_old  BOOLEAN;
    l_number_commission_item    integer;
    l_num_count_items_for_big_multi integer;
    l_warehouse_number  TEXT;
BEGIN


END
$$
LANGUAGE 'plpgsql' VOLATILE SECURITY DEFINER COST 100;
