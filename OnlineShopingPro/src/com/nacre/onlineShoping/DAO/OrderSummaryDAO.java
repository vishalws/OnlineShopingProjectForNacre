package com.nacre.onlineShoping.DAO;

import java.sql.SQLException;
import java.util.List;

import com.nacre.onlineShopping.DTO.OrderSummaryDTO;
import com.nacre.onlineShopping.DTO.RegistrationDTO;

public interface OrderSummaryDAO {
	public List<OrderSummaryDTO> getUserDetailsDao(int userid,String product_id) throws SQLException;
}
