<%--
  Created by IntelliJ IDEA.
  User: bendi
  Date: 2018/1/26
  Time: 9:49
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
    <title></title>
</head>
<body>
<a href="">游客</a>
<a href="">员工</a>
<a href="adminlogin">管理</a>
</body>
</html>
