package com.nacre.onlineShoping.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/VISITOR_FOR_SERVLET")
public class VisitorServlet extends HttpServlet {
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doVisitor(request, response);
}
@Override
	public  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doVisitor(request, response);
	}
 public void doVisitor(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 String email = null;
		HttpSession ses = null;

		ses = request.getSession(false);
		if (ses == null) {
			response.sendRedirect("./html/login.html");
		} else {

			email = request.getParameter("email");
			ses = request.getSession();
			ses.setAttribute("visitorEmail", email);
			request.getRequestDispatcher("Pages/ViewVisitor.jsp").forward(request, response);
		}
	
 }
}
