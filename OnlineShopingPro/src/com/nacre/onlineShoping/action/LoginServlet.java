package com.nacre.onlineShoping.action;
 
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nacre.onlineShoping.delegate.LoginDelegate;

public class LoginServlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			doLogin(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			doLogin(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public void doLogin(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException {
		System.out.println("enter into servlet------>");
		PrintWriter out = null;
		String email = null;
		String password = null;
		int adminId = 0;
		String role = null;
		LoginDelegate loginDelegate = null;
		int userid = 0;
		RequestDispatcher rd = null;
		HttpSession ses = null;
		// create PrintWriter object
		try {
			out = response.getWriter();
			// set content
			response.setContentType("text/html");
			email = request.getParameter("email");
			password = request.getParameter("pwd");
			role = request.getParameter("role");
			loginDelegate = new LoginDelegate();
			if (role.equals("1")) {

				adminId = loginDelegate.loginForm(email, password);
				ses = request.getSession();
				ses.setAttribute("adminId", adminId);
				System.out.println(adminId);
				if (adminId != 0) {
					
					rd = request.getRequestDispatcher("/Pages/admin.jsp");

					rd.forward(request, response);

				
				}else {

					out.print("Sorry UserName or Password Error!");
					rd = request.getRequestDispatcher("./html/login.html");
					rd.include(request, response);

				}
			} else if (role.equals("2")) {
				ses=request.getSession();
				ses.setAttribute("oldpwd", password);
				userid = loginDelegate.getUserLoginDelegate(email, password);
				// set in session
				System.out.println("hi" + userid);
				ses = request.getSession();
				ses.setAttribute("userid1", userid);
				System.out.println("hi user1");
				if (userid != 0) {
					System.out.println("hi user");
					rd = request.getRequestDispatcher("/ViewProduct.html");
					rd.forward(request, response);
				}else {

					out.print("Sorry UserName or Password Error!");
					rd = request.getRequestDispatcher("./html/login.html");
					rd.include(request, response);

				}
				
				
			} else {

				out.print("Sorry UserName or Password Error!");
				rd = request.getRequestDispatcher("./html/login.html");
				rd.include(request, response);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}