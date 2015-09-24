<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>파라미터 출력</title>
</head>
<body>
<form action="requestParameter.jsp" method="get">
	<p>이름: <input type="text" name="name"></p>
	<p>취미: 
		<input type="checkbox" name="hobby" value="Ski">스키
		<input type="checkbox" name="hobby" value="Inline">인라인</p>
	<input type="submit" value="submit">
	
	
	</form>

</body>
</html>