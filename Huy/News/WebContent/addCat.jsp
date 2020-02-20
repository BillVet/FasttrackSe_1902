<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

<link href="/style/css/them.css" rel="stylesheet">
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

	<div class="container-fluid">
		<div class="row-fluid">
			<div class="col-md-offset-3 col-md-6" id="box">
				<h2 class="text-center text-primary">Thêm Thể Loại</h2>
				<hr>
				<form class="form-horizontal"
					action="<%= request.getContextPath()%>/addCat" method="post"
					id="login_form">
					<fieldset>

						<div class="form-group">
							<div class="col-md-12">
								<div class="input-group">
									<span class="input-group-addon"><i
										class="glyphicon glyphicon-pencil"></i></span> <input name="category_id"
										placeholder=" ID" class="form-control" type="text">
								</div>
							</div>
						</div>

						<div class="form-group">
							<div class="col-md-12">
								<div class="input-group">
									<span class="input-group-addon"><i
										class="glyphicon glyphicon-pencil"></i></span> <input name="category_name"
										placeholder="Tên Thể Loại" class="form-control" type="text">
								</div>
							</div>
						</div>

						<div class="form-group">
							<div class="col-md-12">
								<button type="submit" class="btn btn-block btn-success">Thêm</button>
							</div>
						</div>
					</fieldset>
				</form>
			</div>
		</div>
	</div>
</body>
</html>