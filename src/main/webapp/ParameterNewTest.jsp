<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="actiontag.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello Jsp</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		String str = request.getParameter("str");
		ActionTagTest_02 acT = new ActionTagTest_02(id, str);
	
		out.println("<h3>"+ acT.getStr() + "</h3>");
	%>

	<h3><%=acT.getContent()%></h3>	
</body>
</html>