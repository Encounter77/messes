<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Date Stime = new Date();
		int year = Stime.getYear() + 1900;
		int month =  Stime.getMonth() + 1;
		int date = Stime.getDate();
		int day = Stime.getDay();
		int hours = Stime.getHours();
		int minutes = Stime.getMinutes();
		int secounds = Stime.getSeconds();
		if(hours >= 0 && hours < 12){
			out.println("早上好！！");
		}else {
			out.println("晚上好！！");
		}
	%>
	<br>
	<center>
		<p>当前时间:<%= year %>年<%= month %>月<%=date %>日星期<%=day %>,<%=hours %>时<%=minutes %>分<%=secounds %>
		秒</p>
	</center>
</body>
</html>