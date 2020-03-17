package buchPackage;

import java.util.ArrayList;

public class Bibliothek {
private String name;
private ArrayList <Buch> buchList = new ArrayList<Buch>();
private static Bibliothek bibliothek =null;


public static Bibliothek getBibliothek() {
    return bibliothek;
}
public static void setBibliothek(Bibliothek bibliothek) {
		Bibliothek.bibliothek = bibliothek;
		bibliothek = new Bibliothek();
}
public ArrayList<Buch> getBuchList() {
    return buchList;
}
public void setBuchList(ArrayList<Buch> buchList) {
    this.buchList = buchList;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}


}