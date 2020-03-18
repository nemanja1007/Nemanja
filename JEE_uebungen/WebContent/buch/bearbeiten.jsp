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
<title>Bearbeitung</title>
</head>
<body style="padding: 20px;">
	<h1>Bearbeitung</h1>
	<form action="speichern.html?isbn${ buecher.isbn }" method="get">
		<label for="buchisbn">IBSN-Nummer</label>
		<input class="form-control"	id="buchisbn" type="text" name="neueISBN">
		<br> 
		<label for="titelid">Titel</label>
		 <input class="form-control" id="titelid" type=text name="titel">
		 <br>
		 <label for="seitenid">Seiten</label>
		 <input class="form-control" id="seitenid" type=text name="seiten">
		 <br>
		 <label for="titelid">Kategorie</label>
		 <input class="form-control" id="kategorieid" type=text name="kategorie">
		 <br>
	</form>
</body>
</html>