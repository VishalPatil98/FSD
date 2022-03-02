<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*"%>
<%@ page import="java.util.*" %>
<%@page import="learningAcademy.Dbconnect" %>

    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Learners Academy</title>
 <link type="text/css" rel="stylesheet" href="css/style.css">   
</head>
<body>
<%
	String name=(String) session.getAttribute("name");
	if(name!=null)
	{
%>
<ul>
 	<li><a href="student.jsp">Student</a></li>
 	<li><a href="teacher.jsp">Teachers</a></li>
 	<li><a href="subject.jsp">Subject</a></li>
 	<li><a class="active" href="classes.jsp">Classes</a></li>
 	<li><a href="logout.jsp">Logout</a></li>
</ul>
<div style="width: 100%">
<div class="login" style="float:left; width:25%;">
  <h1>Show Class Report</h1>
    <form  action="report" method="post">
        <input type="text" name="subname" placeholder="Enter Subject name" required="required" />
        <button type="submit" class="btn btn-primary btn-block btn-large">SHOW</button>
    </form>
</div>
<sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/lms" 
user="root" password="vishal@12345" var="conn"/>

<sql:query var="rs" dataSource="${conn }">
	select * from subject
</sql:query>
<div class="record" style="float:right; width:50%; margin-right: 100px; margin-top: 50px;">
<table>
<caption><h3 style="color: white">Subjects Avaliable</h3></caption>
	<tr>
		
		<th>Subject Name</th>
		
	</tr>
	<c:forEach var="subject" items="${rs.rows }" >
		<tr align="center">
			
			<td>${subject.sub_name }</td>
		</tr>
	</c:forEach>
</table>
</div>
</div>
<%
	}
	else
	{
		response.sendRedirect("index.jsp?error=1");		
	}
%>
</body>
</html>