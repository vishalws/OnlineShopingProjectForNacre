<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<link rel= "stylesheet" type="text/css" href="../mycss/visitor.css">
<script  type="text/javascript"  src="../js/validateLogin.js"></script>




</head>
<body>

<div>
<h2>visitor form</h2>
<form action="../VISITOR_FOR_SERVLET" onsubmit="return (validateEmail();" name="myForm">
<table>
<tr><td><label>Email::</label><input type="email" name="email"/></td></tr>


<tr><td><input  type="submit" value="login"/></td></tr>
<tr><td><a href="<%=request.getContextPath()%>/html/registrationJquery.html">registrastion</a></td></tr>
</table>
</form>
</div>
</body>
</html>