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
	String error=request.getParameter("error");
	if(error!=null)
	{
		out.print("Login First");
	}

%>
<form  action="login.jsp" method="post">
      <input type="text" name="username" placeholder="Username" required="required" />
        <input type="password" name="password" placeholder="Password" required="required" />
        <button type="submit">Let me in.</button>
    </form>


<a href="dashboard.jsp">Direct</a>
</body>
</html>