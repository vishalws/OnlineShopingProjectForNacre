package com.nacre.onlineShoping.DAO;

import java.sql.SQLException;

public interface LoginDAO {

	public int loginDAO(String email,String password);
	public int getUserLogin(String email, String password) throws SQLException;
	public int getVisitorMetaData(String email,int pid) throws SQLException;
	public int getChangePassword(int userid,String pwd) throws SQLException;
}
