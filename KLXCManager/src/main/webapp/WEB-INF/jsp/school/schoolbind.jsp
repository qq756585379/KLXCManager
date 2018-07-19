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
<title>快来学车后台管理-驾校资料添加</title>
<script type="text/javascript" src="../js/jsAddress.js"></script>
</head>

<body onload="load('place')">
	<jsp:include page="../head.jsp"></jsp:include>
	<div class="admin">
		<div class="panel admin-panel">
			<div class="panel-head">
				<strong>驾校资料添加</strong>
			</div>
			<br /> <br />
			<form method="post" enctype="multipart/form-data" class="form-x"
				action="<%=basePath%>school/bindSchool" style="padding-right: 20px">
				<input type="hidden" id="id" name="id" value="${info.id}" />
				<div class="form-group">
					<div class="label">
						<label for="name">驾校名称</label>
					</div>
					<div class="field">
						<label for="name">${info.name}</label>
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label for="type">所属场地</label>
					</div>
					<div class="field" style="width: 200px" align="left">
						<select class="input" name="place_id" id="place_id"
							data-validate="required:请选择场地"">
							<option value="">请选择</option>
							<c:forEach var="item" items="${list}">
								<option value="${item.id}" ${(info.place_id==item.id)?'selected' : ''}>${item.name}</option>
							</c:forEach>
						</select>
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