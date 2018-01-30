<%--
  Created by IntelliJ IDEA.
  User: bendi
  Date: 2018/1/30
  Time: 14:01
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
    <form action="addResume" method="post">
        姓名:<input name="name"><br>
        年龄:<input name="age"><br>
        民族:<input name="ethnicity"><br>
        电话:<input name="phone"><br>
        身高<input name="height"><br>
        体重:<input name="weight"><br>
        婚姻状态:<input type="text" name="marrige"><br>
        地址：<input name="address"><br>
        毕业学校：<input name="school"><br>
        自我评价:<input name="selfassessment"><br>
        实习经历:<input name="intership"><br>
        曾获奖励:<input name="award"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
