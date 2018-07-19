<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<div class="panel-foot text-center">
	<ul class="pagination">
		<c:choose>
			<c:when test="${curPage > 1}">
				<li><a href="<%=basePath%>${url}?page=${curPage-1}">上一页</a></li>
			</c:when>
			<c:otherwise>
				<li><a href="<%=basePath%>${url}?page=${curPage}">上一页</a></li>
			</c:otherwise>
		</c:choose>
	</ul>
	<ul class="pagination pagination-group">
		<c:forEach var="page" begin="1" end="${totalPage}" step="1">
			<c:choose>
				<c:when test="${curPage == page}">
					<li><a class="active"
						href="<%=basePath%>${url}?page=${page}">${page}</a></li>
				</c:when>
				<c:otherwise>
					<li><a href="<%=basePath%>${url}?page=${page}">${page}</a></li>
				</c:otherwise>
			</c:choose>
		</c:forEach>
	</ul>
	<ul class="pagination">
		<c:choose>
			<c:when test="${curPage < totalPage}">
				<li><a href="<%=basePath%>${url}?page=${curPage+1}">下一页</a></li>
			</c:when>
			<c:otherwise>
				<li><a href="<%=basePath%>${url}?page=${curPage}">下一页</a></li>
			</c:otherwise>
		</c:choose>
	</ul>
</div>