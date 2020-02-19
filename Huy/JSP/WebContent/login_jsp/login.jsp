<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout</title>
</head>
<body>
<h1>Hello</h1>
<% String name = request.getParameter("name"); %>
<h3>Ten cua ban la: <%=name %></h3>
<a href="/JSP/logout.jsp"> Logout</a>
</body>
</html>