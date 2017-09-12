<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>session</title>
</head>
<body>
<%! int count=0;%>
<%  String usercount; 
	request.getSession(true);         
 	if(session.isNew()) {   
 		count++;                            
  		usercount = String.valueOf(count);    
        session.putValue("usercounts",usercount);   
    }  
	out.print("您是本站的第<font color=red size=5>");
	out.print(session.getValue("usercounts")); out.print(" </font>位访客");
%>
</body>
</html>