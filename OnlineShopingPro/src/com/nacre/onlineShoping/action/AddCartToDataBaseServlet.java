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
import com.nacre.onlineShoping.delegate.AddCartToDataBaseDelegate;
import com.nacre.onlineShopping.DTO.OrderSummaryDTO;
import com.nacre.onlineShopping.DTO.ProductDTO;
import com.nacre.onlineShopping.Exception.DBException;

@WebServlet("/AddCartToDataBaseServlet")
public class AddCartToDataBaseServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doAddCart(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doAddCart(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void doAddCart(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		boolean flag = false;
		RequestDispatcher rd = null;
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		System.out.println("servlet addCart");
		OrderSummaryDTO orderSummaryDto = new OrderSummaryDTO();
		orderSummaryDto.setProduct_id(Integer.parseInt(request.getParameter("pid")));
		System.out.println("AddCartServletid=" + orderSummaryDto.getProduct_id());
		orderSummaryDto.setProduct_name(request.getParameter("pname"));
		System.out.println("AddCartServletName=" + orderSummaryDto.getProduct_name());
		orderSummaryDto.setProduct_quantity(Integer.parseInt(request.getParameter("quantity")));
		System.out.println("AddCartServletQuantity=" + orderSummaryDto.getProduct_quantity());
		orderSummaryDto.setProduct_price(Integer.parseInt(request.getParameter("price")));
		System.out.println(orderSummaryDto.getProduct_price());

		System.out.println(orderSummaryDto.getCity());
		HttpSession ses = request.getSession(false);
		int userid = (int) ses.getAttribute("userid1");
		System.out.println(userid);

		// create AddCartDelegate object
		AddCartToDataBaseDelegate addCartDelegate = new AddCartToDataBaseDelegate();
		try {
			int result = addCartDelegate.getAddCartToDataBaseDelegate(orderSummaryDto, userid);
			if(result !=0){
				out.print("<h2>data added in cart</h2>");
			rd=request.getRequestDispatcher("/Pages/OrderSummary.jsp");
			rd.include(request, response);
			}
		} catch (DBException e) {
			rd = request.getRequestDispatcher("/Pages/err.jsp");
			flag = true;
		} catch (Exception e) {
			rd = request.getRequestDispatcher("/Pages/err.jsp");
			flag = true;
		} finally {
			if (flag)
				rd.forward(request, response);
		}
	}

}
