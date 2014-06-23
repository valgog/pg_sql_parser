CREATE OR REPLACE FUNCTION function_with_select_into(
    p_limit                             integer,
    p_shipment_number                   TEXT[],
    OUT result_status_id                SMALLINT,
    OUT result_status_msg               text
) RETURNS RECORD AS
$$
DECLARE
BEGIN
             SELECT cc_outbound_tour_required
             FROM zal_data.commission
             JOIN zal_data.commission_config on cc_id = c_commission_config_id
             INTO l_outbound_tour_required_old
             where c_id = l_commission_id;

             select count(1)
             from zal_data.commission_item
             into l_number_commission_item
             where ci_commission_id = l_commission_id;

END
$$
LANGUAGE 'plpgsql' VOLATILE SECURITY DEFINER COST 100;
