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
<title>快来学车后台管理-意向报名列表</title>
</head>

<body onload="load('weixin')">
	<jsp:include page="../head.jsp"></jsp:include>
	<div class="admin">
		<form method="post">
			<div class="panel admin-panel">
				<div class="panel-head">
					<strong>意向报名列表</strong>
				</div>
				<table class="table table-hover">
					<tr>
						<th width="100">意向城市</th>
						<th width="200">合作业务</th>
						<th width="100">合作方式</th>
						<th width="100">联系人姓名</th>
						<th width="100">联系方式</th>
						<th width="200">录入时间</th>
					</tr>
					<c:forEach var="item" items="${list}">
						<tr>
							<td>${item.city}</td>
							<td>${item.join_name}</td>
							<td>${item.join_type}</td>
							<td>${item.contact_name}</td>
							<td>${item.contact_mode}</td>
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