<%-- 
    Document   : donsignup.jsp
    Created on : 13 Jun, 2017, 12:59:00 PM
    Author     : LENOVO PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up</title>
    </head>
    <body bgcolor="silver">
        <h1>Donor Login</h1>
        <h2>Sign UP</h2>
        <form name="f1" action = "donservelet" method = "POST">
                  <label>Name:</label><input type = "text" name = "name"id="name" class = "box"><br /><br />
                  <label>Blood group</label><input type = "text" name = "bgroup"id="bgroup" class = "box" ><br/><br />
                  <label>Contact</label><input type = "text" name = "contact"id="contact" class = "box"><br /><br />
                 <label>UserName:</label><input type = "text" name = "firstname"id="username" class = "box"><br /><br />
                  <label>Password :</label><input type = "password" name = "password" id="password" class = "box" ><br/><br />
                  <label>Confirm password :</label><input type = "password" name = "cpassword" id="cpassword" class = "box" ><br/><br />
                  <input type = "Submit" value = " Submit ">
        </form>
    </body>
</html>

