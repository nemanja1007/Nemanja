package lottoPackage;

public class Zufallszahl {
	private int zahl;

	public int getZahl() {
		zahl = (int)Math.random() * 48 + 1;
		return zahl;
	}

	public void setZahl(int zahl) {
		this.zahl = zahl;
	}
	
}
