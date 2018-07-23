package com.nacre.onlineShoping.DAOImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nacre.onlineShoping.DAO.OrderSummaryDAO;
import com.nacre.onlineShopping.DTO.OrderSummaryDTO;
import com.nacre.onlineShopping.DTO.RegistrationDTO;
import com.nacre.onlineShopping.dbutl.DataBaseConection;
import com.nacre.onlineShopping.dbutl.QueryUtil;

public class OrderSummaryDaoImpl implements OrderSummaryDAO {

	static java.sql.Connection connection;
	PreparedStatement preparedStatement;
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

	public List<OrderSummaryDTO> getUserDetailsDao(int userid, String product_id) throws SQLException {
		preparedStatement = connection.prepareStatement(QueryUtil.GET_USER_DATA_ORDER_SUMMARY);
		preparedStatement.setInt(1, userid);
		ResultSet resultSet = preparedStatement.executeQuery();
		// create list object
		List<OrderSummaryDTO> ldto = new ArrayList<OrderSummaryDTO>();
		OrderSummaryDTO rdto = null;
		if (resultSet.next()) {
			rdto = new OrderSummaryDTO();
			rdto.setFname(resultSet.getString(1));
			rdto.setEmail(resultSet.getString(2));
			rdto.setMob(resultSet.getLong(3));
			rdto.setLine1(resultSet.getString(4));
			rdto.setLine2(resultSet.getString(5));
			rdto.setPincode(resultSet.getInt(6));
			rdto.setCity(resultSet.getString(7));
			rdto.setState(resultSet.getString(8));
			rdto.setCountry(resultSet.getString(9));

			/*ldto.add(rdto);*/
		}
		preparedStatement = connection.prepareStatement(QueryUtil.GET_PRODUCT_INFI_FOR_ADD_TO_CART);
		preparedStatement.setInt(1, Integer.parseInt(product_id.replaceAll("'", "")));
		resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			//rdto = new OrderSummaryDTO();
			
			rdto.setProduct_id(resultSet.getInt(1));
			rdto.setProduct_name(resultSet.getString(2));
			rdto.setProduct_price(resultSet.getInt(3));
			rdto.setProduct_quantity(resultSet.getInt(4));
			ldto.add(rdto);
		}
		
		System.out.println("orderSummaryin DAO" + ldto);
		return ldto;

	}

}
