<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
<title>快来学车后台管理-修改信息</title>
</head>

<body onload="load('user')">
	<jsp:include page="../head.jsp"></jsp:include>
	<div class="admin">
		<div class="panel admin-panel">
			<div class="panel-head">
				<strong>修改信息</strong>
			</div>
			<br /> <br />
			<form method="post" class="form-x" action="<%=basePath%>user/uptUser"
				style="padding-right: 20px">
				<input type="hidden" id="userId" name="userId" value="${user.userId}" />
				<div class="form-group">
					<div class="label">
					</div>
					<div class="field">
						<strong style="color: red;">${msg}</strong>
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label for="nickName">姓名</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="nickName" name="nickName"
							value="${user.nickName}" size="50" placeholder="姓名"
							data-validate="required:输入姓名" />
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label for="phone">手机号码</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="phone" value="${user.phone}"
							name="phone" size="50" placeholder="手机号码"
							data-validate="required:输入手机号码" />
					</div>
				</div>

				<div class="form-button">
					<button class="button bg-main" type="submit">修改</button>
				</div>
			</form>
			<br /> <br />
		</div>

	</div>

</body>
</html>