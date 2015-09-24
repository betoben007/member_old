<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Database Programming</title>
</head>
<body>
	<h3>데이터베이스 연결</h3>
<%

	Class.forName("com.mysql.jdbc.Driver");
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/novel?user=root&password=1234");
	out.print("<p>데이터베이스 연결 성공</p>");
	
	DatabaseMetaData dm = conn.getMetaData();
	out.print("<b>JDBC 이름</b>: "+ dm.getDriverName() +"<br>");
	out.print("<b>JDBC 버젼</b>: "+ dm.getDriverVersion() +"<br>");
	out.print("<b>DBMS URL</b>: "+ dm.getURL() +"<br>");
	out.print("<b>사용자 이름</b>: "+ dm.getUserName() +"<br>");
	
	conn.close();
	out.print("<p>연결 종료</p>");
	 %>
	
</body>
</html>