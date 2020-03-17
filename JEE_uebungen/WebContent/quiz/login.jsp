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
<title>Login</title>
</head>
<body>
	<h1>Login für Quiz</h1>
	<h2>Geben sie einen Gastnamen an</h2>
	<form action="startseite.jsp" method="get" accept-charset="utf-8">
		<label>Gastname: <input type="text" name="gast"></label><br>
		<input type ="submit" name="submit" value="senden"> 
	</form>
</body>
</html>