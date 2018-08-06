<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <meta name="renderer" content="webkit">
    <title>快来学车后台管理-后台管理</title>
    <script src="../js/jquery.js"></script>
</head>

<body onload="load('index')">
<jsp:include page="head.jsp"></jsp:include>
<div class="admin">
    <div class="line-big">
        <div class="xm3">
            <div class="panel border-back">
                <div class="panel-body text-center">${UserInfo.nickname}</div>
                <div class="panel-foot bg-back border-back">${UserInfo.nickname}，欢迎登陆，登录时间为${UserData.loginTime}</div>
            </div>
            <br/>
            <div class="panel">
                <c:if test="${UserData.hasProve}">
                    <div class="panel-head">
                        <strong>待处理</strong>
                    </div>
                    <ul class="list-group">
                        <li>
                            <a href="<%=basePath%>coach/toApprove" class="icon-home">
                                <span class="float-right badge bg-main">${UserData.approveSize}</span>审批
                            </a>
                        </li>
                    </ul>
                </c:if>
            </div>
            <br/>
        </div>
    </div>
</div>

</body>
</html>