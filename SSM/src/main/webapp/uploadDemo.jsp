<%--
  Created by IntelliJ IDEA.
  User: Think
  Date: 2022/12/29
  Time: 7:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>SpringMVC传统方式文件上传</h3>
<form action="${pageContext.request.contextPath}/file/upload" method="post" enctype="multipart/form-data">
    图片:<input type="file" name="upload"><br>
    图片描述：<input type="text" name="pdesc">
    <input type="submit" value="上传">

</form>

</body>
</html>
