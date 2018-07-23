package com.nacre.onlineShoping.DAO;

import java.sql.SQLException;
import java.util.List;

import com.nacre.onlineShopping.BO.AddressBO;
import com.nacre.onlineShopping.DTO.AddressDTO;

public interface AddressDAO {
public List<AddressBO> getAddressDetailsDao(int addid) throws ClassNotFoundException, SQLException;

}
