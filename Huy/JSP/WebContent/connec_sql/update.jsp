<%@page import="java.sql.PreparedStatement"%>
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

	<%
		String url = "jdbc:mysql://localhost:3306/book";
		String user = "root";
		String pass = "";

		Class.forName("com.mysql.jdbc.Driver");
		Connection connect = DriverManager.getConnection(url, user, pass);

		int id = Integer.valueOf(request.getParameter("id")) ;
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		float price = Integer.valueOf(request.getParameter("price"));
		int qty = Integer.valueOf(request.getParameter("qty"));

		String sql="update books set id=?,title=?,author=?,price=?,qty=? w";
		PreparedStatement ps = connect.prepareStatement(sql);
		ps.setInt(1,id);
		ps.setString(2,title);
		ps.setString(3,author);
		ps.setFloat(4,price);
		ps.setInt(5,qty);	
		
		ps.executeUpdate();

		response.sendRedirect("/JSP/connec_sql/connection.jsp");
	%>
</body>
</html>