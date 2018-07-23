package com.nacre.onlineShopping.ServicesImpl;

import java.sql.SQLException;
import java.util.List;

import com.nacre.onlineShoping.BO.ProductBO;
import com.nacre.onlineShoping.DAO.UpdateEditAdminDAO;
import com.nacre.onlineShoping.DAOImpl.UpdateEditAdminDaoImpl;
import com.nacre.onlineShopping.DTO.RegistrationDTO;
import com.nacre.onlineShopping.Servies.UpdateEditAdminService;

public class UpdateEditAdminServiceImpl implements UpdateEditAdminService {
	UpdateEditAdminDAO updateEditAdminDao=new UpdateEditAdminDaoImpl();
	@Override
	public int getUpdateEditDataService(ProductBO productBo) throws ClassNotFoundException, SQLException {
        
       return updateEditAdminDao.getEditAdminDataDao(productBo);
		
	}
	public List<RegistrationDTO> getViewRegistrationService() throws ClassNotFoundException, SQLException {
		List<RegistrationDTO> rdto=updateEditAdminDao.getViewRegistration();
		return rdto;
		
	}

}
