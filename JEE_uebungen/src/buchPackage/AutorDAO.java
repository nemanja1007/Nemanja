package buchPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AutorDAO {
	public int insert(Author a) {
        int r = 0;

        try {
            String sql = "INSERT INTO autor (name, vorname) VALUES (?,?)";
            Connection con = DBConnection.getInstance().getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            //pstmt.setInt(1,  1);
            pstmt.setString(1, a.getName());
            pstmt.setString(2, a.getVorname());
            //pstmt.setDate(3, a.getGeburtsdatum())
            r = pstmt.executeUpdate();

            //SELECT für PK
            ResultSet rs = pstmt.getGeneratedKeys();
            if(rs.next()) {
                int pk = rs.getInt(1);
                a.setId(pk);
            }


        }catch (SQLException se){
            return 0;
        }

        return r;
    }
	
	public int update(Author a) {
		return 0;
	}
	
	public int delete(int pk) {
		return 0;
	}
	
	public ArrayList<Author> selectAll(){
        ArrayList<Author> list = new ArrayList<>();

        try {
            String sql = "INSERT INTO autor (name, vorname, geburtsdatum) VALUES (?,?,?)";
            Connection con = DBConnection.getInstance().getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            //SELECT für PK
            ResultSet rs = pstmt.getGeneratedKeys();
            while(rs.next()) {
                int pk = rs.getInt(1);
                String name = rs.getString(2);
                String vorname = rs.getString(3);

                Author a = new Author();
                a.setId(pk);
                a.setName(name);
                a.setVorname(vorname);

                list.add(a);
            }
        }catch (SQLException se) {

        }
        return list;
    }
}
