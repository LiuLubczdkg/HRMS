<%--
  Created by IntelliJ IDEA.
  User: bendi
  Date: 2018/1/29
  Time: 13:55
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
    <title>游客登录</title>
    <script src="js/jquery-3.1.0.js"></script>
    <script>
        $(function () {
            $("#name").blur(function () {
                $.ajax({
                    type:"post",
                    url:"adminJSAJAX",
                    data:"newsTile="+$("#name").val(),
                    success:function (data) {
                        $("#sp1").html(data);
                    }
                })
            })
            $("#pass").blur(function () {
                $.ajax({
                    type:"post",
                    url:"adminJSAJAX",
                    data:"newsTile="+$("#pass").val(),
                    success:function (data) {
                        $("#sp2").html(data);
                    }
                })
            })
        })
    </script>
</head>
<body>
    <form action="glogin" method="post">
        <fieldset style="border-color: aqua">
        <legend>游客登录</legend>
            账号：<input type="text" name="name" placeholder="请输入用户" id="name"><span id="sp1"></span><br>
            密码:<input type="text" name="password" placeholder="输入密码" id="pass"><span id="sp2"></span><br>
            <input type="submit" value="登录">
            <input type=submit value="注册" onclick="this.form.action='guestadd'">2
        </fieldset>
    </form>
</body>
</html>
