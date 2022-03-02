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
 	<li><a class="active" href="teacher.jsp">Teachers</a></li>
 	<li><a href="subject.jsp">Subject</a></li>
 	<li><a href="classes.jsp">Classes</a></li>
 	<li><a href="logout.jsp">Logout</a></li>   
</ul>
<div style="width: 100%">
<div class="login" style="float:left; width:25%;">
  <h1>Add Teacher</h1>
    <form  action="teacherdetails" method="post">
      <input type="text" name="tname" placeholder="Enter Teacher name" required="required" />
        <input type="text" name="temail" placeholder="Enter Teacher Email" required="required" />
        <input type="text" name="tsubject" placeholder="Enter Subject" required="required" />
        <button type="submit" class="btn btn-primary btn-block btn-large">ADD Teacher</button>
    </form>
</div>
<sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/lms" 
user="root" password="vishal@12345" var="conn"/>
<sql:query var="rs" dataSource="${conn }">
	select * from teacher
</sql:query>
<div class="record" style="float:right; width:50%; margin-right: 110px; margin-top: 50px;">
<table>
<caption><h1 style="color: white">Teacher Details</h1></caption>
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Email</th>
		<th>Subject</th>
		<th>Action</th>
	</tr>
	<c:forEach var="teacher" items="${rs.rows }" >
		<tr>
			<td>${teacher.taecher_id }</td>
			<td>${teacher.teacher_name }</td>
			<td>${teacher.teacher_email }</td>
			<td>${teacher.teacher_subject }</td>
			<td><a href="deleteteacher?taecher_id=${teacher.taecher_id }">Delete</a></td>
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