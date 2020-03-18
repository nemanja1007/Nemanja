<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Anmelden</title>
</head>
<body>
	${ session.invalidate() }
	<h1>Formular</h1>
	<form action="hallojstl.jsp" method="post">
		<label>Benutzer: <input type="text" name="benutzer"></label>
		<button type="submit" class="btn btn-primary">Absenden</button>
	</form>
</body>
</html>