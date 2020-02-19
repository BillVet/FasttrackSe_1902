<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/JdbcServersConnection/FormGet" method="post">
		ID <input type="text" name="id"><br> 
		Name <input type="text" name="name"><br> 
		Age <input type="text" name="age"><br> 
		Class <input type="text" name="clas"><br>
		Gender <input type="text" name="gender"><br> 
		<input type="submit" value="Add">
	</form>
</body>
</html>