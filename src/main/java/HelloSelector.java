import java.sql.*;


public class HelloSelector {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/world";
		String user = "jym";
		String pw = "1234";
		
		Connection conn = DriverManager.getConnection(url, user, pw);
		
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
