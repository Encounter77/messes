<%@ page contentType="text/html; charset=gb2312" language="java"
	import="java.sql.*"%>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<head>
<title>删除图书</title>
</head>
<body>
	<jsp:useBean id="db" class="book.bean.DBBean" scope="page" />
	<%
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	int n = db.executeUpdate("delete from bookinfo where id="+id);
	if(n == 1){
		out.println("<script language='javascript'>alert('删除成功，点击确定跳转到主页！');</script>");
		response.setHeader("refresh", "1;url=index.jsp");
	}
	/* else{
		out.println("<script language='javascript'>alert('修改失败，点击确定跳转到主页！');</script>");
		response.setHeader("refresh", "1;url=");
	} */
	%>
</body>
</html>