<%@page import="ajaxPackage.Benutzer" %>
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

	if (vorhanden == 1 && passwort.equals(//TODO Passwort von User)) {
		benutzerListe.add(benutzer);
%>
<div class="alert alert-success" role="alert">
	Erfolgreich angemeldet! <a href="anmelden.html" class="alert-link">Zur
		Anmeldung</a>
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
