package jabook.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
	
	private static ConnectionFactory connectionFactory = new ConnectionFactory();
	
	private ConnectionFactory() {};
	
	public static ConnectionFactory getDefaultFactory() {
		
		if(connectionFactory == null){
			connectionFactory = new ConnectionFactory();
		}
		
		return connectionFactory;
	}
	
	
	public Connection createConnection() {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/novel";
		String user = "root";
		String password = "1234";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
}



