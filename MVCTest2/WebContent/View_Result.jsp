<%@page import="java.math.BigDecimal"%>
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
		<hr>
		<%
			Double data = (Double) request.getAttribute("data");
			String result = (String)request.getAttribute("result");
		%>
			<h3>您的BML指数为:<font color=#FF0000><%=new BigDecimal(data).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue() %></font>!!</h3>
			<h2><font color=#FF0000><%=result %></font></h2>
	</center>
</body>
</html>