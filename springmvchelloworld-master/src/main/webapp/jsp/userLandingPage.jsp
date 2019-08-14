<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Landing Page</title>

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

.button2 {
	background-color: #121d54;
	color: white;
	font-weight: bold;
	border: 2px solid darkBlue;
	border-radius: 15px;
}

.button2:hover {
	background-color: #D4E5FA;
	color: darkBlue;
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

input[type=text], select, #date {
	width: 50%;
	padding: 12px 20px;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
	background-color: #F7F3F9;
}

#box, .chart {
	margin-left: 224px;
}

input[type=date] {
	width: 20%;
	padding: 12px 20px;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
	background-color: #F7F3F9;
}

input[type=file] {
	width: 40%;
	border: 1px solid #ccc;
	border-radius: 4px;
	display: inline-block;
}

label {
	font-weight: bold;
	font-size: 20px;
	margin-left: 215px;
	color: white;
}

.uploadA {
	margin-left: 70px;
	color: #2A1D6A;
	font-family: Arial;
	font-size: 25px;
}

p {
	text-align: center;
	font-weight: bold;
}

.heading {
	margin-left: 725px;
	font-weight: bold;
	font-size: 35px;
	color: white;
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

@media ( min-width : 1200px) {
	form>div>label {
		text-align: right;
	}
}
</style>
</head>
<body>
	<div class="sections">

		<header class="head">
		<div align="right" style="margin-bottom: 10px;">
			<button class="button logout" style="align: right;">Logout</button>
		</div>
		<div>
			<button class="tabs" style="vertical-align: middle">
				<span>IPOs</span>
			</button>
			<a href="ComparisonCharts.html">
				<button class="tabs" style="vertical-align: middle">
					<span>Compare Company </span>
				</button>
			</a>
			<button class="tabs" style="vertical-align: middle">
				<span>Compare Sectors </span>
			</button>
			<button class="tabs" style="vertical-align: middle">
				<span>Others</span>
			</button>
		</div>
		</header>
		<div class="body"></div>
		<footer class="footer"> </footer>

	</div>


</body>
</html>