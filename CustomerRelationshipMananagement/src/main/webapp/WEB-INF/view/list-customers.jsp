<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>

<html>
 <head>
 <meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
   <!-- Bootstrap CSS --> 
   <link rel="stylesheet"  href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"    
    integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
    crossorigin="anonymous">
 <title>CUSTOMER RELATIONSHIP MANAGEMENT</title>
 </head>
 <BR>
  <style>
      body {
        background-color: #e6ebef;
      }
      h1 {
        background-color: #00C000; 
      }
      
      <title>Student Directory</title>
   
     
   </style>
   <!--  background-color:#1c87c9; -->
  </head>
 <body>
    <h1 ALIGN = "CENTER" >CUSTOMER RELATIONSHIP MANAGEMENT</h1>
     <marquee bgcolor="#00C000" loop="-1" scrollamount="2" width="100%">Welcome to Customer Relationship Management</marquee>
  <BR><BR>
 <div>           
<div class="container"> 
<a href="showFormForAdd" class="btn btn-primary btn-sm mb-3">click to Add new Customer</a>  
 <BR><BR>
<table  class="table table-bordered table-striped"> 
       
   <!--  <thead class="thead-dark"> -->
    <thead bgcolor="green">             
    <tr>                 
      <th>First Name</th>                 
      <th>Last Name</th>                 
      <th>email</th>                 
       <th>Action</th>       
     </tr>
    </thead>
  <tbody>          
   <c:forEach items="${customers}" var="customer" > 			
    <tr>               
     <td>${customer.firstName}</td>                 
     <td>${customer.lastName}</td>                 
     <td>${customer.email}</td>                         
     <td><a href="showFormForUpdate?customerId=${customer.customerId}" class="btn btn-info btn-sm"> Update</a>                
        <a href="delete?customerId=${customer.customerId}" class="btn btn-danger btn-sm" 
        onclick="if(!(confirm('Are you sure you want to delete this Customer?'))) return false">Delete</a></td>             
     </tr>
   </c:forEach>
   </tbody>
  </table>
</div>
</body>
</html>