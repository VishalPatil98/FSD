<!DOCTYPE html>
<html>
    <head>
        <title>Welcome!</title>
    </head>
    <body>
    <center>
        <h1 style="color: green;">Hello [[${#httpServletRequest.remoteUser}]]!</h1>
        <form th:action="@{/logout}" method="post">
            <input type="submit" value="Sign Out" style="color: blue;"/>
        </form>
        </center>
    </body>
</html>