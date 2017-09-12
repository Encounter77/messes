<%--
  User: 李欣
  Date: 2017/4/10
  Time: 9:50
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>异步数据测试</title>
    <script type="text/javascript" src="js/jquery-3.2.0.min.js"></script>
</head>
<body>
用户名：zhangsan<br>
密　码：123456<br>
<button id="btn">模拟登录</button>
</body>
<script type="text/javascript">
    $("#btn").click(function () {
        $.post("/testjson2/JsonServlet",      // 以POST方式访问服务器链接/JsonServlet
            {'username': 'zhangsan', 'password': '123456'},     // 向服务器传递数据
            function (data) {        // 请求成功的回调函数
                var json = eval('(' + data + ')');  // 将Json字符串传换成js对象
                if (json.status) {
                    alert("登陆成功！");
                } else {
                    alert(json.msg);
                }
            });
    });
</script>
</html>
