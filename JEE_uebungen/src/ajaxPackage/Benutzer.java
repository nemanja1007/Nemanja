package ajaxPackage;

public class Benutzer {
	private String benutzername;
	private String passwort;
	
	public Benutzer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Benutzer(String benutzername, String passwort) {
		super();
		this.benutzername = benutzername;
		this.passwort = passwort;
	}
	
	public String getBenutzername() {
		return benutzername;
	}
	public void setBenutzername(String benutzername) {
		this.benutzername = benutzername;
	}
	public String getPasswort() {
		return passwort;
	}
	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}
	
	
}
