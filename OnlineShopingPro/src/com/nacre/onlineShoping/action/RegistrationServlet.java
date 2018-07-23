package com.nacre.onlineShoping.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nacre.onlineShoping.BO.RegistrationBO;
import com.nacre.onlineShoping.delegate.RegistrationDelegate;
import com.nacre.onlineShopping.DTO.RegistrationDTO;
import com.nacre.onlineShopping.ServicesImpl.RegistrationServiceImpl;
import com.nacre.onlineShopping.Servies.RegistrationService;

public class RegistrationServlet extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response){
		PrintWriter out=null;
		String fname=null;
		String lname=null;
		String gender=null;
		String email=null;
		String password=null;
		long mob=0;
		String addr1=null;
		String addr2=null;
		String pin=null;
		int result=0;
		
		RegistrationService rservice=null;
		RegistrationDTO registrationDto=null;
		//RegistrationDelegate registrationDelegate=null;
		RegistrationBO registrationBo=null;
		//create printWriter object
		try {
			out=response.getWriter();
			//create the RegistrationDTO Object and set content
			registrationDto=new RegistrationDTO();
			response.setContentType("text/html");
			registrationDto.setFname(request.getParameter("fname"));
			registrationDto.setLname(request.getParameter("lname"));
			registrationDto.setGender(request.getParameter("gender"));
			registrationDto.setEmail(request.getParameter("email"));
			registrationDto.setPassword(request.getParameter("pwd"));
			registrationDto.setMob(Long.parseLong(request.getParameter("mob")));
			registrationDto.setAddr1(request.getParameter("addr1"));
			registrationDto.setAddr2(request.getParameter("addr2"));
			registrationDto.setPin(Integer.parseInt(request.getParameter("pin")));
			
			HttpSession session=request.getSession();
			String cityId=(String)session.getAttribute("cityId");
			System.out.println(cityId);
			registrationDto.setCityId(cityId);
			
			//create the service object
			RegistrationDelegate registrationDelegate=new RegistrationDelegate();
			
			
			rservice=new RegistrationServiceImpl();
			
			try {
				result=registrationDelegate.RegistrationFormData(registrationDto);
				//add Address id in session
				session.setAttribute("userid", result);
				System.out.println(session.getAttribute("userid"));
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				//registrationDelegate.insertCityidToRegistrationTableDelagate(registrationBo);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
