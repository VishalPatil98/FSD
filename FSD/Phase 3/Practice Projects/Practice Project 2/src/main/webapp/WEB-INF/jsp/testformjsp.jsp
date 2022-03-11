<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<html>
<head>
<meta charset="ISO-8859-1">
<title>feedback App</title>
</head>
<body>
<center>
<h1>Enter Your Feedback</h1>
<h3 style="color: red;">
<form action="/test_form" method="post" commandName="testUser">
Username:  <input type="text" id="user" name="user" placeholder="Enter Your Name">
<br>
<br>
Comment:  <input type="text" id="comments" name="comments" placeholder="Enter Your Comment">
<br>
<br>
Rating:  <input type="text" id="rating" name="rating" placeholder="Enter  betwwen (1-10)"> 
<br>
<br>
<input type="submit" value="Submit">
</form> 
</h3>
</center>
</body>
</html>