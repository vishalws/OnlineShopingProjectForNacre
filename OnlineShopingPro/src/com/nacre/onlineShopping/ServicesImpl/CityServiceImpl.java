package com.nacre.onlineShopping.ServicesImpl;

import java.sql.SQLException;
import java.util.List;

import com.nacre.onlineShoping.DAO.CityDAO;
import com.nacre.onlineShoping.DAOImpl.CityDaoImpl;
import com.nacre.onlineShopping.BO.CityBO;
import com.nacre.onlineShopping.DTO.CityDTO;
import com.nacre.onlineShopping.Servies.CityService;

public class CityServiceImpl implements CityService {

	@Override
	public List<CityBO> getCityDetailsService(int sid) throws ClassNotFoundException, SQLException {
		CityDAO cityDao=new CityDaoImpl();
		return cityDao.getCityDetails(sid);
		
	}

}
