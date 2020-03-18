<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EL Test</title>
</head>
<body>
	<div class="alert alert-primary" role="alert">
		<h1>${ Datum }</h1>
	</div>

	<div class="alert alert-info" role="alert">
		<h1>${ sessionScope["Datum"] }</h1>
	</div>

	<div class="alert alert-danger" role="alert">
		<h1>${ applicationScope["Datum"]}</h1>
	</div>

</body>
</html>