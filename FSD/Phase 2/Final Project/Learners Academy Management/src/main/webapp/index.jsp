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
	String error=request.getParameter("error");
	if(error!=null)
	{
		out.print(" <b style='color: white'; >Login First</b>");
	}
%>
<h1 align="center" style="color: yellow;">WELCOME TO LEARNER'S ACADEMY</h1>
<div class="login">

  <h1>Login</h1>
    <form  action="Login.jsp" method="post">
      <input type="text" name="username" placeholder="Username" required="required" />
        <input type="password" name="password" placeholder="Password" required="required" />
        <button type="submit" class="btn btn-primary btn-block btn-large">Let me in</button>
    </form>
</div>

</body>
</html>