<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title>快来学车后台管理-教练列表</title>
</head>

<body onload="load('user')">
<jsp:include page="../head.jsp"></jsp:include>
<div class="admin">
<form method="post">
	<div class="panel admin-panel">
		<div class="panel-head">
			<strong>用户列表</strong>
		</div>
		<table class="table table-hover">
			<tr>
				<th width="100">姓名</th>
				<th width="100">用户名</th>
				<th width="100">角色</th>
				<th width="100">手机号码</th>
				<th width="100">时间</th>
				<th width="100">操作</th>
			</tr>
			<c:forEach var="item" items="${list}">
				<tr>
					<td>${item.nickName}</td>
					<td>${item.userName}</td>
					<td>${item.userRoleStr}</td>
					<td>${item.phone}</td>
					<td>${item.createTime}</td>
					<td><a class="button border-yellow button-little"
										href="<%=basePath%>user/getUserById?userId=${item.userId}">修改</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</form>
</div>
</body>
</html>