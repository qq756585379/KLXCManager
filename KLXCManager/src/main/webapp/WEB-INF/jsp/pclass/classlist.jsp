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
<title>快来学车后台管理-班级列表</title>
</head>

<body onload="load('place')">
	<jsp:include page="../head.jsp"></jsp:include>
	<div class="admin">
		<form method="post">
			<div class="panel admin-panel">
				<div class="panel-head">
					<strong>班级列表---${size}个班级</strong>
				</div>
				<table class="table table-hover">
					<tr>
						<th width="80">班级名称</th>
						<th width="80">班级价格</th>
						<th width="50">省钱</th>
						<th width="50">省时</th>
						<th width="50">课程类型</th>
						<th width="100">班级类型</th>
						<th width="50">城市</th>
						<th width="100">场地名称</th>
						<th width="300">特色服务</th>
						<th width="300">接送方案</th>
						<th width="300">费用说明</th>
						<th width="100">创建时间</th>
						<th width="60"></th>
					</tr>
					<c:forEach var="item" items="${list}">
						<tr>
							<td>${item.name}</td>
							<td>${item.price}</td>
							<td>${item.save_money}</td>
							<td>${item.save_time}</td>
							<td>${item.lesson}</td>
							<td>${item.class_type_desc}</td>
							<td>${item.city}</td>
							<td>${item.place_name}</td>
							<td title="${item.service_content}">${item.service_content}</td>
							<td title="${item.bus_plan}">${item.bus_plan}</td>
							<td title="${item.price_remark}">${item.price_remark}</td>
							<td>${item.create_time}</td>
							<td><c:choose>
									<c:when test="${item.rid > 0}">已推荐</c:when>
									<c:otherwise>
										<a class="button border-yellow button-little"
											href="<%=basePath%>pclass/addRecomClass?id=${item.id}&city=${item.city}">推荐</a>
									</c:otherwise>
								</c:choose> <a class="button border-yellow button-little"
								href="<%=basePath%>pclass/toClassEdit?id=${item.id}">修改</a> <a
								class="button border-yellow button-little"
								href="<%=basePath%>pclass/delClass?id=${item.id}">删除</a></td>
						</tr>
					</c:forEach>
				</table>
				<jsp:include page="../pagefooter.jsp"></jsp:include>
			</div>
		</form>
	</div>


</body>
</html>