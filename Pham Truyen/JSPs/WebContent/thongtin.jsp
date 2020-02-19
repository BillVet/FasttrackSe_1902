<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String i = request.getParameter("name");
%>
Ten cua ban: <%= i %>

<a href="/JSPs/dangxuat.jsp">Logout</a>
</body>
</html>