<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="update.jsp" method="post">
		Nhap id: <input type="text" name="id">
		Nhap title: <input type="text" name="title">
		Nhap author: <input type="text" name="author">
		Nhap price: <input type="text" name="price">
		Nhap qty: <input type="text" name="qty">
		<input type="submit" value="Go">
	</form>
</body>
</html>