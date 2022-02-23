<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<h3 align="center" style="color: blue">Enter Product Details</h3>
<form action="save" method="post">
<h3 align="center">Product Name: <input type="text" placeholder="Enter name of product" name="name" /></h3>
<h3 align="center">Product Price: <input type="text" name="price" placeholder="Enter price of product" /></h3>
<h3 align="center">Product Quantity: <input type="text" name="quantity" placeholder="Enter quantity of product" /></h3>
<h2 align="center"><input type="submit" value="Save" /></h2>
</form>
</tr>
</table>
</body>
</html>