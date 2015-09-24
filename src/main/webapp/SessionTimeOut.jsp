<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Session</title>
</head>
<body>
	<h3>세션 생명주기 설정</h3>
	<%
		session.setMaxInactiveInterval(60*1);
	
	%>
	
</body>
</html>