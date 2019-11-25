 <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<title>Register Page</title>


<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

   <link href="${css}/style.css" rel="stylesheet">

<!-- <style type="text/css">
body {
  margin: 0;
  padding: 0;
  background-color: #17a2b8;
  height: 100vh;
}
</style> -->

</head>
<body>
    <div id="login" >
        <h3 class="text-center text-white pt-5">Register Form</h3>
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12">
                        <form:form id="login-form" class="form"  action="register" method="post" modelAttribute="userObj" >
                        <fieldset >
                            <h3 class="text-center text-info">Register </h3>
                             <div class="form-group">
                                <label for="username" class="text-info">Name :</label><br>
                                <form:input path="userName" id="name" class="form-control"/> 
                            </div>
                             <div class="form-group">
                                <label for="address" class="text-info">Address :</label><br>
                                <form:input path="userAddress" id="address" class="form-control"/>
                            </div>
                            
                            <div class="form-group">
                                <label for="email" class="text-info" >Email Id</label><br>
								<form:input path="userEmail" id="email" class="form-control"/>                            
							</div>
							<div class="form-group">
                                <label for="email" class="text-info" >Contact Number :</label><br>
								<form:input path="userPhone" id="email" class="form-control"/>                            
							</div>
							
                            <div class="form-group">
                                <label for="password" class="text-info">Password</label><br>
                                <input type="password" name="userPass" id="password" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="remember-me" class="text-info"><span>Remember Me</span> <span><input id="remember-me" name="remember-me" type="checkbox"></span></label><br>
                                <input type="submit" name="submit" class="btn btn-info btn-md" value="Register">
                            </div>
                           
                            </fieldset>
                        </form:form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>






<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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
</html> --%>