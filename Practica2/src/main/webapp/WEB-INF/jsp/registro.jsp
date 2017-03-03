<%-- 
    Document   : registro
    Created on : 25/02/2017, 10:20:38 PM
    Author     : diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Se ha registrado a:</h1>
        
        <h1>
            <br><br>
            ${name}
            <br><br>
            ${carreer}
            <br><br>
            <h2>Fecha de nacimiento:</h2>
            ${days}
            ${months}
            ${years}
            <br><br>
            ${email}
            <br><br>
            ${password}
        </h1>
    </body>
</html>