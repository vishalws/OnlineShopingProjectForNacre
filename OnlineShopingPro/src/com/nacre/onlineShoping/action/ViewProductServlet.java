package com.nacre.onlineShoping.action;

import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.nacre.onlineShoping.delegate.ViewProductDelegate;
import com.nacre.onlineShopping.DTO.ProductDTO;

public class ViewProductServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
			doViewProduct(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*System.out.println("inside ViewProductServlet");
		List<ProductDTO> lproductDto=null;
		ViewProductDelegate viewProductDeledate=new ViewProductDelegate();
		response.setContentType("application/json");
		String pid=null;
		ProductDTO productDTO=new ProductDTO();
		String pid=productDTO.getProduct_id();
		HttpSession ses=null;
		//session for pid for feedback
		ses=request.getSession();
		ses.setAttribute("pid", pid);
		System.out.println("in doViewProduct="+pid);
		try {
			lproductDto=viewProductDeledate.getViewProductInDelegate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		for(ProductDTO dto:lproductDto){
			pid=dto.getProduct_id();
		}
		HttpSession ses=null;
		//session in pid
		ses=request.getSession();
		ses.setAttribute("pid", pid);
		System.out.println("in doViewProduct="+pid);
		
		
		
		
		response.getWriter().write(new Gson().toJson(lproductDto));
		System.out.println("lproductDto"+lproductDto);*/
	}
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doViewProduct(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void doViewProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException{
		System.out.println("inside ViewProductServlet");
		List<ProductDTO> lproductDto=null;
		ViewProductDelegate viewProductDeledate=new ViewProductDelegate();
		response.setContentType("application/json");
	
		ProductDTO productDTO=new ProductDTO();
		String pid=productDTO.getProduct_id();
		HttpSession ses=null;
		//session for pid for feedback
		/*ses=request.getSession();
		ses.setAttribute("pid", pid);
		System.out.println("in doViewProduct="+pid);*/
		lproductDto=viewProductDeledate.getViewProductInDelegate();
	
		for(ProductDTO dto:lproductDto){
			pid=dto.getProduct_id();
		}
	
		//session in pid
		ses=request.getSession();
		ses.setAttribute("pid", pid);
		System.out.println("in doViewProduct="+pid);
		
		
		
		
		response.getWriter().write(new Gson().toJson(lproductDto));
		System.out.println("lproductDto"+lproductDto);
	}
}
