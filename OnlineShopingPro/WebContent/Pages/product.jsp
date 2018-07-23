<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel = "stylesheet" type="text/css" href="../mycss/product.css"> 
<link rel="stylesheet" type="text/css"  href="../mycss/datef.css">
<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
<script src="http://code.jquery.com/ui/1.11.0/jquery-ui.js">
</script>
<script type="text/javascript">


$(function(){
$( "#datepicker" ).datepicker();
/* //Pass the user selected date format
$( "#format" ).change(function() {
$( "#datepicker" ).datepicker( "option", "dateFormat", $(this).val() );
}); */
});
  
  
</script>
</head>
<body id="form">
<div class="container">
<div>
<h2>Product form</h2>
<div class="main">
<form action="../producturl" method="post" enctype="multipart/form-data">
<div id="table">
<table>
<tr><td><label>product Name::</label></td><td><input type="text" name="pname"></td></tr>
<tr><td><label>product quantity::</label></td><td><input type="text" name="quantity"></td></tr>
<tr><td><label>product Image::</label></td><td><input type="file" name="image"></td></tr>
<tr><td><label>product price::</label></td><td><input type="text" name="price"></td></tr>
<tr><td><label>Select Date:</label></td><td><input type="text" name="date1" id="datepicker"/>
 <td>
</tr>
<tr><td><label>product color::</label></td><td><input type="text" name="color"></td></tr>
<tr><td><label>product detail::</label></td><td><textarea name="pdetail" id="desc"></textarea></td></tr>
<tr><td><label><input type="submit" value="submit"></td></tr>
</table>
</div>
</form>
</div>
</div>
</div>
<a href="<%=request.getContextPath()%>/Pages/admin.jsp">admin home</a>
</body>
</html>