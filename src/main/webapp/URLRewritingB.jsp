<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>URL Rewriting</title>
</head>
<body>
<%
		request.setCharacterEncoding("utf-8");
	%>
	<h3>URL Rewriting B</h3>
	<h3>ID: <%=request.getParameter("id") %></h3>
</body>
</html>