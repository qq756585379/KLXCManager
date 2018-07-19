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
<title>快来学车后台管理-资料上传</title>
<script type="text/javascript" src="../js/jsAddress.js"></script>
</head>

<body onload="load('operate')">
	<jsp:include page="../head.jsp"></jsp:include>
	<div class="admin">
		<div class="panel admin-panel">
			<div class="panel-head">
				<strong>教练资料上传</strong>
			</div>
			<br /> <br />
			<form method="post" enctype="multipart/form-data" class="form-x"
				action="<%=basePath%>coach/addCoach" style="padding-right: 20px">
				<div class="form-group">
					<div class="label">
						<label for="coach_name">教练姓名</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="coach_name" name="coach_name" maxlength="20"
							size="50" placeholder="教练姓名" data-validate="required:请填写教练姓名" />
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label for="coach_telephone">手机号码</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="coach_telephone"
							name="coach_telephone" size="50" placeholder="手机号码" maxlength="20"
							data-validate="required:输入手机号码" />
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label>性别</label>
					</div>
					<div class="field">
						<div class="button-group button-group-small radio">
							<label class="button active"><input name="coach_sex"
								value="0" checked="checked" type="radio"><span
								class="icon icon-check"></span> 男</label> <label class="button"><input
								name="coach_sex" value="1" type="radio"><span
								class="icon icon-times"></span> 女</label>
						</div>
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label for="coach_driving_years">驾龄</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="coach_driving_years" maxlength="2"
							name="coach_driving_years" size="50" placeholder="驾龄"
							data-validate="required:请填写驾龄" />
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label for="coach_school_age">教龄</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="coach_school_age" maxlength="2"
							name="coach_school_age" size="50" placeholder="教龄"
							data-validate="required:请填写教龄" />
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label for="coach_lesson">教练所教授课程</label>
					</div>
					<div class="field" style="width: 200px" align="left">
						<select class="input" name="coach_lesson" id="coach_lesson"
							data-validate="required:请选择教练所教授课程">
							<option value="">请选择</option>
							<option value="C1">C1</option>
							<option value="C2">C2</option>
							<option value="C3">C3</option>
							<option value="B1">B1</option>
							<option value="B2">B2</option>
							<option value="B3">B3</option>
							<option value="A1">A1</option>
							<option value="A2">A2</option>
							<option value="A3">A3</option>
						</select>
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label for="coach_favicon_url">头像</label>
					</div>
					<div class="field">
						<a class="button input-file" href="javascript:void(0);"> + 选择
							<input id="coach_favicon_url" name="coach_favicon_url"
							data-validate="required:请选择文件,img:只能上传jpg|gif|png格式文件"
							type="file">
						</a>
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label for="coach_city">教练所在城市</label>
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
						<label for="car_no">车牌</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="car_no" 
							name="car_no" size="50" placeholder="车牌"
							data-validate="required:请填写车牌" />
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label for="car_type">车品牌</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="car_type"
							name="car_type" size="50" placeholder="车品牌"
							data-validate="required:请填写车品牌" />
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label for="sign_num">培训人数</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="sign_num"
							name="sign_num" size="50" placeholder="培训人数"
							data-validate="required:请填写培训人数" />
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label for="pass_rate_two">科目二通过率</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="pass_rate_two"
							name="pass_rate_two" size="50" placeholder="科目二通过率"
							data-validate="required:请填写科目二通过率" />
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label for="pass_rate_three">科目三通过率</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="pass_rate_three"
							name="pass_rate_three" size="50" placeholder="科目三通过率"
							data-validate="required:请填写科目三通过率" />
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