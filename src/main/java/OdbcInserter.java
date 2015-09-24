import java.sql.*;


public class OdbcInserter {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user = "xe";
			String pw = "1234";
			
			Connection conn = DriverManager.getConnection(url, user, pw);
			Statement stmt = conn.createStatement();
			
			String sql = "insert into MyHello values('"+ "김삿갓" +"', "+ 35 +")";
			String sql1 = "insert into MyHello values('"+ "이도령" +"', "+ 18 +")";
			
			stmt.executeUpdate(sql);
			stmt.executeUpdate(sql1);
			
			stmt.close();
			stmt.close();
			
			
		}
}
