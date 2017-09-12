<%@ page language="java" contentType="text/html; charset=utf-8"
	import="java.sql.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>修改记录的条件提交页面</title>
</head>
<body>
	<center>
		请选择修改记录所满足的条件
		<hr width="100%" size="3">
		<form action="update_stu_2_edit.jsp" method="post">
			<br> 姓名：<input type="text" name="name"><br> <br>
			性别：男 <input type="radio" value="男" name="sex" checked="checked">
			女 <input type="radio" value="女" name="sex"><br> <br>
			<input type="submit" value="提交"> &nbsp;&nbsp;&nbsp;&nbsp; <input
				type="reset" value="取消">
		</form>
	</center>
</body>
</html>