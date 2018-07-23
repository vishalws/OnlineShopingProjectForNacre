<%@ page language="java" isELIgnored="false"  contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>visitor view</title>
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
										"./viewProductUrl",
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
																		+ "</td><td><img src='data:image/jpg;base64,"+value.product_images+"' alt='Red dot' /></td><td>"
																		+ value.product_color
																		+ "</td><td>"
																		+ value.product_quantity
																		+ "</td><td><a href=./visitorMetaDataServlet?pid='"+value.product_id+"'>view</a></td></tr>";
															});
											$("#pid").append(a);
										});
					});
</script>
</head>
<body style="background-color:cyan">
	<h2 style="color: red">
		<marquee>View  visitor product page</marquee>
	</h2>
 
	<table id="pid" border="1">

	</table>

	
</body>
</html>