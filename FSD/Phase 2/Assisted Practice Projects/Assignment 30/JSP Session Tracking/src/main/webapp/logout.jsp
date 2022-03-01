<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	session.removeAttribute("name");
	session.invalidate();
%>
<h2>Logout Successfully</h2>
<a href="index.jsp">Login</a>
</body>
</html>