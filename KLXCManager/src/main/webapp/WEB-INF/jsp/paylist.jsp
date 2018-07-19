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
						<th width="100">订单号</th>
						<th width="100">支付方式</th>
						<th width="100">支付是否成功</th>
						<th width="100">商户订单号</th>
						<th width="100">支付类型</th>
						<th width="100">交易时间</th>
					</tr>
					<c:forEach var="item" items="${list}">
						<tr>
							<td>${item.order_tid}</td>
							<td>${item.pay_type_desc}</td>
							<td>${item.pay_done_desc}</td>
							<td>${item.out_trade_no}</td>
							<td>${item.pay_method_desc}</td>
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