<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="obj" class="productDetailPortal.Product" scope="session"></jsp:useBean>
<% 
String pid=request.getParameter("pid");
int id=Integer.parseInt(pid);
String name=request.getParameter("pname");
String desc=request.getParameter("pdesc");
String pprice=request.getParameter("pprice");
int price=Integer.parseInt(pprice);
%>
<jsp:setProperty property="id" name="obj" value="<%= id %>"/><br>  
<jsp:setProperty property="name" name="obj" value="<%= name %>"/><br>  
<jsp:setProperty property="description" name="obj" value="<%= desc %>"/><br>
<jsp:setProperty property="price" name="obj"  value="<%= price %>"/><br>
<br>
<h1 align="center" style="color: red;">DATA SAVED</h1>
<h3 align="center"><a href="show_product.jsp">Click Here To See</a></h3>
<h4 align="center" style="color: red;"><a href="index.html">Go To HomePage</a>
</body>
</html>