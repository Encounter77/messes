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
	<form action="Test" method="post" enctype="multipart/form-data">
		<p>文件上传：<input type="file" name="userphoto"></p><h2>${msg }</h2>
		<input type="submit" value="提交">
	</form>
</center>
</body>	
</html>