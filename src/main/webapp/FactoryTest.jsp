<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, jabook.sql.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Database Programming</title>
</head>
<body>
	<h3>Factory 기법</h3>
	<%
		ConnectionFactory connectionfactory = ConnectionFactory.getDefaultFactory();
		Connection conn = connectionfactory.createConnection();
		
		Statement stmt = conn.createStatement();
		
		String sql = "select * from NovelJSP";
		
		ResultSet rs = stmt.executeQuery(sql);		
	%>
	
		<table border = "1" cellspacing="0" cellpadding="3">
			<tr>
				<td align="center" bgcolor="#EEEEFF">이름</td>
				<td align="center" bgcolor="#EEEEFF">나이</td>
			</tr>			
		
	<%
		while(rs.next()) {
			
			out.print("<tr>");
			out.print("<td align=\"center\">"+ rs.getString(1) +"</td>");
			out.print("<td align=\"center\">"+ rs.getInt(2) +"</td>");
			out.print("</tr>");
		}
	%>	
	
	</table>
	
	<%
		rs.close();
		stmt.close();
		conn.close();
	
	
	%>	
	
	
</body>
</html>