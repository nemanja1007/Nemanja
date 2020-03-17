package buchPackage;

import java.util.ArrayList;

public class Bibliothek {
	private String name;
	private ArrayList<Buch> buecher = new ArrayList<>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Buch> getBuecher() {
		return buecher;
	}
	public void setBuecher(ArrayList<Buch> buecher) {
		this.buecher = buecher;
	}

	
	
	
}
