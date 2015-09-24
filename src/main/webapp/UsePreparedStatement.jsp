<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Database Programming</title>
</head>
<body>
	<h3>PreparedStatement 질의문 실행</h3>
	<% 
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/novel";
		String user = "root";
		String password = "1234";
		
		Connection conn = DriverManager.getConnection(url, user, password);
		
		String sql = "Insert into NovelJSP (name, age) value (?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, "Grace");
		pstmt.setInt(2, 24);
		pstmt.executeUpdate();
		
		pstmt.setString(1, "Cavin");
		pstmt.setInt(2, 44);
		pstmt.executeUpdate();
		
		out.print("레코드 삽입 완료<br>");
		
		pstmt.close();
		conn.close();
	
	
	
	
	%>
</body>
</html>