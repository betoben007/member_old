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
	<h3>URL Rewriting A</h3>
		<%
			String id = request.getParameter("id");
		%>
		<h3>ID: <%=id%></h3>
		<a href="URLRewritingB.jsp?id=<%=id%>">다음 페이지로</a>
</body>
</html>