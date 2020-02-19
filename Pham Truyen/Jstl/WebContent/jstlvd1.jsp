
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Thong tin sinh vien</title>
</head>
<body>
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/ft1009" user="root" password=""/>
	
	<!-- <sql:update var="result" dataSource="${db}">Insert into sinhvien value(21,"h",20,"FFSE1709",1)</sql:update> -->
	
	<c:set var="idsv" value="22"></c:set>
	<sql:update var="result" dataSource="${db}">Delete from sinhvien where id=?;
		<sql:param value="${idsv}"></sql:param>
	</sql:update>
	
	<sql:query var="result" dataSource="${db}">Select * from sinhvien;</sql:query>
		
	<table border="1">
		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>Age</td>
			<td>Class</td>
			<td>Gender</td>
		</tr>
		
		<c:forEach var="row" items="${result.rows}">
			<tr>
				<td><c:out value="${row.id}"/></td>
				<td><c:out value="${row.name}"/></td>
				<td><c:out value="${row.age}"/></td>
				<td><c:out value="${row.clas}"/></td>
				<td><c:out value="${row.gender}"/></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>