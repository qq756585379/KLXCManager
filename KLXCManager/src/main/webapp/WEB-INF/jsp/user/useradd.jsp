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
<title>快来学车后台管理-用户添加</title>
</head>

<body onload="load('user')">
	<jsp:include page="../head.jsp"></jsp:include>
	<div class="admin">
		<div class="panel admin-panel">
			<div class="panel-head">
				<strong>添加用户</strong>
			</div>
			<br /> <br />
			<form method="post" class="form-x" action="<%=basePath%>user/addUser"
				style="padding-right: 20px">
				<div class="form-group">
					<div class="label">
						<label for="nickName">姓名</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="nickName" name="nickName"
							size="50" placeholder="姓名" data-validate="required:输入姓名" />
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label for="userName">用户名</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="userName" name="userName"
							size="50" placeholder="姓名" data-validate="required:输入用户名" />
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label for="userPassword">密码</label>
					</div>
					<div class="field">
						<input type="password" class="input" id="userPassword"
							name="userPassword" size="50" placeholder="密码"
							data-validate="required:输入密码" />
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label for="phone">手机号码</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="phone"
							name="phone" size="50" placeholder="手机号码"
							data-validate="required:输入手机号码" />
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label for="userType">用户类型</label>
					</div>
					<div class="field" style="width: 200px" align="left">
						<select class="input" name="userType" id="userType"
							data-validate="required:请选择用户类型">
							<option value="1">区域负责人</option>
							<option value="2">后台管理人员</option>
						</select>
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label for="userRole">角色</label>
					</div>
					<div class="field" style="width: 200px" align="left">
						<select class="input" name="userRole" id="userRole"
							data-validate="required:请选择角色">
							<option value="">请选择</option>
							<c:forEach var="item" items="${list}">
								<option value="${item.tid}">${item.name}</option>
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