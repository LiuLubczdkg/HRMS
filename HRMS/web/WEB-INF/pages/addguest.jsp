<%--
  Created by IntelliJ IDEA.
  User: bendi
  Date: 2018/1/29
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title>游客注册</title>
</head>
<body>
    <form action="addguest" method="post">
        用户名:<input name="name" id="name"><span id="sp1"></span><br>
        密码：<input type="password" name="pass1" id="pass1"><span id="sp2"></span><br>
        确认密码：<input type="password" id="pass2"><span id="sp3"></span><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
