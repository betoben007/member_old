<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.lang.*"%>


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
	
		String id = request.getParameter("id");
	%>
	
	<%	
		for(int i=0; i<id.length(); i++){			
			if(!(id.equals("@"))){		
	%>
				아이디의 형식이 잘못되었습니다.		
	<%
				break;
			}
		}
	%>
	</center>
</body>
</html>