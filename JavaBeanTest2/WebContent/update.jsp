<%@ page language="java" contentType="text/html; charset=gb2312"
	import="java.sql.*" errorPage="error.jsp"%>
<html>
<head>
<title>修改完成</title>
</head>
<body>
	<jsp:useBean id="db" class="book.bean.DBBean" scope="page" />
	<%
		request.setCharacterEncoding("utf-8");
		String bookname = request.getParameter("bookname");
		String author = request.getParameter("author");
		String price = request.getParameter("price");
		String id = request.getParameter("id");
		String sql = "update bookinfo set bookname=" + bookname
				+ ",author=" + author + ",price=" + price + " where id="
				+ id;
		int n = db.executeUpdate(sql);
		if (n == 1) {
			out.println("<script language='javascript'>alert('修改成功，点击确定跳转到主页！');</script>");
			response.setHeader("refresh", "1;url=index.jsp");
		}
		db.close();
	%>
</body>
</html>