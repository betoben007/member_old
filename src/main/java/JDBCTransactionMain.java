import java.sql.*;


public class JDBCTransactionMain {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/world";
		String user = "jym";
		String pw = "1234";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DriverManager.getConnection(url, user, pw);
			conn.setAutoCommit(false);
			
			String sql = "insert into MyHello (name, age) values(?, ?)";
			pstmt = conn.prepareStatement(sql);
		
			pstmt.setString(1, "트랜잭션");
			pstmt.setInt(2, 50);
			pstmt.executeUpdate();
			System.out.println("Data Inserted 1");
			
			pstmt.setString(1, "adcfml;emlqmeoima;lmlzmvlk;m");
			pstmt.setInt(2, 50);
			pstmt.executeUpdate();
			System.out.println("Data Inserted 2");
			
			conn.commit();
			System.out.println("COMMIT Complete 2");
		} catch (SQLException e) {
			if(conn != null){
				try {
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		} finally {
			try {
				conn.setAutoCommit(true);
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
}
