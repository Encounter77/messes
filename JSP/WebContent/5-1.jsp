<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	td{
		text-align:left;
		width:100px;
	}
</style>
</head>
<body>
<form action="5-2.jsp" method="post">
	<table align="center">
				<tr>
					<td>姓名：</td>
					<td><input type="text" name="userName" >(必填)</td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><input type="password" name="userPwd">(必填)</td>
				</tr>
				<tr>
					<td>确认密码：</td>
					<td><input type="password" name="userPwdr"></td>
				</tr>
				<tr>
					<td>性别：</td>
					<td width="70px"><input type="radio" name="userSex" value="男">男&nbsp;
					<input type="radio" name="userSex" value="女">女&nbsp;</td>
				</tr>
				<tr>
					<td>爱好：</td>
					<td><input type="checkbox" name="userHobbies" value="计算机">计算机&nbsp;
					<input type="checkbox" name="userHobbies" value="音乐">音乐&nbsp;
					<input type="checkbox" name="userHobbies" value="体育">体育&nbsp;
					<input type="checkbox" name="userHobbies" value="文学">文学&nbsp;</td>
				</tr>
				<tr>
					<td>星座：</td>
					<td>
						<select size="5" name="constellation">
							<option value="-1"></option>
							<option value="白羊座">白羊座</option>
							<option value="金牛座">金牛座</option>
							<option value="双子座">双子座</option>
							<option value="巨蟹座">巨蟹座</option>
							<option value="狮子座">狮子座</option>
							<option value="处女座">处女座</option>
							<option value="天枰座">天枰座</option>
							<option value="天蝎座">天蝎座</option>
							<option value="射手座">射手座</option>
							<option value="摩羯座">摩羯座</option>
							<option value="水瓶座">水瓶座</option>
							<option value="双鱼座">双鱼座</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>个人简介：</td>
					<td><textarea name="introduce"></textarea></td>
				</tr>
				<tr>
					<td><input type="submit" value="提交"></td>
				</tr>
	</table>
</form>
</body>
</html>