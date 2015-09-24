<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Database Programming</title>
</head>
<body>
	<h3>간단한 데이터베이스 프로그래밍</h3>
	<%
		Class.forName("com.mysql.jdbc.Driver");
		out.print("JDBC Driver 로딩 완료<br>");
		String url = "jdbc:mysql://localhost:3306/novel";
		String user = "root";
		String password = "1234";
		Connection conn = DriverManager.getConnection(url, user, password);
		
		out.print("연결 URL 정의 및 DB와 Connection 생성완료<br>");
		
		Statement stmt = conn.createStatement();
		String sql = "create table NovelJSP(name VARCHAR(10) NOT NULL PRIMARY KEY, age INTEGER)";
				
		stmt.executeUpdate(sql);	
		out.print("NovelJSP 테이블 생성 완료<br>");
		
		stmt = conn.createStatement();
		sql = "Insert into NovelJSP value ('jabook', 32)";
		stmt.executeUpdate(sql);
		out.print("데이터 삽입 완료<br>");
		
		stmt = conn.createStatement();
		sql = "select * from NovelJSP";
		ResultSet rs = stmt.executeQuery(sql);
		out.print("데이터 쿼리 완료<br>");
		
		while(rs.next()) {
			out.print(rs.getString(1) +", "+ rs.getInt(2) +"<br>");
		}
				
		
		rs.close();
		stmt.close();
		conn.close();
		out.print("연결종료<br>");
	
	
	%>
</body>
</html>