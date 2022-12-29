<%--
  Created by IntelliJ IDEA.
  User: Think
  Date: 2022/12/29
  Time: 5:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/paramsToMap" method="post">
    账户名<input type="text" name="accountName"><br>
    账户金额<input type="text" name="money"><br>
    <input type="submit" value="提交">

</form>
</body>
</html>
