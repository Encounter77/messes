<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
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

			String sql = "select * from stu_info";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			rs.last();
		%>你要查询的学生数据表共有 <font size="5" color="red"> <%=rs.getRow()%>
		</font>人

		<table border="2" bgcolor="ccceee" width="650">
			<tr bgcolor="CCCCCC" align="center">
				<td>记录条数</td>
				<td>学号</td>
				<td>姓名</td>
				<td>性别</td>
				<td>年龄</td>
				<td>体重</td>
				<td>身高</td>
			</tr>
			<%
				rs.beforeFirst();
				while (rs.next()) {
			%>
			<tr align="center">
				<td><%=rs.getRow()%></td>
				<td><%=rs.getString("id")%></td>
				<td><%=rs.getString("name")%></td>
				<td><%=rs.getString("sex")%></td>
				<td><%=rs.getString("age")%></td>
				<td><%=rs.getString("weight")%></td>
				<td><%=rs.getString("hight")%></td>
			</tr>
			<%
				}
			%>
		</table>
	</center>
	<%
		if (rs != null) {
			rs.close();
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