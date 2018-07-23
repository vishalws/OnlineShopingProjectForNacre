<%@ page language="java" isELIgnored="false"   contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>OrderSummary</title>

</head>
<body>

<h1 style='color:red;text-align:center'>Order Summary</h1>
<a href="./ViewProduct.html">home</a>
<form action="./AddCartToDataBaseServlet" method="post">
<c:choose>
<c:when test="${!empty ulist}">
<table border="1" width=100%>
<c:forEach var="dto" items="${ulist}">
<tr bgcolor="cyan">
<td>Name::<input type="text" value="${dto.fname}" name="uname" readonly></tr>
<tr bgcolor="cyan">
<td>mobile::<input type="text" value="${dto.mob}" name="mob" readonly></td></tr>
<tr bgcolor="cyan">
<td>Email::<input type="text" value="${dto.email}" name="email" readonly></td></tr>
<tr bgcolor="cyan">
<td>ProductId:<input type="text" value="${dto.product_id}" name="pid" readonly></td></tr>
<tr bgcolor="cyan">
<td>ProductName::<input type="text" value="${dto.product_name}" name="pname" readonly></td></tr>
<tr bgcolor="cyan">
<td>ProductQuantity::<select onchange="valid(this.value);" name="quantity"><option id="q" values="1">1</option><option id="q" values="2">2</option><option id="q" values="3">3</option><option id="q" values="4">4</option><option id="q" values="5">5</option><option id="q" values="6">6</option><option id="q" values="7">7</option><option id="q" values="8">8</option><option id="q" values="9">9</option><option id="q" values="10">10</option></td></tr>
<tr bgcolor="cyan">
<td>ProductPrice::<p id="demo"></p><input type="text" value="${dto.product_price}" name="price"  id="pric" readonly/></td></tr>
<tr bgcolor="cyan">

<td>Line1::<input type="text" value="${dto.line1}" name="line1" readonly></td></tr>
<tr bgcolor="cyan">
<td>Line2::<input type="text" value="${dto.line2}" name="line2" readonly></td></tr>
<tr bgcolor="cyan">
<td>pincode::<input type="text" value="${dto.pincode}" name="pincode" readonly></td></tr>
<tr bgcolor="cyan">
<td>city::<input type="text" value="${dto.city}" name="city" readonly></td></tr>
<tr bgcolor="cyan">
<td>state::<input type="text" value="${dto.state}" name="state" readonly></td></tr>
<tr bgcolor="cyan">
<td>country::<input type="text" value="${dto.country}" name="country" readonly></td></tr>
<tr bgcolor="cyan">
<td><input type="submit" value="order"> <!-- <input type="submit" value="place"> --></td></tr>

</c:forEach>
</table>

</c:when>

<c:otherwise>
<h3>DATA WILL NOT COME</h3>
</c:otherwise>
</c:choose>
</form>


<script type="text/javascript">
function valid(q){
	alert(q);
	 document.getElementById("demo").innerHTML="";  
	var price=document.getElementById("pric").value;
	var price1=price*q;
	alert(price1);
	 document.getElementById("demo").innerHTML=price1; 
	debugger;
return false;
}
</script>

</body>
</html>