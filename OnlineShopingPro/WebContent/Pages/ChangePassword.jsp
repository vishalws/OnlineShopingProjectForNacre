<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
$('#password, #confirm_password').on('keyup', function () {
	  if ($('#password').val() == $('#confirm_password').val()) {
	    $('#message').html('Matching').css('color', 'green');
	  } else 
	    $('#message').html('Not Matching').css('color', 'red');
	});
});
</script>
</head>
<body>
<form action="./change_password" >
<c:choose>
<c:when test="${!empty list}">
<table>
<c:forEach var="olpwd" items="${list}">
<tr><td>old password</td><td><input type="password" value=${olpwd} /></td></tr>
</c:forEach>
</table>
</c:when>
</c:choose>
<table>
<tr><td>password :</td>
 <td> <input name="password" id="password" type="password" />
</td></tr>

<tr><td>confirm password:
 </td><td> <input type="password" name="confirm_password" id="confirm_password" /></td></tr>
  <span id='message'></span>
<tr><td><input type="submit" value="changePassword"></td></tr>
</table>
</form>
</body>
</html>