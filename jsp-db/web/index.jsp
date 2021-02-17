

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
<!--        <link type="text/css" href="style.css" />-->
    </head>
    <body style="background-color: yellow">
        <div style="text-align: center;">
        <h1 style="color: green">Insert Data Form</h1>
        
        <form method="post" action="process.jsp" >
                   First name:<br>
                   <input type="text" name="first_name">
                   <br>
                   Last name:<br>
                   <input type="text" name="last_name">
                   <br>
                   City name:<br>
                   <input type="text" name="city_name">
                   <br>
                   Email Id:<br>
                   <input type="email" name="email">
                   <br><br>
                   <input type="submit" value="submit">
         </form>
        </div>
    </body>
</html>
