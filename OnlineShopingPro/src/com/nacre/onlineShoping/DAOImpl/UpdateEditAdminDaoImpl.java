package com.nacre.onlineShoping.DAOImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nacre.onlineShoping.BO.ProductBO;
import com.nacre.onlineShoping.DAO.UpdateEditAdminDAO;
import com.nacre.onlineShopping.DTO.RegistrationDTO;
import com.nacre.onlineShopping.dbutl.DataBaseConection;
import com.nacre.onlineShopping.dbutl.QueryUtil;

public class UpdateEditAdminDaoImpl implements UpdateEditAdminDAO {
	static java.sql.Connection connection;
	
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

	@Override
	public int getEditAdminDataDao(ProductBO productBo) throws ClassNotFoundException, SQLException {
		connection = DataBaseConection.getConnection();
		PreparedStatement preparedStatement;
		int result = 0;
		long time = System.currentTimeMillis();
		java.sql.Timestamp timeStamp = new java.sql.Timestamp(time);
		preparedStatement = connection.prepareStatement(QueryUtil.SAVE_EDITABLE_BY_ADMIN_PRODUCT_DATA);
		//System.out.println("UpdateEditDao=" + productBo.getProduct_name());
		preparedStatement.setString(1, productBo.getProduct_name());
		preparedStatement.setInt(2, productBo.getProduct_price());
		preparedStatement.setString(7, productBo.getProduct_color());
		preparedStatement.setString(3, productBo.getProduct_description());
		preparedStatement.setDate(4, productBo.getProduct_date());
		preparedStatement.setInt(6, productBo.getProduct_quantity());
		preparedStatement.setTimestamp(5, timeStamp);
		preparedStatement.setInt(8, productBo.getAdminId());
		preparedStatement.setInt(9, productBo.getProduct_id());
		result = preparedStatement.executeUpdate();
		if (result != 0) {
			System.out.println("edit data is updated");
		} else {
			System.out.println("edit data not is updated");
		}
		
		return result;
		
		
	}
	public List<RegistrationDTO> getViewRegistration() throws ClassNotFoundException, SQLException{
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		List<RegistrationDTO> ldto=null;
		connection=DataBaseConection.getConnection();
		 preparedStatement=connection.prepareStatement(QueryUtil.GET_REGISTRATION_DETAILS);
		resultSet=preparedStatement.executeQuery();
		//list dto object
		ldto=new ArrayList<RegistrationDTO>();
		while(resultSet.next()){
			//create registrationDto object
			RegistrationDTO rdto=new RegistrationDTO();

			rdto.setFname(resultSet.getString(1));
			rdto.setLname(resultSet.getString(2));
			rdto.setEmail(resultSet.getString(3));
			rdto.setMob(resultSet.getLong(4));
			rdto.setGender(resultSet.getString(5));
			ldto.add(rdto);
		}
		
		

		return ldto;
		
	}

}
