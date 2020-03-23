package buchPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class DBConnection {
	private static DBConnection instance = null;
	private Connection connection;
	private Statement statement;

	public DBConnection() {
		try {
			// Verbindung zum Server
			this.connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mySQLdb", "root",
					"");
			System.out.println("Connection erfolgreich");
			//this.statement = (Statement) connection.createStatement();
			this.connection.close();
		} catch (SQLException ex) {
			System.err.println(ex);
		}
		
	}

//Ausfühtung Konstruktor
	public static DBConnection getInstance() {
		if (instance == null) {
			instance = new DBConnection();
		}
		return instance;
	}
}
