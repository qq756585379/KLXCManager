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
<title>快来学车后台管理-场地详情</title>
</head>

<body onload="load('place')">
	<jsp:include page="../head.jsp"></jsp:include>
	<div class="admin">
		<form class="form-x">
			<div class="form-group">
				<div class="label">
					<label>场地名称</label>
				</div>
				<div class="field" style="padding-top: 8px">
					<label>${info.name}</label>
				</div>
			</div>
			
			<div class="form-group">
				<div class="label">
					<label for="coach_school_age">服务内容</label>
				</div>
				<div class="field" style="padding-top: 8px">
					<label>${info.service_content}</label>
				</div>
			</div>

			<div class="form-group">
				<div class="label">
					<label for="coach_favicon_url">场地图片1</label>
				</div>
				<div class="field" style="padding-top: 8px">
					<img width="80px" height="80px" alt=""
						src="${info.img_url1}">
				</div>
			</div>

			<div class="form-group">
				<div class="label">
					<label for="coach_image1_url">场地图片2</label>
				</div>
				<div class="field" style="padding-top: 8px">
					<img width="100px" height="100px" alt=""
						src="${info.img_url2}">
				</div>
			</div>

			<div class="form-group">
				<div class="label">
					<label for="coach_image2_url">场地图片3</label>
				</div>
				<div class="field" style="padding-top: 8px">
					<img width="100px" height="100px" alt=""
						src="${info.img_url3}">
				</div>
			</div>

			<div class="form-group">
				<div class="label">
					<label for="coach_city">所在城市</label>
				</div>
				<div class="field" style="padding-top: 8px">
					<label>${info.city}</label>
				</div>
			</div>
			
			<div class="form-group">
				<div class="label">
					<label for="coach_area">所在区域</label>
				</div>
				<div class="field" style="padding-top: 8px">
					<label>${info.area}</label>
				</div>
			</div>

			<div class="form-group">
				<div class="label">
					<label for="coach_address">学车地址
					</label>
				</div>
				<div class="field" style="padding-top: 8px">
					<label>${info.address}</label>
				</div>
			</div>
			<div class="form-button">
				<button class="button bg-main" type="button"
					onclick="history.back();">返回</button>
			</div>
		</form>


	</div>

</body>
</html>