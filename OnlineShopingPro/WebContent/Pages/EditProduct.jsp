<%@ page language="java" isELIgnored="false"  contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit-page</title>

</head>
<body>
<a href="<%=request.getContextPath()%>/Pages/admin.jsp">home</a>
<h1 style='color:red;text-align:center'>welcome to admin edit page</h1>
<form action="" method="get">
<c:choose>
<c:when test="${!empty list}">
<table border="1" width="100%">
<tr bgcolor="cyan">
<td>ProductId</td>
<td>ProductName</td>
<td>ProductQuantity</td>
<td>ProductColor</td>
<td>ProductPrice</td>
<td>ProductDescription</td>
<td>Product_Add_Date</td>
<td>Edit</td>
</tr>
<c:forEach var="dto" items="${list}">
<tr>
<td>${dto.product_id}</td>
<td>${dto.product_name}</td>
<td>${dto.product_quantity}</td>
<td>${dto.product_color}</td>
<td>${dto.product_price}</td>
<td>${dto.product_description}</td>
<td>${dto.product_date}</td>
<td><a href="./Edit_PURPOSE_SERVLET?pid=${dto.product_id}">Edit</a></td>
</tr>
</c:forEach>
</table>

</c:when>
<c:otherwise>
<h3>DATA WILL NOT COME</h3>
</c:otherwise>
</c:choose>
</form>
</body>
</html>