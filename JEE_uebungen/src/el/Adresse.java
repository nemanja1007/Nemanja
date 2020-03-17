package el;

public class Adresse {
	private String strasse;
	private String ort;

	public Adresse(String strasse, String ort) {
		super();
		this.strasse = strasse;
		this.ort = ort;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	@Override
	public String toString() {
		return this.strasse + " " + this.ort;
	}
	
}
