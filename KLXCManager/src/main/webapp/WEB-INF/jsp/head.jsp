<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>快来学车后台管理</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <meta name="renderer" content="webkit">

    <link rel="stylesheet" href="../../css/pintuer.css">
    <link rel="stylesheet" href="../../css/admin.css">
    <link rel="stylesheet" href="../../css/base.css">

    <script src="../../js/jquery.js"></script>
    <script src="../../js/pintuer.js"></script>
    <script src="../../js/respond.js"></script>

    <script type="text/javascript">
        function load(i) {
            document.getElementById("li_" + i).className = "";
            document.getElementById("li_" + i).className = "active";
        }
    </script>
</head>

<body onload="load(0)">

<div class="lefter">
    <div class="logo"><img width="90px" height="40px" alt="后台管理系统"/></div>
</div>

<div class="righter nav-navicon" id="admin-nav">
    <div class="mainer">
        <div class="admin-navbar">
            <span class="float-right">
                <a class="button button-little bg-yellow" href="<%=basePath%>head/logout.do">注销登录</a>
            </span>
            <ul class="nav nav-inline admin-nav">
                <c:forEach var="item" items="${Tab}">
                    <li id="${item.lid}">
                        <a href="<%=basePath%>${item.url}" class="icon-home"> ${item.name}</a>
                        <ul>
                            <c:forEach var="item2" items="${item.tabList}">
                                <li><a href="<%=basePath%>${item2.url}">${item2.name}</a></li>
                            </c:forEach>
                        </ul>
                    </li>
                </c:forEach>
            </ul>
        </div>
        <div class="admin-bread">
            <span>您好，${UserInfo.nickName}，欢迎您的光临。</span>
            <ul class="bread">
                <li><a href="index.html" class="icon-home">主页</a></li>
                <li>后台首页</li>
            </ul>
        </div>
    </div>
</div>
</body>

</html>
