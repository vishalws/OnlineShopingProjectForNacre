package com.nacre.onlineShoping.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;
import com.nacre.onlineShoping.DAO.LoginDAO;
import com.nacre.onlineShopping.Exception.DBException;
import com.nacre.onlineShopping.dbutl.DataBaseConection;
import com.nacre.onlineShopping.dbutl.QueryUtil;

public class LoginDAOImpl implements LoginDAO {
Boolean flag=false;
static java.sql.Connection connection;
PreparedStatement preparedStatement;
ResultSet resultSet;
String email1;
String password1;
int adminId=0;


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
	public int loginDAO(String email, String password)  {
		int adminId1=0;
			try {
				Connection connection=DataBaseConection.getConnection();
				preparedStatement=connection.prepareStatement(QueryUtil.loginSelect,Statement.RETURN_GENERATED_KEYS);
				preparedStatement.setString(1,email);
				preparedStatement.setString(2, password);
				resultSet=preparedStatement.executeQuery();
				ResultSet rs=preparedStatement.getGeneratedKeys();
				while(rs.next())
				adminId=rs.getInt(1);
				System.out.println("in login dao="+adminId);
				
				while(resultSet.next()){
					adminId1=resultSet.getInt(1);
					System.out.println(adminId1);
					email1=resultSet.getString(2);
					password1=resultSet.getString(3);
					
				}
				if(email.equals(email1) && password.equals(password1)){
					System.out.println("success");
					
				}
				else{
					System.out.println("registration not done");
					
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	
		return adminId1;
	}
	
	@Override
	
	public int getUserLogin(String email, String password) throws SQLException {
		int userid1=0;
		int userid=0;
		int adminId1=0;
		preparedStatement=connection.prepareStatement(QueryUtil.GET_EMAIL_PASSWORD,Statement.RETURN_GENERATED_KEYS);
		preparedStatement.setString(1, email);
		preparedStatement.setString(2, password);
		resultSet=preparedStatement.executeQuery();
		
		ResultSet rs=preparedStatement.getGeneratedKeys();
		while(resultSet.next()){
			userid1=resultSet.getInt(1);
			email1=resultSet.getString(2);
			password1=resultSet.getString(3);
			System.out.println("userDao"+email1+" " +password1);
		}
		while(rs.next()){
			userid=rs.getInt(1);
		}
		if(email.equals(email1) && password.equals(password1)){
			System.out.println("user allow here");
		}
		else
		{
			System.out.println("user not allow here");
		}
		
		return userid1;
	}

	public int getVisitorMetaData(String email,int pid) throws SQLException{
		int result=0;
		preparedStatement=connection.prepareStatement(QueryUtil.INSERT_VISITOR_META_DATA);
		preparedStatement.setString(1, email);
		preparedStatement.setInt(2, pid);
		result=preparedStatement.executeUpdate();
		if(result == 0){
			System.out.println("visitor data is not inserted");
		}
		else{
			System.out.println("visitor data is inserted");
		}
		return result;
	}
	public int getChangePassword(int userid,String pwd) throws SQLException{
		int result=0;
		preparedStatement=connection.prepareStatement(QueryUtil.CHANGE_PASSWORD);
		preparedStatement.setString(1, pwd);
		preparedStatement.setInt(2, userid);
		result=preparedStatement.executeUpdate();
		if(result == 0){
			System.out.println("password is not change");
		}
		else{
			System.out.println("password  is change");
		}
		return result;

	}
}
