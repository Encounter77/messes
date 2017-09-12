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
		<h3>请输入您的身高体重</h3>
		<hr>
		<form action="controller_Servlet" method="post">
			身高：<input name="hight">米<br><br> 
			体重：<input name="weight">千克<br><br>
			<input type="submit" value="提交">
		</form>
	</center>
</body>
</html>