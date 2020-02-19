<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hello</title>
</head>
<body>
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/book" user="root" password="" />
	<c:set var="id" value="112134"></c:set>
	<sql:update var="result" dataSource="${db}">insert into books values(12363343,"heobi","beaso",232,21)</sql:update>
	<sql:update var="result" dataSource="${db}">delete from books where id=?</sql:update>
	<sql:param value="${id}"></sql:param>
	<sql:query var="result" dataSource="${db}">select * from books</sql:query>

	<table>
		<tr>
			<th>id</th>
			<th>title</th>
			<th>author</th>
			<th>price</th>
			<th>qty</th>
		</tr>
		<c:forEach var="row" items="${result.rows}">
			<tr>
				<td><c:out value="${row.id}" /></td>
				<td><c:out value="${row.title}" /></td>
				<td><c:out value="${row.author}" /></td>
				<td><c:out value="${row.price}" /></td>
				<td><c:out value="${row.qty}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>