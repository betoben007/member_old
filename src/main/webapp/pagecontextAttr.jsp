<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("contextName", "Using PageContext");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PageContext를 이용한 정보 공유</title>
	<h2>PageContexxt의 속성 호출</h2>
</head>
<body>

	<%
		Object obj = pageContext.getAttribute("contextName");
		if(obj != null)
			out.println("<h3>PageContext Value: "+ (String)obj +"</h3>");
		else
			out.println("Attrubute Not found!!");
	%>

	<h2>PageContext의 속성 재호출</h2>
	<%
		Object obj2 = pageContext.getAttribute("contextName");
		if(obj2 != null)
			out.println("<h3>PageContext Value: "+ (String) obj2 +"</h3>");
		else
			out.println("Attrubute Not found!!");
	%>
</body>
</html>