import java.sql.*;

public class HelloInserter {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		Class.forName("com.mysql.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/world";
		String user = "jym";
		String pw = "1234";
		
		Connection conn = DriverManager.getConnection(url, user, pw);
		
		Statement stmt = conn.createStatement();
		
		String sql = "insert into MyHello values('"+ "홍길동" +"',"+ 12 +")";
		int r = stmt.executeUpdate(sql);
		
		System.out.println(r +" 데이터 삽입 OK");
		
		stmt.close();
		conn.close();
		
		
		
	}
		
	
}
