<%-- 
    Document   : docsignup.jsp
    Created on : 13 Jun, 2017, 12:37:21 PM
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
        <h1>Doctor Login</h1>
        <h2>Sign UP</h2>
        <form name="f1" action = "docservelet" method = "POST">
                  <label>Name:</label><input type = "text" name = "name"id="name" class = "box"><br /><br />
                  <label>Id</label><input type = "text" name = "id"id="id" class = "box" ><br/><br />
                  <label>Specialization</label><input type = "text" name = "spec"id="spl" class = "box"><br /><br />
                 <label>UserName:</label><input type = "text" name = "username"id="username" class = "box"><br /><br />
                  <label>Password :</label><input type = "password" name = "password" id="password" class = "box" ><br/><br />
                  <label>Confirm password :</label><input type = "password" name = "cpassword" id="cpassword" class = "box" ><br/><br />
                  <input type = "Submit" value = " Submit ">
        </form>
    </body>
</html>
