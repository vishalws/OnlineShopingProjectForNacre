package com.nacre.onlineShoping.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.nacre.onlineShoping.delegate.CountryDelegate;
import com.nacre.onlineShoping.delegate.StateDelegate;
import com.nacre.onlineShopping.BO.StateBO;
import com.nacre.onlineShopping.DTO.CountryDetailsDTO;
import com.nacre.onlineShopping.DTO.StateDetailsDTO;

public class StateServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 List<StateDetailsDTO> stateDetailsDTO=null;
         response.setContentType("application/json");
		try {
			String cid=request.getParameter("cid");
		//	System.out.println("stServlet="+cid);
			//service class method call
			stateDetailsDTO=new StateDelegate().getStateDetails(cid);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(stateDetailsDTO);
		response.getWriter().write(new Gson().toJson(stateDetailsDTO));
	}
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
