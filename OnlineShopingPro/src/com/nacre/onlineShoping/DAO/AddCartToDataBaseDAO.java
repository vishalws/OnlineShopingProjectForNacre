package com.nacre.onlineShoping.DAO;

import java.sql.SQLException;

import com.nacre.onlineShopping.DTO.OrderSummaryDTO;

public interface AddCartToDataBaseDAO {
	public int getAddCartToDataBaseDao(OrderSummaryDTO dto,int userid) throws SQLException;
}
