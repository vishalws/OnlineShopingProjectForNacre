package com.nacre.onlineShopping.Servies;

import java.sql.SQLException;
import java.util.List;

import com.nacre.onlineShopping.BO.AddressBO;
import com.nacre.onlineShopping.DTO.AddressDTO;

public interface AddressService {
public List<AddressBO> getAddresDetailsService(int addid) throws ClassNotFoundException, SQLException;
}
