<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
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
		Connection connection = null;
		Statement s = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost/ft1009" + "?user=root&password=");

			s = connection.createStatement();

			String id = request.getParameter("ID");

			String sql = "DELETE FROM sinhvien " + " WHERE ID = '" + id + "' ";

			s.execute(sql);

		} catch (Exception e) {
			out.println(e.getMessage());
			e.printStackTrace();
		}
	%>
</body>
</html>