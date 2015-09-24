<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp:include 태그</title>
</head>
<body>
	<h3>Include.jsp의 시작입니다.</h3>
	<%=request.getParameter("name")%>
	<h3>IncludeTo.jsp의 마지막입니다.</h3>
</body>
</html>