<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style><%@include file="/css/stock.css"%></style>
<title>Stock</title>
</head>
<body>
<h1 align="center">Store</h1>
    <div class="form"></div>
    <form action="<%=request.getContextPath()%>/StockController"
			method="post" class="form">
        <table>
        <tr> <td> Product Quantity</td><td> <input type="Number" name=stockProductQTY></td></tr>
        <tr> <td> Price</td><td> <input type="Price" name=stockPrice></td></tr>
        <tr> <td> Supplier ID</td><td> <input type="ID" name=supplierID></td></tr>
         <tr> <td> Store Product Name</td><td> <input type="Name" name=stockProductName></td></tr>
        <tr> <td> <input type="submit" value="Add" onclick="window.location.href='<%= request.getContextPath() %>/view/Dashboard.jsp'"/>
        <!-- </td><td> <input type=""></td></tr> -->
        </table>
        </form>
    </div>
</body>
</html>