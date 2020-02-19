<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dach Sách</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.css"
	rel="stylesheet">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
	<a href="/MVC/danhsach" class="btn btn-warning" style="margin: 10px">
		Trang chu</a>
	<a class="btn btn-primary pull-right"
		style="float: right; margin: 10px"
		href="<%=request.getContextPath()%>/logout">logout</a>
	<p class="btn " style="float: right; margin: 10px; color: green">
		<c:out value=" ${user}"></c:out>
	</p>

	<div class="container">
	
		<h2 style="text-align: center;">Danh sách</h2>
		<form action="<%=request.getContextPath()%>/addform.jsp">
			<button type="submit" class="btn btn-md btn-danger pull-right my-2">Thêm
				Sách</button>
		</form>

		<table class="table table-striped table-bordered table-hover">
			<thead class="thead-dark">
				<tr>
					<th>Id</th>
					<th>Title</th>
					<th>Author</th>
					<th>Price</th>
					<th>Qty</th>
					<th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="row" items="${listBook}">
					<tr>
						<td><c:out value="${row.id}" /></td>
						<td><c:out value="${row.title}" /></td>
						<td><c:out value="${row.author}" /></td>
						<td><c:out value="${row.price}" /></td>
						<td><c:out value="${row.qty}" /></td>
						<td><a class="btn btn-danger"
							href="<%= request.getContextPath()%>/editBook?id=<c:out value="${row.id}"/>">Sửa
								<span class="glyphicon glyphicon-pencil"></span>

						</a> <a class="btn btn-danger"
							href="<%= request.getContextPath()%>/deleteBook?id=<c:out value="${row.id}"/>">Xóa
								<span class="glyphicon glyphicon-remove"></span>
						</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<nav aria-label="Navigation for book">
				<ul class="pagination">
					<c:if test="${currentPage != 1}">
						<li class="page-item"><a class="page-link"
							href="<%= request.getContextPath() %>/danhsach?currentPage=${currentPage-1}">Previous</a>
						</li>
					</c:if>

					<c:forEach begin="1" end="${noOfPage}" var="i">
						<c:choose>
							<c:when test="${currentPage eq  i}">
								<li class="page-item active">
									<a class="page-link">${i}</a>
								</li>
							</c:when>
							<c:otherwise>
								<li class="page-item"><a class="page-link"
									href="<%= request.getContextPath() %>/danhsach?currentPage=${i}">${i}</a>
								</li>
							</c:otherwise>
						</c:choose>
					</c:forEach>

					<c:if test="${currentPage lt noOfPage}">
						<li class="page-item"><a class="page-link"
							href="<%= request.getContextPath() %>/danhsach?currentPage=${currentPage+1}">Next</a>
						</li>
					</c:if>
				</ul>
			</nav>
	</div>
</body>
</html>