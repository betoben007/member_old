<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>config 내장 객체</title>
</head>
<body>

	<%
		out.println("<h3>Servlet Name</h3>"+ config.getServletName() +"<br>");
		out.println("<h3>Parameter Information</h3>");
		Enumeration paramNames =  config.getInitParameterNames();
	
		while(paramNames.hasMoreElements()) {
	
			String paramName = (String) paramNames.nextElement();
			String paramValue = config.getInitParameter(paramName);
			out.println(paramName + " - " + paramValue +"<br>");
		}
	%>
</body>
</html>