<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta content="text/html; charset=UTF-8">
<title>jsp 페이지 구성</title>
</head>
<body>

	<%
		String name = "소설같은 자바";
		String author = "이명진";
	%>
	
	<input type="text" name="아이디">
	<input type="submit" value="아이디">
	
	<%= name %>의 저자는 <%= author %>입니다.
</body>
</html>