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
<title>快来学车后台管理-邀请码添加</title>
<script type="text/javascript" src="../js/jsAddress.js"></script>
</head>

<body onload="load('city')">
	<jsp:include page="../head.jsp"></jsp:include>
	<div class="admin">
		<div class="panel admin-panel">
			<div class="panel-head">
				<strong>邀请码添加</strong>
			</div>
			<br /> <br />
			<form method="post" class="form-x"
				action="<%=basePath%>invite/addInvite" style="padding-right: 20px">
				
				<div class="form-group">
					<div class="label">
						<label for="nickname">负责的城市</label>
					</div>
					<div class="field" style="padding-top: 5px">
						<strong style="color: red;">${msg}</strong>
						<c:forEach var="item" items="${list}">
						<label class="radio"> <input type="radio"
							value="${item.city}${item.area}" name="area_name" checked="checked"> ${item.city}${item.area}
						</label><br/>
						</c:forEach>
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label for="type">邀请码类型</label>
					</div>
					<div class="field" style="width: 200px" align="left">
						<select class="input" name="type" id="type"
							data-validate="required:请选择邀请码类型">
							<option value="">请选择</option>
							<c:if test="${show}">
							<option value="M">门店</option>
							<option value="Z">招生团队</option>
							</c:if>
							<option value="X">校园代理</option>
						</select>
					</div>
				</div>      
				
				<div class="form-group">
					<div class="label">
						<label for="name">名称</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="name" name="name"
							maxlength="40" size="50" placeholder="名称"
							data-validate="required:请填写名称" />
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label for="phone">联系电话</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="phone" name="phone"
							maxlength="40" size="50" placeholder="联系电话"
							data-validate="required:请填写联系电话" />
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label for="city">城市</label>
					</div>
					<div class="field"  style="width: 200px">
						<input type="text" class="input" id="city" name="city" value="${city}" maxlength="20"
							size="50" placeholder="城市" data-validate="required:请填写城市" />
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label for="area">区域</label>
					</div>
					<div class="field" style="width: 200px">
						<input type="text" class="input" id="area" name="area" maxlength="20"
							size="50" placeholder="区域" data-validate="required:请填写区域" />
					</div>
				</div>
				<div class="form-button">
					<button class="button bg-main" type="submit">提交</button>
				</div>
			</form>
			<br /> <br />
		</div>


	</div>
</body>
</html>