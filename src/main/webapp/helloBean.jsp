<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="myHello" class="hello.HelloBean" scope="page" />
<html>
<head>
<title>Hello JSP</title>
</head>
<body>
	<%
		String str = new String();
		
		myHello.setStatement("Grace Byun!!");
		str = myHello.getStatement();
		
		out.println("<h1>"+ str +"</h1>");
	%>

</body>
</html>