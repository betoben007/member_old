<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>pageContext의 ForWard</title>
</head>
<body>
	<h2>다른 페이지로 포워딩</h2>
	<%
		pageContext.forward("forwardReceive.jsp");
	
		out.println("<h3> 제어권이 다시 돌아오지 않는다. </h3>");
	%>
</body>
</html>