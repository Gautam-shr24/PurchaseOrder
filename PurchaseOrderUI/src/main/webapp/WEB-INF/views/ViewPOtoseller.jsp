<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All PO's</title>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

   <link href="${css}/style.css" rel="stylesheet">
   
   
			<script>
					$(document).ready(function(){
				  		$("button").click(function(){
				   		$(".ListItems").toggle();
					  });
					});
			
			
			</script>
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

<div align="center">

<h1>Welcome Seller!!!</h1>

<div align="center">
	${msg }
	<table border=1>
		<tr>

		<th>Purchase Order Id </th>				
		<th>Buyer Id </th>
		<th>Seller Id </th>
		<th>Status</th>
		
		</tr>
		
		<c:forEach items="${list }" var="obj">
		<tr>
				
				<td>${obj.purchaseOrderId}</td>
				<td>${obj.buyerObj.userId}</td>
				<td>${obj.sellerObj.userId}</td>
				<td>${obj.status }</td>
				
			<td><button>View List Items</button></td>
			</tr>
		
		</c:forEach>
		</table>
		</div>
</div>
	
	<div align="center" class="ListItems">
		${msg }
		<table border=1>
			<tr>
	
			<th>Name </th>				
			<th>Email </th>
			<th>Address </th>
			<th>Phone no</th>
			
			</tr>
			
			<c:forEach items="${list }" var="obj">
			<tr>
					
					<td>${obj.buyerObj.userName}</td>
					<td>${obj.buyerObj.userId}</td>
					<td>${obj.sellerObj.userId}</td>
					<td>${obj.status }</td>
					
				<td><button>View List Items</button></td>
				</tr>
			
			</c:forEach>
			</table>
			</div>
	</div>



</body>
</html>