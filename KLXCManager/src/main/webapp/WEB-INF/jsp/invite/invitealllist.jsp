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
<title>快来学车后台管理-邀请码列表</title>
</head>

<body onload="load('city')">
	<jsp:include page="../head.jsp"></jsp:include>
	<div class="admin">
		<form method="post">
			<div class="panel admin-panel">
				<div class="panel-head">
					<strong>邀请码列表</strong>
				</div>
				<table class="table table-hover">
					<tr>
						<th width="100">姓名</th>
						<th width="100">类型</th>
						<th width="200">城市-区域</th>
						<th width="100">邀请码</th>
						<th width="100">创建人</th>
						<th width="200">创建时间</th>
					</tr>
					<c:forEach var="item" items="${list}">
						<tr>
							<td>${item.name}</td>
							<td>${item.type}-${item.typeDesc}</td>
							<td>${item.city}-${item.area}</td>
							<td>${item.type}${item.code}</td>
							<td>${item.create_name}</td>
							<td>${item.create_time}</td>
							<td><a
								class="button border-yellow button-little"
								href="<%=basePath%>invite/delInvite?id=${item.id}">删除</a>
								<a style="margin-left: 20px"
								class="button border-yellow button-little"
								href="<%=basePath%>invite/createQr?code=${item.type}${item.code}">生成二维码</a>
								</td>
						</tr>
					</c:forEach>
				</table>
				<jsp:include page="../pagefooter.jsp"></jsp:include>
			</div>
		</form>
	</div>


</body>
</html>