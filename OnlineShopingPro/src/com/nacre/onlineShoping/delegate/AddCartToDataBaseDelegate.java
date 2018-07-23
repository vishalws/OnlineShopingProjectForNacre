package com.nacre.onlineShoping.delegate;

import com.nacre.onlineShopping.DTO.OrderSummaryDTO;
import com.nacre.onlineShopping.Exception.DBException;
import com.nacre.onlineShopping.ServicesImpl.AddCartToDataBaseServiceImpl;
import com.nacre.onlineShopping.Servies.AddCartToDataBaseService;

public class AddCartToDataBaseDelegate {

	AddCartToDataBaseService addCartService = new AddCartToDataBaseServiceImpl();

	public int getAddCartToDataBaseDelegate(OrderSummaryDTO orderDto, int userid) throws Exception {
		int count = 0;
		try {
			count = addCartService.getAddCartToDataBaseService(orderDto, userid);
		} catch (Exception e) {
			throw new DBException(e);
		}
		return count;

	}
}
