
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
	String url ="jdbc:mysql://localhost:3306/book";
	String user ="root" ;
	String pass ="";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conect = DriverManager.getConnection(url, user, pass);
		Statement statement = conect.createStatement();
		ResultSet rs = statement.executeQuery("select * from books");
	%>
	<table border="1" >
		<tr>
			<th>id</th>
			<th>title</th>
			<th>author</th>
			<th>price</th>
			<th>qty</th>
		</tr>
		<%
		while(rs.next()){
			int id=rs.getInt(1);
		%>
			<tr style="text-align:'center'">
				<td> <%=rs.getInt(1)%> </td>
				<td> <%=rs.getString(2)%> </td>
				<td> <%=rs.getString(3)%> </td>
				<td> <%=rs.getFloat(4)%> </td>
				<td> <%=rs.getInt(5)%> </td>
				<td><a href="/JSP/connec_sql/update_form.jsp?id=<%=rs.getInt(1)%>"><button>update</button></a></td>
				<td><a href="/JSP/connec_sql/delete.jsp?id=<%=rs.getInt(1)%>"><button>delete</button></a></td>
			</tr>
		<% }%>
	</table>
	<a href="/JSP/connec_sql/insert_sql.jsp">add....</a>
</body>
</html>