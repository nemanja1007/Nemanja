<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<style>
body{
padding: 5px;
}
</style>

<%
	String benutzer = request.getParameter("benutzer");
	String passwort = request.getParameter("passwort");
	String wiederholung = request.getParameter("wiederholung");

	ArrayList<String> benutzerListe = (ArrayList<String>) request.getServletContext()
			.getAttribute("benutzerListe");
	if (benutzerListe == null) {
		benutzerListe = new ArrayList<>();
		benutzerListe.add("Hans");
		benutzerListe.add("Nemanja");
		benutzerListe.add("Peter");
		benutzerListe.add("Jahi");
		request.getServletContext().setAttribute("benutzerListe", benutzerListe);

	}
	int vorhanden = 0;

	for (int i = 0; i < benutzerListe.size(); i++) {
		if (benutzerListe.get(i).equals(benutzer)) {
			vorhanden += 1;
		}
	}

	if (vorhanden == 0 && passwort.equals(wiederholung)) {
		benutzerListe.add(benutzer);
%>
<div class="alert alert-success" role="alert">
	Erfolgreich registriert! <a href="anmelden.html" class="alert-link">Zur
		Anmeldung</a>
</div>
<%
	} else if (!passwort.equals(wiederholung)) {
%><div class="alert alert-danger" role="alert">
	Passwörter stimmen nicht überein! <a href="registrierung.jsp"
		class="alert-link">Zurück zur Registrierung</a>
</div>
<%
	} else {
%>
<div class="alert alert-danger" role="alert">
	Dieser Name ist schon vergeben! <a href="registrierung.jsp"
		class="alert-link">Zurück zur Registrierung</a>
</div>
<%
	}
%>
