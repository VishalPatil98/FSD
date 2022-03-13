<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>       
<html>
<head>
<title>Search</title>
<style>
table {
	float: left;
}

th {
	border-bottom: 1px solid black;
	text-align: center;
}
</style>
</head>
<body>
<div>
	<h2>Search for User</h2>
	<table style="align-self: center;">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Password</th>
		</tr>
		<tr>
			<td>${userSearch.id}</td>
			<td>${userSearch.name}</td>
			<td>${userSearch.email}</td>
			<td>${userSearch.password}</td>
		</tr>
	</table>
	<br>
	<br>
	<br>
	<br>
</div>	
	<form:form action="update" method="post" commandName="update">
		<h1>Update This User?</h1>
		<h3>
			<p>User ID: ${userSearch.id}</p>
			<input type="hidden" name="id" id="id" value="${userSearch.id}" required/>
			New Name :<input type="text" name="name" id="name" value="${userSearch.name}" required/>
			<br>
			<br>
			New Email:<input type="text" name="email" id="email" value="${userSearch.email}" required/>
			<br>
			<br>
			New Password:<input type="text" name="password" id="password" value="${userSearch.password}" required/><br/><br/>
			<br>
			<br>
			<input type="submit" value="Submit"/>
	</form:form>
	<br />
	<br />
	<a href="/">Return to Menu</a>
	</h3>
</body>
</html>
