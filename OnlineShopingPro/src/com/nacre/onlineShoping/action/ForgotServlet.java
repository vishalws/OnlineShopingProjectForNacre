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

import com.nacre.onlineShoping.delegate.ForgotDelegate;

public class ForgotServlet extends HttpServlet {


	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doForgot(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doForgot(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void doForgot(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException{
		PrintWriter out=null;
		String email=null;
		String pwd=null;
		String role=null;
		int result=0;
		RequestDispatcher rd=null;
		//create object of PrintWriter
		out=response.getWriter();
		response.setContentType("text/html");
		ForgotDelegate forgotDelegate=null;
		email=request.getParameter("emailid");
		System.out.println("email="+email);
		System.out.println("pwd="+pwd);
		pwd=request.getParameter("pwd");
		role=request.getParameter("role");
		System.out.println("role="+role);
		forgotDelegate=new ForgotDelegate();
		if(role.equals("2")){
			
			result=forgotDelegate.getForgotPwd(email, pwd);
			
			 if(result != 0){
			
				out.println("<h2>password is updated</h2>");
				rd=request.getRequestDispatcher("./forgotPassword.html");
				rd.include(request, response);	 
			}
			else{
				out.print("<h2>check email or password</h2>");
				request.getRequestDispatcher("./forgotPassword.html").include(request, response);	 
			}
			
		}//if
		
		if(role.equals("1")){
			
			result=forgotDelegate.getForgotPwdAdmin(email, pwd);
			
			if(result != 0){
				out.println("<h2>password is updated</h2>");
				 rd=request.getRequestDispatcher("./forgotPassword.html");
				rd.include(request, response);
			}//if
			
			else{
				out.print("<h2>check email or password</h2>");
				request.getRequestDispatcher("./forgotPassword.html").include(request, response);	 
			}
		}//if
		else{
			out.print("<h2>select the role</h2>");
			rd=request.getRequestDispatcher("./forgotPassword.html");
			rd.include(request, response);
			 }
		}
		
	}


