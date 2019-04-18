<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新用户注册</title>
</head>
<body>
	<from:form action="${pageContext.request.contextPath }/userregist" method="post" modelAttribute="user">
		username:<from:input path="username"/><br><br>
		password:<from:password path="password"/><br><br>
		sex:<from:radiobutton path="sex"/>man <from:radiobutton path="sex"/>woman
		<input type="submit" value="regist">
	</from:form>
</body>
<!-- <script type="text/javascript">
$("#btn").on("click",function(){
	$.ajax({
        url:"buy",
        type:"POST",
        data:JSON.stringify($('form').serializeObject()),
        contentType:"application/json",  //缺失会出现URL编码，无法转成json对象
        success:function(){
            alert("成功");
        }
	})
})
</script> -->
</html>