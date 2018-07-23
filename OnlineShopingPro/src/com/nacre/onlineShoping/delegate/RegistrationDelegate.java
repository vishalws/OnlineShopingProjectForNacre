package com.nacre.onlineShoping.delegate;

import java.sql.SQLException;

import javax.imageio.spi.RegisterableService;

import com.nacre.onlineShoping.BO.RegistrationBO;
import com.nacre.onlineShopping.DTO.RegistrationDTO;
import com.nacre.onlineShopping.ServicesImpl.RegistrationServiceImpl;
import com.nacre.onlineShopping.Servies.RegistrationService;

public class RegistrationDelegate {
	RegistrationService registrationService=new RegistrationServiceImpl();

public int RegistrationFormData(RegistrationDTO registrationDto) throws SQLException{
		return registrationService.formdata(registrationDto);
}

/*public int insertCityidToRegistrationTableDelagate(RegistrationBO registrationBo) throws Exception{
	RegistrationBO registrationBo=new RegistrationBO();
	registrationBo.setAddr1(registrationDTO.getAddr1());
	registrationBo.setAddr2(registrationDTO.getAddr2());
	registrationBo.setPin(Integer.parseInt(registrationDTO.getPin()));
	registrationBo.setCityId(Integer.parseInt(registrationDTO.getCityId()));
    return registrationService.insertCityIdFormRegister(registrationBo);
	
	
}*/
}
