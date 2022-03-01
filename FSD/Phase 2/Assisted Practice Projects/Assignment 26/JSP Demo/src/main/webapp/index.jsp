<%@page import="java.util.Calendar"%>
<%@page import="org.apache.naming.java.javaURLContextFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Sciptlet Tag</h1>
<hr>
<% 
	out.print("Hello World ");
%>
<h1>Declaration :Delcare variable as well as methods</h1>
<hr>
<%!
int a=10;
int b=30;
%>
<%!
	public int square(int m)
{
	return m*m;
}
%>
<%="Square of 10 is:"+square(10) %>
<hr>
<%= Calendar.getInstance().getTime() %>
<hr>
<h1>Using EL</h1>
${'Hello'}
</body>
</html>