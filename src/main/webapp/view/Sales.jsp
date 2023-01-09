<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style><%@include file="/css/Sell.css"%></style>
<title>Sell</title>
</head>
<body>
   <form action="<%=request.getContextPath()%>/SalesController"
			method="post" class="form">
            <label for="Sold">Sold Product Name:</label>
            <input type="text" id="first-name" name="salesProductName">
            <label for="Quantity">Sold Quantity</label>
            <input type="Number" id="email" name="salesProductQTY">
            <label for="price">Sold Price</label>
            <input type="text" id="last-name" name="salesPrice">
            <br>
            <label for="date">Date</label>
            <input type="date" id="password" name="salesDate">
            <br>
            <input type="submit" value="ADD">
</body>
</html>