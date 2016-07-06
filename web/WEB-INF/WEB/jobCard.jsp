<%-- 
    Document   : jobCard
    Created on : Apr 28, 2016, 8:38:06 PM
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
        <br/>
        <br/>
        <div class="container">
            <div class="row">
                <jsp:include page="ALL/top.jsp"></jsp:include>
                <div class="col-md-3">
                    <fieldset>
                        <form:form action="addJobCard" modelAttribute="jobCard" method="POST">
                            <legend>Job Card Add</legend>
                            <label for="selectbasic">Select Customer Name</label>
                            <form:select class="form-control text-f" style="border-radius: 0px" path="customerId" >
                                <c:forEach items="${customers}" var="result">
                                    <form:option value="${result.customerId}">${result.name}</form:option>
                                </c:forEach>
                            </form:select>
                            <label for="selectbasic">Select Grade Name</label>
                            <form:select class="form-control text-f" style="border-radius: 0px" path="gradeId" >
                                <c:forEach items="${grades}" var="result">
                                    <form:option value="${result.gradeId}">${result.name}</form:option>
                                </c:forEach>
                           </form:select>


                            <form:input class="form-control text-f" style="border-radius: 0px" type="hidden" path="jobNumber" value="0" placeholder="JobNumber ?"></form:input><br/>
                                <label for="selectbasic">Vehicle Number</label>
                            <form:input class="form-control text-f" style="border-radius: 0px" path="vehicleNumber" placeholder="vehicleNumber ?"></form:input>
                            <div><form:errors path="vehicleNumber" Class="text-danger"/></div><br/>
                            <label for="selectbasic">Date</label>
                            <form:input class="form-control text-f" style="border-radius: 0px" path="date" placeholder="Date ? dd/mm/yyyy"></form:input>
                             <div><form:errors path="date" Class="text-danger"/></div><br/>
                            <label for="selectbasic">Model</label>
                            <form:input class="form-control text-f" style="border-radius: 0px" path="model" placeholder="Model ?"></form:input>
                             <div><form:errors path="model" Class="text-danger"/></div><br/>
                            <label for="selectbasic">Group Leader</label>
                            <form:input class="form-control text-f" style="border-radius: 0px" path="groupLeader" placeholder="GroupLeader ?"></form:input>
                             <div><form:errors path="groupLeader" Class="text-danger"/></div><br/>
                            <button  class="btn btn-primary"  style="margin-top: 5px;width: 40%;margin: 10px" type="submit">SAVE</button>
                                <!--<button  class="btn btn-danger"  style="margin-top: 5px;width: 40%;margin: 10px" type="button" >CANCEL</button>-->
                                <a href="complaint"><button  class="btn btn-warning" type="button" style="margin-top: 5px;width: 40%;margin: 10px">NEXT</button></a>
                        </form:form>
                    </fieldset>
                </div>
                <div class="col-md-3">
                    <form action="searchJobCard">
                        <label for="selectbasic">Search JobCard</label>
                        <input type="text" name="jobNum" class="form-control text-f" style="border-radius: 0px" placeholder="SearchJobNum ?"/>
                        <button  class="btn btn-primary"  style="margin-top: 5px;width: 40%;margin: 10px" type="submit">SEARCH</button>
                    </form>
                </div>                 
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
