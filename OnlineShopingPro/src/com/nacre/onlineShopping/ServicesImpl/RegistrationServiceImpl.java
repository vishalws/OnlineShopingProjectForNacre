package com.nacre.onlineShopping.ServicesImpl;

import java.sql.SQLException;
import java.util.ArrayList;

import com.nacre.onlineShoping.BO.RegistrationBO;
import com.nacre.onlineShoping.DAO.RegistrationDAO;
import com.nacre.onlineShoping.DAOImpl.RegistrationDAOImpl;
import com.nacre.onlineShopping.DTO.RegistrationDTO;
import com.nacre.onlineShopping.Servies.RegistrationService;

public class RegistrationServiceImpl implements RegistrationService {
	RegistrationDAO registrationDao=new RegistrationDAOImpl();
	@Override
	public int formdata(RegistrationDTO registrationDto) throws SQLException {
		
		return registrationDao.insertRegistration(registrationDto);
			
		
		
	}

	/*@Override
	public int insertCityIdFormRegister(RegistrationBO registrationBo) throws Exception {
		return registrationDao.insertCityIdFromTableRegister(registrationBo);
		
	}
*/
	

	
	

}
