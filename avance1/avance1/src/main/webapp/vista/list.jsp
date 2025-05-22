<%-- 
    Document   : mostrado
    Created on : 29-04-2016, 0:03:25
    Author     : Null
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelo.usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>Lista</title>
        <link rel="stylesheet" href="estiloLista.css">
    </head>
    <body text="#00FF99">
    <h1> Los Proyectos registrados son: </h1>
        
        
        <%
            
            
            ArrayList<usuario> ListaU = (ArrayList<usuario>) request.getAttribute("listaProyectos");
            if (ListaU == null) {
            ListaU = new ArrayList<>();
                }

        %>
   
                     <table border="1">
            <tr>
                <td>Titulo</td>
                <td>Descripcion</td>
                <td>Fecha Inicio</td>
                <td>Fecha Fin </td>
                <td>Presupuesto</td>
                <td>Investigador</td>
            </tr>
            <%
                for(int i=0; i<ListaU.size(); i++)
                {
                    out.println("<tr>");
                        out.println("<td>" + ListaU.get(i).getTitulo()+ "</td>");
                        out.println("<td>" + ListaU.get(i).getDescripcion()+ "</td>");
                        out.println("<td>" + ListaU.get(i).getFinicio()+ "</td>");
                        out.println("<td>" + ListaU.get(i).getFfin()+ "</td>");
                        out.println("<td>" + ListaU.get(i).getPresupuesto()+ "</td>");
                        out.println("<td>" + ListaU.get(i).getInvestigador()+ "</td>");
                    out.println("</tr>");
                }
            %>
        </table>
             <a href="index.jsp"> Nuevo Registro</a>        
</body>


</html>

