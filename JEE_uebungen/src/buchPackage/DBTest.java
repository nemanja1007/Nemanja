package buchPackage;

import java.sql.SQLException;

public class DBTest {
	public static void main(String [] args) {
		DBConnection db = DBConnection.getInstance();
		try {
			db.getConnection().close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
