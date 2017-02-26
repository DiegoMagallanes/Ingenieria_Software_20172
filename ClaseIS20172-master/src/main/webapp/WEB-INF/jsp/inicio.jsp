<%-- 
    Document   : inicio
    Created on : 25/02/2017, 15:48:21 PM
    Author     : diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
    </head>
    
    <body bgcolor=#CEF6F5 align="center">
        
        <br><br><br><br><br>
        
        <h1>Iniciar Sesión</h1>
        
        <form method="POST" action="/Clase1/verInfo">
            <input id="email" name="email" type="text" placeholder="Correo electronico">
            <br><br>
            <input id="pwd" name="pwd" type="password" placeholder="Contraseña">
            <br><br>
            <button>Aceptar</button>
        </form>
        <br>
        <form method="submit" action="/Clase1/registrar">
            <button>Registrate</button>
        </form>
    </body>
</html>
