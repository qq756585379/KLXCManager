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
<title>快来学车后台管理-场地资料添加</title>
<script type="text/javascript" src="../js/jsAddress.js"></script>
</head>

<body onload="load('place')">
	<jsp:include page="../head.jsp"></jsp:include>
	<div class="admin">
		<div class="panel admin-panel">
			<div class="panel-head">
				<strong>场地资料添加</strong>
			</div>
			<br /> <br />
			<form method="post" enctype="multipart/form-data" class="form-x"
				action="<%=basePath%>place/addPlace" style="padding-right: 20px">
				<div class="form-group">
					<div class="label">
						<label for="name">场地名称</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="name" name="name"
							maxlength="40" size="50" placeholder="场地名称"
							data-validate="required:请填写场地名称" />
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label for="service_content">服务内容</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="service_content"
							name="service_content" size="50" placeholder="服务内容"
							maxlength="100" data-validate="required:输入服务内容" />
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label for="url1">场地图片1</label>
					</div>
					<div class="field">
						<a class="button input-file" href="javascript:void(0);"> + 选择
							<input id="url1" name="url1"
							data-validate="required:请选择文件,img:只能上传jpg|gif|png格式文件"
							type="file">
						</a>
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label for="url2">场地图片2</label>
					</div>
					<div class="field">
						<a class="button input-file" href="javascript:void(0);"> + 选择
							<input id="url2" name="url2"
							type="file">
						</a>
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label for="url3">场地图片3</label>
					</div>
					<div class="field">
						<a class="button input-file" href="javascript:void(0);"> + 选择
							<input id="url3" name="url3"
							type="file">
						</a>
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label for="coach_city">场地所在城市</label>
					</div>
					<div class="field" style="padding-top: 7px">
						省：<select id="cmbProvince" name="province"></select> 市：<select
							id="cmbCity" name="city"></select> <select id="cmbArea"
							name="area" ></select>
						<script type="text/javascript">
							addressInit('cmbProvince', 'cmbCity', 'cmbArea');
						</script>
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label for="address">学车地址</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="address" name="address"
							maxlength="200" size="50" placeholder="学车地址"
							data-validate="required:请填写学车地址" />
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