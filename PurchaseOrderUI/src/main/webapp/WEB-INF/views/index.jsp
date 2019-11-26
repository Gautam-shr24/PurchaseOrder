<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="css" value="${pageContext.request.contextPath}/resources/css" scope="application"/>
<c:set var="images" value="${pageContext.request.contextPath}/resources/images" scope="application"/>



<html>
<head>
 <!-- Favicons -->
  <link href="img/favicon.png" rel="icon">
  <link href="img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Poppins:300,400,500,700" rel="stylesheet">

  <!-- Bootstrap CSS File -->
  <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Libraries CSS Files -->
  <link href="lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="lib/animate/animate.min.css" rel="stylesheet">
   <link href="${css}/style.css" rel="stylesheet">



</head>
<body style="background:url('${images}/img.jpg');">
<%-- <img src="${images}/img.jpg"/> --%>
<%-- <div align="center">
	<h1>${msg }</h1>
	${msg1}
	</div> --%>
	
	
	<header id="header">
    <div class="container">

     
      <nav id="nav-menu-container">
        <ul class="nav-menu">
          <li class="menu-active"><a href="#hero">Home</a></li>
          <li><a href="#about">About Us</a></li>
          <li><a href="getRegisterForm">Register</a></li>
          <li><a href="getLoginForm">Login</a></li>
          <li><a href="#contact">Contact Us</a></li>
        </ul>
      </nav><!-- #nav-menu-container -->
    </div>
  </header><!-- #header -->
	
	
	<section id="hero">
    <div class="hero-container">
      <h1>Welcome to</h1>
      <h1>Purchase Order Management Site</h1>
    <!--   <h2>We are team of talanted designers making websites with Bootstrap</h2> -->
     <!--  <a href="#about" class="btn-get-started">Get Started</a> -->
    </div>
  </section><!-- #hero -->
	

	<!-- 
	<div align="center">
	<h1><a href="getRegisterForm">Register</a></h1>
	<h1><a href="getLoginForm">Login</a></h1>
	</div>
 -->

</body>
</html>
 