<%-- 
    Document   : index
    Created on : 17-09-2023, 22:05:48
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora de interes simple</title>
    </head>
    <body>
        <h1> Calculadora de interes simple </h1>
        <br>
        <form action="Servletindex" method="POST">
        <!-- Solicitamos el valor correspondiente al CAPITAL -->
            <label for="capital"> Capital inicial: </label>
            <br>
            <input type="number" name="capital" required>
        <br>
        <!-- Solicitamos el valor correspondiente al INTERES -->
            <label for="interes"> Tasa de interes anual (%): </label>
            <br>
            <input type="number" name="interes" required>
        <br>
        <!-- Solicitamos el valor correspondiente al TIEMPO -->
            <label for="tiempo"> Tiempo (años): </label>
            <br>
            <input type="number" name="tiempo" required>
        <br>
            <button type="submit"> CALCULAR </button>
        </form>
            <h4> *Presione CALCULAR para obtener el resultado* </h4>
    </body>
</html>
