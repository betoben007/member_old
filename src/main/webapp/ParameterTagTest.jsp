<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<jsp:useBean id="acT" class="actiontag.ActionTagTest_02">
		<jsp:setProperty name="acT" property="*"/>
	</jsp:useBean>

	<h3><jsp:getProperty name="acT" property="str"/></h3>
	<h3><jsp:getProperty name="acT" property="content"/></h3>
</body>
</html>