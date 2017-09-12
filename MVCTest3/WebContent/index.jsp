<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<frameset rows="100,*" cols="*"  border="3"
	framespacing="0">
	<frame src="index_title.jsp" name="topFrame" scrolling="No"
		noresize="noresize" id="topFrame" />
	<frameset cols="200,*"  border="3" framespacing="0">
		<frame src="index_left.jsp" name="leftFrame" scrolling="No"
			noresize="noresize" id="leftFrame" />
		<frame src="index_right.jsp" name="right" id="mainFrame" />
	</frameset>
</frameset>
</head>
<body>
</body>
</html>