package com.nacre.onlineShopping.dbutl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseConection {
public static Connection connection=null;
public static PreparedStatement preparedstatement=null;
public static ResultSet resulSet=null;
static String email=null;
static String password=null;
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		
			//load the driver class
			Class.forName("com.mysql.jdbc.Driver");
			 Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/onlineshopping","root","root");
			
			 return connection;
		
	}
	
}
