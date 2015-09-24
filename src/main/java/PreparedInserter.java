import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class PreparedInserter {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/world";
		String user = "jym";
		String pw = "1234";
		
		Connection conn = DriverManager.getConnection(url, user, pw);
		
		String sql = "insert into MyHello (name, age) values(?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, "변강쇠");
		pstmt.setInt(2, 20);
		pstmt.executeUpdate();
		
		pstmt.setString(1, "월매");
		pstmt.setInt(2, 50);
		pstmt.executeUpdate();
		
		pstmt.setString(1, "방자");
		pstmt.setInt(2, 25);
		pstmt.executeUpdate();
		
		pstmt.setString(1, "향단이");
		pstmt.setInt(2, 15);
		pstmt.executeUpdate();
		
		pstmt.close();
		conn.close();
		System.out.println("데이터 업데이트 완료");
	}
	

	
}
