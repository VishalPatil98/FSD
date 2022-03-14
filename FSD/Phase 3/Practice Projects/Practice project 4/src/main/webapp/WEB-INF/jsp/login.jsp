<!DOCTYPE html>
<html >
    <head>
        <title>Login</title>
    </head>
    <body>
    <center>
        <div style="color: red; font: bold;" th:if="${param.error}">
            Invalid username or password.
        </div>
        <div style="color: red; font: bold;" th:if="${param.logout}">
            You have been logged out.
        </div>
        <h3>
        <form th:action="@{/login}" method="post">
           User Name : <input type="text" name="username" placeholder="Enter username"/> </label>
           <br>
           <br>
           Password: <input type="password" name="password" placeholder="Enter password"/> </label>
           <br>
           <br>
           <input type="submit" value="Sign In"/>
           <br>
           <br>
        </form>
        <a href="/">Back to Homepage</a>
        </h3>
        </center>
    </body>
</html>