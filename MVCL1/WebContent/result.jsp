<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="mvc.ex.Complex"%>
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
			request.setCharacterEncoding("utf-8");
			Complex addr = (Complex) request.getAttribute("addr");
			Complex subr = (Complex) request.getAttribute("subr");
			Complex mulr = (Complex) request.getAttribute("mulr");
			Complex divr = (Complex) request.getAttribute("divr");
	%>
		这两个复数的运算结果为：<br> 和：<%=addr.getReal() %>+(<%=addr.getImage() %>)i<br>
		差：<%=subr.getReal() %>+(<%=subr.getImage() %>)i<br> 积：<%=mulr.getReal() %>+(<%=mulr.getImage() %>)i<br>
		商：<%=divr.getReal() %>+(<%=divr.getImage() %>)i %>
	</center>
</body>
</html>