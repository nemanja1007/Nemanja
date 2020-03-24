package buchPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BuchDAO {
	public int insert(Buch b) {
		int anz = 0;
		try {
			if(b.getAuthor().getId() > 0) {
				Connection con = DBConnection.getInstance().getConnection();
				String sql = "Insert into buch (Titel, AnzSeiten, autor_fk) values (?, ?, ?)";
				PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				pstmt.setString(1, b.getTitel());
				pstmt.setInt(2, b.getSeiten());
				pstmt.setInt(3, b.getAuthor().getId());
				anz = pstmt.executeUpdate();
				ResultSet rs = pstmt.getGeneratedKeys();
				if(rs.next()) {
					b.setIsbn(rs.getInt(1));
				}
				
			}else {
				anz = -1;
			}
		}catch (SQLException se) {
			se.printStackTrace();
		}
		return anz;
	}
	
	public ArrayList<Buch> selectAll(){
		ArrayList<Buch> list = new ArrayList<>();
		AutorDAO dao = new AutorDAO();
		ArrayList <Author> autoren = dao.selectAll();
		try {
			Connection con = DBConnection.getInstance().getConnection();
			PreparedStatement pstmt = con.prepareStatement("Select id, Titel, AnzSeiten, autor_fk from buch");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Buch b = new Buch();
				b.setIsbn(rs.getInt(1));
				b.setTitel(rs.getString(2));
				b.setSeiten(rs.getInt(3));
				int autorFk = rs.getInt(4);
				for(Author a : autoren) {
				//Author a = dao.select(autorFk);
				if(a.getId() == autorFk)
					b.setAuthor(a);
				}
				list.add(b);
			}
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		return list;
	} 
	


}
