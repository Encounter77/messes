<%@page import="mvc.ex.Complex"%>
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
		<form action="Model_Servlet" method="post">
		<h3>请输入第一个复数：</h3>
			请输入第一个复数的实部：<input type="text" name="realpart1"><br>
			请输入第一个复数的虚部：<input type="text" name="imaginarypart1">
		<br>	
		<h3>请输入第二个复数：</h3>
			请输入第二个复数的实部：<input type="text" name="realpart2"><br>
			请输入第二个复数的虚部：<input type="text" name="imaginarypart2">
		<br>
		<input type="submit" value="提交">
		</form>
	</center>
</body>
</html>