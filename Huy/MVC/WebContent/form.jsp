<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dang Ki</title>
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
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="col-md-offset-4 col-md-4" id="box">
				<h2>Thành viên</h2>
				<hr>
				<form class="form-horizontal" action="<%= request.getContextPath() %>/dangky"
					method="post" id="login_form">
					<fieldset>
						<div class="form-group">
							<div class="col-md-12">
								<div class="input-group">
									<span class="input-group-addon"><i
										class="glyphicon glyphicon-user"></i></span> <input name="username"
										placeholder="Username" class="form-control" type="text">
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="col-md-12">
								<div class="input-group">
									<span class="input-group-addon"><i
										class="glyphicon glyphicon-lock"></i></span> <input name="password"
										placeholder="Password" class="form-control" type="password">
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="col-md-12">
								<button type="submit" class="btn btn-md btn-danger pull-right">Register</button>
							</div>
						</div>
					</fieldset>
				</form>
			</div>
		</div>
	</div>
	<h2><% %>${note}</h2>
</body>
</html>