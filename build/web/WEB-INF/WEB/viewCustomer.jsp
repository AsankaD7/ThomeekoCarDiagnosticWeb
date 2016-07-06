<%-- 
    Document   : viewCustomer
    Created on : May 10, 2016, 1:56:59 AM
    Author     : asankad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/MainStyle.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/AdminLTE.min.css" rel="stylesheet" type="text/css"/>
        <link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:700|Raleway|Open+Sans' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Indie+Flower' rel='stylesheet' type='text/css'>
        <script src="js/jquery.js" type="text/javascript"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <br/>
        <br/>
        <div class="container">        
        <div class="row">
                <div class="col-md-9">
                    <div class='book'>
                        <br/>
                        <table class='table table-bordered book-table'>
                            <tr>
                                <th>Customer Name</th>
                                <th>Address</th>
                                <th>Fax</th>
                                <th>Contact1</th>
                                <th>Contact2</th>
                            </tr>
                            <c:forEach items="${customerList}" var="result">
                                <tr>
                                    <td>${result.name}</td>
                                    <td>${result.address}</td>
                                    <td>${result.fax}</td>
                                    <td>${result.tl1}</td>
                                    <td>${result.tl2}</td>
                                    <td><form action="deleteCustomer"><input type="hidden" value="${result.customerId}" name="custId"/><button class="btn btn-danger" type="submit" >DELETE</button></form></td>
                                    <td><form action="updateCustomer"><input type="hidden" value="${result.customerId}" name="custId"/><button class="btn btn-success" type="submit">UPDATE</button></form></td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                </div>
        </div>
        </div>
    </body>
</html>
