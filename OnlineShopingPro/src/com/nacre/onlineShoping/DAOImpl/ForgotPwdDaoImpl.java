package com.nacre.onlineShoping.DAOImpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.nacre.onlineShoping.DAO.ForgotPwdDAO;
import com.nacre.onlineShopping.dbutl.DataBaseConection;
import com.nacre.onlineShopping.dbutl.QueryUtil;

public class ForgotPwdDaoImpl implements ForgotPwdDAO{
static java.sql.Connection connection;
PreparedStatement preparedStatement;
int count=0;
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
	@Override
	public int getPassword(String email, String pwd) throws SQLException {
		preparedStatement=connection.prepareStatement(QueryUtil.UPDATE_PASSWORD_USER);
		preparedStatement.setString(1, pwd);
		preparedStatement.setString(2, email);
		count=preparedStatement.executeUpdate();
		if(count == 0){
			System.out.println("password is not updated in user");
		}
		else{
			System.out.println("password is updated in user");
		}
		return count;
	}
	@Override
	public int getPasswordAdmin(String email, String pwd) throws SQLException {
		preparedStatement=connection.prepareStatement(QueryUtil.UPDATE_PASSWORD_ADMIN);
		preparedStatement.setString(1, pwd);
		preparedStatement.setString(2, email);
		count=preparedStatement.executeUpdate();
		if(count == 0){
			System.out.println("password is not updated in admin");
		}
		else{
			System.out.println("password is updated in admin");
		}
		return count;
	}

}
