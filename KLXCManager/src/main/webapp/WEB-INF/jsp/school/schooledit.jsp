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
<script>
	function loadType() {
		var val = document.getElementById("type").value;
		if (val == 0) {
			document.getElementById("type_1").style.display = "block";
			document.getElementById("type_2").style.display = "none";
		} else {
			document.getElementById("type_1").style.display = "none";
			document.getElementById("type_2").style.display = "block";
		}
	}

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
		var val = "," + obj.value;
		if (obj.checked) {
			typeObj.value = typeObj.value + val;
		} else {
			typeObj.value = typeObj.value.replace(val, '');
		}
	}
</script>
</head>

<body onload="load('place');loadType()">
	<jsp:include page="../head.jsp"></jsp:include>
	<div class="admin">
		<div class="panel admin-panel">
			<div class="panel-head">
				<strong>驾校资料添加</strong>
			</div>
			<br /> <br />
			<form method="post" enctype="multipart/form-data" class="form-x"
				action="<%=basePath%>school/uptSchool" style="padding-right: 20px">
				<input type="hidden" id="id" name="id" value="${info.id}" />
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
							<option value="0" ${(info.type==0)?'selected' : ''}>自营</option>
							<option value="1" ${(info.type==1)?'selected' : ''}>合作</option>
						</select>
					</div>
				</div>
				<input type="hidden" id="class_type" name="class_type"
					value="${info.class_type}" />
				<div class="form-group">
					<div class="label">
						<label for="class_type">班级</label>
					</div>
					<div id="type_1" class="controls" style="padding-top: 8px">
						<label class="checkbox inline"> <input type="checkbox"
							id="class_type1" value="1" onclick="typeSelect(this)"
							${hasType1?'checked' : ''}> 自营计时
						</label> <label class="checkbox inline" style="margin-left: 20px">
							<input type="checkbox" id="class_type2" value="2"
							onclick="typeSelect(this)" ${hasType2?'checked' : ''}>
							自营非计时
						</label>
					</div>
					<div id="type_2" class="controls"
						style="padding-top: 8px; display: none;">
						<label class="checkbox inline"> <input type="checkbox"
							id="class_type3" value="11" onclick="typeSelect(this)"
							${hasType11?'checked' : ''}> 合作计时
						</label> <label class="checkbox inline" style="margin-left: 20px">
							<input type="checkbox" id="class_type4" value="12"
							onclick="typeSelect(this)" ${hasType12?'checked' : ''}>
							合作非计时
						</label>
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label for="city">驾校所在城市</label>
					</div>
					<div class="field" style="padding-top: 7px">
						<input style="width: 100px; margin-right: 20px" type="text"
							class="input" id="city" value="${info.city}" name="city"
							size="50" placeholder="城市" data-validate="required:请填写城市" />
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label for="area">驾校所在区域</label>
					</div>
					<div class="field" style="padding-top: 7px">
						<input style="width: 100px; margin-right: 20px" type="text"
							class="input" id="area" value="${info.area}" name="area"
							size="50" placeholder="区域" data-validate="required:请填写区域" />
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label for="address">驾校地址</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="address" name="address"
							maxlength="200" size="50" placeholder="驾校地址"
							value="${info.address}" data-validate="required:请填写驾校地址" />
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