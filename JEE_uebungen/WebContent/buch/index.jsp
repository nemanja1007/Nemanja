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
<title>Bibliothek</title>
</head>
<body>
	<h1>Wilkommen in der Bibliothek</h1>
	<form action="BuchServlet" accept-charset="utf-8">
		<label>Titel des Buchs: <input type="text" name="titel"
			required></label><br> <label>Anzahl Buchseiten: <input
			type="number" name="seiten" required></label><br> <label>Buchkategorie:
			<input type="text" name="kategorie" required>
		</label><br>
		<fieldset>
			<legend>Author</legend>
			<select name="author" required>
				<option>Bitte auswählen</option>
				<option>Nemanja Petrovic</option>
				<option>Michael Jackson</option>
				<option>Lionel Messi</option>
				<option>Conor McGregor</option>
				<option>Gian Niemann</option>
			</select>
		</fieldset>
		<br> <input type="submit" name="submit" value="senden">
	</form>



	</form>
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
		integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
		integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
		crossorigin="anonymous"></script>
</body>
</html>