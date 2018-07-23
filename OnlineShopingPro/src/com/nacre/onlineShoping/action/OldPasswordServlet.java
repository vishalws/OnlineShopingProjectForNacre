package com.nacre.onlineShoping.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/old_password")
public class OldPasswordServlet extends HttpServlet {
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doOldPwd(request, response);
}
@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doOldPwd(request, response);
	}
public void doOldPwd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	PrintWriter out=null;
	HttpSession ses=null;
	//create printWriter object
	out=response.getWriter();
	//set the content type
	response.setContentType("text/html");
	String oldpwd=request.getParameter("oldpwd");
	System.out.println("sesoldPwd="+oldpwd);
	//get session object
	ses=request.getSession();
	String sesOldPwd=(String) ses.getAttribute("oldpwd");
	System.out.println("sesoldPwd="+sesOldPwd);
	System.out.println("in change ");
	if(oldpwd.equals(sesOldPwd)){
		System.out.println("in change if");
		request.setAttribute("list", sesOldPwd);
		request.getRequestDispatcher("./Pages/ChangePassword.jsp").forward(request, response);
		/*out.print("<form action='' onsubmit=>");
		out.print("<table>");
		out.print("<tr><td>old password</td><td><input type='text' value='"+oldpwd+"' readonly></td></tr>");
		out.print("<tr><td>new password</td><td><input type='text' name='newPwd'></td></tr>");
		out.print("<tr><td>conform password</td><td><input type='text' name='conPwd'></td></tr>");
		out.print("<tr><td><input type='submit' value='changPassword'></td></tr>");
		
		out.print("</table>");*/
	}
	
}
}
