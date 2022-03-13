<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Authentication Page</title>
</head>

<body>
<center>
<h1 style="color: red;">Login Page</h1>
<h3>
<form action="Auth" method="post"> 
Username:  <input name="username" id="username" type="text" placeholder="Enter Email-id" required/>
<br>
<br>
Password:  <input name="password" id="password" type="password" placeholder=" Enter Password" required/>
<br>
<br>	
<input type="submit" name="Submit"/>
</form>
</h3>
</center>
</body>
</html>