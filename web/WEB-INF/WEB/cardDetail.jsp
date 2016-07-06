<%-- 
    Document   : cardDetail
    Created on : May 8, 2016, 11:50:39 AM
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
                        <form:form action="addCardDetail" modelAttribute="cardDetailMap" method="POST">
                            <legend>Card Detail Add</legend>                          
                            <label for="selectbasic">Select Job Card Number</label>
                            <form:select class="form-control text-f" style="border-radius: 0px" path="jobCard" >
                                <c:forEach items="${jobCardList}" var="result">
                                    <form:option value="${result.jobNumber}">${result.jobNumber}</form:option>
                                </c:forEach>
                            </form:select>
                            <label for="selectbasic">Select Spare Part</label>
                            <form:select class="form-control text-f" style="border-radius: 0px" path="sparePart" >
                                <c:forEach items="${sparePartList}" var="result">
                                    <form:option value="${result.partId}">${result.description}</form:option>
                                </c:forEach>
                            </form:select>                             
                            <label for="selectbasic">Quantity</label>
                            <form:input class="form-control text-f" style="border-radius: 0px" path="qty" placeholder="Quantity ?"></form:input><br/>
                            <label for="selectbasic">Amount</label>
                            <form:input class="form-control text-f" style="border-radius: 0px" path="amount" placeholder="Amount ?"></form:input><br/>
                            <button  class="btn btn-primary"  style="margin-top: 5px;width: 40%;margin: 10px" type="submit">SAVE</button>
                            <a href="adminPannel">   <button  class="btn btn-danger"  style="margin-top: 5px;width: 40%;margin: 10px" type="button" >CANCEL</button></a>
                        </form:form>
                    </fieldset>
                </div>
                <div class="col-md-9">
                    <div class='book'>
                        <br/>
                        <table class='table table-bordered book-table'>
                            <tr>
                                <th>Job Card Number</th>
                                <th>Spare Part</th>
                                <th>Quantity</th>
                                <th>Amount</th>
                            </tr>
                            <c:forEach items="${cardDetailList}" var="result">
                                <tr>
                                    <td>${result.jobCard.jobNumber}</td>
                                    <td>${result.sparePart.description}</td>
                                    <td>${result.qty}</td>
                                    <td>${result.amount}</td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
