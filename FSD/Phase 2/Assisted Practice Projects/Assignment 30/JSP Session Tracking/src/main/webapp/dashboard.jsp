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
	String name=(String) session.getAttribute("name");
	if(name!=null)
	{
		out.print("Hellow"+name);
		out.print("<a href='logout.jsp'>Logout</a>");
	}
	else
		response.sendRedirect("index.jsp?error=1");

%>
</body>
</html>