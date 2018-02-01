<%--
  Created by IntelliJ IDEA.
  User: bendi
  Date: 2018/1/30
  Time: 0:21
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
    <title>游客页面</title>
    <script src="js/jquery-3.1.0.js"></script>
    <script>
        $(function () {
           $("#updateg").click(function () {
               $("#d1").css("display","block");
           })
            $("#sub").click(function () {
                if($("#oldPass").val()==${sessionScope.guest.passwoed} && $("#newPass").val()!=''){
                    $("#sub").attr("type","submit");
                }else {
                   if($("#oldPass").val()==${sessionScope.guest.passwoed}){
                       alert("原密码错误");
                   }else if ($("#newPass").val()!=''){
                       alert("新密码不能为空");
                   }
                }
            })
        })
    </script>
</head>
<body>
    <input type="button" id="updateg">
    <div id="d1" style="display: none" >
        <form action="updateguest" method="post">
            旧密码:<input name="oldPass" id="oldPass"> <br>
            新密码:<input name="newPass" id="newPass"><br>
            <input type="button" value="提交" id="sub">
        </form>
    </div>
</body>
</html>
