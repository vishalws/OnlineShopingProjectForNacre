package com.nacre.onlineShoping.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nacre.onlineShoping.delegate.LoginDelegate;
@WebServlet("/change_password")
public class ChangePasswordServlet extends HttpServlet {
@Override
public  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		doChangePwd(request, response);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doChangePwd(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public void doChangePwd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
	HttpSession ses=request.getSession();
	int userid=(int) ses.getAttribute("userid1");
	String pwd=request.getParameter("password");
	LoginDelegate ldelegate=new LoginDelegate();
	int result=ldelegate.getChangePasswordDelegate(userid, pwd);
	if(result !=0){
		request.getRequestDispatcher("./ViewProduct.html").forward(request, response);
	}
}
}
