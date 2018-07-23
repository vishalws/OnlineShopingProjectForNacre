package com.nacre.onlineShoping.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.mysql.jdbc.Statement;
import com.nacre.onlineShoping.BO.RegistrationBO;
import com.nacre.onlineShoping.DAO.RegistrationDAO;
import com.nacre.onlineShopping.DTO.RegistrationDTO;
import com.nacre.onlineShopping.dbutl.DataBaseConection;
import com.nacre.onlineShopping.dbutl.QueryUtil;

public class RegistrationDAOImpl implements RegistrationDAO {
	static Connection connection = null;
	
	static {
		try {
			connection = DataBaseConection.getConnection();
		} catch (Exception e) {

		}
	}
	PreparedStatement preparedstatement = null;
	int registerData = 0;

	@Override
	public int insertRegistration(RegistrationDTO registrationDto) throws SQLException {
		int userId = 0;
		int count = 0;
		int addid = 0;

		ResultSet resultSet;
		preparedstatement = connection.prepareStatement(QueryUtil.ADDRESSINSERT, Statement.RETURN_GENERATED_KEYS);
		// set the value int ps object
		preparedstatement.setString(1, registrationDto.getAddr1());
		preparedstatement.setString(2, registrationDto.getAddr2());
		preparedstatement.setInt(3, registrationDto.getPin());
		preparedstatement.setString(4, registrationDto.getCityId());

		// execute the query
		count = preparedstatement.executeUpdate();
		ResultSet resultSet1 = preparedstatement.getGeneratedKeys();
		if (resultSet1.next())

		{

			addid = resultSet1.getInt(1);
		}

		try {
			
			preparedstatement = connection.prepareStatement(QueryUtil.registrationInsert,
					Statement.RETURN_GENERATED_KEYS);
			preparedstatement.setString(1, registrationDto.getFname());
			preparedstatement.setString(2, registrationDto.getLname());
			preparedstatement.setString(6, registrationDto.getGender());
			preparedstatement.setString(3, registrationDto.getEmail());
			preparedstatement.setString(5, registrationDto.getPassword());
			preparedstatement.setLong(4, registrationDto.getMob());
			preparedstatement.setInt(7, addid);

			registerData = preparedstatement.executeUpdate();
			ResultSet resultSet2 = preparedstatement.getGeneratedKeys();
			if (resultSet2.next()) {
				userId = resultSet2.getInt(1);
			}
			if (registerData == 0) {
				System.out.println("data is not inserted");
			} else {
				System.out.println("data is  inserted");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userId;
	}
}

	
	/*public int insertCityIdFromTableRegister(RegistrationBO bo) throws Exception {
	
		int userId = 0;  int count = 0; int addid = 0;
		  
		  ResultSet resultSet; preparedstatement =
		  connection.prepareStatement(QueryUtil.ADDRESSINSERT, Statement.RETURN_GENERATED_KEYS); 
		  // set the value int ps object
		  preparedstatement.setString(1, bo.getAddr1());
		  preparedstatement.setString(2, bo.getAddr2());
		  preparedstatement.setInt(3, bo.getPin()); preparedstatement.setInt(4,bo.getCityId());
		  
		  // execute the query count = preparedstatement.executeUpdate();
		  ResultSet resultSet1 = preparedstatement.getGeneratedKeys(); if
		  (resultSet1.next())
		  
		  {
		  
		  addid = resultSet1.getInt(1);
		  } 
		  try {
		 
		  preparedstatement =
		  connection.prepareStatement(QueryUtil.registrationInsert);
		  preparedstatement.setString(1, bo.getFname());
		  preparedstatement.setString(2, bo.getLname());
		  preparedstatement.setString(6, bo.getGender());
		  preparedstatement.setString(3, bo.getEmail());
		  preparedstatement.setString(5, bo.getPassword());
		  preparedstatement.setLong(4, bo.getMob());
		  preparedstatement.setInt(7, addid);
		 
		 registerData = preparedstatement.executeUpdate(); 
		 if (registerData == 0) {
			 System.out.println("data is not inserted"); } else {
		  System.out.println("data is  inserted");
		  } 
		 } catch (SQLException e) {
		  // TODO Auto-generated catch block e.printStackTrace();
			  }
		  return userId;
		  
		  }
		 */
	