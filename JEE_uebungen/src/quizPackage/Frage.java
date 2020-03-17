package quizPackage;

public class Frage {
	private String frage;
	private String[] antworten;
	private int richtig;
	

	
	public Frage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Frage(String frage, String[] antworten, int richtig) {
		super();
		this.frage = frage;
		this.antworten = antworten;
		this.richtig = richtig;
	}
	public String getFrage() {
		return frage;
	}
	public void setFrage(String frage) {
		this.frage = frage;
	}
	public String[] getAntworten() {
		return antworten;
	}
	public void setAntworten(String[] antworten) {
		this.antworten = antworten;
	}
	public int getRichtig() {
		return richtig;
	}
	public void setRichtig(int richtig) {
		this.richtig = richtig;
	}
	
	
	
	

}
