<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<title>快来学车后台管理-用户添加</title>
<script type="text/javascript" src="../js/jsAddress.js"></script>
</head>

<body onload="load('city')">
	<jsp:include page="head.jsp"></jsp:include>
	<div class="admin">
		<div class="panel admin-panel">
			<div class="panel-head">
				<strong>添加城市负责人</strong>
			</div>
			<br /> <br />
			<form method="post" class="form-x"
				action="<%=basePath%>rebate/addRebate"
				style="padding-right: 20px">
				<div class="form-group">
					<div class="label">
						<label for="city_name">地址</label>
					</div>
					<div class="field" style="padding-top: 7px">
						省：<select id="cmbProvince" name="province"></select> 市：<select
							id="cmbCity" name="city"></select> <select id="cmbArea"
							name="area" style="display: none;"></select>
						<script type="text/javascript">
							addressInit('cmbProvince', 'cmbCity', 'cmbArea');
						</script>
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label for="city_rebate">折扣价格</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="city_rebate"
							name="city_rebate" size="50" placeholder="折扣价格"
							data-validate="required:输入折扣价格" />
					</div>
				</div>
				<div class="form-button">
					<button class="button bg-main" type="submit">提交</button>
				</div>
			</form>
			<br/>
			<br/>
		</div>
	</div>

</body>
</html>