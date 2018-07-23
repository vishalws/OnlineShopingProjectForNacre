package com.nacre.onlineShoping.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.nacre.onlineShoping.delegate.RoleDelegate;
import com.nacre.onlineShopping.DTO.RoleDTO;

public class RoleServlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<RoleDTO> roleDto=null;
		response.setContentType("application/json");
		RoleDelegate roleDelegate=new RoleDelegate();
		try {
			roleDto=roleDelegate.getRoleDetailsFromDelegate();
			response.getWriter().write(new Gson().toJson(roleDto));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
