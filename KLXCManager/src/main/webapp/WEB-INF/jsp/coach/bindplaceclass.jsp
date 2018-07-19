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
<title>快来学车后台管理-场地绑定</title>
<script type="text/javascript" src="../js/jsAddress.js"></script>
<script type="text/javascript">
	function chgCity(a) {
		document.location.href = "<%=basePath%>pclass/toRecomclass?city=" + a.value; 
	}
</script>
</head>

<body onload="load('operate')">
	<jsp:include page="../head.jsp"></jsp:include>
	<div class="admin">
		<div class="panel admin-panel">
			<div class="panel-head">
				<strong>场地绑定</strong>
			</div>
			<br /> <br />
			<form method="post" class="form-x"
				action="<%=basePath%>coach/bindPlaceClass" style="padding-right: 20px">
				<input type="hidden" id="id" name="id" value="${id}" />
				<div class="form-group">
					<div class="label">
						<label for="city">城市</label>
					</div>
					<div class="field" align="left">
						<label>${city}</label>
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label for="place_id">场地</label>
					</div>
					<div class="field" style="width: 200px" align="left">
						<select class="input" name="place_id" id="place_id"
							data-validate="required:请选择场地">
							<option value="">请选择</option>
							<c:forEach var="item" items="${placelist}">
								<option value="${item.id}">${item.name}</option>
							</c:forEach>
						</select>
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label for="class_id">班级</label>
					</div>
					<div class="field" style="width: 200px" align="left">
						<select class="input" name="class_id" id="class_id"
							data-validate="required:请选择班级">
							<option value="">请选择</option>
							<c:forEach var="item" items="${clssList}">
								<option value="${item.id}">${item.name}</option>
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