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
	<%
		ResultSet rs = (ResultSet) request.getAttribute("rs");
		session.setAttribute("sex", rs.getString("sex"));
		session.setAttribute("name", rs.getString("name"));
	%>
	<center>
		<form action="Update_stu" method="post">
			<table border="0" width="238" height="252">
				<tr>
					<td>学号</td>
					<td><input name="id" value=<%=rs.getInt("id")%>></td>
				</tr>
				<tr>
					<td>姓名</td>
					<td><input name="name2" value=<%=rs.getString("name")%>></td>
				</tr>
				<tr>
					<td>性别</td>
					<td><input name="sex2" value=<%=rs.getString("sex")%>></td>
				</tr>
				<tr>
					<td>年龄</td>
					<td><input name="age" value=<%=rs.getInt("age")%>></td>
				</tr>
				<tr>
					<td>体重</td>
					<td><input name="weight" value=<%=rs.getFloat("weight")%>></td>
				</tr>
				<tr>
					<td>身高</td>
					<td><input name="hight" value=<%=rs.getFloat("hight")%>></td>
				</tr>

				<tr align="center">
					<td colspan="2"><input type="submit" value="提交">
						&nbsp;&nbsp;&nbsp;&nbsp; <input type="reset" value="取消"></td>
				</tr>

			</table>
		</form>
	</center>
</body>
</html>