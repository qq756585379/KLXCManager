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
<title>快来学车后台管理系统-登录</title>
<link rel="stylesheet" href="../css/pintuer.css">
<link rel="stylesheet" href="../css/admin.css">

<script src="../js/jquery.js"></script>
<script src="../js/pintuer.js"></script>
<script src="../js/respond.js"></script>
<script src="../js/admin.js"></script>

</head>

<body>
	<div class="container">
		<div class="line">
			<div class="xs6 xm4 xs3-move xm4-move">
				<br /> <br /> <br /> <br />
				<div class="panel" style="width: 480px">
					<div class="panel-head">
						<strong>用户注册</strong>
					</div>
					<div class="panel-body" style="padding: 30px;">

						<form method="post" class="form-x"
							action="<%=basePath%>user/regist">
							<div class="form-group">
								<div class="label">
									<label for="userName">手机号码</label>
								</div>
								<div class="field">
									<input type="text" class="input" id="userName"
										name="userName" size="50" placeholder="手机号码"
										data-validate="required:请填写手机号码" />
								</div>
							</div>
							<div class="form-group">
								<div class="label">
									<label for="password">密码</label>
								</div>
								<div class="field">
									<input type="password" class="input" name="password"
										placeholder="密码" data-validate="required:请填写密码,length#>=6:密码长度需大于6位" />
								</div>
							</div>
							<div class="form-group">
								<div class="label">
									<label for="confPwd">确认密码</label>
								</div>
								<div class="field">
									<input type="password" class="input" name="confPwd"
										placeholder="确认密码" data-validate="required:请填写确认密码" />
								</div>
							</div>
							<div class="form-button">
								<button class="button bg-main" type="submit">注册</button>
							</div>
						</form>
					</div>

				</div>
			</div>
		</div>
	</div>

</body>
</html>
