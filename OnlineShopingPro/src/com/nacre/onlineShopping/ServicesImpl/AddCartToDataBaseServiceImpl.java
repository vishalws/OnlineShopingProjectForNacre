package com.nacre.onlineShopping.ServicesImpl;

import java.sql.SQLException;

import com.nacre.onlineShoping.DAO.AddCartToDataBaseDAO;
import com.nacre.onlineShoping.DAOImpl.AddCartTODataBaseDaoImpl;
import com.nacre.onlineShopping.DTO.OrderSummaryDTO;
import com.nacre.onlineShopping.Exception.DBException;
import com.nacre.onlineShopping.Servies.AddCartToDataBaseService;

public class AddCartToDataBaseServiceImpl implements AddCartToDataBaseService {

	AddCartToDataBaseDAO addCartdao = new AddCartTODataBaseDaoImpl();

	@Override
	public int getAddCartToDataBaseService(OrderSummaryDTO orderSummaryDTO, int userid) throws Exception {
		int quantiy = orderSummaryDTO.getProduct_quantity();
		int c = 0;
		int price = orderSummaryDTO.getProduct_price();
		price = quantiy * price;
		orderSummaryDTO.setProduct_price(price);
		try {
			c = addCartdao.getAddCartToDataBaseDao(orderSummaryDTO, userid);
		} catch (SQLException e) {
			throw new DBException(e);
		}catch(Exception e){
			throw e;
		}
		return c;

	}

}
