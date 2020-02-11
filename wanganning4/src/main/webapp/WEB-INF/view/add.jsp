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
				<th>姓名</th>
				<td><input type="text" name="name"></td>
			</tr>
			
			<tr>
				<th>性别</th>
				<td>
					男<input type="radio" name="gender" value="男">
					女<input type="radio" name="gender" value="女">
				</td>
			</tr>
			
			<tr>
				<th>生日</th>
				<td><input type="date" name="birthday"></td>
			</tr>
			
			<tr>
				<th>毕业大学</th>
				<td><input type="text" name="college"></td>
			</tr>
			
			<tr>
				<th>所学专业</th>
				<td><input type="text" name="major"></td>
			</tr>
			
			<tr>
				<th>学历</th>
				<td>
				<select name="edu">
					<option value="1">专科</option>
					<option value="2">本科</option>
					<option value="3">研究生</option>
				</select>
				</td>
			</tr>
			
			<tr>
				<th>学位</th>
				<td>
					<select name="degree">
					<option value="1">学士</option>
					<option value="2">硕士</option>
					<option value="3">博士</option>
				</select>
				</td>
			</tr>
			<tr>
				<td>
					<button onclick="add()">录入</button>
				</td>
			</tr>
		</table>
	</form>
	<script type="text/javascript">
		function add() {
			$.post("addApplicant",$("form").serialize(), function(msg) {
				if(msg)
				{
					alert("录入成功");
					location.href="listApplicant";
				}
				else
				{
					alert("录入失败");
				}
			})
		}
		
	</script>
</body>
</html>