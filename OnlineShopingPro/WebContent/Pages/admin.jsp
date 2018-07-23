<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel= "stylesheet" type="text/css" href="./mycss/admin.css">
<style type="text/css">
.btn {
    border: none;
    color: white;
    padding: 12px 20px;
    font-size: 13px;
    cursor: pointer;
}

.success {background-color: #4CAF50;} /* Green */
.success:hover {background-color: #46a049;}

.info {background-color: #2196F3;} /* Blue */
.info:hover {background: #0b7dda;}

.warning {background-color: #ff9800;} /* Orange */
.warning:hover {background: #e68a00;}

.danger {background-color: #f44336;} /* Red */ 
.danger:hover {background: #da190b;}

.default {background-color: #e7e7e7; color: black;} /* Gray */ 
.default:hover {background: #ddd;}
</style>
<script type="text/javascript">



</script>
</head>
<body>
<div>
<!-- <META HTTP-EQUIV="Refresh" CONTENT="10"> --> 
<h2 style="text-align:center">Admin home page</h2>
<form action="#">
<table>

<tr><th><p><a href="<%=request.getContextPath()%>/Pages/product.jsp" class="btn success">Add product</a></p></th>&nbsp; &nbsp; &nbsp;&nbsp;<th><p><a href="../adminEditServlet" class="btn warning">Edit/update product</a></p></th>

&nbsp; &nbsp; &nbsp; <th><a href="<%=request.getContextPath()%>/Pages/ViewRegistration.jsp" class="btn info">view Registration</a></th>&nbsp; &nbsp; &nbsp;<th><a href="<%=request.getContextPath()%>/Pages/ViewProductForAdmin.jsp" class="btn info">view product</a></th></tr>
</table>

<table id="pid" border="1">

	</table>
</form>

</div>
</body>
</html>