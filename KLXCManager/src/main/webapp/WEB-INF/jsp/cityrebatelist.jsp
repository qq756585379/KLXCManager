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
<title>快来学车后台管理-城市折扣列表</title>
</head>

<body onload="load('city')">
	<jsp:include page="head.jsp"></jsp:include>
	<div class="admin">
		<form method="post">
			<div class="panel admin-panel">
				<div class="panel-head">
					<strong>城市折扣列表</strong>
				</div>
				<table class="table table-hover">
					<tr>
						<th width="100">城市</th>
						<th width="100">折扣金额</th>
						<th width="100">操作</th>
					</tr>
					<c:forEach var="item" items="${list}">
						<tr>
							<td>${item.city_name}</td>
							<td>${item.city_rebate}</td>
							<td><a href="#">详情</a></td>
						</tr>
					</c:forEach>
				</table>
				<jsp:include page="pagefooter.jsp"></jsp:include>
			</div>
		</form>
	</div>


</body>
</html>