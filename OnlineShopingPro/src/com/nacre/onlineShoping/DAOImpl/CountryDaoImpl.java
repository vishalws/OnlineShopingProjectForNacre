package com.nacre.onlineShoping.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nacre.onlineShoping.DAO.CountryDAO;
import com.nacre.onlineShopping.DTO.CountryDetailsDTO;
import com.nacre.onlineShopping.dbutl.DataBaseConection;
import com.nacre.onlineShopping.dbutl.QueryUtil;

public class CountryDaoImpl implements CountryDAO {
	
	PreparedStatement preparedStatement;
	ResultSet resultSet;
  public static Connection connection;
	
	int id=0;
	String coutry=null;
	
	static{
		
		try {
			connection=DataBaseConection.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	@Override
	public List<CountryDetailsDTO> countryDao() {
		List<CountryDetailsDTO> list=new ArrayList<CountryDetailsDTO>();
       CountryDetailsDTO countryDeatilsDTO=null;
		try {
			preparedStatement=connection.prepareStatement(QueryUtil.COUNTRYSELECT);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			resultSet=preparedStatement.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			while(resultSet.next()){
				countryDeatilsDTO=new CountryDetailsDTO();
			   countryDeatilsDTO.setCid(resultSet.getInt(1));
			   countryDeatilsDTO.setCountryName(resultSet.getString(2));
				list.add(countryDeatilsDTO);
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(list);
		return list;
	}

}
