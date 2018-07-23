package com.nacre.onlineShoping.delegate;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nacre.onlineShopping.BO.CityBO;
import com.nacre.onlineShopping.DTO.CityDTO;
import com.nacre.onlineShopping.ServicesImpl.CityServiceImpl;
import com.nacre.onlineShopping.Servies.CityService;

public class CityDelegate {
	public List<CityDTO> getCityDetailsDelegate(String sid) throws ClassNotFoundException, SQLException {
		CityService cityService = new CityServiceImpl();
		List<CityDTO> lcityDto = new ArrayList<CityDTO>();
		List<CityBO> lcityBo = null;
		int sid1 = Integer.parseInt(sid);
		lcityBo = cityService.getCityDetailsService(sid1);
		for (CityBO citybo : lcityBo) {
			CityDTO cityDto = new CityDTO();
			cityDto.setCtid(String.valueOf(citybo.getCtid()));
			cityDto.setCityName(citybo.getCityName());
			lcityDto.add(cityDto);
		}
		return lcityDto;

	}
}
