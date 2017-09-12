<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>pageContext</title>
</head>
<body>
	<%
		Integer count = (Integer) pageContext.getAttribute("count");
		if (count != null) {
			count ++;
		} else
			count = 1;
		pageContext.setAttribute("count", count);
	%>
	<%
		Integer a = (Integer) pageContext.getAttribute("count");
		out.print("<center>你是第<font color=red size=5>" + a + "</font>位用户</center>");
	%>
</body>
</html>