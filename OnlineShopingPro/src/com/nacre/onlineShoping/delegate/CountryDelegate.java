package com.nacre.onlineShoping.delegate;



import java.util.List;

import com.nacre.onlineShopping.DTO.CountryDetailsDTO;
import com.nacre.onlineShopping.ServicesImpl.CountryServiceImpl;


public class CountryDelegate {
	public List<CountryDetailsDTO> getCountryDelegate(){
 
		return new CountryServiceImpl().countryService();
		

}
}
