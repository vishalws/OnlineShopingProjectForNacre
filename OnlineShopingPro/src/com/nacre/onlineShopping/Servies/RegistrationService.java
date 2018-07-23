package com.nacre.onlineShopping.Servies;

import java.sql.SQLException;
import java.util.ArrayList;

import com.nacre.onlineShoping.BO.RegistrationBO;
import com.nacre.onlineShopping.DTO.RegistrationDTO;

public interface RegistrationService {
	public int formdata(RegistrationDTO registrationDto) throws SQLException;
/*public int insertCityIdFormRegister(RegistrationBO registrationBo) throws Exception;*/
}
