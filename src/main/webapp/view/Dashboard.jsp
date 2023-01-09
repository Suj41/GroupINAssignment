<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List" %>
<%@page import="model.Customer" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style><%@include file="/css/dash.css"%></style>
<title>Dash Board</title>

</head>
<body>


	<div style="text-align: center;">
		<button class="btns"onclick="window.location.href='<%= request.getContextPath() %>/view/Stock.jsp'"/>Stocks <span class="tooltiptext"></span></button>
		<button class="btns"onclick="window.location.href='<%= request.getContextPath() %>/view/Orders.jsp'"/>Orders <span class="tooltiptext"></span></button>
		<button class="btns"onclick="window.location.href='<%= request.getContextPath() %>/view/Sales.jsp'"/>Sales <span class="tooltiptext"></span></button>
		<button class="btns"onclick="window.location.href='<%= request.getContextPath() %>/view/Supplier.jsp'"/>Suppliers<span class="tooltiptext"></span></button>
	</div>
				<h1>Hello <%=session.getAttribute("username") %></h1>
    <
    
    <h1>Customer Details</h1>
    
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
   List<Customer>lstCustomer = (List<Customer>) request.getAttribute("lstCustomer");
   %>
   
   <%
   if(lstCustomer!=null){
	   for(Customer customer : lstCustomer){
		   %>
		   <tr>
		   <td><%= customer.getC_Fname() %></td>
		   <td><%= customer.getC_Lname() %></td>
		   <td><%= customer.getC_Address() %></td>
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