<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <meta name="renderer" content="webkit">
    <title>快来学车后台管理-广告图片</title>
</head>

<body onload="load('operate')">
<jsp:include page="head.jsp"></jsp:include>
<div class="admin">
    <form method="post">
        <div class="panel admin-panel">
            <div class="panel-head">
                <strong>广告图片列表</strong>
            </div>
            <table class="table table-hover">
                <tr>
                    <th width="100">ID</th>
                    <th width="*">地址</th>
                    <th width="200">时间</th>
                    <th width="100">操作</th>
                </tr>
                <c:forEach var="item" items="${list}">
                    <tr>
                        <td>${item.id}</td>
                        <td>${item.url}</td>
                        <td>${item.create_time}</td>
                        <td>
                            <a class="button border-yellow button-little"
                               href="<%=basePath%>banner/delBanner?id=${item.id}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </form>
    <br/>
    <br/>
    <div class="panel admin-panel">
        <div class="panel-head">
            <strong>添加广告图片</strong>
        </div>
        <br/>
        <br/>
        <form method="post" class="form-x" enctype="multipart/form-data" action="<%=basePath%>banner/addBanner">
            <div class="form-group">
                <div class="label">
                    <label for="url">图片</label>
                </div>
                <div class="field">
                    <a class="button input-file" href="javascript:void(0);"> + 选择
                        <input id="url" name="url"
                               data-validate="required:请选择文件,img:只能上传jpg|gif|png格式文件"
                               type="file">
                    </a>
                </div>
            </div>
            <div class="form-button">
                <button class="button bg-main" type="submit">添加</button>
            </div>
        </form>
        <br/>
        <br/>
    </div>
</div>

</body>
</html>