package com.nacre.onlineShopping.ServicesImpl;

import java.sql.SQLException;
import java.util.List;

import com.nacre.onlineShoping.BO.RoleBO;
import com.nacre.onlineShoping.DAO.RoleDAO;
import com.nacre.onlineShoping.DAOImpl.RoleDAOImpl;
import com.nacre.onlineShoping.action.RoleServlet;
import com.nacre.onlineShopping.Servies.RoleService;

public class RoleServiceImpl implements RoleService {

	@Override
	public List<RoleBO> getRoleDetailsFromService() throws SQLException {
		RoleDAO roleDao=new RoleDAOImpl();
		return roleDao.getRoleDetails();
		
		
	}

}
