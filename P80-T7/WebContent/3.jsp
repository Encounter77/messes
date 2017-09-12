<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>application</title>
</head>
<body>
<% 
		Integer count = (Integer) application.getAttribute("counter");
		if(count == null){
			count = 0;
		}
		count ++;
		application.setAttribute("counter", count);
%>
	<center>
		<hr>
		<p>这是一个访问网站计数器</p><br>
		<p>当前网站访问人数：<font color=red size=5><%=count %></font></p>
		<hr>
	</center>
</body>
</html>