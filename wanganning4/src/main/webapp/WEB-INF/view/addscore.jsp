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
	<form>
	<table>
		<tr>
			<th>应聘者</th>
			<td>${listApplicant.name }<input type="hidden" value="${listApplicant.id }" name="aid"></td>
		</tr>
		<tr>
			<th>应聘职位</th>
			<td>
				<select name="jid">
					<c:forEach items="${listjob }" var="j">
						<c:if test="${listApplicant.edu >= j.require_edu}">
							<c:if test="${listApplicant.degree >= j.require_degree }">
								<option value="${j.id }">${j.name }</option>
							</c:if>	
						</c:if>
						
					</c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<th>面试成绩</th>
			<td>
				<select name="score">
				<c:forEach begin="0" end="100" var="i">
					<option value="${i }">${i }</option>
				</c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<td colspan="2"><button type="button" onclick="addscore()">录入成绩</button> </td>
		</tr>
	</table>
	</form>
	
	<script type="text/javascript">
	function addscore() {
		$.post("addscore",$("form").serialize(), function(msg) {
			if(msg)
			{
				alert("录入成功");
				location.href="listApplicant";
			}
		})
	}
		
	</script>
</body>
</html>