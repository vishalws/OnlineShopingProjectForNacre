package com.nacre.onlineShopping.ServicesImpl;

import java.sql.SQLException;

import com.nacre.onlineShoping.DAO.ForgotPwdDAO;
import com.nacre.onlineShoping.DAOImpl.ForgotPwdDaoImpl;
import com.nacre.onlineShopping.Servies.ForgotService;


public class ForgotServiceImpl implements ForgotService {

	ForgotPwdDAO forgotPwd=new ForgotPwdDaoImpl();

	@Override
	public int getFordotPassword(String email, String pwd) throws SQLException {
		
		return forgotPwd.getPassword(email, pwd);
		
	}

	@Override
	public int getFordotPasswordAdmin(String email, String pwd) throws SQLException {
		
		return forgotPwd.getPasswordAdmin(email, pwd);
	}

}
