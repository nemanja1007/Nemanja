package buchPackage;

import java.sql.SQLException;
import java.util.ArrayList;

public class DBTest {
	public static void main(String[] args) {
        DBConnection db = DBConnection.getInstance();

        try {
            if(db != null && !db.getConnection().isClosed()) {
                AutorDAO autorDAO = new AutorDAO();
                Author a = new Author();
                a.setName("Muster");
                a.setVorname("test");
                autorDAO.insert(a);

                ArrayList<Author> list = autorDAO.selectAll();
                for(Author a2 : list) {
                    System.out.println(a2.getId() + " " + a2.getName() + a2.getVorname());
                }

                db.getConnection().close();

                System.out.println(a.getId());
            }

            db.getConnection().close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
