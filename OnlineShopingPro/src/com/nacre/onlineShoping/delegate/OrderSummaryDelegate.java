package com.nacre.onlineShoping.delegate;

import java.sql.SQLException;
import java.util.List;

import com.nacre.onlineShopping.DTO.OrderSummaryDTO;
import com.nacre.onlineShopping.DTO.RegistrationDTO;
import com.nacre.onlineShopping.ServicesImpl.OrderSummaryServiceImpl;
import com.nacre.onlineShopping.Servies.OrderSummaryService;

public class OrderSummaryDelegate {
	OrderSummaryService orderSummartService=new OrderSummaryServiceImpl();
public List<OrderSummaryDTO> getUserDetailsDelegate(int userid,String product_id) throws SQLException
{
	return orderSummartService.getUserDetailsService(userid,product_id);
	
	
	
}
}

