<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="db" class="book.bean.DBBean" scope="page" />
	<%
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		ResultSet rs = db.executeQuery("select * from bookinfo where id="
				+ id);
		rs.next();
	%>
	<form action="update.jsp" method="post">
		<table width="50%" border="1" align="center">
			<CAPTION>修改图书信息</CAPTION>
			<tr>
				<th width="30%">书名：</th>
				<td width="70%"><input name="bookname" type="text"
					value="<%=rs.getString(2)%>"></td>
			</tr>
			<tr>
				<th>作者：</th>
				<td><input name="author" type="text"
					value="<%=rs.getString(3)%>"></td>
			</tr>
			<tr>
				<th>价格：</th>
				<td><input name="price" type="text"
					value="<%=rs.getString(4)%>">元</td>
			</tr>
			<tr>
				<th colspan="2"><input type="hidden" name="id" value="<%=id%>">
					<input type="submit" value="修改"> <input type="reset"
					value="重置"></th>
			</tr>
		</table>
	</form>
	<%
		db.close();
	%>
</body>
</html>