<%-- 
    Document   : index
    Created on : 02-nov-2016, 9:06:03
    Author     : alumno
--%>

<%@page import="entidades.Producto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<jsp:useBean id="producto" scope="session" class="entidades.Producto" />
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="POST" action="CarritoServlet">

            <select name="productos" multiple="multiple">
                <%
                    ArrayList<Producto> lista = (ArrayList) session.getAttribute("lista");
               
                    for (Producto p : lista) {
                        
                         String nombre = p.getNombre();
                %>
                <option><%=p.getNombre()%></option>
                <%
                    }%>

            </select>
            <br><div class="compra">
                <p>Total de compra:</p><br>
            </div>
            <button type="submit" value="Enviar">Comprar</button>
        </form>

    </body>
</html>