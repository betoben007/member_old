<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<html>
<head>
<meta content="charset=UTF-8">
<title>page 지시문의 import 속성</title>
</head>
<body>
	<%
		String str = "Hello JSP ~~~~";
		Vector v = new Vector();
		v.addElement(str);
		out.println("<h2>"+ v.elementAt(0) +"</h2>");
	
	
	%>
	
</body>
</html>