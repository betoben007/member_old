<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>

	<%
		request.setCharacterEncoding("utf-8");	
	
		String id1 = "주영민";
	
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
	%>
	
	<%
	
		if(!id1.equals(id)){
	%>		
		<h3> 잘못 입력하셨습니다. 다시 입력해주세요</h3>
		<%@include file="login.jsp" %>
	<%
		} else {
	
	%>

	아이디: <%=id%><p>
	비번: <%=pw%>
	
	<%
		}
	
	%>
</body>




</html>



