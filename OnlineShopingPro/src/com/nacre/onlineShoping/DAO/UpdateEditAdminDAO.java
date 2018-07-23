package com.nacre.onlineShoping.DAO;

import java.sql.SQLException;
import java.util.List;

import com.nacre.onlineShoping.BO.ProductBO;
import com.nacre.onlineShopping.DTO.RegistrationDTO;

public interface UpdateEditAdminDAO {
public int getEditAdminDataDao(ProductBO productBo) throws ClassNotFoundException, SQLException;
public List<RegistrationDTO> getViewRegistration() throws ClassNotFoundException, SQLException;
}
