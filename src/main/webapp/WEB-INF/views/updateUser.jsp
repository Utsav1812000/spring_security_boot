<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<div class="col-md-3 p-5">
		<form action="../updateuser" method="post">
		
			<input type="hidden" name="id" value="${user.id }">
		
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">UserName
				</label> <input type="text" class="form-control" name="name" value="${user.name }">
			</div>

			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Email
					address</label> <input type="email" name="email" value="${user.email }" class="form-control"
					id="exampleInputEmail1" aria-describedby="emailHelp">
			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Password</label>
				<input type="password" class="form-control"
					id="exampleInputPassword1" name="password" value="${user.password }">
			</div>
			
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"> 
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>

	<a href="loginuser">Already Have An Account..?</a>


</body>
</html>