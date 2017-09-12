<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="add.jsp" method="post">
		<table width="50%" border="1" align="center">
			<CAPTION>添加图书信息</CAPTION>
			<tr>
				<th width="30%">书名：</th>
				<td width="70%"><input name="bookname" type="text"></td>
			</tr>
			<tr>
				<th>作者：</th>
				<td><input name="author" type="text"></td>
			</tr>
			<tr>
				<th>价格：</th>
				<td><input name="price" type="text">元</td>
			</tr>
			<tr>
				<th colspan="2"><input type="submit" name="submit" value="添加">
					<input type="reset" value="重置"></th>
			</tr>
		</table>
	</form>
	<jsp:useBean id="db" class="book.bean.DBBean" scope="page" />
	<%
		request.setCharacterEncoding("utf-8");
		String submit = request.getParameter("submit");
		if (submit != null && !submit.equals("")) {
			String bookname = request.getParameter("bookname");
			String author = request.getParameter("author");
			String price = request.getParameter("price");
			String sql = "insert into bookinfo(bookname,author,price) values("
					+ bookname + ',' + author + ',' + price + ")";
			int n = db.executeUpdate(sql);
			if (n == 1) {
				out.println("<script language='javascript'>alert('添加成功，点击确定跳转到主页！');</script>");
				response.setHeader("refresh", "1;url=index.jsp");
			} else {
				out.println("<script language='javascript'>alert('添加失败，点击确定返回添加页面！');</script>");
				response.setHeader("refresh", "1;url=add.jsp");
			}
		}
		db.close();
	%>
</body>
</html>