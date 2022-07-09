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
  <title>Customer Form</title>
     <style>
      body {
        background-color: #e6ebef;
      }
      h1 {
        background-color: #00C000;
      }
      
    </style>
  </head>
 <body>
    <h1 ALIGN = "CENTER" >CUSTOMER RELATIONSHIP MANAGEMENT</h1>
    <marquee bgcolor="#00C000" loop="-1" scrollamount="2" width="100%">Welcome to Customer Relationship Management</marquee>
  <BR>
  
    <div>
      <form action="save" method="POST">
      <br>
    </div>  
       <div>
         <h3>Customer Form for ${mode}</h3><br>
           <!--  <div class="form-inline"> -->
                       
          <input type="hidden" name="customerId" value="${customer.customerId}" />
          <div class="form-group row">
            <label for="firstName" class="col-sm-2 col-form-label"> FirstName</label>
            <input type="text" name="firstName" value="${customer.firstName}" class="form-control mb-4 col-4" placeholder="First Name" >
           </div>
           <div class="form-group row">
             <label for="lastName" class="col-sm-2 col-form-label"> LastName</label> 
             <input type="text" name="lastName" value="${customer.lastName}" class="form-control mb-4 col-4" placeholder="Last Name" > 
           </div>
           <div class="form-group row">
             <label for="email" class="col-sm-2 col-form-label"> email</label>    
             <input type="text" name="email" value="${customer.email}" class="form-control mb-4 col-4" placeholder="email" >
          </div>
              <button type="submit" class="btn btn-info col-2" > Save</button> 
            </form>  
          <br><br>
       </div>
        <a href="list"> Back to Customer List</a> 
       </div> 
</body>
</html>