<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>

	<%
		String benutzer = request.getParameter("benutzer");
		String passwort = request.getParameter("passwort");
		String wiederholung = request.getParameter("wiederholung");
		
		ArrayList<String> benutzerListe = 
		(ArrayList<String>)request.getServletContext().getAttribute("benutzerListe");
		if(benutzerListe == null){
			benutzerListe = new ArrayList<>();
			benutzerListe.add("Hans");
			benutzerListe.add("Nemanja");
			benutzerListe.add("Peter");
			benutzerListe.add("Jahi");
			request.getServletContext().setAttribute("benutzerListe", benutzerListe);

		}
		int vorhanden = 0;
		
		for(int i = 0; i < benutzerListe.size(); i++){
			if(benutzerListe.get(i).equals(benutzer)){
				vorhanden += 1;
			}
		}
		
		if(vorhanden == 0 && passwort.equals(wiederholung)){
			benutzerListe.add(benutzer);
			out.print("Erfolgreich registriert!");
			
		}else if(!passwort.equals(wiederholung)){
			out.print("Passw�rter stimmen nicht �berein!");
		}
			else{
			out.print("Dieser Name ist schon vergeben!");
		}
	%>