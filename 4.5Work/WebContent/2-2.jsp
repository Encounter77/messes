<%@ page language="java" import="java.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<p>平方计算</p>
		<jsp:include page="2-1.jsp">
			<jsp:param value="5" name="number"/>
		</jsp:include>		
	</center>
</body>
</html>