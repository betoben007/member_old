import java.sql.*;


public class ConnPoolMain {
	public static void main(String[] args) throws InterruptedException, SQLException {
		
		ConnPool pool = ConnPool.getConnPool();
		Connection conn = pool.getConnection();
		
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
