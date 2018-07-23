package com.nacre.onlineShoping.DAOImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nacre.onlineShopping.DTO.OrderSummaryDTO;
import com.nacre.onlineShopping.dbutl.DataBaseConection;
import com.nacre.onlineShopping.dbutl.QueryUtil;

public class ProductForCartDaoImpl {
	static java.sql.Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;
List<OrderSummaryDTO> lorderSummaryDto=new ArrayList<OrderSummaryDTO>();
	
	static{
		try {
			connection=DataBaseConection.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<OrderSummaryDTO> getProductToAddCartDetails(int pid) throws SQLException{
		preparedStatement=connection.prepareStatement(QueryUtil.GET_PRODUCT_INFI_FOR_ADD_TO_CART);
		preparedStatement.setInt(1, pid);
		resultSet=preparedStatement.executeQuery();
		while(resultSet.next()){
			OrderSummaryDTO dto=new OrderSummaryDTO();
			dto.setProduct_name(resultSet.getString(1));
			dto.setProduct_price(resultSet.getInt(2));
			dto.setProduct_quantity(resultSet.getInt(3));
			lorderSummaryDto.add(dto);
		}
		return lorderSummaryDto;
		
	}
}
