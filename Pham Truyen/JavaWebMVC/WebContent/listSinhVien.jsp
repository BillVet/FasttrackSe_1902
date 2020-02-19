<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sach sinh vien</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.css" rel="stylesheet">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container-fluid">
		<div>
			<h3>Xin chao: ${user.username};</h3>
			<h2 style="text-align: center;color: blue">Danh sach sinh vien</h2>
		
			<table class="table table-hover" style = "width: 1000px">
				<thead>
					<tr>
						<td>ID</td>
						<td>Name</td>
						<td>Age</td>
						<td>Class</td>
						<td>Gender</td>
						<td></td>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${listSinhvien}" var="sinhvien">
						<tr>
							<td><c:out value="${sinhvien.id}"></c:out></td>
							<td><c:out value="${sinhvien.name}"></c:out></td>
							<td><c:out value="${sinhvien.age}"></c:out></td>
							<td><c:out value="${sinhvien.clas}"></c:out></td>
							<td><c:out value="${sinhvien.gender}"></c:out></td>
							<td><a href="<%="request.getContextPath()"%>/FormSV.jsp">Add</a></td>
							<td><a href="<%="request.getContextPath()"%>/edit?id=<c:out value = '${sinhvien.id}'></c:out>" data-toggle = "tooltip">Edit</a></td>
							<td><a href="<%="request.getContextPath()"%>/delete?id=<c:out value = '${sinhvien.id}'></c:out>">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>