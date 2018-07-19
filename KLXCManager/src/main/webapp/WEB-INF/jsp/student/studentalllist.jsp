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

<body onload="load('place')">
	<jsp:include page="../head.jsp"></jsp:include>
	<div class="admin">
		<form method="post">
			<div class="panel admin-panel">
				<div class="panel-head">
					<strong>邀请码列表</strong>
				</div>
				                                                                                                                                                       
				<table class="table table-hover">
					<tr>
						<th width="100">学员姓名</th>
						<th width="100">是否分配</th>
						<th width="100">报名类型</th>
						<th width="100">金额</th>
						<th width="100">学员电话</th>
						<th width="200">报名时间</th>
					</tr>
					<c:forEach var="item" items="${list}">
						<tr>
							<td>${item.stu_name}</td>
							<td>${item.hasCoach}</td>
							<td>${item.class_type_desc}</td>
							<td>${item.class_money}</td>
							<td>${item.stu_phone}</td>
							<td>${item.create_time}</td>
							<td><a
								class="button border-yellow button-little"
								href="<%=basePath%>student/toStudentEdit?id=${item.tid}">分配教练</a></td>
						</tr>
					</c:forEach>
				</table>
				<jsp:include page="../pagefooter.jsp"></jsp:include>
			</div>
		</form>
	</div>


</body>
</html>