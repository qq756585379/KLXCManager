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
<title>快来学车后台管理-班级资料添加</title>
<script type="text/javascript">
	function chgCity(a) {
		var v_url = "<%=basePath%>pclass/getPlaceList?city=" + a.value; 
		$.ajax({
			url: v_url,
			type:"get",
			datatype:"json",
			success:function(data){
				$("#place_id").html("");
				$("#place_id").append("<option value=''>请选择</option>");
				setData($("#place_id"), data)
			}
		})
	}
	
	function setData(object, data) {
		$.each(JSON.parse(data), function(i, item){
			object.append($('<option/>', {
				value : item.id,
				text: item.name
			}));
		});
	}
	
</script>
</head>

<body onload="load('place')">
	<jsp:include page="../head.jsp"></jsp:include>
	<div class="admin">
		<div class="panel admin-panel">
			<div class="panel-head">
				<strong>班级资料添加</strong>
			</div>
			<br /> <br />
			<form method="post" enctype="multipart/form-data" class="form-x"
				action="<%=basePath%>pclass/addClass" style="padding-right: 20px">
				<div class="form-group">
					<div class="label">
						<label for="name">班级名称</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="name" name="name"
							maxlength="40" size="50" placeholder="班级名称"
							value="${info.name}"
							data-validate="required:请填写班级名称" />
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label for="price">价格</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="price" name="price"
							maxlength="40" size="50" placeholder="价格"
							value="${info.price}"
							data-validate="required:请填写价格" />
					</div>
				</div>
				
				
				<div class="form-group">
					<div class="label">
						<label for="price_open">开班费</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="price_open" name="price_open"
							maxlength="40" size="50" placeholder="开班费"
							value="${info.price_open}"
							data-validate="required:请填写开班费" />
					</div>
				</div>
				
				
				<div class="form-group">
					<div class="label">
						<label for="price_hour">每课时单价</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="price_hour" name="price_hour"
							maxlength="40" size="50" placeholder="每课时单价"
							value="${info.price_hour}"
							data-validate="required:请填写每课时单价" />
					</div>
				</div>
				
				
				<div class="form-group">
					<div class="label">
						<label for="total_hour">总共课时</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="total_hour" name="total_hour"
							maxlength="40" size="50" placeholder="总共课时"
							value="${info.total_hour}"
							data-validate="required:请填写总共课时" />
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label for="min_hour">最小要买入的课时</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="min_hour" name="min_hour"
							maxlength="40" size="50" placeholder="最小要买入的课时"
							value="${info.min_hour}"
							data-validate="required:请填写最小要买入的课时" />
					</div>
				</div>
				
				
				<div class="form-group">
					<div class="label">
						<label for="save_money">省钱(%)</label>
					</div>
					<div class="field" style="width: 100px">
						<input type="text" class="input" id="save_money" name="save_money"
							maxlength="40" size="50" placeholder="省钱"
							value="${info.save_money}"
							data-validate="required:请填写省钱" />
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label for="save_time">省时(%)</label>
					</div>
					<div class="field" style="width: 100px">
						<input type="text" class="input" id="save_time" name="save_time"
							maxlength="40" size="50" placeholder="省时"
							value="${info.save_time}"
							data-validate="required:请填写省时" />
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label for="lesson">课程类型</label>
					</div>
					<div class="field" style="width: 200px" align="left">
						<select class="input" name="lesson" id="lesson"
							data-validate="required:请选择课程类型">
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
						<label for="class_type">班级类型</label>
					</div>
					<div class="field" style="width: 200px" align="left">
						<select class="input" name="class_type" id="class_type"
							data-validate="required:请选择班级类型">
							<option value="">请选择</option>
							<option value="1">自营计时</option>
							<option value="2">自营非计时</option>
							<option value="11">合作计时</option>
							<option value="12">合作非计时</option>
						</select>
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label for="city">城市</label>
					</div>
					<div class="field" style="width: 200px" align="left">
						<select class="input" name="city" id="city"
							data-validate="required:请选择场地" onchange="chgCity(this)">
							<c:forEach var="item" items="${cityList}">
								<option value="${item.city_name}" ${(item.city_name==city)?'selected' : ''}>${item.city_name}</option>
							</c:forEach>
						</select>
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label for="place_id">场地</label>
					</div>
					<div class="field" style="width: 200px" align="left">
						<select class="input" name="place_id" id="place_id"
							data-validate="required:请选择场地">
							<option value="">请选择</option>
							<c:forEach var="item" items="${placelist}">
								<option value="${item.id}">${item.name}</option>
							</c:forEach>
						</select>
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label for="service_content">特色服务</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="service_content" name="service_content"
							maxlength="200" size="50" placeholder="特色服务"
							value="${info.service_content}"
							data-validate="required:请填写特色服务" />
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label for="bus_plan">接送方案</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="bus_plan" name="bus_plan"
							maxlength="200" size="50" placeholder="接送方案"
							value="${info.bus_plan}"
							data-validate="required:请填写接送方案" />
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label for="price_remark">费用说明</label>
					</div>
					<div class="field">
						<input type="text" class="input" id="price_remark" name="price_remark"
							maxlength="200" size="50" placeholder="费用说明"
							value="${info.price_remark}"
							data-validate="required:请填写费用说明" />
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