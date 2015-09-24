<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Read Cookie</title>
</head>
<body>
	<h3>쿠키 읽기</h3>
	<%
		String cookieValue = request.getHeader("Cookie");
		if(cookieValue==null) {
			out.print("<h2>쿠키가 없습니다.</h2>");
		} else {
			Cookie[] cookies = request.getCookies();
			for(int i=0; i<cookies.length; i++) {
				out.print("<b>Name: </b>"+ cookies[i].getName() +"</br>");
				out.print("<b>Value: </b>"+ cookies[i].getValue() +"</br>");
				out.print("<b>Domain: </b>"+ cookies[i].getDomain() +"</br>");
				out.print("<b>MaxAge: </b>"+ cookies[i].getMaxAge() +"</br>");
				out.print("<b>Path: </b>"+ cookies[i].getPath() +"</br>");
				out.print("<b>Comment: </b>"+ cookies[i].getComment() +"</br>");
				out.print("<br>");
			}
		}
	%>
</body>
</html>