package com.nacre.onlineShoping.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nacre.onlineShoping.delegate.FeedbackDelegate;
import com.nacre.onlineShopping.DTO.FeedbackDTO;
@WebServlet("/feedbacurl")
public class FeedbackServlet extends HttpServlet {
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		doFeedback(request, response);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doFeedback(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public void doFeedback(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
	FeedbackDelegate feedbackDelegate=null;
	String feedback=null;
	PrintWriter out=response.getWriter();
	response.setContentType("text/html");
	HttpSession session=request.getSession(false);
	String pid=(String) session.getAttribute("pid");
	int uid= (int) session.getAttribute("userid1");
	System.out.println("in feedback servlet"+uid);
	feedback=request.getParameter("feedbk");
	FeedbackDTO feedbackDto=new FeedbackDTO();
	feedbackDto.setProductid(Integer.parseInt(pid));
	feedbackDto.setUserid(uid);
	feedbackDto.setFeedback(feedback);
	feedbackDelegate=new FeedbackDelegate();
	int result=feedbackDelegate.getFeedbackDelegate(feedbackDto);
	if(result !=0){
		System.out.println("in feedback servlet in if");
		out.println("<h2 style='text-align:center;color:red'>Thanks for feedback</h2>");
		out.println("<a href='./ViewProduct.html'>home</>");
		RequestDispatcher rd=request.getRequestDispatcher("./output.html");
		rd.forward(request, response);
	}
}
}
