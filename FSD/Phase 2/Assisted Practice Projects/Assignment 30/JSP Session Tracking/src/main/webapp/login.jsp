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

	String name=request.getParameter("username");
	String pass=request.getParameter("password");
	if(name.equals("admin") && pass.equals("admin"))
	{
		session.setAttribute("name", name);
		response.sendRedirect("dashboard.jsp");
	}
	else
		response.sendRedirect("index.jsp?error=1");
		
%>
</body>
</html>