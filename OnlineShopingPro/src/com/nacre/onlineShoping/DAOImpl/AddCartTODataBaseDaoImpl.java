package com.nacre.onlineShoping.DAOImpl;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nacre.onlineShoping.DAO.AddCartToDataBaseDAO;
import com.nacre.onlineShopping.DTO.OrderSummaryDTO;
import com.nacre.onlineShopping.dbutl.DataBaseConection;
import com.nacre.onlineShopping.dbutl.QueryUtil;

public class AddCartTODataBaseDaoImpl implements AddCartToDataBaseDAO {

	static java.sql.Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;

	static {
		try {
			connection = DataBaseConection.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getAddCartToDataBaseDao(OrderSummaryDTO dto, int userid) throws SQLException {
		int result = 0;
		Long time = System.currentTimeMillis();
		Date d = new Date(time);

		preparedStatement = connection.prepareStatement(QueryUtil.INSERT_PRODUCT_USER_INFO_INTO_ADD_TO_CART);
		preparedStatement.setInt(1, dto.getProduct_price());
		preparedStatement.setInt(2, dto.getProduct_quantity());
		preparedStatement.setDate(3, d);
		preparedStatement.setInt(4, dto.getProduct_id());
		try {
			preparedStatement.setInt(5, userid);
		} catch (SQLException e) {
			throw e;
			// e.printStackTrace();
		} catch (Exception e) {
			throw e;
		}
		result = preparedStatement.executeUpdate();
		if (result == 0) {
			System.out.println("failed to insert in TableCart");
		} else {
			System.out.println("success to insert in TableCart");
		}
		return result;

	}
}
