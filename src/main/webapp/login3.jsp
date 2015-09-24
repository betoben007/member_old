<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
</head>
<body>
<center>
	<h1>회원가입을 환영합니다.</h1>
	</center>
	<textarea rows="4" cols="30" name="주의사항">당신은 이글을 보는 순간 이 글과 똑같은 편지를 30통 보내야합니다. 그렇지 않을 경우 당신의 앞날은 책임질수 없으며, 여러가지 않좋은 일이 일어날수도 있습니다. 아무튼 회원가입하신것에 대해서 감사드립니다.
	</textarea><p>
	<form action="login5.jsp" method="post">

	아이디(이메일): <input type="text" name="id"><p>
	비밀번호: <input type="password" name="pw"><p>
	비밀번호확인: <input type="password" name="pw1"><p>
	성별: 
	<input type="radio" name="gender" value="Man">남자
	<input type="radio" name="gender" value="Woman">여자<p>
	가입목적:
	<input type="checkbox" name="pur" value="why1">심심해서
	<input type="checkbox" name="pur" value="why2">멋있어서
	<input type="checkbox" name="pur" value="why3">장난으로
	<input type="checkbox" name="pur" value="why4">탈퇴하려고<p>
	
	
	가입인사(1000자 이내): <p><textarea name="line" rows="10" cols="100"></textarea><p>
	
	
	
		<input type="submit" value="회원가입"><input type="reset" value="초기화">
	</form>

</body>
</html>