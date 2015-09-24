<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp:param 태그</title>
</head>
<body>
	<h3>ParamTo.jsp의 시작입니다</h3>
	<h3>ID: <%=request.getParameter("id")%></h3>
	<h3>Str: <%=request.getParameter("str") %></h3>

</body>
</html>