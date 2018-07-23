package com.nacre.onlineShoping.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.nacre.onlineShopping.DTO.AddressDTO;

public class AddressServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<AddressDTO> laddDto = null;
		response.setContentType("application/json");
		String ctid = request.getParameter("ctid");
		// System.out.println(addid);
		HttpSession session = request.getSession();
		session.setAttribute("cityId", ctid);
		// AddressDelegate addressDelegat=new AddressDelegate();

		// System.out.println("AddressServlet="+addid);

		// laddDto=addressDelegat.getAddressDetailsDelegate(ctid);
		response.getWriter().write(new Gson().toJson(laddDto));

	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
