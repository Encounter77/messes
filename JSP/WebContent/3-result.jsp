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
		String s1 = request.getParameter("Q1");
		String s2 = request.getParameter("Q2");
		String s3 = request.getParameter("Q3");
		/* if(s1 == null) s1 = " ";
		if(s2 == null) s2 = " ";
		if(s3 == null) s3 = " "; */
		int grade = 0;
		out.println("--------试卷解析--------<br><br>");
		if(s1 != null){
			out.print("第一题你的解答为："+s1+"  ");
			if(s1.equals("2")){
				grade ++;
				out.println(" Yes!<br>");
			}else{
				out.println(" No!<br>");
			}
		}else{
			out.println("第一题无作答！<br>");
		}
		out.println("----------------------<br>");
		if(s2 != null){
			out.print("第二题你的解答为："+s2+"  ");
			if(s2.equals("3")){
				grade ++;
				out.println(" Yes!<br>");
			}else{
				out.println(" No!<br>");
			}
		}else{
			out.println("第二题无作答！<br>");
		}
		out.println("----------------------<br>");
		if(s3 != null){
			out.print("第一题你的解答为："+s3+"  ");
			if(s3.equals("4")){
				grade ++;
				out.println(" Yes!<br>");
			}else{
				out.println(" No!<br>");
			}
		}else{
			out.println("第三题无作答！<br>");
		}
		out.println("----------------------<br>");
	%>
	<center>
		<p>你的成绩:<%=grade %>分！</p>
	</center>
</body>
</html>