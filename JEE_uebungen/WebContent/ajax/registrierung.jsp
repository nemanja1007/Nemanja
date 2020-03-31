<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Registrierung</title>
</head>
<body style="padding: 5px;">
<h1>Registrieren</h1>
<form action="reg_pruefen.jsp">
<label>Benutzername: <input type ="text" name="benutzer" required></label>
<br>
<label>Passwort: <input type ="password" name="passwort" required></label>
<br>
<label>Passwort wiederholen: <input type ="password" name="wiederholung" required></label>
<br>
<button class="btn btn-primary" type="submit">Registrieren</button>

</form>
</body>
</html>