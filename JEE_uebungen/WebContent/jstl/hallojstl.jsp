<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Link für Core Tags -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Test</title>
</head>
<body style="padding: 20px;">
	<%
		int[] zahlen = new int[] { 15, 4, 69, 79 };
		request.setAttribute("zahlen", zahlen);
		ArrayList<String> list = new ArrayList<>();
		list.add("hallo");
		list.add("welt");
		list.add("!");
		request.setAttribute("list", list);
	%>
	<c:set var="zahl" value="${ 1 + 4}" scope="session" />
	<c:set var="benutzer" value="${ param['benutzer'] }" scope="session" />
	<div class="alert alert-primary" role="alert">
		<c:out value="${ zahl }" />
	</div>
	<c:if test="${ not empty benutzer }">
		<div class="alert alert-warning" role="alert">
			<c:out value="${ benutzer }" />
		</div>
	</c:if>
	<div class="alert alert-danger" role="alert">
		<c:out value="${'Hallo Welt'}" />
	</div>
	<c:forEach var="i" begin="0" end="${ 3 }" step="1">
		<c:out value="${ zahlen[i] }" />
		<br>

	</c:forEach>
	<br>
	<c:forEach var="item" items="${ list }">
		<c:out value="${ item }" />
		<br>
	</c:forEach>
	
	<br>
	
	<c:forEach var="i" begin="0" end="${list.size() - 1}">
		<c:out value="${ list[i] }" />
		<br>
	</c:forEach>
	<a href="anmelden.jsp" class="badge badge-primary">Logout</a>

</body>
</html>