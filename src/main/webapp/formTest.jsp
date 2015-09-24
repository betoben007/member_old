<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta content="charset=UTF-8">
<title>jsp에서 파라미터 처리하기</title>
	<h2>파라미터의 값</h2>
</head>
<body>

	<%
		response.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		out.println(name);
	%>
</body>
</html>