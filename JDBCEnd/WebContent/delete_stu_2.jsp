<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
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
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String className = "com.mysql.jdbc.Driver";
		String url1 = "jdbc:mysql://localhost:3306/students";
		String url2 = "?user=root&password=1234";
		String url3 = "&useUnicode=true&characterEncoding=utf-8";

		Class.forName(className);
		con = DriverManager.getConnection(url1 + url2 + url3);

		request.setCharacterEncoding("utf-8");

		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String ww1 = request.getParameter("w1");
		String ww2 = request.getParameter("w2");
		String s = " 1=1";

		if (!name.equals(""))
			s = s + " and name='" + name + "'";
		if (sex != null)
			s = s + " and sex='" + sex + "'";
		float w1, w2;
		if (ww1.equals("")) {
			w1 = Float.parseFloat(ww1);
			s = s + " and weight>=" + w1;
		}
		if (ww2.equals("")) {
			w2 = Float.parseFloat(ww2);
			s = s + " and weight<=" + w2;
		}

		String sql = "delete from stu_info where " + s;

		pstmt = con.prepareStatement(sql);

		int n = pstmt.executeUpdate();
		if (n == 1) {
	%>
	数据删除操作成功！
	<br>
	<%
		} else {
	%>
	数据删除操作失败！
	<br>

	<%
		}
		if (pstmt != null) {
			pstmt.close();
		}
		if (con != null) {
			con.close();
		}
	%>

</body>
</html>