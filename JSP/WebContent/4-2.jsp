<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		String chance = request.getParameter("book");
		//out.println(chance);	
	%>
	<%if(chance.equals("b1")){ %> 
			<jsp:forward page="4-1-1.jsp"></jsp:forward>
	<%} %>
	<%if(chance.equals("b2")){ %> 
			<jsp:forward page="4-1-2.jsp"></jsp:forward>
	<%} %>
	<%if(chance.equals("b3")){ %> 
			<jsp:forward page="4-1-3.jsp"></jsp:forward>
	<%} %>
	<%if(chance.equals("b4")){ %> 
			<jsp:forward page="4-1-4.jsp"></jsp:forward>
	<%} %>
		
</body>
</html>