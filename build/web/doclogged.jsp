<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>DOCTOR LOGIN</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body bgcolor="grey">
        <form name="r" action="requestservelet" method="POST">
       <table border="1">
            <thead> <h2>  REQUIREMENTS</h2>
                 
                <tr>
                    
                    <th>BLOOD GROUP</th>
                    <th>HOSPITAL</th>
                    <th>PATIENT NAME</th>
                </tr>
            </thead>
            <%
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/blood", "root", "admin");
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select * from data");
                while(rs.next())
                {
                %>
            <tbody>
                <tr>
                    <td><%=rs.getString("bgrp")%></td>
                    <td><%=rs.getString("qty")%></td>
                    <td><%=rs.getString("hospital")%></td>
                  
                </tr>
                <%
}
                %>
                
            </tbody>
       </table> <br> <br>
        <table border="1">
            <thead> <h2> DONOR DETAILS </h2>
                <tr>
                    
                    <th>NAME</th>
                    <th>BLOOD GROUP</th>
                    <th>CONTACT</th>
                </tr>
            </thead>
            <tbody>
              
                
                    <%
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/blood", "root", "admin");
                Statement stt=conn.createStatement();
                ResultSet rss=stt.executeQuery("select * from donor");
                int i=0;
                while(rss.next())
                { 
                %>
            <tbody>
                <tr>
                    <td><input type="checkbox" name="t" value="ON" id="i"/><%=rss.getString("name")%></td>
                    <td><%=rss.getString("bgrp")%></td>
                    <td><%=rss.getString("contact")%></td>
                
                </tr>
                
                
                <%
                  i= i++;
}
                %>
                           
              
            </tbody>
        </table>

             <input type="submit" value="REQUEST" name="REQUEST" />
      </form>
    </body>
</html>
