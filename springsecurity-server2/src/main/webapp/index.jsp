<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
认证成功，我是初始页面
<br><br>
<sec:authorize ifAnyGranted="ROLE_ADMIN">
    ROLE_ADMIN才会显示的内容
</sec:authorize>
</body>
</html>
