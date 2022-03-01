<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" info="First JSP project"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int serverPort= request.getServerPort();
out.print("Port: "+serverPort+"<br>");
out.print("Servlet Name is "+ config.getServletName()+"<br>");
out.print("Server Info: "+application.getServerInfo()+"<br>");

out.print("Page Name: "+ page.toString()+"<br>");

pageContext.setAttribute("userid", "vishal");
out.print("Attribute from Page Context: "+ pageContext.getAttribute("userid")+"<br>");
%>
</body>
</html>