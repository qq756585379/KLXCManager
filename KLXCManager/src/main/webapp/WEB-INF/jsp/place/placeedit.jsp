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
				action="<%=basePath%>place/uptPlace" style="padding-right: 20px">
				<input type="hidden" id="id" name="id" value="${info.id}" />
				<div class="form-group">
					<div class="label">
						<label for="name">场地名称</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="name" name="name"
							maxlength="40" size="50" placeholder="场地名称"
							value="${info.name}"
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
							value="${info.service_content}"
							maxlength="100" data-validate="required:输入服务内容" />
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label for="url1">产地图片1</label>
					</div>
					<div class="field">
						<a class="button input-file" href="javascript:void(0);"> + 选择
							<input id="url1" name="url1"
							data-validate="img:只能上传jpg|gif|png格式文件"
							type="file">
						</a><img width="100px" height="100px" alt=""
							src="${info.img_url1}">
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label for="url2">产地图片2</label>
					</div>
					<div class="field">
						<a class="button input-file" href="javascript:void(0);"> + 选择
							<input id="url2" name="url2"
							data-validate="img:只能上传jpg|gif|png格式文件"
							type="file">
						</a><img width="100px" height="100px" alt=""
							src="${info.img_url2}">
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label for="url3">产地图片3</label>
					</div>
					<div class="field">
						<a class="button input-file" href="javascript:void(0);"> + 选择
							<input id="url3" name="url3"
							data-validate="img:只能上传jpg|gif|png格式文件"
							type="file">
						</a>
						<img width="100px" height="100px" alt=""
							src="${info.img_url3}">
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label for="city">所在城市</label>
					</div>
					<div class="field" style="padding-top: 7px">
						<input style="width: 100px; margin-right: 20px" type="text"
							class="input" id="city" value="${info.city}"
							name="city" size="50" placeholder="城市"
							data-validate="required:请填写城市" />
					</div>

				</div>
				
				<div class="form-group">
					<div class="label">
						<label for="area">所在区域</label>
					</div>
					<div class="field" style="padding-top: 7px">
						<input style="width: 100px; margin-right: 20px" type="text"
							class="input" id="area" value="${info.area}"
							name="area" size="50" placeholder="区域"
							data-validate="required:请填写域" />
					</div>

				</div>

				<div class="form-group">
					<div class="label">
						<label for="address">学车地址</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="address" name="address"
							maxlength="200" size="50" placeholder="学车地址"
							value="${info.address}"
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