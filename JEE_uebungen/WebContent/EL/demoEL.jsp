<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo</title>
</head>
<body>
	<h1> ${ 1 + 1 } </h1><br>
	<%= request.getParameter("name") %>
	<h1> ${ param["name"] }</h1>
	<h1> ${ EineZahl }</h1>
	<h1> ${ EinString }</h1>
	<h1> ${ Counter }</h1>
	<h1> ${ sessionScope["EineZahl"] }</h1>
	<h1> ${ Person.getName() }</h1>
	<h1> ${ Person.name } ${ Person.vorname }</h1>
	<h1> ${ Person.adresse.strasse }</h1>
	<h1> ${ Person }</h1>
	<%for(int i = 0; i < 2; i++){
		request.setAttribute("i", i);%>
	<h1> ${ Personen[i].vorname }</h1>
	<h1> ${ Personen[i] }</h1>
	<% } %>
</body>
</html>