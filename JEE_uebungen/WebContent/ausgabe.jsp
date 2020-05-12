<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Ausgabe</title>
</head>
<body style="padding: 20px;">
<% String filepath = "img/BILD.ENDUNG"; //Bild anpassen
request.setAttribute("filepath", filepath);

%>
	<h1>Tabelle</h1>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Produktname</th>
				<th scope="col">Besitzer</th>
				<th scope="col">Beschreibung</th>
				<th scope="col">Bild</th>
			</tr>
		</thead>
		<tbody>

			<c:forEach var="product" items="${ items }">
				<tr>
					<td><c:out value="${ product.name }" /></td>
					<td><c:out value="${ product.owner }" /></td>
					<td><c:out value="${ product.description }" /></td>
					<td> <img src="${ filepath }" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>