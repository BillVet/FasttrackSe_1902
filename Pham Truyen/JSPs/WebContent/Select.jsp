<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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
	String url = "jdbc:mysql://localhost:3306/ft1009";
	String user = "root";
	String password = "";

	Class.forName("com.mysql.jdbc.Driver");
	Connection connection = DriverManager.getConnection(url, user, password);
	Statement statement = connection.createStatement();
	ResultSet resultSet = statement.executeQuery("select * from sinhvien");				
%>
	
<table border="1">
	<tr>
		<td> ID </td>
		<td> Name </td>
		<td> Age </td>
		<td> Class </td>
		<td> Gender </td>
		<td> Action </td>
	</tr>
	
	<%
		while (resultSet.next()) {
	%>
		<tr>
			<td><%= resultSet.getInt(1) %></td>
			<td><%= resultSet.getString(2) %></td>
			<td><%= resultSet.getInt(3) %></td>
			<td><%= resultSet.getString(4) %></td>
			<td><%= resultSet.getString(5) %></td>
			<td><a href="Delete.jsp"><%="resultSet.getInt(1)"%>Delete</a></td>
		</tr>				
	<%}
	%>	
</table>
<a href = "InsertForm.jsp">Them sinh vien</a>
</body>
</html>