<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>request 객체를 이용한 파라미터 출력</title>
</head>
<body>
	<h2>getParameter()</h2>
	이름: <%=request.getParameter("name")%>
	
	<h2>getParameterValue()</h2>
	취미:
		<%
			String[] hobby = request.getParameterValues("hobby");
			for(int i=0; i<hobby.length; i++){
				out.println(hobby[i] +" ");
			}
		%>
		
	<h2>getParameterValue()</h2>
	<%
		Enumeration param = request.getParameterNames();
		while(param.hasMoreElements()) {
			String name = (String)param.nextElement();
			out.println(name +" ");
			String[] value = request.getParameterValues(name);
			for(int i=0; i<value.length; i++) {
				out.println(value[i] + " ");
			}
			
			out.println("<br>");
		}
	%>	

	<h2>getParameterMap()</h2>		
	<%

		Map paramMap = request.getParameterMap();
		Set paramKeySet = paramMap.keySet();
		
		Iterator keyIterator = paramKeySet.iterator();
		
		while(keyIterator.hasNext()){
			String name = (String) keyIterator.next();
			out.print(name + " : ");
			String[] value = (String[]) paramMap.get(name);
			for(int i=0; i<value.length; i++){
				out.print(value[i] + " ");
			}
			out.print("<br>");
		}
	%>
		
		
		
</body>
</html>