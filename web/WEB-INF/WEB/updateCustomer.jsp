<%-- 
    Document   : updateCustomer
    Created on : May 7, 2016, 8:19:53 PM
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
        <div class="container">
                <div class="row">
                    <jsp:include page="ALL/top.jsp"></jsp:include>
                    </div>
                    <div style="width: 40px; margin-top: 50px;"></div>
                    <div class="row">
                    <div class="col-md-3">
                        <fieldset>
                        <form:form action="addUpdateCustomer" modelAttribute="customer" method="POST">
                            <legend>Update Customer</legend>
                            <form:input class="form-control text-f" style="border-radius: 0px" type="hidden" path="customerId" placeholder="CustomerName ?"></form:input>
                                <label>Customer Name</label>                   
                            <form:input class="form-control text-f" style="border-radius: 0px" path="name" placeholder="CustomerName ?"></form:input>
                            <div><form:errors path="name" Class="text-danger"/></div><br/>
                            <label>Address</label>
                            <form:input class="form-control text-f" style="border-radius: 0px" path="address" placeholder="Address ?"></form:input>
                            <div><form:errors path="address" Class="text-danger"/></div><br/>
                            <label>Fax No</label>
                            <form:input class="form-control text-f" style="border-radius: 0px" path="fax" placeholder="FaxNo ?"></form:input>
                            <div><form:errors path="fax" Class="text-danger"/></div><br/>
                            <label>Contact One</label>
                            <form:input class="form-control text-f" style="border-radius: 0px" path="tl1" placeholder="Contact One ?"></form:input>
                            <div><form:errors path="tl1" Class="text-danger"/></div><br/>
                            <label>Contact Two</label>
                            <form:input class="form-control text-f" style="border-radius: 0px" path="tl2" placeholder="Contact Two ?"></form:input>
                            <div><form:errors path="tl2" Class="text-danger"/></div><br/>
                            <button  class="btn btn-primary"  style="margin-top: 5px;width: 100%;margin: 10px" type="submit">UPDATE</button>
                                <!--<button  class="btn btn-danger"  style="margin-top: 5px;width: 40%;margin: 10px" type="button" >CANCEL</button>-->
                        </form:form>
                        <form action="customer"><input class="btn btn-danger"  style="margin-top: 5px;width: 100%;margin: 10px" type="submit" value="ADD CUSTOMER"/></form>
                    </fieldset>
                </div>
            </div>
        </div>
    </body>
</html>
