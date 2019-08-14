<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link href="https://fonts.googleapis.com/css?family=Roboto:400,700"
	rel="stylesheet">
<title>Registration Page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
.body {
	background: #71789a;
	font-family: 'Open Sans', sans-serif;
	height: 1000px;
}

body {
	color: #999;
	background: #f3f3f3;
	font-family: 'Roboto', sans-serif;
}

.form-control {
	border-color: #eee;
	min-height: 41px;
	box-shadow: none !important;
}

.form-control:focus {
	border-color: #5cd3b4;
}

.form-control, .btn {
	border-radius: 3px;
}

.signup-form {
	width: 500px;
	margin: 0 auto;
	padding: 30px 0;
}

.signup-form h2 {
	color: #333;
	margin: 0 0 30px 0;
	display: inline-block;
	padding: 0 30px 10px 0;
	border-bottom: 3px solid #121d54;
}

.signup-form form {
	color: #999;
	border-radius: 3px;
	margin-bottom: 15px;
	background: #fff;
	box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
	padding: 30px;
}

.signup-form .form-group {
	margin-bottom: 20px;
}

.signup-form label {
	font-weight: bold;
	font-size: 15px;
	color: black;
}

.signup-form .btn {
	font-size: 16px;
	font-weight: bold;
	background: #121d54;
	border: none;
	margin-top: 20px;
	min-width: 140px;
}

.signup-form .btn:hover, .signup-form .btn:focus {
	background: #41cba9;
	outline: none !important;
}

.signup-form a {
	color: #5cd3b4;
	text-decoration: underline;
}

.signup-form a:hover {
	text-decoration: none;
}

.signup-form form a {
	color: #5cd3b4;
	text-decoration: none;
}

.signup-form form a:hover {
	text-decoration: underline;
}

.error {
	color: red
}
</style>
</head>
<body>
	<div class="section">

		<div class="body">


			<div class="signup-form">
				<form:form method="post" action="registerUser"
					modelAttribute="registerUser" class="form-horizontal">


					<div class="col-xs-8 col-xs-offset-4">
						<h2 style="color: #211EDB;">Register User</h2>
					</div>
					<div class="form-group">
						<label class="control-label col-xs-4">Username</label>
						<div class="col-xs-8">
							<form:input type="text" class="form-control" path="username" />
							<form:errors path="username" cssClass="error" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-xs-4">Password</label>
						<div class="col-xs-8">
							<form:input type="text" class="form-control" path="password" />
							<form:errors path="password" cssClass="error" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-xs-4">User Type</label>
						<div class="col-xs-8">
							<form:input type="text" class="form-control" path="usertype" />
							<form:errors path="usertype" cssClass="error" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-xs-4">Email</label>
						<div class="col-xs-8">
							<form:input type="email" class="form-control" path="email" />
							<form:errors path="email" cssClass="error" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-xs-4">Mobile Number</label>
						<div class="col-xs-8">
							<form:input type="number" class="form-control"
								path="mobileNumber" />
							<form:errors path="mobileNumber" cssClass="error" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-xs-4">Confirmed</label>
						<div class="col-xs-8">
							<form:input type="text" class="form-control" path="confirmed" />
							<form:errors path="confirmed" cssClass="error" />
						</div>
					</div>

					<div class="form-group">
						<div class="col-xs-8 col-xs-offset-4">
							<p>...any other fields...</p>
							<button type="submit" class="btn btn-primary btn-lg">Register</button>
						</div>
					</div>
				</form:form>
			</div>

		</div>

	</div>



</body>
</html>
