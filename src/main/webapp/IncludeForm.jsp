<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp:include 태그</title>
</head>
<body>
	<h2>jsp:include 태그를 이용한 다른 페이지 호출</h2>
	<h3>IncludeFrom.jsp의 시작 입니다.</h3>
	<jsp:include page="IncludeTo.jsp"/>
	<h3>IncludeForm.jsp의 마지막입니다.</h3>
</body>
</html>