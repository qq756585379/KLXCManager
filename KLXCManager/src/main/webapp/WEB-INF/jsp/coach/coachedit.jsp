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
    <title>快来学车后台管理-资料上传</title>
    <script type="text/javascript" src="../js/jsAddress.js"></script>
</head>

<body onload="load('operate')">
<jsp:include page="../head.jsp"></jsp:include>
<div class="admin">
    <div class="panel admin-panel">
        <div class="panel-head"><strong>教练资料修改</strong></div>
        <br/> <br/>
        <form method="post" enctype="multipart/form-data" class="form-x"
              action="<%=basePath%>coach/uptCoach" style="padding-right: 20px">
            <input type="hidden" id="id" name="id" value="${coach.id}"/>
            <div class="form-group">
                <div class="label">
                    <label for="coach_name">教练姓名</label>
                </div>
                <div class="field">
                    <input type="text" class="input" id="coach_name" name="coach_name"
                           value="${coach.coach_name}" size="50" placeholder="教练姓名"
                           data-validate="required:请填写教练姓名"/>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label for="coach_telephone">手机号码</label>
                </div>
                <div class="field">
                    <input type="text" class="input" id="coach_telephone"
                           name="coach_telephone" value="${coach.coach_telephone}" size="50"
                           placeholder="手机号码" data-validate="required:输入手机号码"/>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>性别</label>
                </div>
                <div class="field">
                    <c:choose>
                        <c:when test="${coach.coach_sex == 0}">
                            <div class="button-group button-group-small radio">
                                <label class="button active"> <input name="coach_sex"
                                                                     value="0" checked="checked" type="radio"><span
                                        class="icon icon-check"></span> 男
                                </label> <label class="button"><input name="coach_sex"
                                                                      value="1" type="radio"><span
                                    class="icon icon-times"></span>
                                女</label>
                            </div>
                        </c:when>
                        <c:otherwise>
                            <div class="button-group button-group-small radio">
                                <label class="button"> <input name="coach_sex"
                                                              value="0" type="radio"><span
                                        class="icon icon-check"></span>
                                    男
                                </label> <label class="button active"><input name="coach_sex"
                                                                             value="1" checked="checked"
                                                                             type="radio"><span
                                    class="icon icon-times"></span> 女</label>
                            </div>
                        </c:otherwise>
                    </c:choose>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label for="coach_driving_years">驾龄</label>
                </div>
                <div class="field">

                    <input type="text" class="input" id="coach_driving_years"
                           value="${coach.coach_driving_years}" name="coach_driving_years"
                           size="50" placeholder="驾龄" data-validate="required:请填写驾龄"/>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label for="coach_school_age">教龄</label>
                </div>
                <div class="field">
                    <input type="text" class="input" id="coach_school_age"
                           value="${coach.coach_school_age}" name="coach_school_age"
                           size="50" placeholder="教龄" data-validate="required:请填写教龄"/>
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
                        <option value="C1" ${(coach.coach_lesson=='C1')?'selected' : ''}>C1</option>
                        <option value="C2" ${(coach.coach_lesson=='C2')?'selected' : ''}>C2</option>
                        <option value="C3" ${(coach.coach_lesson=='C3')?'selected' : ''}>C3</option>
                        <option value="B1" ${(coach.coach_lesson=='B1')?'selected' : ''}>B1</option>
                        <option value="B2" ${(coach.coach_lesson=='B2')?'selected' : ''}>B2</option>
                        <option value="B3" ${(coach.coach_lesson=='B3')?'selected' : ''}>B3</option>
                        <option value="A1" ${(coach.coach_lesson=='A1')?'selected' : ''}>A1</option>
                        <option value="A2" ${(coach.coach_lesson=='A2')?'selected' : ''}>A2</option>
                        <option value="A3" ${(coach.coach_lesson=='A3')?'selected' : ''}>A3</option>
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
                               data-validate="img:只能上传jpg|gif|png格式文件" type="file">
                    </a> <img width="100px" height="100px" alt=""
                              src="${coach.coach_favicon_url}">
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label for="coach_city">教练所在城市</label>
                </div>
                <div class="field" style="padding-top: 7px">
                    <input style="width: 100px; margin-right: 20px" type="text"
                           class="input" id="coach_city" value="${coach.coach_city}"
                           name="coach_city" size="50" placeholder="城市"
                           data-validate="required:请填写城市"/>
                </div>

            </div>

            <div class="form-group">
                <div class="label">
                    <label for="coach_area">教练所在区/县</label>
                </div>
                <div class="field" style="padding-top: 7px">
                    <input style="width: 100px;" type="text" class="input"
                           id="coach_area" value="${coach.coach_area}" name="coach_area"
                           size="50" placeholder="区/县" data-validate="required:请填区/县"/>
                </div>

            </div>

            <div class="form-group">
                <div class="label">
                    <label for="car_no">车牌</label>
                </div>
                <div class="field">
                    <input type="text" class="input" id="car_no" value="${coach.car_no}"
                           name="car_no" size="50" placeholder="车牌"
                           data-validate="required:请填写车牌"/>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label for="car_type">车品牌</label>
                </div>
                <div class="field">
                    <input type="text" class="input" id="car_type" value="${coach.car_type}"
                           name="car_type" size="50" placeholder="车品牌"
                           data-validate="required:请填写车品牌"/>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label for="sign_num">培训人数</label>
                </div>
                <div class="field">
                    <input type="text" class="input" id="sign_num" value="${coach.sign_num}"
                           name="sign_num" size="50" placeholder="培训人数"
                           data-validate="required:请填写培训人数"/>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label for="pass_rate_two">科目二通过率</label>
                </div>
                <div class="field">
                    <input type="text" class="input" id="pass_rate_two" value="${coach.pass_rate_two}"
                           name="pass_rate_two" size="50" placeholder="科目二通过率"
                           data-validate="required:请填写科目二通过率"/>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label for="pass_rate_three">科目三通过率</label>
                </div>
                <div class="field">
                    <input type="text" class="input" id="pass_rate_three" value="${coach.pass_rate_three}"
                           name="pass_rate_three" size="50" placeholder="科目三通过率"
                           data-validate="required:请填写科目三通过率"/>
                </div>
            </div>

            <div class="form-button">
                <button class="button bg-main" type="submit">提交</button>
            </div>
        </form>
        <br/>
        <br/>
    </div>
</div>

</body>
</html>