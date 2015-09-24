<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Set Cookie</title>
</head>
<body>
	<h3>쿠키 설정</h3>
	<%
		Cookie cookie = new Cookie("name", "Grace");
		cookie.setMaxAge(60*60*5);
		response.addCookie(cookie);
	%>
</body>
</html>