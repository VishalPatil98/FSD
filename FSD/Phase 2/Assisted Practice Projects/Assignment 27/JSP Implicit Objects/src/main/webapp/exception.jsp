<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int a;int b;int result;
%>
<%
	a= Integer.parseInt(request.getParameter("num1"));
	out.print("<br>");
	b= Integer.parseInt(request.getParameter("num2"));
	result=a/b;
	out.print("<br>");
	out.print("Division is :"+result);
	
%>
</body>
</html>