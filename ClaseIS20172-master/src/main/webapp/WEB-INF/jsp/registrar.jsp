<%-- 
    Document   : registrar
    Created on : 25/02/2017, 09:43:38 PM
    Author     : diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    </head>
    <body bgcolor=#E2A9F3 align="center">
        
        <br><br><br>
        
        <h1>Registro</h1>
        
        <form method="POST" action="/Clase1/datosRegistro">
            <input id="name" name="name" type="text" placeholder="Tu Nombre">
                <br><br>
            <input id="carreer" name="carreer" type="text" placeholder="¿Qué estudias?">
                <br><br>
            <h3>Fecha de nacimiento</h3>
            <select name="days">
                <option value="1" selected>1</option> <option value="2">2</option>
                <option value="3">3</option> <option value="4">4</option>
                <option value="5">5</option> <option value="6">6</option>
                <option value="7">7</option> <option value="8">8</option>
                <option value="9">9</option> <option value="10">10</option>
                <option value="11">11</option> <option value="12">12</option>
                <option value="13">13</option> <option value="14">14</option>
                <option value="15">15</option> <option value="16">16</option>
                <option value="17">17</option> <option value="18">1</option>
                <option value="19">19</option> <option value="20">20</option>
                <option value="21">21</option> <option value="22">22</option>
                <option value="23">23</option> <option value="24">24</option>
                <option value="25">25</option> <option value="26">26</option>
                <option value="27">27</option> <option value="28">28</option>
                <option value="29">29</option> <option value="30">30</option>
                <option value="31">31</option>
            </select>
            &nbsp;
            <select name="months">
                <option value="Enero" selected>Enero</option>
                <option value="Febrero">Febrero</option>
                <option value="Marzo">Marzo</option>
                <option value="Abril">Abril</option>
                <option value="Mayo">Mayo</option>
                <option value="Junio">Junio</option>
                <option value="Julio">Julio</option>
                <option value="Agosto">Agosto</option>
                <option value="Septiembre">Septiembre</option>
                <option value="Octubre">Octubre</option>
                <option value="Noviembre">Noviembre</option>
                <option value="Dieciembre">Diciembre</option>
            </select>
            &nbsp;
            <select name="years">
                <option value="1987" selected>1987</option> <option value="1988">1988</option>
                <option value="1989">1989</option> <option value="1990">1990</option>
                <option value="1991">1991</option> <option value="1992">1992</option>
                <option value="1993">1993</option> <option value="1994">1994</option>
                <option value="1995">1995</option> <option value="1996">1996</option>
                <option value="1997">1997</option> <option value="1998">1998</option>
                <option value="1999">1999</option> <option value="2000">2000</option>
                <option value="2001">2001</option> <option value="2002">2002</option>
                <option value="2003">2003</option> <option value="2004">2004</option>
                <option value="2005">2005</option> <option value="2006">2006</option>
                <option value="2007">2007</option> <option value="2008">2008</option>
                <option value="2009">2009</option> <option value="2010">2010</option>
                <option value="2011">2011</option> <option value="2012">2012</option>
                <option value="2013">2013</option> <option value="2014">2014</option>
                <option value="2015">2015</option> <option value="2016">2016</option>
                <option value="2017">2017</option>
            </select>
                <br><br>
            <input id="email" name="email" type="text" placeholder="Correo electronico">
                <br><br>
            <input id="password" name="password" type="password" placeholder="Contraseña">
                <br><br>
            <button>Registrar</button>
        </form>
    </body>
</html>
