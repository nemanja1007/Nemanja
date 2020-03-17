<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="quizPackage.Frage"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Quiz</title>
</head>
<body>
	<h1>
		Frage
		<%= session.getAttribute("CountFrage")%>:
	</h1>
	<h2><%= ((Frage) session.getAttribute("Frage")).getFrage()%><br>
	</h2>

	<form action="frage.html" method="post" accept-charset="utf-8">

		<%= ((Frage) session.getAttribute("Frage")).getAntworten()[0]%><br>
		<%= ((Frage) session.getAttribute("Frage")).getAntworten()[1]%><br>
		<input type="hidden" name="nextFrage"
			value="<%= (Integer) session.getAttribute("CountFrage") + 1 %>">
		<button type="submit">Weiter</button>
	</form>
</body>
</html>