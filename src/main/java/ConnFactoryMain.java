import java.sql.*;


public class ConnFactoryMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ConnFactory factory = ConnFactory.getDefaultFactory();
		Connection conn = factory.createConnection();
		
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from MyHello");
		
		
		while(rs.next()) {
			System.out.print(rs.getString("name") + " ");
			System.out.println(rs.getInt("age"));
		}
		
		rs.close();
		stmt.close();
		conn.close();
	}
}
