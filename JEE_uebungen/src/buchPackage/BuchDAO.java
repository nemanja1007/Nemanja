package buchPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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

}
