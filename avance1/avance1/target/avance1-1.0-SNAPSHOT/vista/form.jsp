<%-- 
    Document   : registrar
    Created on : 29-04-2016, 0:02:21
    Author     : Null
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>Registro de Proyecto</title>
        <link href="StyleRegistrar.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>Bienvenido al registro de Proyectos!</h1>
        
        <form action="AltaServlet.do" method="POST">
            <p>
                <input type="text" name="txttitulo" placeholder="Título" />
            </p>
            <p>
                <input type="text" name="txtdes" placeholder="Descripción" />
            </p>
            <p>
                <input type="date" name="textFini" />
                Fecha Inicio
            </p>
            <p>
                <input type="date" name="txtFfin" />
                Fecha Fin
            </p>
            <p>
                <input type="text" name="txtpre" placeholder="Presupuesto" />
            </p>
            <p>
                <input type="text" name="txtInv" placeholder="Investigador" />
            </p>
            <input type="submit" value="Guardar" name="btguardar" />
            <a href="index.jsp"> Inicio</a>
        </form>
    </body>
</html>

