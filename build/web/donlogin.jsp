<%-- 
    Document   : donlogin.jsp
    Created on : 13 Jun, 2017, 12:58:29 PM
    Author     : LENOVO PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign In</title>
    </head>
    <body bgcolor="silver">
        <h1>Donor Login</h1>
        <h2>Sign In</h2>
        <form name="f1" action = "loginservlet" method = "POST"/>
                  <label>UserName:</label><input type = "text" name = "uname"id="firstname" class = "box"><br /><br />
                  <label>Password :</label><input type = "password" name = "pass" id="cpassword" class = "box" ><br/><br />
                  <input type = "Submit" value = " Submit ">
        </form>
    </body>
</html>
