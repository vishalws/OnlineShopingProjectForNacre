package com.nacre.onlineShopping.ServicesImpl;


import java.util.List;



import com.nacre.onlineShoping.DAOImpl.CountryDaoImpl;
import com.nacre.onlineShopping.DTO.CountryDetailsDTO;
import com.nacre.onlineShopping.Servies.CountryService;

public class CountryServiceImpl implements CountryService {

	@Override
	public List<CountryDetailsDTO> countryService() {
	return new CountryDaoImpl().countryDao(); 
	}

}
