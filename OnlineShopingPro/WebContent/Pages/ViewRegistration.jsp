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
<script type="text/javascript">

$.get("../viewRegistration",function(json)
		{ 
		 
		  
		  
	  var a="<tr><td>name</td><td>lname</td><td>email</td><td>mobile</td><td>Gender</td></tr>";
	 
	  $.each(json,function(key,value){
		 
	  	a+="<tr><td>"+value.fname+"</td><td>"+value.lname+"</td><td>"+value.email+"</td><td>"+value.mob+"</td><td>"+value.gender+"</td>";
	  });
		  $("#tid").append(a);
	});

</script>
</head>
<body>
<h2 style="color:red;">Register user info</h2>
<table id="tid" border="1" style="background-color:cyan;">

</table>
<a href="<%=request.getContextPath()%>/Pages/admin.jsp">admin home</a>
</body>
</html>