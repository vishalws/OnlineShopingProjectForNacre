package com.nacre.onlineShoping.DAO;

import java.sql.SQLException;

import com.nacre.onlineShoping.BO.RegistrationBO;
import com.nacre.onlineShopping.DTO.RegistrationDTO;

public interface RegistrationDAO {


	public int insertRegistration(RegistrationDTO registrationDto) throws SQLException;
	/*public int insertCityIdFromTableRegister(RegistrationBO bo) throws Exception;*/



}
