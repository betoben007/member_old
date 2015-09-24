<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Session</title>
</head>
<body>
	<h3>세션 정보</h3>
	isNew(): <%=session.isNew()%><br>
	세션 ID: <%=session.getId()%><br>
	세션 생성시간: <%=new java.util.Date(session.getCreationTime()).toString()%><br>
	세션 마지막 접속시간: <%=new java.util.Date(session.getLastAccessedTime()).toString()%><br>
	세션 Active 시간: <%=session.getMaxInactiveInterval()%> sec
	
</body>
</html>