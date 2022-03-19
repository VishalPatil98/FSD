<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
  	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of Products</title>
</head>
<body>
<h3>List Of Products</h3>
<table>
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Price</th>
		<th>Quantity</th>
	</tr>
<c:forEach var="product" items="${list }">
	<tr>
		<td>${product.id }</td>
		<td>${product.name }</td>
		<td>${product.price }</td>
		<td>${product.quantity }</td>
	</tr>
</c:forEach>
</table>
</body>
</html>