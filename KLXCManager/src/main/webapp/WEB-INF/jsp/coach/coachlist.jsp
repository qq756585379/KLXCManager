<%@ page language="java" import="java.util.*" contentType="text/html; utf-8" pageEncoding="utf-8" %>
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
    <title>快来学车后台管理-教练列表</title>
</head>

<body onload="load('operate')">
<jsp:include page="../head.jsp"></jsp:include>
<div class="admin">
    <form method="post">
        <div class="panel admin-panel">
            <div class="panel-head">
                <strong>教练列表</strong>
            </div>
            <table class="table table-hover">
                <tr>
                    <th width="100">姓名</th>
                    <th width="100">驾龄</th>
                    <th width="100">教龄</th>
                    <th width="100">分类</th>
                    <th width="100">手机号码</th>
                    <th width="100">性别</th>
                    <th width="100">城市</th>
                    <th width="100">区/县</th>
                    <th width="100">车牌</th>
                    <th width="100">车品牌</th>
                    <th width="100">培训人数</th>
                    <th width="100">科目二通过率</th>
                    <th width="100">科目三通过率</th>
                    <th width="100">场地</th>
                    <th width="100">班级</th>
                    <th width="100">操作</th>
                </tr>
                <c:forEach var="item" items="${list}">
                    <tr>
                        <td>${item.coach_name}</td>
                        <td>${item.coach_driving_years}</td>
                        <td>${item.coach_school_age}</td>
                        <td>${item.coach_lesson}</td>
                        <td>${item.coach_telephone}</td>
                        <td>${item.coach_sex_desc}</td>
                        <td>${item.coach_city}</td>
                        <td>${item.coach_area}</td>
                        <td>${item.car_no}</td>
                        <td>${item.car_type}</td>
                        <td>${item.sign_num}</td>
                        <td>${item.pass_rate_two}%</td>
                        <td>${item.pass_rate_three}%</td>
                        <td>${item.place_name}</td>
                        <td>${item.class_name}</td>
                        <td>
                            <a class="button border-yellow button-little"
                               href="<%=basePath%>coach/coachInfo?id=${item.id}">详情</a>
                            <a class="button border-yellow button-little"
                               href="<%=basePath%>coach/toCoachEdit?id=${item.id}">修改</a>
                            <a class="button border-yellow button-little"
                               href="<%=basePath%>coach/toBind?id=${item.id}&city=${item.coach_city}">分配场地班级</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
            <jsp:include page="../pagefooter.jsp"></jsp:include>
        </div>
    </form>
</div>

</body>
</html>