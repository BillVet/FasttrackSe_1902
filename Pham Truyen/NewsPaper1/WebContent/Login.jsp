<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link style="text\css" href="/Style/css/login.css">
</head>
<body>
	<form action="<%= request.getContextPath()%>/login" method="post" >
		<div class="container" style="text-align: center;margin: 20% 30%;padding: 30px;background: red">
			<label for="name"><b>Username</b></label>
			<input type="text" placeholder="EnterUsername" name="username"><br>
			
			<label for="name"><b>Password</b></label>
			<input type="text" placeholder="EnterPassword" name="password"><br>
			
			<input type="checkbox" name="remember"> Remember me <br>
			<button type="submit" style="background: blue;">Login</button>
		</div>		
	</form>
</body>
</html>