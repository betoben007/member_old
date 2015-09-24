<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hidden Form Field</title>
</head>
<body>
	<h3>Hidden Form Field A</h3>
	<%
		String id= request.getParameter("id");
	%>
	<h3>ID: <%=id %></h3>
	<form action="HiddenFFB.jsp" method="post">
		<input type="hidden" name="id" value="<%=id%>"/>
		<input type="submit" value="Next"/>
	</form>
</body>
</html>