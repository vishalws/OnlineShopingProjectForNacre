package com.nacre.onlineShopping.ServicesImpl;

import java.sql.SQLException;
import java.util.List;

import com.nacre.onlineShoping.DAO.OrderSummaryDAO;
import com.nacre.onlineShoping.DAOImpl.OrderSummaryDaoImpl;
import com.nacre.onlineShopping.DTO.OrderSummaryDTO;
import com.nacre.onlineShopping.DTO.RegistrationDTO;
import com.nacre.onlineShopping.Servies.OrderSummaryService;

public class OrderSummaryServiceImpl implements OrderSummaryService {
OrderSummaryDAO orderSummary=new OrderSummaryDaoImpl();
	@Override
	public List<OrderSummaryDTO> getUserDetailsService(int userid,String product_id) throws SQLException {
		return orderSummary.getUserDetailsDao(userid,product_id);
		
	}
	
	

}
