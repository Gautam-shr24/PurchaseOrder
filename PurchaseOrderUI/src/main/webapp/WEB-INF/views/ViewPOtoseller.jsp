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
<form>
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
				
		<td><a href="viewlineitems?viewId=${obj.purchaseOrderId}" class="btn btn-primary btn-block btn-large">View</a></td> 
			</tr>
		
		</c:forEach>
		</table>
		</form>
		</div>
</div>
	
<%-- 	<div align="center" class="ListItems">
		${msg }
		<table border=1>
			<tr>
	
			<th>Buyer Id </th>				
			<th>Product items Detail </th>
			<th>Quantity </th>
			
			</tr>
			
			<c:forEach items="${list }" var="obj">
			<tr>
					
				<td>${obj.buyerObj.userId}</td>	
				<td><c:forEach items="${obj.poItemsObj }" var="listItems">
				${listItem.productObj.productName },
				
				</c:forEach>				
				</td>
				
				<td><c:forEach items="${obj.poItemsObj }" var="listItems">
				${listItem.quantity}
				
				</c:forEach>				
				</td>
				
				</tr>
			
			</c:forEach>
			</table>
			</div>
	</div>

 --%>

</body>
</html>