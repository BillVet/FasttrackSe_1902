<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<style type="text/css">
.themdanhmuc {
	padding: 10px;
	position: absolute;
	left: 50%;
	top: 50%;
	transform: translate(-50%,-50%);

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
				<button class="w-100 mb-1 btn btn-outline-primary">Quản lý
					danh mục</button>
				<button class="w-100 mb-1 btn btn-outline-primary">Quản lý
					tài khoản</button>
			</div>
			<div class="col-8 m-0 p-0">
				<div class="qldm">
					<button class="btn btn-success">Thêm danh mục mới</button>
				</div>
				<div class="qltk">
					
				</div>
			</div>
		</div>

	</div>

	<div class="themdanhmuc border border-primary bg-light">
		<form class="form-horizontal" action="/Ngay19.02.2020.BaiTap/themdanhmuc"
			method="post" id="login_form">
			<input name="category_id" placeholder="Mã danh mục" class="form-control mb-1"
				type="text"> 
			<input name="category_name"
				placeholder="Tên danh mục" class="form-control mb-1" type="text">
			<button type="submit" class="btn btn-primary">Thêm
				vào</button>
			<button type="submit" class="btn btn-danger">Hủy
				bỏ</button>
		</form>
	</div>
</body>
</html>