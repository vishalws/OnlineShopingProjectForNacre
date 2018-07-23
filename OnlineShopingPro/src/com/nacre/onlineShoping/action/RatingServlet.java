package com.nacre.onlineShoping.action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nacre.onlineShoping.delegate.ViewProductDelegate;
import com.nacre.onlineShopping.DTO.RatingDTO;
@WebServlet("/ratingurl")
public class RatingServlet extends HttpServlet {
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		doRating(request, response);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doRating(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

  public void doRating(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
	  String rating=request.getParameter("rating");
	 // String product_id=request.getParameter("pid");
	  System.out.println("rating="+rating);
	 
	  HttpSession ses=null;
	  int result=0;
	  ViewProductDelegate viewProductDelegate=null;
	  RatingDTO dto=null;
	  ses=request.getSession(false);
	  //get the user id from session
	  Integer userid= (Integer) ses.getAttribute("userid1");
	  String product_id= (String) ses.getAttribute("pid");
	  System.out.println("rating servlet"+product_id);
	  //create delegate object
	  viewProductDelegate=new ViewProductDelegate();
	  //creaet rating object
	  dto=new RatingDTO();
	  dto.setRating(rating);
	  int i=Integer.parseInt(product_id.replaceAll("'", ""));
	  dto.setProduct_id(i);
	  dto.setUser_id(userid);
	  result=viewProductDelegate.getRatingDetailsDelegate(dto);
  }
}
