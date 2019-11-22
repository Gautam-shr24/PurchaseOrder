<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Buyer</title>

 <script src="${js}/confirm.js"></script>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

</head>
<body>

<div align = "center">
<h1>Register Yourself!!!!!</h1>

<form:form  action="register" method="post" modelAttribute="userObj">

		<table>

			
			
			<tr>
			<th>Name</th>
			<td><form:input path="userName" id="name"/></td>
			</tr>
			
			
			<tr>
			<th>Address</th>
			<td><form:input path="userAddress" id="address"/></td>
			</tr>
			
			<tr>
			<th>Phone_No</th>
			<td><form:input path="userPhone" id="phone"/></td>
			</tr>
			
			<tr>
			<th>Email</th>
			<td><form:input path="userEmail" id="address"/></td>
			</tr>
			
			<tr>
			<th>Password</th>
			<td><form:input path="userPass" id="password"/></td>
			</tr>
			
			
			
			<tr>
			<th></th>
			<td><input id="btn"  type="submit" value="Register"  /></td>
			</tr>
			
		
		
		</table>



</form:form>

</div>

</body>
</html>