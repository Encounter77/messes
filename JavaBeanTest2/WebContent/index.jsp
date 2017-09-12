<%@page import="java.sql.ResultSet"%>
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
		<a href=add.jsp>增加图书信息</a>
	</center>
	<p>
	<table align=center width=500 border=1>
		<tr>
			<td>书名
			<td>作者
			<td>价格
			<td>管理 <jsp:useBean id="db" class="book.bean.DBBean"
					scope="page" /> <%
 	String s = "select * from bookinfo";
 	ResultSet rs = db.executeQuery(s);
 	while (rs.next()) {
 		int id = rs.getInt(1);
 		out.println("<tr><td>" + rs.getString(2) + "</td><td>"
 				+ rs.getString(3) + "</td><td>" + rs.getString(4)
 				+ "</td><td><a href='del.jsp?id=" + id
 				+ "'>删除</a>&nbsp;<a href='edit.jsp?id=" + id
 				+ "'>修改</a></td></tr>");
 	}
 	rs.close();
 	db.close();
 %>
	</table>
</body>
</html>