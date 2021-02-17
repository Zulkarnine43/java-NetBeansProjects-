

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         

<%
String first_name=request.getParameter("first_name");
String last_name=request.getParameter("last_name");
String city_name=request.getParameter("city_name");
String email=request.getParameter("email");

try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspdb", "root", "");
Statement st=conn.createStatement();

int i=st.executeUpdate("insert into users(first_name,last_name,city_name,email)values('"+first_name+"','"+last_name+"','"+city_name+"','"+email+"')");
out.println("Data is successfully inserted!");
//out.print("<a href="retrieve.jsp">show details</a>");
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>
<br>
<a href="index.jsp">Insert More</a>
<br>
<a href="retrieve.jsp">show details</a>
    </body>
</html>
