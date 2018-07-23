package com.nacre.onlineShoping.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.nacre.onlineShoping.delegate.CountryDelegate;
import com.nacre.onlineShopping.DTO.CountryDetailsDTO;

public class CountryServler extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	     List<CountryDetailsDTO> countryDetailsDTO=null;
         response.setContentType("application/json");
		countryDetailsDTO=new CountryDelegate().getCountryDelegate();
		System.out.println(countryDetailsDTO);
		response.getWriter().write(new Gson().toJson(countryDetailsDTO));
	
	}
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}
