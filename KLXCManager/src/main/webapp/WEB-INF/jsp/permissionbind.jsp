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

<link rel="stylesheet" href="../js/js/zTree_v3-master/css/demo.css"
	type="text/css">
<link rel="stylesheet"
	href="../js/zTree_v3-master/css/zTreeStyle/zTreeStyle.css"
	type="text/css">
<script type="text/javascript"
	src="../js/zTree_v3-master/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript"
	src="../js/zTree_v3-master/js/jquery.ztree.core.js"></script>
<script type="text/javascript"
	src="../js/zTree_v3-master/js/jquery.ztree.excheck.js"></script>

<SCRIPT type="text/javascript">
	var setting = {
		check : {
			enable : true
		},
		data : {
			simpleData : {
				enable : true
			}
		}
	};

	var zNodes = [

	{
		id : 11,
		pId : 1,
		name : "can check 1-1",
		open : true
	}, {
		id : 111,
		pId : 11,
		name : "can check 1-1-1"
	}, {
		id : 112,
		pId : 11,
		name : "can check 1-1-2"
	}, {
		id : 12,
		pId : 1,
		name : "can check 1-2",
		open : true
	}, {
		id : 121,
		pId : 12,
		name : "can check 1-2-1"
	}, {
		id : 122,
		pId : 12,
		name : "can check 1-2-2"
	}, ];

	var code;

	function setCheck() {
		var zTree = $.fn.zTree.getZTreeObj("treeDemo"), py = $("#py").attr(
				"checked") ? "p" : "", sy = $("#sy").attr("checked") ? "s" : "", pn = $(
				"#pn").attr("checked") ? "p" : "", sn = $("#sn")
				.attr("checked") ? "s" : "", type = {
			"Y" : py + sy,
			"N" : pn + sn
		};
		zTree.setting.check.chkboxType = type;
		showCode('setting.check.chkboxType = { "Y" : "' + type.Y + '", "N" : "'
				+ type.N + '" };');
	}
	function showCode(str) {
		if (!code)
			code = $("#code");
		code.empty();
		code.append("<li>" + str + "</li>");
	}

	$(document).ready(function() {
		$.fn.zTree.init($("#treeDemo"), setting, zNodes);
		setCheck();
		$("#py").bind("change", setCheck);
		$("#sy").bind("change", setCheck);
		$("#pn").bind("change", setCheck);
		$("#sn").bind("change", setCheck);
	});
</SCRIPT>
</head>

<body onload="load('perm')">

<ul id="treeDemo" class="ztree"></ul>
				
	

</body>
</html>