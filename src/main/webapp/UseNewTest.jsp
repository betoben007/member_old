<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello JSP</title>
</head>
<body>

	<jsp:useBean id="acT" class="actiontag.ActoinTagTest"/>
	
	<jsp:setProperty name="acT" property="str" value="Hello" />
	<jsp:setProperty name="acT" property="id" value="JSP" />

	<h3></h3><jsp:getProperty name="acT" property="str"/></h3> 
	<h3></h3><jsp:getProperty name="acT" property="content"/></h3> 
</body>
</html>