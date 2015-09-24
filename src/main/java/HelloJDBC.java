import java.sql.*;



public class HelloJDBC {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/world";
		String id = "jym";
		String password = "1234";
		
		Connection conn = DriverManager.getConnection(url, id, password);
		
		Statement stmt = conn.createStatement();
		String sql = "create table MyHello(name varchar(20), age int)";
		stmt.executeUpdate(sql);
		
		System.out.println("MyHello 테이블 완성");
		
		stmt.close();
		conn.close();
	}
}
