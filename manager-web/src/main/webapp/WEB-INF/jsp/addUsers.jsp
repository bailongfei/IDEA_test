<%--
  Created by IntelliJ IDEA.
  User: bailongfei123
  Date: 2019/5/28
  Time: 12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
   <form action="user/addUser" method="post">
       用户名：<input type="text" name="username"><br>
       年龄：<input type="text" name="userage"><br>
       <input type="submit" value="提交">
   </form>
</body>
</html>
