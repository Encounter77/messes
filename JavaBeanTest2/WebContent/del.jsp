<%@ page contentType="text/html; charset=gb2312" language="java"
	import="java.sql.*"%>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<head>
<title>ɾ��ͼ��</title>
</head>
<body>
	<jsp:useBean id="db" class="book.bean.DBBean" scope="page" />
	<%
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	int n = db.executeUpdate("delete from bookinfo where id="+id);
	if(n == 1){
		out.println("<script language='javascript'>alert('ɾ���ɹ������ȷ����ת����ҳ��');</script>");
		response.setHeader("refresh", "1;url=index.jsp");
	}
	/* else{
		out.println("<script language='javascript'>alert('�޸�ʧ�ܣ����ȷ����ת����ҳ��');</script>");
		response.setHeader("refresh", "1;url=");
	} */
	%>
</body>
</html>