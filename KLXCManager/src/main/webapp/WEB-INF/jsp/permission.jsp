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
<title>快来学车后台管理-权限管理</title>
</head>

<body onload="load('perm')">
	<jsp:include page="head.jsp"></jsp:include>
	<div class="admin">
		<form method="post">
			<div class="panel admin-panel">
				<div class="panel-head">
					<strong>权限列表</strong>
				</div>
				<table class="table table-hover">
					<tr>
						<th width="100">ID</th>
						<th width="100">权限名称</th>
						<th width="*">描述</th>
						<th width="100">操作</th>
					</tr>
					<c:forEach var="item" items="${list}">
						<tr>
							<td>${item.tid}</td>
							<td>${item.name}</td>
							<td>${item.remark}</td>
							<td><a class="button border-yellow button-little" href="<%=basePath%>perm/uptPerm?tid=${item.tid}">绑定</a><a
								class="button border-yellow button-little" href="<%=basePath%>perm/delPerm?tid=${item.tid}">删除</a></td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</form>
		<br /> <br />
		<div class="panel admin-panel">
			<div class="panel-head">
				<strong>添加角色</strong>
			</div>
			<br /> <br />
			<form method="post" class="form-x" action="<%=basePath%>perm/addPerm">

				<div class="form-group">
					<div class="label">
						<label for="name">角色名</label>
					</div>
					<div class="field" style="width: 200px">
						<input type="text" class="input" id="name" name="name" size="50"
							placeholder="角色名" data-validate="required:输入角色名" />
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label for="remark">角色描述</label>
					</div>
					<div class="field" style="width: 200px">
						<input type="text" class="input" id="remark" name="remark" size="50"
							placeholder="角色描述" data-validate="required:输入角色描述" />
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