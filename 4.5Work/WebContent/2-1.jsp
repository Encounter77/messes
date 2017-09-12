<%@ page language="java" import="java.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String str = request.getParameter("number");
		//out.println(str);
		int num = Integer.parseInt(str);
		double result = num*num;
	%>
	<center>
		<%=num %>的平方等于<%=result %>
	</center>
	
</body>
</html>