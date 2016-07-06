<%-- 
    Document   : searchCustomer
    Created on : May 12, 2016, 11:43:40 PM
    Author     : asankad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/MainStyle.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/AdminLTE.min.css" rel="stylesheet" type="text/css"/>
        <link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:700|Raleway|Open+Sans' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Indie+Flower' rel='stylesheet' type='text/css'>
        <script src="js/jquery.js" type="text/javascript"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
                        <legend>Customer Search</legend>                    
                    <form action="searchCustomer">
                        <input type="text" name="custId" class="form-control text-f" style="border-radius: 0px" placeholder="SearchCustomer ?"/>
                        <button  class="btn btn-primary"  style="margin-top: 5px;width: 40%;margin: 10px" type="submit">SEARCH</button>
                        <a href="adminPannel"><button  class="btn btn-danger" type="button" style="margin-top: 5px;width: 40%;margin: 10px">CANCEL</button></a>
                    </form>
                    </fieldset>   
                </div>    
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
                                <tr>
                                    <td>${customer.name}</td>
                                    <td>${customer.address}</td>
                                    <td>${customer.fax}</td>
                                    <td>${customer.tl1}</td>
                                    <td>${customer.tl2}</td>
                                    <td><form action="deleteCustomer"><input type="hidden" value="${customer.customerId}" name="custId"/><button class="btn btn-danger" type="submit" >DELETE</button></form></td>
                                    <td><form action="updateCustomer"><input type="hidden" value="${customer.customerId}" name="custId"/><button class="btn btn-success" type="submit">UPDATE</button></form></td>
                                </tr>
                        </table>
                    </div>
                </div>
            </div>
        </div>        
    </body>
</html>
