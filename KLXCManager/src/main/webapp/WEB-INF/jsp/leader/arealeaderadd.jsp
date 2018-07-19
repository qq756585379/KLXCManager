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
<title>快来学车后台管理-添加区域负责人</title>
<script type="text/javascript" src="../js/jsAddress.js"></script>
<script type="text/javascript">
	function aclick(a) {
		var name = document.getElementById("nickName").value;  
        //指定<a>标签的href  
        a.href = "<%=basePath%>leaderarea/searchByName?nickName=" + name; 
	}
</script>
</head>

<body onload="load('city')">
	<jsp:include page="../head.jsp"></jsp:include>
	<div class="admin">
		<div class="panel admin-panel">
			<div class="panel-head">
				<strong>添加区域负责人</strong>
			</div>
			<br /> <br />
			<form method="post" class="form-x"
				action="<%=basePath%>leaderarea/addLeader" style="padding-right: 20px">
				<div class="form-group">
					<div class="label">
						<label for="nickName">用户姓名</label>
					</div>
					<div class="field" style="width: 200px">
						<input type="text" class="input" id="nickName" name="nickName" value="${nickName}"
							size="50" placeholder="用户姓名" data-validate="required:输入用户姓名" />
					</div>
					<a style="margin-left: 30px" class="button bg-main" onclick="aclick(this);">搜索</a>
					<strong style="color: red;">（请先搜索用户信息，在添加）</strong>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label for="nickname">用户信息</label>
					</div>
					<div class="field" style="padding-top: 5px">
						<c:forEach var="item" items="${list}">
						<label class="radio"> <input type="radio"
							value="${item.userId},${item.nickName},${item.phone}" name="userinfo" checked="checked"> ${item.nickName}
						</label><br/>
						</c:forEach>
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label for="city_name">城市</label>
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

				<div class="form-button">
					<button class="button bg-main" type="submit">添加</button>
				</div>
				
			</form>
			<br /> <br />
		</div>
	</div>

</body>
</html>