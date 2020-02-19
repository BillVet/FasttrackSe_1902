<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
		int id = Integer.valueOf(request.getParameter("id"));
		String name = request.getParameter("name");
		int age = Integer.valueOf(request.getParameter("age"));
		String clas = request.getParameter("clas");
		String gender = request.getParameter("gender");
		
		try{
			String url = "jdbc:mysql://localhost:3306/ft1009";
			String user = "root";
			String password = "";

			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, user, password);
			String sql = "insert into sinhvien values(?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.setString(4, clas);
			ps.setString(5, gender);
			
			ps.executeUpdate();
			response.sendRedirect("Select.jsp");
		}catch(Exception e){
			System.out.print(e);
			e.printStackTrace();
		}
	%>
</body>
</html>