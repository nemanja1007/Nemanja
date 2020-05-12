package db.model;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

import db.dao.BuchDAO;


public class TestBuch {
    BuchDAO dao = new BuchDAO();
    public static void main(String[] args) {
    	TestBuch test = new TestBuch();
        Scanner s = new Scanner(System.in);
        int i = 0;
        System.out.println("Buch");
        System.out.println("Was wollen Sie machen? | select=1 | insert =2 | delete=3 | update=4 |");
        i = s.nextInt();

        if(i == 1) {
        test.testSelect();
        }else if (i == 2) {
        test.testInsert();
        }else if (i == 3) {
        test.testDelete();
        }else if (i == 4) {
        test.testUpdate();
        }
    }

    public void testInsert()
    {
        List<Autor> liste = new ArrayList<>();
        liste.add(new Autor("Nemanja", "Petrovic"));
        liste.add(new Autor("Nikola", "Gajevic"));
        liste.add(new Autor("Jahi", "Yancy"));

        Buch p = new Buch(liste ,  187, "Die legende von Verdansk ");
        dao.insert(p);
    }

    public void testDelete()
    {
        /*int id = 5;
        dao.delete(id);*/
    }


    public void testUpdate()
    {
        List<Autor> liste = new ArrayList<>();
        liste.add(new Autor("Nemanja", "Petrovic"));
        liste.add(new Autor("Nikola", "Gajevic"));
        liste.add(new Autor("Jahi", "Yancy"));

        Buch p = new Buch(liste ,  404, "Die legende von Verdansk ");
        dao.update(p);
    }


    public void testSelect()
    {
        List<Buch> list = dao.selectAll();
        for (Buch person : list) {
            System.out.println( person.getIsbn() + " " + person.getTitel());
            System.out.println( person.getAutoren());
            System.out.println( "--------------------------------------");
        }

    }
}