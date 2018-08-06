<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>快来学车后台管理系统-登录</title>
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
</head>

<body>
<div class="container">
    <div class="line">
        <div class="xs6 xm4 xs3-move xm4-move">
            <br/><br/>
            <br/><br/>
            <form action="<%=basePath%>user/login.do" method="post">
                <div class="panel">
                    <div class="panel-head"><strong>快来学车后台管理系统</strong></div>
                    <div class="panel-body" style="padding:30px;">
                        <div class="form-group">
                            <div class="field field-icon-right">
                                <input type="text" class="input" name="userName" placeholder="登录账号"
                                       data-validate="required:请填写账号"/>
                                <span class="icon icon-user"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="field field-icon-right">
                                <input type="password" class="input" name="password" placeholder="登录密码"
                                       data-validate="required:请填写密码"/>
                                <span class="icon icon-key"></span>
                            </div>
                        </div>
                    </div>
                    <div class="panel-foot text-center">
                        <button class="button bg-main" type="submit" style="width: 100px"> 登 录</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
