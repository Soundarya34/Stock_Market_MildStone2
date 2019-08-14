<%@page import="com.example.springMvcExample.model.StockExchange"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*,com.example.springMvcExample.model.Company"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Stock Exchange List</title>
<style type="text/css">
strong {
	font-weight: bold;
}

em {
	font-style: italic;
}

table {
	background: #f5f5f5;
	border-collapse: separate;
	box-shadow: inset 0 1px 0 #fff;
	font-size: 12px;
	line-height: 24px;
	margin: 30px auto;
	text-align: left;
	width: 800px;
}

th {
	background: url(https://jackrugile.com/images/misc/noise-diagonal.png),
		linear-gradient(#777, #444);
	border-left: 1px solid #555;
	border-right: 1px solid #777;
	border-top: 1px solid #555;
	border-bottom: 1px solid #333;
	box-shadow: inset 0 1px 0 #999;
	color: #fff;
	font-weight: bold;
	padding: 10px 15px;
	position: relative;
	text-shadow: 0 1px 0 #000;
}

th:after {
	background: linear-gradient(rgba(255, 255, 255, 0),
		rgba(255, 255, 255, .08));
	content: '';
	display: block;
	height: 25%;
	left: 0;
	margin: 1px 0 0 0;
	position: absolute;
	top: 25%;
	width: 100%;
}

th:first-child {
	border-left: 1px solid #777;
	box-shadow: inset 1px 1px 0 #999;
}

th:last-child {
	box-shadow: inset -1px 1px 0 #999;
}

td {
	border-right: 1px solid #fff;
	border-left: 1px solid #e8e8e8;
	border-top: 1px solid #fff;
	border-bottom: 1px solid #e8e8e8;
	padding: 10px 15px;
	position: relative;
	transition: all 300ms;
}

td:first-child {
	box-shadow: inset 1px 0 0 #fff;
}

td:last-child {
	border-right: 1px solid #e8e8e8;
	box-shadow: inset -1px 0 0 #fff;
}

tr {
	background: url(https://jackrugile.com/images/misc/noise-diagonal.png);
}

tr:nth-child(odd) td {
	background: #f1f1f1
		url(https://jackrugile.com/images/misc/noise-diagonal.png);
}

tr:last-of-type td {
	box-shadow: inset 0 -1px 0 #fff;
}

tr:last-of-type td:first-child {
	box-shadow: inset 1px -1px 0 #fff;
}

tr:last-of-type td:last-child {
	box-shadow: inset -1px -1px 0 #fff;
}

tbody:hover td {
	color: transparent;
	text-shadow: 0 0 3px #aaa;
}

tbody:hover tr:hover td {
	color: #444;
	text-shadow: 0 1px 0 #fff;
}
</style>
</head>
<body>

	<%
		List stockExchangeList = (List) request.getAttribute("stockExchangeList");
		System.out.println(stockExchangeList);
	%>


	<table>
		<thead>
			<tr>
				<th>StockExchange id</th>
				<th>StockExchange Name</th>
				<th>Brief</th>
				<th>Contact Address</th>
				<th>Remarks</th>

			</tr>
		</thead>
		<tbody>

			<%
				for (int i = 0; i < stockExchangeList.size(); i++) {
					StockExchange stockExchangeDetails = (StockExchange) stockExchangeList.get(i);
			%>

			<tr id="listOfStockExchange">
				<td><%=stockExchangeDetails.getstockExchangeId()%></td>
				<td><%=stockExchangeDetails.getStockExchangeName()%></td>
				<td><%=stockExchangeDetails.getBrief()%></td>
				<td><%=stockExchangeDetails.getContactAddress()%></td>
				<td><%=stockExchangeDetails.getRemarks()%></td>

			</tr>
			<%
				}
			%>
		</tbody>
	</table>


</body>
</html>