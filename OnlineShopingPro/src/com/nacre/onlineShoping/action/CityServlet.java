package com.nacre.onlineShoping.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.nacre.onlineShoping.delegate.CityDelegate;

import com.nacre.onlineShopping.DTO.CityDTO;


public class CityServlet extends HttpServlet {

	
	@Override
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	CityDelegate cityDelegate=new CityDelegate();
	List<CityDTO> cityDto=null;
	//List<User> user=new ArrayList<User>();
	//User u=new User();
	//int ctid=0;
	response.setContentType("application/json");
	String sid=request.getParameter("sid");
	
	try {
		cityDto=cityDelegate.getCityDetailsDelegate(sid);
	//	System.out.println("in city servlet="+cityDto);
		Gson gson=new Gson();
		String json=gson.toJson(cityDto);
		// user= (List<User>) gson.fromJson(json,User.class);
		//u.getCityid();
		//user.add((List<User>) user1);
		
		
		
		//ctid=((User) user).getCityid();
		//System.out.println("in city servlet id="+ctid);
		response.getWriter().write(json);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doGet(request, response);
}

}
