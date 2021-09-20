<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body class="container-fluid">
	<h1 align="center">View All Users</h1>

	<table class="table table-bordered">
		<thead>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>EMAIL</th>
				<th>PASSWORD</th>
				<th colspan="3" align="center">Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="data">
				<tr>
					<td>${data.id}</td>
					<td>${data.name}</td>
					<td>${data.email}</td>
					<td>${data.password}</td>
					<td>View</td>
					<td><a href="getById/${data.id }">Update</a></td>
					<td>Delete</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>