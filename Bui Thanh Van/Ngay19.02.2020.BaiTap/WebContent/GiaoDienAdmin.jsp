<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-UTF-8">
<title>Insert title here</title>
<link
	href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<style type="text/css">
.themdanhmuc {
	padding: 10px;
	position: absolute;
	left: 50%;
	top: 50%;
	transform: translate(-50%, -50%);
	display: none;
}
.indexqltk{
	display: none;
}
</style>
</head>
<body>
	<div class="container-fluid">
		<div class="row p-2 mb-2 bg-primary text-white">
			<div class="col-6">
				<h3>
					Xin chào:
					<%=request.getParameter("username")%></h3>
			</div>
			<div class="col-6">
				<button class="btn btn-danger float-right">Đăng Xuất</button>
			</div>
		</div>
	</div>
	<div class="container-fluid">
		<div class="row">

			<div class="col-4 ">
				<button class="qldm w-100 mb-1 btn btn-outline-primary">Quản
					lý danh mục</button>
				<button class="qltk w-100 mb-1 btn btn-outline-primary">Quản
					lý tài khoản</button>
			</div>
			<div class="col-8 m-0 p-0">
				<div class="indexqldm">
					<table class="table table-bordered table-dark">
						<thead>
							<tr>
								<th scope="col">Mã danh mục</th>
								<th scope="col">Tên danh mục</th>

							</tr>
						</thead>
						<tbody>
							<c:forEach var="listDanhSachDanhMuc" items="${list}">
								<tr>
									<td><c:out value="${listDanhSachDanhMuc.category_id}"></c:out></td>
									<td><c:out value="${listDanhSachDanhMuc.category_name}"></c:out></td>
									<td><a href="xoadanhmuc?id=${listDanhSachDanhMuc.category_id}"> Xóa </a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>


					<button class="tdmm btn btn-success">Thêm danh mục mới</button>
				</div>
				<div class="indexqltk">
				<table class="table table-bordered table-dark">
						<thead>
							<tr>
								<th scope="col">Mã thành viên</th>
								<th scope="col">User Name</th>
								<th scope="col">Mật khẩu</th>
								<th scope="col">Tên thành viên</th>
								<th scope="col">Email </th>
								<th scope="col">Chức vụ</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="listNhanVien" items="${listnv}">
								<tr>
									<td><c:out value="${listNhanVien.userid}"></c:out></td>
									<td><c:out value="${listNhanVien.username}"></c:out></td>
									<td><c:out value="${listNhanVien.password}"></c:out></td>
									<td><c:out value="${listNhanVien.fullname}"></c:out></td>
									<td><c:out value="${listNhanVien.email}"></c:out></td>
									<td><c:out value="${listNhanVien.role}"></c:out></td>
									<td><a href="xoathanhvien?id=${listNhanVien.userid}"> Xóa </a></td>
									
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>

	</div>

	<div class="themdanhmuc border border-primary bg-light">
		<form class="form-horizontal"
			action="/Ngay19.02.2020.BaiTap/themdanhmuc" method="post"
			id="login_form">
			<input name="category_id" placeholder="Mã danh mục"
				class="form-control mb-1" type="text"> <input
				name="category_name" placeholder="Tên danh mục"
				class="form-control mb-1" type="text">
			<button type="submit" class="btn btn-primary">Thêm vào</button>
			<div class="huybo btn btn-danger">Hủy bỏ</div>
		</form>
	</div>

	<script>
		$(document).ready(function() {
			/* Chuyển động theme chính */
			$('.qldm').click(function() {
				$('.indexqldm').show();
				$('.indexqltk').hide();
			})
			$('.qltk').click(function() {
				$('.indexqldm').hide();
				$('.indexqltk').show();
			})
			/* Chuyển động thêm danh mục */
			$('.tdmm').click(function() {
				$('.themdanhmuc').show()
			})
			$('.huybo').click(function() {
				$('.themdanhmuc').hide()
			})
		})
	</script>
</body>
</html>