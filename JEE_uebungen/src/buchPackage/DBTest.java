package buchPackage;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class DBTest {
	public static void main(String[] args) {
        System.out.println(true && true || (true && false));
        DBConnection db = DBConnection.getInstance();

        try {
            if(db != null && !db.getConnection().isClosed()) {
                AutorDAO autorDAO = new AutorDAO();
                Author a = new Author();
                a.setName("McGregor");
                a.setVorname("Conor");
                
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                LocalDate datum = LocalDate.parse("20.04.1969", formatter);
                a.setGeburtsdatum(LocalDate.of(1969, 04, 20));
                autorDAO.insert(a);
                
                List<Author> list = autorDAO.selectAll();
                for(Author a2 : list) {
                    System.out.println(a2.getId() + " " + a2.getName() + " " + a2.getVorname());
                    if(a2.getGeburtsdatum() != null)
                    	System.out.print(a2.getGeburtsdatum().format(formatter));
                    System.out.println();
                }

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

