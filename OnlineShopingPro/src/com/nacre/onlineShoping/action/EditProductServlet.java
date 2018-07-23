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

import com.google.gson.Gson;
import com.nacre.onlineShoping.delegate.EditProductDelegate;
import com.nacre.onlineShoping.delegate.ViewProductDelegate;
import com.nacre.onlineShopping.DTO.ProductDTO;
@WebServlet("/adminEditServlet")
public class EditProductServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doEditProduct(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		doEditProduct(request, response);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}
	public void doEditProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException{
		System.out.println("inside EditProductServlet");
		List<ProductDTO> lproductDto=null;
		PrintWriter out=null;
		EditProductDelegate EditProductDeledate=new EditProductDelegate();
	    response.setContentType("text/html");
	    //get PrintWriter object
	out=response.getWriter();
	
		lproductDto=EditProductDeledate.getEditProductInDelegate();
	
		if(lproductDto != null)
		{
			request.setAttribute("list", lproductDto);
			request.getRequestDispatcher("/Pages/EditProduct.jsp").forward(request, response);
		}
		System.out.println("lproductDto"+lproductDto);
	}
}
