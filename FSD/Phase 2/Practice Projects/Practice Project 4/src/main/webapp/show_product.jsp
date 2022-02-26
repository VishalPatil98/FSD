<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<<jsp:useBean id="obj" class="productDetailPortal.Product" scope="session"></jsp:useBean>
<h3 align="center">Product ID:<jsp:getProperty property="id" name="obj"/></h3><br> 
<h3 align="center">Product Name :<jsp:getProperty property="name" name="obj"/></h3><br>  
<h3 align="center">Product Description :<jsp:getProperty property="description" name="obj" /></h3><br>
<h3 align="center">Product Price<jsp:getProperty property="price" name="obj" /></h3><br>
<h4 align="center" style="color: red;"><a href="index.html">Go To HomePage</a></h4>
</body>
</html>