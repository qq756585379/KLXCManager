<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

<body onload="load('market')">
	<jsp:include page="head.jsp"></jsp:include>
	<div class="admin">
		<form method="post">
			<div class="panel admin-panel">
				<div class="panel-head">
					<strong>订单列表</strong>
				</div>
				<table class="table table-hover">
					<tr>
						<th width="100">城市</th>
						<th width="100">地区</th>
						<th width="100">场地</th>
						<th width="100">学员</th>
						<th width="100">学员电话</th>
						<th width="100">订单金额</th>
						<th width="100">订单联系人</th>
						<th width="100">订单联系电话</th>
						<th width="100">支付状态</th>
						<th width="100">邀请码</th>
						<th width="100">订单产生时间</th>
					</tr>
					<c:forEach var="item" items="${list}">
						<tr>
							<td>${item.city}</td>
							<td>${item.area}</td>
							<td>${item.place_name}</td>
							<td>${item.user_nicname}</td>
							<td>${item.telephone}</td>
							<td>${item.order_money}</td>
							<td>${item.order_name}</td>
							<td>${item.order_phone}</td>
							<td>${item.pay_done_desc}</td>
							<td>${item.invitation_code}</td>
							<td>${item.create_time}</td>
						</tr>
					</c:forEach>
				</table>
				<jsp:include page="pagefooter.jsp"></jsp:include>
			</div>
		</form>
	</div>


</body>
</html>