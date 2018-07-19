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
<title>快来学车后台管理-分配教练</title>
<script type="text/javascript" src="../js/jquery.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#sch_id").change(function() {
			var ids = $("#ids").val();
			var idArry = ids.split(",");
			
			var names = $("#names").val();
			var nameArry = names.split(",");
			
			var schnames = $("#schnames").val();
			var schnameArry = schnames.split(",");
			
			var name = $("#sch_id option:selected").val();
			
			// 先清空第二个 
			$("#coach_id").empty();
			
			for (var i = 0; i < schnameArry.length; i++) {
				if(name == schnameArry[i]) {
					var option = $("<option>").val(idArry[i]).text(nameArry[i]);
					$("#coach_id").append(option);
				}
			}
		});
	})
</script>
<script type="text/javascript">
	
</script>
</head>

<body onload="load('place')">
	<jsp:include page="../head.jsp"></jsp:include>
	<div class="admin">
		<div class="panel admin-panel">
			<div class="panel-head">
				<strong>分配教练</strong>
			</div>
			<br /> <br />
			<form method="post" enctype="multipart/form-data" class="form-x"
				action="<%=basePath%>student/uptStudent" style="padding-right: 20px">
				<input type="hidden" id="tid" name="tid" value="${info.tid}" /> 
				<input type="hidden" id="ids" name="ids" value="${ids}" />
				<input type="hidden" id="names" name="names" value="${names}" />
				<input type="hidden" id="schnames" name="schnames" value="${schnames}" />
				<div class="form-group">
					<div class="label">
						<label>学员姓名</label>
					</div>
					<div class="field" style="padding-top: 8px">
						<label>${info.stu_name}</label>
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label>学员电话</label>
					</div>
					<div class="field" style="padding-top: 8px">
						<label>${info.stu_phone}</label>
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label>报名场地</label>
					</div>
					<div class="field" style="padding-top: 8px">
						<label>${info.place_name}</label>
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label>班级类型</label>
					</div>
					<div class="field" style="padding-top: 8px">
						<label>${info.class_type_desc}</label>
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label>班级费用</label>
					</div>
					<div class="field" style="padding-top: 8px">
						<label>${info.class_money}</label>
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label>报名时间</label>
					</div>
					<div class="field" style="padding-top: 8px">
						<label>${info.create_time}</label>
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label for="sch_id">场地包含驾校</label>
					</div>
					<div class="field" style="width: 200px" align="left">
						<select class="input" name="sch_id" id="sch_id">
							<c:forEach var="item" items="${schList}">
								<option value="${item.name}">${item.name}</option>
							</c:forEach>
						</select>
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label for="coach_id">教练</label>
					</div>
					<div class="field" style="width: 200px" align="left">
						<select class="input" name="coach_id" id="coach_id">
							<c:forEach var="item" items="${coaList}">
								<option value="${item.coach_id}">${item.coach_name}</option>
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