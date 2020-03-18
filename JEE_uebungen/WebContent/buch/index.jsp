<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bibliothek</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
</head>
<body style="padding: 20px;">
	<h1>Buch erfassen</h1>
	<form action="BuchServlet">
		<div class="form-group">
			<fieldset>
				<legend>Buch</legend>
				<label>Titel<input type="text" name="titel"></label> <label>Seiten<input
					type="number" name="seiten"></label> <label>Kategorie<input
					type="select" name="kategorie"></label>
			</fieldset>
			<br>
			<fieldset>
				<legend>Autor</legend>
				<label>Name<input type="text" name="Name"></label> <label>Vorname<input
					type="text" name="Vorname"></label> <label>Geburtsdatum<input
					type="date" name="GebDatum"></label>
			</fieldset>
			<input class="btn btn-primary" type="submit" name="Senden"
				value="submit">
		</div>
	</form>
</body>
</html>