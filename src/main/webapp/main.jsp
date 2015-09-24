<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Main Page</title>
</head>
<body>
	
	<center>
		<h1> 홈페이지에 오신것을 환영합니다. </h1>
		<a href="login.jsp"><button>로그인</button></a>
		<a href="login3.jsp"><button>회원가입</button></a>
		<a href="login4.jsp"><button>회원탈퇴</button></a>
		
		<%
			pageContext.include("login.jsp");
		%>
		
		<!-- <form action="log.jsp" method="post">
			<input type="submit" name="value" value="로그인">
			<input type="submit" name= "value" value="회원가입">
			<input type="submit" name= "value" value="회원탈퇴">
		</form> -->
			
	</center>
	
	
	
</body>
</html>