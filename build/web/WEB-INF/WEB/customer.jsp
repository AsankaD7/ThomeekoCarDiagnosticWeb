<%-- 
    Document   : customer
    Created on : Apr 27, 2016, 7:55:58 PM
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
                <jsp:include page="ALL/top.jsp"></jsp:include>
                </div>
                <div style="width: 40px; margin-top: 50px;"></div>
                <div class="row">
                    <div class="col-md-3">
                        <fieldset>
                        <form:form action="addCustomer" modelAttribute="customer" method="POST">
                            <legend>Customer Add</legend>
                            <form:input class="form-control text-f" style="border-radius: 0px" type="hidden" path="customerId" value="0" placeholder="CustomerName ?"></form:input>
                                <label for="selectbasic">Customer Name</label>
                            <form:input class="form-control text-f" style="border-radius: 0px" path="name" placeholder="CustomerName ?"></form:input>
                            <div><form:errors path="name" Class="text-danger"/></div><br/>
                            <label for="selectbasic">Address</label>
                            <form:input class="form-control text-f" style="border-radius: 0px" path="address" placeholder="Address ?"></form:input>
                            <div><form:errors path="address" Class="text-danger"/></div><br/>
                            <label for="selectbasic">Fax Number</label>
                            <form:input class="form-control text-f" style="border-radius: 0px" path="fax" placeholder="FaxNo ?"></form:input>
                            <div><form:errors path="fax" Class="text-danger"/></div><br/>
                            <label for="selectbasic">Contact One</label>
                            <form:input class="form-control text-f" style="border-radius: 0px" path="tl1" placeholder="Contact One ?"></form:input>
                            <div><form:errors path="tl1" Class="text-danger"/></div><br/>
                            <label for="selectbasic">Contact Two</label>
                            <form:input class="form-control text-f" style="border-radius: 0px" path="tl2" placeholder="Contact Two ?"></form:input>
                            <div><form:errors path="tl2" Class="text-danger"/></div><br/>   
                            <button  class="btn btn-primary"  style="margin-top: 5px;width: 40%;margin: 10px" type="submit">SAVE</button>

                            <a href="adminPannel"><button  class="btn btn-danger" type="button" style="margin-top: 5px;width: 40%;margin: 10px">CANCEL</button></a> 
                        </form:form>
                    </fieldset>
                </div>
                <div class="col-md-3">
                    <form action="searchCustomer">
                        <label for="selectbasic">Search Customer</label>
                        <input type="text" name="custId" class="form-control text-f" style="border-radius: 0px" placeholder="SearchNumber ?"/>
                        <button  class="btn btn-primary"  style="margin-top: 5px;width: 40%;margin: 10px" type="submit">SEARCH</button>
                    </form>
                </div>    
                <div class="col-md-9">
                    <div class='book'>
                        <br/>
                        <table class='table table-bordered book-table'>
                            <tr>
                                <th>Customer Number</th>
                                <th>Customer Name</th>
                                <th>Address</th>
                                <th>Fax</th>
                                <th>Contact1</th>
                                <th>Contact2</th>
                            </tr>
                            <c:forEach items="${customerList}" var="result">
                                <tr>
                                    <td>${result.customerId}</td>
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
