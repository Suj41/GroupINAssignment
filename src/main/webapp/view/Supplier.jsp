<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style><%@include file="/css/stock.css"%></style>
<title>Supplier</title>
</head>
<body>
<h1 align="center">Store</h1>
    <div class="form"></div>
    <form action="<%=request.getContextPath()%>/SupplierController"
			method="post" class="form">
        <table>
        <tr> <td>Name</td><td> <input type="text" name=supplierName></td></tr>
        <tr> <td>Address</td><td> <input type="text" name=supplierAddress></td></tr>
        <tr> <td>Phone Number</td><td> <input type="text" name=supplierPhone></td></tr>
        <tr> <td> <input type="submit" value="ADD" onclick="window.location.href='<%= request.getContextPath() %>/view/Dashboard.jsp'"/>
        <!-- </td><td> <input type=""></td></tr> -->
        </table>
        </form>
    </div>
</body>
</html>