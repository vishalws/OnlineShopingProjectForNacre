package com.nacre.onlineShopping.Servies;

import java.sql.SQLException;

public interface LoginService {

	public int loginService(String email,String password);
	public int getUserLoginService(String email, String password) throws SQLException; 	
	public int getVisitorMetaDataService(String email,int pid) throws SQLException;
	public int getChangePasswordService(int userid,String pwd) throws SQLException;
}
