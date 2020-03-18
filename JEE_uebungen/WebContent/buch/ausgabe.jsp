<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@page import="java.util.ArrayList"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Bibliothek</title>
</head>
<body style="padding: 20px;">
	<h1>Tabelle</h1>
	<!--  ${buchListe.size() } -->
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Titel</th>
				<th scope="col">Anzahl Seiten</th>
				<th scope="col">Kategorie</th>
				<th scope="col">Autorname</th>
				<th scope="col">Autorvorname</th>
				<th scope="col">Geburtsdatum</th>
			</tr>
		</thead>
		<tbody>

			<c:forEach var="buecher" items="${ buchListe }" >

			<tr>
				<td><c:out value="${ buecher.titel }" /></td>
				<td><c:out value="${ buecher.seiten }" /></td>
				<td><c:out value="${ buecher.kategorie }" /></td>
				<td><c:out value="${ buecher.author.name }" /></td>
				<td><c:out value="${ buecher.author.vorname }" /></td>
				<td><c:out value="${ buecher.author.geburtsdatum }" /></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<a class="btn btn-primary" href="index.jsp" role="button">Neuen Eintrag hinzuf�gen</a>
	<a class="btn btn-primary" href="index.jsp" role="button">Eintrag l�schen</a> <!-- href �ndern -->
	<a class="btn btn-primary" href="index.jsp" role="button">Eintrag editieren</a> <!-- href �ndern -->
	
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


