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
<title>快来学车后台管理-区域负责人列表</title>
</head>

<body onload="load('city')">
	<jsp:include page="../head.jsp"></jsp:include>
	<div class="admin">
		<form method="post">
			<div class="panel admin-panel">
				<div class="panel-head">
					<strong>区域负责人列表</strong>
				</div>
				<table class="table table-hover">
					<tr>
						<th width="100">城市</th>
						<th width="100">区域</th>
						<th width="100">负责人</th>
						<th width="100">电话</th>
						<th width="100">创建时间</th>
					</tr>
					<c:forEach var="item" items="${list}">
						<tr>
							<td>${item.city}</td>
							<td>${item.area}</td>
							<td>${item.user_name}</td>
							<td>${item.user_phone}</td>
							<td>${item.create_time}</td>
						</tr>
					</c:forEach>
				</table>
				<jsp:include page="../pagefooter.jsp"></jsp:include>
			</div>
		</form>
	</div>


</body>
</html>