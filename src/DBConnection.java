import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	   
		String BDD = "tp2";
		String url = "jdbc:mysql://localhost:3310/tp2" ; 
		String user = "root@localhost";
		String passwd = "papa1234";
	    private Connection conn;

	   private static DBconnection instance ; 
	    public DBConnection() throws SQLException {
			conn=DriverManager.getConnection(url, user,passwd);
			return conn ; 
		}

	    public static DBConnection getInstance() throws SQLException {
	    	if(instance == null) {
	    		instance = new DBConnection();
	    	}
	    	return instance;
	    }
	    
	    public Connection getConn() {
			return conn;
		}

		
}
