<%-- 
    Document   : ejercicio1
    Created on : 04-10-2013, 09:55:12 PM
    Author     : Reformador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio1</title>
    </head>
    <body>
        <h1>Ejercicio N° 1 (8 Ptos)</h1><hr/><br/>
        <a href="../index.jsp"><---  Regresar al Menú</a>
        <p/><center><form action="../Servlet_dato?id=1" method="POST">
                Edad:<input type="text" name="edad" value="Solo numeros" required/><br/>
                Sexo:<select name="sexo">
                    <option value="Femenino">Femenino</option>
                    <option value="Masculino">Masculino</option>
                </select>
                </br>
                <input type="submit" value="Calcular" />
            </form>
    </center>
    </body>
</html>
