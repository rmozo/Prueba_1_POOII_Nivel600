<%-- 
    Document   : ejercicio2
    Created on : 05-10-2013, 02:06:42 AM
    Author     : Rodrigo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio2</title>
    </head>
    <body>
        <h1>Ejercicio N° 2 (8 Ptos)</h1><hr/><br/>
        <a href="../index.jsp"><---  Regresar al Menú</a>
        <p/><center><form action="../Servlet_dato?id=2" method="POST">
                Ingrese el monto de su compra: $<input type="text" name="v1" value="Solo numeros" required/><br/>
                </br>
                <input type="submit" value="Busque su descuento!!" />
            </form>
    </center>
    </body>
</html>
