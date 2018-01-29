<%--
  Created by IntelliJ IDEA.
  User: bendi
  Date: 2018/1/29
  Time: 13:26
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
    <title>管理员界面</title>
</head>
<body>
    <a href="">添加招聘信息</a>
    <a href="">修改招聘信息</a>
    <a href="">查看简历</a>
    <a href=""></a>
    <a href=""></a>
    <a href=""></a>
</body>
</html>
