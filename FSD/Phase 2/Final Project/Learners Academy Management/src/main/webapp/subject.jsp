<%@page import="java.sql.*"%>
<%@ page import="java.util.*" %>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

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
	String name=(String) session.getAttribute("name");
	if(name!=null)
	{
%>
<ul>
 	<li><a href="student.jsp">Student</a></li>
 	<li><a href="teacher.jsp">Teachers</a></li>
 	<li><a class="active" href="subject.jsp">Subject</a></li>
 	<li><a href="classes.jsp">Classes</a></li>
 	<li><a href="logout.jsp">Logout</a></li>   
</ul>
<div style="width: 100%">
<div class="login" style="float:left; width:25%;">
  <h1 >Add Subject</h1>
    <form  action="sub_details" method="post">
      <input type="text" name="subname" placeholder="Enter Subject name" required="required" />
        <input type="text" name="stime" placeholder="Enter Batch Timing" required="required" />
      
        <button type="submit" class="btn btn-primary btn-block btn-large">ADD Subject</button>
    </form>
</div>
<sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/lms" 
user="root" password="vishal@12345" var="conn"/>

<sql:query var="rs" dataSource="${conn }">
	select * from subject
</sql:query>
<div class="record" style="float:right; width:50%; margin-right: 100px; margin-top: 50px;">
<table>
<caption><h1 style="color: white">Subject Details</h1></caption>
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Time</th>
		<th>Action</th>
	</tr>
	<c:forEach var="subject" items="${rs.rows }" >
		<tr>
			<td>${subject.sub_id }</td>
			<td>${subject.sub_name }</td>
			<td>${subject.sub_time }</td>
			<td><a href="deletesub?sub_id=${subject.sub_id }">Delete</a></td>
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