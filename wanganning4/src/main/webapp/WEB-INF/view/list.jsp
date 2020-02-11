<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="from" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/css/my-login.css">
<script src="/js/jquery.min.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/my-login.js"></script>
<script src="/js/jquery-3.4.1.min.js"></script>
</head>
<body>
	友情链接:<a href="listApplicant">全部应聘信息</a> &nbsp; <a href="toaddApplicant">录入应聘信息</a> &nbsp; <a href="listApplicant?score=90">面试成绩大于90</a> &nbsp; <a href="listApplicant?edu=3">学历研究生</a>
	<table class="table table-hover table-bordered text-center">
		<thead>
			<tr>
				<th>应聘人</th>
				<th>性别</th>
				<th>生日</th>
				<th>毕业学校</th>
				<th>所学专业</th>
				<th>学历</th>
				<th>学位</th>
				<th>分数</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listApplicant }" var="i">
				<tr>
					<td>${i.name }</td>
					<td>${i.gender }</td>
					<td>${i.birthday }</td>
					<td>${i.college }</td>
					<td>${i.major }</td>
					<td>${i.edu == 1 ? "专科" : i.edu == 2 ? "本科" : "研究生"  }</td>
					<td>${i.degree == 1 ? "学士" : i.degree == 2 ? "硕士" : "博士"  }</td>
					<td>${i.score }</td>
					<td><a href="toaddscore?id=${i.id }">录入成绩</a>&nbsp;&nbsp;<a>删除</a></td>
				</tr>
			</c:forEach>
			
		</tbody>
	</table>
</body>
</html>