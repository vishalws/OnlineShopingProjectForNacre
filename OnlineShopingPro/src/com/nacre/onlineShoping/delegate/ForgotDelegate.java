package com.nacre.onlineShoping.delegate;

import java.sql.SQLException;

import com.nacre.onlineShopping.ServicesImpl.ForgotServiceImpl;
import com.nacre.onlineShopping.Servies.ForgotService;

public class ForgotDelegate {
public int getForgotPwd(String email,String pwd) throws SQLException{
	ForgotService forgotService=new ForgotServiceImpl();
	return forgotService.getFordotPassword(email, pwd);
	
	
}
public int getForgotPwdAdmin(String email,String pwd) throws SQLException{
	ForgotService forgotService=new ForgotServiceImpl();
	return forgotService.getFordotPasswordAdmin(email, pwd);
	
	
}
}
