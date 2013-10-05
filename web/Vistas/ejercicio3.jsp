<%-- 
    Document   : ejercicio3
    Created on : 05-10-2013, 11:25:59 AM
    Author     : Rodrigo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio3</title>
    </head>
    <body>
        <h1>Ejercicio N° 3 (10 Ptos)</h1><hr/><br/>
        <a href="../index.jsp"><---  Regresar al Menú</a>
        <p/><center><form action="../Servlet_dato?id=3" method="POST">
                Ingrese el Primer Número:<input type="text" name="num1" required/><br/>
                Ingrese el Segundo Número:<input type="text" name="num2" required/><br/>
                <input type="submit" value="Verificar" />
            </form>
    </center>
    </body>
</html>
