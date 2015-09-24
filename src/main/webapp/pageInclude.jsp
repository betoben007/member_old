<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>pageContext의 Incldue</title>
</head>
<body>
	<h2>다른 페이지의 인클루드</h2>

	<%
		pageContext.include("included.jsp");
	%>
		<h3>제어권이 돌아왔습니다</h3>
</body>
</html>