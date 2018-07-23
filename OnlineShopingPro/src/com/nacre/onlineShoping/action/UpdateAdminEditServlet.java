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

import com.nacre.onlineShoping.delegate.UpdateEditAdminDelegate;
import com.nacre.onlineShopping.DTO.ProductDTO;
@WebServlet("/update_admin_editable_data")
public class UpdateAdminEditServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			try {
				doUpdateEdit(request, response);
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
				doUpdateEdit(request, response);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void doUpdateEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException
	{
		ProductDTO dto=null;
		HttpSession ses = null;
		int result=0;
		PrintWriter out=response.getWriter();
		UpdateEditAdminDelegate updateEditAdminDelegate=null;
		ses = request.getSession();
		Integer adminId = (Integer) ses.getAttribute("adminId");
		System.out.println("doUpdateEditServlet="+adminId);
		//create dto object
		dto=new ProductDTO();
		String id=request.getParameter("pid");
		System.out.println("doUpdate="+id);
		 dto.setProduct_id(id);
		 dto.setProduct_name(request.getParameter("pname"));
		 dto.setProduct_price(request.getParameter("price"));
		 dto.setProduct_description(request.getParameter("desc"));
	     dto.setProduct_date(request.getParameter("pDate"));
		 dto.setProduct_quantity(request.getParameter("quantity"));
		 dto.setProduct_color(request.getParameter("color"));
		 dto.setAdminId(String.valueOf(ses.getAttribute("adminId")));
		 //delegate object will be created
		updateEditAdminDelegate=new UpdateEditAdminDelegate();
		result=updateEditAdminDelegate.getUpdateEditAdminDataDelegate(dto);
		if(result !=0){
			out.println("<h2>product is edited</h2>");
			RequestDispatcher rd=request.getRequestDispatcher("./Pages/editShow.jsp");
			rd.forward(request, response);
		}
	}
}
