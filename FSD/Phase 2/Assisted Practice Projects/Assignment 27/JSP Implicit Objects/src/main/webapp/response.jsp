<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Response object</title>
</head>
<body>
<%= "This is response page " %>
<%= "welcome "+request.getParameter("uname")  %>
<% 
	response.sendRedirect("request.jsp");
%>
</body>
</html>