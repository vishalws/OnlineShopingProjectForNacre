package com.nacre.onlineShopping.Servies;

import java.sql.SQLException;
import java.util.List;

import com.nacre.onlineShopping.BO.CityBO;
import com.nacre.onlineShopping.DTO.CityDTO;

public interface CityService {
public List<CityBO> getCityDetailsService(int sid) throws ClassNotFoundException, SQLException;
}
