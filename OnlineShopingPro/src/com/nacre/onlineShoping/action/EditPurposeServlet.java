package com.nacre.onlineShoping.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nacre.onlineShoping.delegate.EditProductDelegate;
import com.nacre.onlineShoping.delegate.EditPurposeDelegate;
import com.nacre.onlineShopping.DTO.ProductDTO;
@WebServlet("/Edit_PURPOSE_SERVLET")
public class EditPurposeServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doEditPurpose(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doEditPurpose(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void doEditPurpose(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		String id = null;
		String name = null;
		String color = null;
		String quantity = null;
		String discription = null;
		String date = null;
		String price = null;
		PrintWriter out = null;
		List<ProductDTO> ldto = null;
		// ProductDTO dto=new ProductDTO();
		EditPurposeDelegate editPurposeDelegate = null;
		// get printWriter object
		out = response.getWriter();
		// set the content type
		response.setContentType("text/html");
		String pid = request.getParameter("pid");
		// create delegate object
		editPurposeDelegate = new EditPurposeDelegate();
		if (editPurposeDelegate != null) {
			// call editDelegate class method
			ldto = editPurposeDelegate.getEditPurposeDataDelegate(pid);
			for (ProductDTO dto : ldto) {
				id = dto.getProduct_id();
				color = dto.getProduct_color();
				date = dto.getProduct_date();
				discription = dto.getProduct_description();
				name = dto.getProduct_name();
				price = dto.getProduct_price();
				quantity = dto.getProduct_quantity();
			}
		} // update_admin_editable_data
		if (ldto != null) {
			out.println("<body bgcolor='#E6E6FA' >");
		//	out.println("<a href='<%=request.getContextPath()%>/Pages/admin.jsp'>home</a>");
			out.println("<h3 style='text-align:center;color:red'>Edit data page</h3>");
			out.println("<form action='update_admin_editable_data' method='post' >");
			out.println("<table  style='text-align:center;bgcolor:cyan'>");
			out.println("<tr><td> product Id:</td><td><input type='text' value=" +id+ " name='pid' readonly></td></tr>");
			out.println("<tr><td> product name::</td><td><input type='text' value=" + name + " name='pname'></td></tr>");
			out.println(" <tr><td>product price:</td><td><input type='text' value=" + price + " name='price'></td></tr>");
			out.println(" <tr><td>product desciption:</td><td><input type='text' value=" + discription + " name='desc'></td></tr>");
			out.println(" <tr><td>product add date:</td><td><input type='date' value=" + date + " name='pDate'></td></tr>");
			out.println(" <tr><td>product quantity:</td><td><input type='text' value=" + quantity + " name='quantity'></td></tr>");
			out.println(" <tr><td>product color:</td><td><input type='text' value=" + color + " name='color'></td></tr>");

			out.println(" <tr><td><input type='submit' value='upadate'><tr><td>");
			out.println("<table>");
			out.println("</form>");
		}
	}

}
