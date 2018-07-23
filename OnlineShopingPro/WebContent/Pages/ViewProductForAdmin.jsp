<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>



<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="<%=application.getContextPath()%>/assets/js/jquery-1.10.2.js"></script>
<!-- BOOTSTRAP SCRIPTS -->
<script
	src="<%=application.getContextPath()%>/assets/js/bootstrap.min.js"></script>

<script type="text/javascript">
	

	$(document)
			.ready(
					function() {
						

						$
								.get(
										"../viewProductUrl",
										function(json) {

											var a = "<tr><td>product id</td><td>product name</td><td>product price</td><td>product images</td><td>product color</td><td>product quantity</td></tr>";

											$
													.each(
															json,
															function(key, value) {

																
																a += "<tr><td>"
																		+ value.product_id
																		+ "</td><td>"
																		+ value.product_name
																		+ "</td><td>"
																		+ value.product_price
																		+ "</td><td><img src='data:image/jpg;base64,"+value.product_images+"' alt='Red dot' width='95' height='95'/></td><td>"
																		+ value.product_color
																		+ "</td><td>"
																		+ value.product_quantity
																		+ "</td></tr>";
															});
											$("#pid").append(a);
										});
					});
</script>
</head>
<body style="background-color:cyan">
	<h2 style="color: red">
		<marquee>View product page</marquee>
	</h2>
	<a href="<%=request.getContextPath()%>/Pages/admin.jsp">back to home</a>
	<table id="pid">

	</table>

	
</body>
</html>