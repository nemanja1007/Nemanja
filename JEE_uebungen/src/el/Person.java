package el;

public class Person {
	private String name;
	private String vorname;
	private Adresse adresse;

	public Person(String name, String vorname, Adresse adresse) {
		super();
		this.name = name;
		this.vorname = vorname;
		this.adresse = adresse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	@Override
	public String toString() {
		return this.name + " " + this.vorname + " " + this.adresse;
	}

}
