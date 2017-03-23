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
        
        <%-- MAPA --%>
        
        <style type="text/css">
        html, body{ height: 100%; margin: 0; padding: 0;}
        #map {height: 100%; margin-left: 25%; margin-right: 25%; margin-top: 2%; margin-bottom: 2% }
        </style>
        
    </head>
    
    <body bgcolor=#CEF6F5 align="center">
        
        <br>
        
        <h1>Iniciar Sesión</h1>
        
        <form method="POST" action="/Clase1/persona">
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
        
        <br>
        
        <%-- MAPA --%>
        <div id = "map"></div>
        
        <script type="text/javascript">
            var map;
            function initMap(){
                map = new google.maps.Map(document.getElementById('map'), {
                    center: {lat: 35.141432, lng: -90.052629},
                    zoom: 21,
                    mapTypeId: google.maps.MapTypeId.SATELLITE
                });
                
                var marker = new google.maps.Marker({
                    position: {lat: 35.141432, lng: -90.052629},
                    map: map,
                    //title: 'Marcador 1'
                });
                
                var info = 'come down and play';
                
                var infowindow =  new google.maps.InfoWindow({
                    content: info
                });
                
                infowindow.open(map, marker);
                
                <%--  
                marker.addListener('click', function(){
                    infowindow.open(map, marker);
                });
                --%>
            }
        </script>
        
        <script type="text/javascript"
                src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDvfkQSaSfeL20ShaYbhIFZd9n63xAxqSg&sensor=false&callback=initMap">
        </script>
        
    </body>
</html>