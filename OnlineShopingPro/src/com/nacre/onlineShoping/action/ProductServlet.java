package com.nacre.onlineShoping.action;

import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.apache.commons.codec.binary.Base64;

import com.nacre.onlineShoping.delegate.ProductDelegate;
import com.nacre.onlineShopping.DTO.ProductDTO;
@MultipartConfig(maxFileSize=16101213)
public class ProductServlet extends HttpServlet {

	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doProduct(request, response);
		} catch (SQLException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			try {
				doProduct(request, response);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void doProduct(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ParseException, IOException, ServletException {
		PrintWriter out=response.getWriter();
		ProductDTO productDto = new ProductDTO();
		int pid = 0;
		// get addId from session
		HttpSession ses = request.getSession(false);
		int userid = (int) ses.getAttribute("adminId");
		System.out.println(userid);
		productDto.setProduct_name(request.getParameter("pname"));
		productDto.setProduct_price(request.getParameter("price"));
		productDto.setProduct_quantity(request.getParameter("quantity"));
		productDto.setProduct_color(request.getParameter("color"));
		productDto.setProduct_date(request.getParameter("date1"));

		productDto.setProduct_description(request.getParameter("pdetail"));
		Part imagePart = null;
		try {
			imagePart = request.getPart("image");
			InputStream st = imagePart.getInputStream();
			byte[] imageByte = new byte[st.available()];
			st.read(imageByte);

			productDto.setProduct_images(Base64.encodeBase64String(imageByte));
		} catch (IOException | ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("image path=" + productDto.getProduct_images());
		// productDto.setAddId(String.valueOf(userid));
		System.out.println("product servlet id=" + productDto.getAddId());
		ProductDelegate productDelegate = new ProductDelegate();
		// call delegate method
		pid = productDelegate.getProductDetailsFromDelegate(productDto);
		// set productId in session
		ses.setAttribute("ppid", pid);
		if(pid !=0){
			out.println("<h2>product is inserted</h2>");
			RequestDispatcher rd=request.getRequestDispatcher("/Pages/msgproduct.jsp");
			rd.forward(request, response);
		}
	}
}
