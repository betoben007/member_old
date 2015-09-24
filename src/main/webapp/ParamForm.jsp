<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp:param 태그</title>
</head>
<body>
	<h2>jsp:param 태그를 이용한 파라미터 전달</h2>
	<h3>ID: <%=request.getParameter("id")%></h3>
	<h3>Str: <%=request.getParameter("str")%></h3>
	<jsp:include page="ParamTo.jsp">
		<jsp:param name="id" value="Micheal"/>
		<jsp:param name="str" value="Thank"/>
	</jsp:include>
</body>
</html>