package com.nacre.onlineShoping.delegate;

import java.io.Serializable;
import java.sql.SQLException;

import com.nacre.onlineShopping.ServicesImpl.LoginServiceImpl;
import com.nacre.onlineShopping.Servies.LoginService;

public class LoginDelegate implements Serializable {
Boolean flag=false;
LoginService loginService=new LoginServiceImpl();
	public int loginForm(String email,String password){
		
		
		return loginService.loginService(email, password);
		
		
	}
	public int getUserLoginDelegate(String email,String password) throws SQLException{
	 return	loginService.getUserLoginService(email, password);
	
		
	}
	public int getVisitorMetaDataDelegate(String email,int pid) throws SQLException{
		int result=loginService.getVisitorMetaDataService(email, pid);
		return result;
	}
	public int getChangePasswordDelegate(int userid,String pwd) throws SQLException{
		int result=loginService.getChangePasswordService(userid, pwd);
		return result;
	}

	}
