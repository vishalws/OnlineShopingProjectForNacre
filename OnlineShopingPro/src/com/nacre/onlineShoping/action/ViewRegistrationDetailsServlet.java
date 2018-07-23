package com.nacre.onlineShoping.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.nacre.onlineShoping.delegate.UpdateEditAdminDelegate;
import com.nacre.onlineShopping.DTO.RegistrationDTO;
@WebServlet("/viewRegistration")
public class ViewRegistrationDetailsServlet extends HttpServlet {
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	try {
		doGetRegistration(request,response);
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		doGetRegistration(request,response);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void doGetRegistration(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException {
	List<RegistrationDTO> ldto=null;
      response.setContentType("application/json");
      UpdateEditAdminDelegate upDelegate=new UpdateEditAdminDelegate();
      ldto=upDelegate.getViewRegistrationDelegate();
		System.out.println(ldto);
		response.getWriter().write(new Gson().toJson(ldto));
}
	
}
