package com.nacre.onlineShopping.Servies;

import java.sql.SQLException;
import java.util.List;

import com.nacre.onlineShoping.BO.ProductBO;
import com.nacre.onlineShopping.DTO.ProductDTO;
import com.nacre.onlineShopping.DTO.RegistrationDTO;

public interface UpdateEditAdminService {
public 

int getUpdateEditDataService(ProductBO productBo) throws ClassNotFoundException, SQLException;

public List<RegistrationDTO> getViewRegistrationService() throws ClassNotFoundException, SQLException;
}
