<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>电影的列表</title>
</head>
<body>

	<table>
		<tr>
			<td>序号</td>
			<td>电影名称</td>
			<td>导演</td>
			<td>上映日期</td>
			<td>电影时长</td>
			<td>年代</td>
			<td>类型</td>
			<td>区域</td>
			<td>状态</td>

		</tr>
		<c:forEach items="${movies }" var="movie" varStatus="i">

			<tr>
				<td>${i.count }</td>
				<td>${movie.name }</td>
				<td>${movie.actor }</td>
				<td>${movie.uptime }</td>
				<td>${movie.longtime }</td>
				<td>${movie.years }</td>
				<td>${movie.area }</td>
				<td>${movie.status }</td>
			</tr>


		</c:forEach>


	</table>

</body>
</html>