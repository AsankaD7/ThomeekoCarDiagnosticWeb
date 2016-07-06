<%-- 
    Document   : SparePart
    Created on : Apr 27, 2016, 11:15:05 PM
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
                <jsp:include page="ALL/top.jsp"></jsp:include>
                </div>
                <div style="width: 40px; margin-top: 50px;"></div>            
                <div class="row">
                    <div class="col-md-3">
                        <fieldset>
                        <form:form action="addSparePart" modelAttribute="sparePart" method="POST">
                            <legend>Spare Part</legend>
                            <form:input class="form-control text-f" style="border-radius: 0px" type="hidden" path="partId" value="0" placeholder="partId ?"></form:input>
                                <label for="selectbasic">Description</label>
                            <form:input class="form-control text-f" style="border-radius: 0px" path="description" placeholder="description ?"></form:input>
                            <div><form:errors path="description" class="text-danger" /></div><br/>
                            <button  class="btn btn-primary"  style="margin-top: 5px;width: 40%;margin: 10px" type="submit">SAVE</button>
                            <a href="adminPannel"><button  class="btn btn-danger"  style="margin-top: 5px;width: 40%;margin: 10px" type="button" >CANCEL</button></a>

                        </form:form>
                </div>
                <div class="col-md-9">
                    <div class='book'>
                        <br/>
                        <table class='table table-bordered book-table'>
                            <tr>
                                <th>Description</th>
                            </tr>
                            <c:forEach items="${SparePartList}" var="result">
                                <tr>
                                    <td>${result.description}</td>
                                </tr>
                            </c:forEach>
                        </table>  
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
