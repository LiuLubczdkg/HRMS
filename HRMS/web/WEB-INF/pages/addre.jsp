<%--
  Created by IntelliJ IDEA.
  User: bendi
  Date: 2018/1/29
  Time: 19:49
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
    <title>添加招聘信息</title>
</head>
<body>
    <form action="addRecruitment" method="post">
        部门:<input name="depa"><br>
        职位:
    </form>
</body>
</html>
