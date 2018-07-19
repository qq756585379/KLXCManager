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
<title>快来学车后台管理-驾校资料添加</title>
<script type="text/javascript" src="../js/jsAddress.js"></script>
<script>
	function typeChg(val) {
		document.getElementById("class_type1").checked = false;
		document.getElementById("class_type2").checked = false;
		document.getElementById("class_type3").checked = false;
		document.getElementById("class_type4").checked = false;
		document.getElementById("class_type").value = '';
		if (val == 0) {
			document.getElementById("type_1").style.display = "block";
			document.getElementById("type_2").style.display = "none";
		} else {
			document.getElementById("type_1").style.display = "none";
			document.getElementById("type_2").style.display = "block";
		}
	}
	
	function typeSelect(obj) {
		var typeObj = document.getElementById("class_type")
		var val = ","+obj.value;
		if(obj.checked) {
			typeObj.value = typeObj.value + val;
		} else {
			typeObj.value = typeObj.value.replace(val, '');
		}
	}
	
</script>

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
				action="<%=basePath%>school/addSchool" style="padding-right: 20px">
				<div class="form-group">
					<div class="label">
						<label for="name">驾校名称</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="name" name="name"
							maxlength="40" size="50" placeholder="驾校名称" value="${info.name}"
							data-validate="required:请填写驾校名称" />
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label for="type">驾校类型</label>
					</div>
					<div class="field" style="width: 200px" align="left">
						<select class="input" name="type" id="type"
							data-validate="required:请选择驾校类型" onchange="typeChg(this.value)">
							<option value="">请选择</option>
							<option value="0">自营</option>
							<option value="1">合作</option>
						</select>
					</div>
				</div>
				<input type="hidden" id="class_type" name="class_type" />
				<div class="form-group">
					<div class="label">
						<label for="class_type">班级</label>
					</div>
					<div id="type_1" class="controls" style="padding-top: 8px">
						<label class="checkbox inline"> <input type="checkbox"
							id="class_type1" value="1" onclick="typeSelect(this)"> 自营计时
						</label> <label class="checkbox inline" style="margin-left: 20px">
							<input type="checkbox" id="class_type2" value="2" onclick="typeSelect(this)"> 自营非计时
						</label>
					</div>

					<div id="type_2" class="controls"
						style="padding-top: 8px; display: none;">
						<label class="checkbox inline"> <input type="checkbox"
							id="class_type3" value="11" onclick="typeSelect(this)"> 合作计时
						</label> <label class="checkbox inline" style="margin-left: 20px">
							<input type="checkbox" id="class_type4" value="12" onclick="typeSelect(this)">
							合作非计时
						</label>
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label for="city">驾校所在城市</label>
					</div>
					<div class="field" style="padding-top: 7px">
						省：<select id="cmbProvince" name="province"></select> 市：<select
							id="cmbCity" name="city"></select> <select id="cmbArea"
							name="area"></select>
						<script type="text/javascript">
							addressInit('cmbProvince', 'cmbCity', 'cmbArea');
						</script>
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label for="address">驾校地址</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="address" name="address"
							maxlength="200" size="50" placeholder="驾校地址" value="${info.address}"
							data-validate="required:请填写驾校地址" />
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