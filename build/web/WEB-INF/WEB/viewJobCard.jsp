<%-- 
    Document   : viewJobCard
    Created on : May 20, 2016, 11:10:25 PM
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
                                <th>Job Number</th>
                                <th>Customer Name</th>
                                <th>Grade</th>
                                <th>Vehicle Number</th>
                                <th>Date</th>
                                <th>Model</th>
                                <th>Group Leader</th>
                            </tr>
                            <c:forEach items="${jobCardList}" var="result">
                                <tr>
                                    <td>${result.jobNumber}</td>
                                    <td>${result.customerId.name}</td>
                                    <td>${result.gradeId.name}</td>
                                    <td>${result.vehicleNumber}</td>
                                    <td>${result.date}</td>
                                    <td>${result.model}</td>
                                    <td>${result.groupLeader}</td>
                                    <td><form action="deleteJobCard"><input type="hidden" value="${result.jobNumber}" name="jobNum"/><button class="btn btn-danger" type="submit" >DELETE</button></form></td>
                                    <td><form action="updateJobCard"><input type="hidden" value="${result.jobNumber}" name="jobNum"/><button class="btn btn-success" type="submit">UPDATE</button></form></td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
