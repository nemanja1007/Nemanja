package buchPackage;

import java.sql.SQLException;
import java.util.ArrayList;

public class DBTest {
	public static void main(String[] args) {
        System.out.println(true && true || (true && false));
        DBConnection db = DBConnection.getInstance();

        try {
            if(db != null && !db.getConnection().isClosed()) {
                AutorDAO autorDAO = new AutorDAO();
                Author a = new Author();
                a.setName("Muster");
                a.setVorname("Meier");
                autorDAO.insert(a);
                /*
                ArrayList<Autor> list = autorDAO.selectAll();
                for(Author a2 : list) {
                    System.out.println(a2.getId() + " " + a2.getName() + " " + a2.getVorname()/* + " " + a2.getGeburtsdatum());
                }*/

                Buch b = new Buch();
                b.setTitel("Eine Programmiersprache");
                b.setSeiten(999);
                b.setAuthor(a);

                BuchDAO buchDAO = new BuchDAO();
                buchDAO.insert(b);


                db.getConnection().close();

                System.out.println(a.getId());
            }

            db.getConnection().close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

