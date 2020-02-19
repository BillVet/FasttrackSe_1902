<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>hello  </h1>
	<ul>
		<li><b>Ho: </b></li> <%= request.getParameter("ho") %>
		<li><b>Ten: </b></li> <%= request.getParameter("ten") %>
	</ul>
</body>
</html>