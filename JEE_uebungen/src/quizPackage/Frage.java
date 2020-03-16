package quizPackage;

public class Frage {
	private String frage;
	private String antwort;
	private int id;

	
	
	public Frage(String frage, String antwort, int id) {
		super();
		this.frage = frage;
		this.antwort = antwort;
		this.id = id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public String getFrage() {
		return frage;
	}

	public void setFrage(String frage) {
		this.frage = frage;
	}

	public String getAntwort() {
		return antwort;
	}

	public void setAntwort(String antwort) {
		this.antwort = antwort;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
