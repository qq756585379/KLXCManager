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
<title>快来学车后台管理-教练资料详情</title>
</head>

<body onload="load('operate')">
	<jsp:include page="../head.jsp"></jsp:include>
	<div class="admin">
		<form class="form-x">
			<div class="form-group">
				<div class="label">
					<label>教练姓名</label>
				</div>
				<div class="field" style="padding-top: 8px">
					<label>${coach.coach_name}</label>
				</div>
			</div>
			
			<div class="form-group">
				<div class="label">
					<label for="coach_school_age">手机号码</label>
				</div>
				<div class="field" style="padding-top: 8px">
					<label>${coach.coach_telephone}</label>
				</div>
			</div>
			<div class="form-group">
				<div class="label">
					<label>性别</label>
				</div>
				<div class="field" style="padding-top: 8px">
					<label>${coach.coach_sex_desc}</label>
				</div>
			</div>

			<div class="form-group">
				<div class="label">
					<label for="coach_name">驾龄</label>
				</div>
				<div class="field" style="padding-top: 8px">
					<label>${coach.coach_driving_years}</label>
				</div>
			</div>
			<div class="form-group">
				<div class="label">
					<label for="coach_school_age">教龄</label>
				</div>
				<div class="field" style="padding-top: 8px">
					<label>${coach.coach_school_age}</label>
				</div>
			</div>


			<div class="form-group">
				<div class="label">
					<label for="coach_lesson">教练所教授课程</label>
				</div>
				<div class="field" style="padding-top: 8px">
					<label>${coach.coach_lesson}</label>

				</div>
			</div>

			<div class="form-group">
				<div class="label">
					<label for="coach_favicon_url">头像</label>
				</div>
				<div class="field" style="padding-top: 8px">
					<img width="80px" height="80px" alt=""
						src="${coach.coach_favicon_url}">
				</div>
			</div>

			

			<div class="form-group">
				<div class="label">
					<label for="coach_city">教练所在城市</label>
				</div>
				<div class="field" style="padding-top: 8px">
					<label>${coach.coach_city} ${coach.coach_area}</label>
				</div>
			</div>


			<div class="form-group">
					<div class="label">
						<label for="car_no">车牌</label>
					</div>
					<div class="field">
						<label>${coach.car_no}</label>
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label for="car_type">车品牌</label>
					</div>
					<div class="field">
						<label>${coach.car_type}</label>
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label for="sign_num">培训人数</label>
					</div>
					<div class="field">
						<label>${coach.sign_num}</label>
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label for="pass_rate_two">科目二通过率</label>
					</div>
					<div class="field">
						<label>${coach.pass_rate_two}%</label>
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label for="pass_rate_three">科目三通过率</label>
					</div>
					<div class="field">
						<label>${coach.pass_rate_three}%</label>
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