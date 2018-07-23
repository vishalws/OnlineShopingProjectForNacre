package com.nacre.onlineShoping.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nacre.onlineShoping.delegate.OrderSummaryDelegate;
import com.nacre.onlineShopping.DTO.OrderSummaryDTO;
import com.nacre.onlineShopping.DTO.ProductDTO;
@WebServlet("/OrderSummaryurl")
public class OrderSummaryServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			try {
				doOrderSummary(request, response);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			try {
				doOrderSummary(request, response);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void doOrderSummary(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException
	{
		List<OrderSummaryDTO> lOrderSummaryDTOs= null;
	
		OrderSummaryDelegate orderSummaryDelegate=null;
		HttpSession ses=null;
		//get userid from session
		ses=request.getSession(false);
		int userid=(int) ses.getAttribute("userid1");
		//set the content type
		response.setContentType("text/html");
		//get the request from jsp page
		String product_id=request.getParameter("product_id");
		/*String product_name=request.getParameter("product_name");
		String product_price=request.getParameter("product_price");
		String product_quantity=request.getParameter("product_quantity");*/
		
		//System.out.println(product_id+" "+product_name+" "+product_price);
		//create the object of OrderSummaryDTo
		
		//create the object of delegate
		orderSummaryDelegate=new OrderSummaryDelegate();
		lOrderSummaryDTOs=orderSummaryDelegate.getUserDetailsDelegate(userid,product_id);
		
		
		//lregistrationDto=new ArrayList<OrderSummaryDTO>();
		
		
		//lOrderSummaryDTOs.add(orderSummaryDto);
		if(lOrderSummaryDTOs !=null){
			request.setAttribute("ulist", lOrderSummaryDTOs);
		    //request.setAttribute("plist", orderSummaryDto);
			request.getRequestDispatcher("/Pages/OrderSummary.jsp").forward(request, response);
		}
		
		
	}
	}

