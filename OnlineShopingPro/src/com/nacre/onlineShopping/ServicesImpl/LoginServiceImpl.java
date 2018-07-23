package com.nacre.onlineShopping.ServicesImpl;

import java.sql.SQLException;

import com.nacre.onlineShoping.DAO.LoginDAO;
import com.nacre.onlineShoping.DAOImpl.LoginDAOImpl;
import com.nacre.onlineShopping.Servies.LoginService;

public class LoginServiceImpl implements LoginService {
Boolean flag=false;
LoginDAO loginDao=new LoginDAOImpl();
	@Override
	public int loginService(String email, String password) {
		
		return loginDao.loginDAO(email, password);
		
		
	}
	@Override
	public int getUserLoginService(String email, String password) throws SQLException {
		return loginDao.getUserLogin(email, password);
		
	}
	public int getVisitorMetaDataService(String email,int pid) throws SQLException{
		int result=loginDao.getVisitorMetaData(email, pid);
		return result;
		
	}
	public int getChangePasswordService(int userid,String pwd) throws SQLException{
		int result=loginDao.getChangePassword(userid, pwd);
		return result;
		
	}

}
