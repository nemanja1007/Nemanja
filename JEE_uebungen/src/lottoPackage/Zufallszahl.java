package lottoPackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Zufallszahl {
	public static ArrayList<Integer> getZahlen(){
		Random r = new Random();
		r.setSeed((new Date()).getTime());
		ArrayList<Integer> liste = new ArrayList<Integer>();
		while(liste.size() < 6) {
			int zahl = r.nextInt(49) + 1;
			if(!liste.contains(zahl)) {
				liste.add(zahl);
			}
		}
		return liste;
	}
	
}
