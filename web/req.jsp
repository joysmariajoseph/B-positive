<%-- 
    Document   : req.jsp
    Created on : 13 Jun, 2017, 5:43:55 PM
    Author     : LENOVO PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <form name="f1" action = "reqservelet" method = "POST"/>
                  <label>Group:</label><input type = "text" name = "bgrp"id="bloodgrp" class = "box"><br /><br />
                  <label>qty :</label><input type = "text" name = "qty" id="quantity" class = "box" ><br/><br />
                   <label>hospital:</label><input type = "text" name = "hospital" id="h" class = "box" ><br/><br /> 
                  <input type = "Submit" value = " Submit ">
        </form>
    </body>
</html>
