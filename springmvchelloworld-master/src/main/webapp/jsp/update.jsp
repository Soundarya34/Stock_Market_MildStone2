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
<title>Create Company</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
.button {
	padding: 16px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin-top: 10px;
	margin-right: 15px;
	-webkit-transition-duration: 0.4s;
	transition-duration: 0.4s;
	cursor: pointer;
}

.logout {
	background-color: #71789a;
	color: white;
	font-weight: bold;
	border: 2px solid #71789a;
	border-radius: 25px;
	margin-bottom: 20px;
}

.logout:hover {
	background-color: #ECF6FC;
	color: black;
}

.tabs {
	display: inline-block;
	border-radius: 25px;
	background-color: #121d54;
	width: 300px;
	border: #efe8e8 solid 1px;
	color: white;
	text-align: center;
	font-size: 28px;
	padding: 10px;
	transition: all 0.5s;
	cursor: pointer;
	margin-right: 70px;
	margin-left: 20px;
	margin-bottom: 40px;
}

.tabs span {
	cursor: pointer;
	display: inline-block;
	position: relative;
	transition: 0.5s;
}

.tabs span:after {
	content: '\00bb';
	position: absolute;
	opacity: 0;
	top: 0;
	right: -20px;
	transition: 0.5s;
}

.tabs:hover span {
	padding-right: 25px;
}

.tabs:hover span:after {
	opacity: 1;
	right: 0;
}

.head {
	height: auto; //300
	px width: inherit;
	background-color: #121d54;
	margin-left: auto;
	margin-right: auto;
	color: white;
	font-size: 30px;
}

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

label {
	font-weight: bold;
	font-size: 10px;
	color: black;
}

.error {
	color: red
}
</style>
</head>
<body>
<div class="section">
		<header class="head">
			<div align="right" style="margin-bottom: 10px;">
				<button class="button logout" style="align: right;">Logout</button>
			</div>
			<div>

				<a href="UploadIPODetails.html"><button class="tabs"
						style="vertical-align: middle">
						<span>Import Data</span>
					</button></a> <a href="CreateCompany.html">
					<button class="tabs" style="vertical-align: middle">
						<span>Manage Company </span>
					</button>
				</a>
				<button class="tabs" style="vertical-align: middle">
					<span>Manage Exchange </span>
				</button>
				<button class="tabs" style="vertical-align: middle">
					<span>Update IPO Details </span>
				</button>
			</div>
		</header>

<div class="body">


			<div class="signup-form">
<%
String companyCode = request.getParameter("companyId");
int companyId=Integer.parseInt(companyCode);
%>
<form:form method="post" action="updateCompany"
					modelAttribute="updateCompany" class="form-horizontal">
					
					
					<div class="col-xs-8 col-xs-offset-4">
						<h2>Update Company</h2>
					</div>
					<div class="form-group">
						<label class="control-label col-xs-4">Company Name</label>
						<div class="col-xs-8">
							<form:input type="text" class="form-control" path="companyName" />
							<form:errors path="companyName" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-xs-4">Ceo Name</label>
						<div class="col-xs-8">
							<form:input type="text" class="form-control" path="ceoName" />
							<form:errors path="ceoName" />
						</div>
					</div>
			

<form:input type="hidden"  path= "companyCode" value="<%=companyId %>"/>
<input type="submit" value="update"/>
</form:form>

</div>

		</div>
		<footer class="footer"> </footer>
	</div>

</body>
</html>