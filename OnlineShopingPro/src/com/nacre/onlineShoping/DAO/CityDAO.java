package com.nacre.onlineShoping.DAO;

import java.sql.SQLException;
import java.util.List;

import com.nacre.onlineShopping.BO.CityBO;

public interface CityDAO {

	public List<CityBO> getCityDetails(int sid) throws ClassNotFoundException, SQLException;
	
}
