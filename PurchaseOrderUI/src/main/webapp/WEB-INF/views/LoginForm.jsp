<html>
<head>
<title>Login Page</title>


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

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <ul class="navbar-nav">
   <li class="nav-item active">
      <a class="nav-link" href="">Purchase Order</a>
    </li>
    <li class="nav-item active">
      <a class="nav-link" href="">Home</a>
    </li>
    <li class="nav-item active">
      <a class="nav-link" href="getRegisterForm">Register</a>
    </li>
    <li class="nav-item active">
      <a class="nav-link" href="getLoginForm">LogIn</a>
    </li>
    
    
   
  </ul>
</nav>
    <div id="login" >
        <h3 class="text-center text-white pt-5">Login form</h3>
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12">
                        <form id="login-form" class="form" action="logIn" method="post" >
                        <fieldset >
                            <h3 class="text-center text-info">Login</h3>
                            <div class="form-group">
                                <label for="username" class="text-info">Email Id<!-- <font color="black">EmailId:</font> --></label><br>
                                <input type="text" name="email" id="username" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="password" class="text-info">Password<!-- <font color="black">Password:</font> --></label><br>
                                <input type="password" name="pass" id="password" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="remember-me" class="text-info"><span>Remember Me</span> <span><input id="remember-me" name="remember-me" type="checkbox"></span></label><br>
                                <input type="submit" name="submit" class="btn btn-info btn-md" value="LogIn">
                            </div>
                            <div id="register-link" class="text-right">
                                <a href="getRegisterForm" class="text-info">Register Here</a>
                            </div>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>




<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log in</title>
</head>
<body>



<div align="center">

<h1>LogIn Form</h1>

<form action="logIn" method="post">

			<table>
				<tr>
					<td>Enter email: </td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="pass"/></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Sign In"/></td>
				</tr>
		</table>
		</form>
	
</div>

</body>
</html> --%>