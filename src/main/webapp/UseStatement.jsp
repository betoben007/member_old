<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Statement 질의문 실행</title>
</head>
<body>
	<%
		Class.forName("com.mysql.jdbc.Driver");
	
		String url = "jdbc:mysql://localhost:3306/novel";
		String user = "root";
		String password = "1234";
		
		Connection conn = DriverManager.getConnection(url, user, password);
		
		Statement stmt = conn.createStatement();
		String sql = "Insert into NovelJSP value('onlyjiny', 20)";
		stmt.executeUpdate(sql);
		out.print("executeUpdate() 메소드<br>");
		
		stmt = conn.createStatement();
		sql = "select * from NovelJSP";
		ResultSet rs = stmt.executeQuery(sql);
		out.print("executeQuery() 메소드<br>");
		
		stmt.close();
		conn.close();
		
	
	
	
	
	
	%>
</body>
</html>