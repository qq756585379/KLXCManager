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
<title>快来学车后台管理-场地列表</title>
</head>

<body onload="load('place')">
	<jsp:include page="../head.jsp"></jsp:include>
	<div class="admin">
		<form method="post">
			<div class="panel admin-panel">
				<div class="panel-head">
					<strong>场地列表</strong>
				</div>
				<table class="table table-hover">
					<tr>
						<th width="200">场地名称</th>
						<th width="*">服务内容</th>
						<th width="100">城市</th>
						<th width="100">区域</th>
						<th width="*">练车地址</th>
						<th width="200">创建时间</th>
					</tr>
					<c:forEach var="item" items="${list}">
						<tr>
							<td>${item.name}</td>
							<td>${item.service_content}</td>
							<td>${item.city}</td>
							<td>${item.area}</td>
							<td>${item.address}</td>
							<td>${item.create_time}</td>
							<td><a class="button border-yellow button-little"
								href="<%=basePath%>place/toPlaceEdit?id=${item.id}">修改</a> <a
								class="button border-yellow button-little"
								href="<%=basePath%>place/getPlaceInfo?id=${item.id}">详情</a> <a
								class="button border-yellow button-little"
								href="<%=basePath%>place/delPlace?id=${item.id}">删除</a></td>
						</tr>
					</c:forEach>
				</table>
				<jsp:include page="../pagefooter.jsp"></jsp:include>
			</div>
		</form>
	</div>


</body>
</html>