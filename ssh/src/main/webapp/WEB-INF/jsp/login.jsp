<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>用户登录</title>
    <script type="text/javascript" src="${pageContext.request.contextPath }/resources/jq/jquery-3.3.1.min.js"></script>
</head>
<body>
        <form id="check" action="${pageContext.request.contextPath }/userlogin" method="post">
        username:<input type="text" name="username" id="username"><br><br>
        password:<input type="password" name="password" id="password"><br><br>
        </form>
        <div id="message">${res}</div>
        <button id="btn">login</button>
    <script type="text/javascript">
        $("#btn").on("click",function(){
            var username = $("#username").val();
            var password = $("#password").val();
            if (username == '' || password == '') {
                $("#message").html('用户名、密码不能为空');
                return;
            }
            $("#check").submit();
        })
    </script>
</body>
</html>