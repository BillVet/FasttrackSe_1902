<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.css" rel="stylesheet">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</head>
<body>

<div class="container-fluid">
	<div class="row-fluid">
		<div class="col-md-offset-4 col-md-4" id="box">
			<h2>Dang nhap</h2>
			<hr>
			<form class="form-horizontal" action="<%= request.getContextPath()%>/login" method="post" onsubmit="return validate()">
				<fieldset>
					<div class="form-group">
						<div class="col-md-12">
							<div class="input-group">
								<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span> <input name="username"
									placeholder="Username" class="form-control" type="text">
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-12">
							<div class="input-group">
								<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span> <input name="password"
									placeholder="Password" class="form-control" type="password">
							</div>
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-12">
							<input type="submit" value="Login"></input>
							<input type="reset" value="Reset"></input>
						</div>
					</div>
				</fieldset>
				<h4 style = "color:red">${message}</h4>
			</form>
		</div>
		<div>
			<a href="<%= request.getContextPath() %>/FormLogin.jsp" style="text-align: center;">Dang nhap</a> || <a href="<%= request.getContextPath() %>/FormDangky.jsp">Dang ky</a>
		</div>
	</div>
</div>	
</body>
</html>