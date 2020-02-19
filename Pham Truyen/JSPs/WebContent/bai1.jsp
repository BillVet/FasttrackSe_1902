<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int a = 8;
		int b = 9;
		int c = a + b;
	%>
	<h3 style = "color:red">Tong: </h3> <%= c %>
	<a href="thongtin.jsp?name=H">Trang thong tin</a>
</body>
</html>