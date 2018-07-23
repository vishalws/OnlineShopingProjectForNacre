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

import com.nacre.onlineShoping.delegate.LoginDelegate;
@WebServlet("/visitorMetaDataServlet")
public class VisitorMetaDataServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doVisitorMetaData(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
		public  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doVisitorMetaData(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	 public void doVisitorMetaData(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		 String email = null;
		// int pid=0;
		 PrintWriter out=response.getWriter();
		 response.setContentType("text/html");
		 HttpSession ses=request.getSession(false);
		email= (String) ses.getAttribute("visitorEmail");
LoginDelegate lodindelegat=new LoginDelegate();
	
				String product_id = request.getParameter("pid");
				int pid=Integer.parseInt(product_id.replaceAll("'", ""));
				int result=lodindelegat.getVisitorMetaDataDelegate(email, pid);
				if(result !=0){
					out.println("<h2>product is view</h2>");
					RequestDispatcher rd=request.getRequestDispatcher("/Pages/ViewVisitor.jsp");
					rd.include(request, response);
				}
				
			}
		
	 }

