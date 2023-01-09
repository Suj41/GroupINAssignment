<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page import="java.util.List" %>
<%@page import="model.Orders" %>
<%@page import="controller.OrdersController" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style><%@include file="/css/Order.css"%></style>
<title>Order</title>
</head>
<body>

<h1 align="center">Orders</h1>
    <div class="form"></div>
    <form action ="<%=request.getContextPath()%>/OrdersController" method=post>
        <table>
        <tr> <td> Order Item</td><td> <input type="text" name=o_ProductName></td></tr>
        <tr> <td> Order Quantity</td><td> <input type="Number" name=o_ProductQTY></td></tr>
        <tr> <td> Customer ID</td><td> <input type="Number" name=c_ID></td></tr>
        <tr> <td> Order Date</td><td> <input type="Date" name=o_Date></td></tr>

        <tr> <td> <input type="submit" value="add"> 
        <!-- </td><td> <input type=""></td></tr> -->
        </table>
        </form>
    </div>
    
      <table>
    <thead>
    <tr>
    
    <th> First Name </th>
     <th> Last Name </th> 
     <th> Address </th>
    
    
    </tr>
    </thead>
   <tbody>
   <%
   int i=1;
   List<Orders>lstOrders = (List<Orders>) request.getAttribute("lstOrders");
   %>
   
   <%
   if(lstOrders!=null){
	   for(Orders customer : lstOrders){
		   %>
		   <tr>
		   <td><%= customer.getO_ID() %></td>
		   <td><%= customer.getC_ID() %></td>
		   <td><%= customer.getO_ProductQTY() %></td>
		   </tr>
		   <%
	   }
   }else{
	   out.print("No data found");
   }
		   %>
	  
 

   
    </table>
   
    
    

    
   
   
    
</body>
</html>