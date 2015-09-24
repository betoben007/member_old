import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;




public class ConnFactory {
	private static int maxconn = 0;
	private static String url = null;
	private static String driver = null;
	private static String user = null;
	private static String pw = null;
	
	private static ConnFactory connFactory = new ConnFactory();
	
	static{
		try{
			loadProperties("jdbc.properties");
		} catch (IOException e) {
			System.out.println("jdbc.properties 파일을 읽어들일 수 없습니다.");
			e.printStackTrace();
		} 
		
	}

	private ConnFactory() {
	}
	
	public static ConnFactory getDefaultFactory() {
		if(connFactory == null) {
			connFactory = new ConnFactory();
		}
		
		return connFactory;
	}
	
	public Connection createConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, pw);
		
		return conn;
	}
	
	private static void loadProperties(String filename) throws IOException {
		Properties p = new Properties();
		FileInputStream in = new FileInputStream(filename);
		p.load(in);
		
		in.close();
		url= p.getProperty("url");
		driver = p.getProperty("driver");
		user = p.getProperty("user");
		pw = p.getProperty("password");
		maxconn = Integer.parseInt(p.getProperty("maxconn"));
		
	}
	
	public static int getMaxConn() {
		return maxconn;
	}
}
