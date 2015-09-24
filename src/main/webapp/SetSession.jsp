<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Session</title>
</head>
<body>
	<h3>세션 데이터 추가</h3>
	<%
		session.setAttribute("userId", "Grace");
	%>

</body>
</html>