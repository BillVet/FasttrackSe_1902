<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.css"
	rel="stylesheet">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
	<a href="/MVC/danhsach" class="btn btn-warning" style="margin: 10px">
		Trang chu</a>
	<a class="btn btn-primary pull-right"
		style="float: right; margin: 10px"
		href="<%=request.getContextPath()%>/logout">logout</a>
	<p class="btn " style="float: right; margin: 10px; color: green">
		<c:out value=" ${user}"></c:out>
	</p>

	<div class="container" style="margin-top: 30px; padding: 0px 250px">
		<form action="<%=request.getContextPath()%>/edit" method="get">
			<table class="table  table-small m-0 p-0">
				<thead>
					<tr>
						<th class="bg-primary" scope="col" colspan="2"
							style="text-align: center; font-size: 24px;">Thông tin sách</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<th scope="row" class="bg-primary text-center">ID</th>
						<td><input class="form-control form-control-lg" type="text"
							value="<c:out value="${book.id}"></c:out>" name="id"
							readonly="readonly"></td>
					</tr>
					<tr>
						<th scope="row" class="bg-primary text-center">Title</th>
						<td><input class="form-control form-control-lg " type="text"
							value="<c:out value="${book.title}"></c:out>" name="title">
						</td>

					</tr>
					<tr>
						<th scope="row" class="bg-primary text-center">Author</th>
						<td><input class="form-control form-control-lg" type="text"
							value="<c:out value="${book.author}"></c:out>" name="author">
						</td>
					</tr>
					<tr>
						<th scope="row" class="bg-primary text-center">Price</th>
						<td><input class="form-control form-control-lg" type="text"
							value="<c:out value="${book.price}"></c:out>" name="price">
						</td>
					</tr>
					<tr>
						<th scope="row" class="bg-primary text-center">Qty</th>
						<td><input class="form-control form-control-lg" type="text"
							value="<c:out value="${book.qty}"></c:out>" name="qty"></td>
					</tr>
				</tbody>
			</table>
			<button class="btn-block btn btn-success" type="submit">Edit</button>
			<button class="btn-block btn btn-dark"><a href="/MVC/danhsach">Cancle</a></button>
		</form>
	</div>
</body>
</html>