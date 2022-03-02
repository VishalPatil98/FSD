<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Learners Academy</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<body>
<%
	String name=request.getParameter("username");
	String pass=request.getParameter("password");
	if(name.equals("vishal") && pass.equals("vishal"))
	{
		session.setAttribute("name", name);
		response.sendRedirect("student.jsp");
	}
	else
		response.sendRedirect("index.jsp?error=1");

%>
</body>
</html>