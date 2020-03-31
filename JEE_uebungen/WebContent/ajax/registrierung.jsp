<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String benutzer = request.getParameter("benutzername");
		ArrayList<String> benutzerListe = new ArrayList<>();
		benutzerListe.add("Hans");
		benutzerListe.add("Nemanja");
		benutzerListe.add("Peter");
		benutzerListe.add("Jahi");
		
		int vorhanden = 0;
		
		for(int i = 0; i < benutzerListe.size(); i++){
			if(benutzerListe.contains(benutzer)){
				vorhanden = 1;
			}else{
				vorhanden = 0;
				
			}
		}
		
		if(vorhanden == 0){
			benutzerListe.add(benutzer);
			out.print("Erfolgreich eingeloggt!");
			
		}else{
			out.print("Dieser Name ist schon vergeben!");
		}
		
	%>
</body>
</html>