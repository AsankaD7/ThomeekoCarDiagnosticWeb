<%-- 
    Document   : jobFinish
    Created on : May 7, 2016, 11:27:31 AM
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

                    <form:form action="addJobFinish" modelAttribute="jobFinish" method="POST">
                       <legend>Job Finish</legend>
                        <form:input class="form-control text-f" style="border-radius: 0px" type="hidden" path="jobFinishid" value="0" placeholder="jobFinishId ?"></form:input>
                        <label for="selectbasic">Select Job Number</label>
                        <form:select class="form-control text-f" style="border-radius: 0px" path="jobNumber" >
                            <c:forEach items="${jobCardList}" var="result">
                                <form:option value="${result.jobNumber}">${result.jobNumber}</form:option>
                            </c:forEach>
                        </form:select>
                        <label for="selectbasic">Test By</label>
                        <form:input class="form-control text-f" style="border-radius: 0px" path="testBy" placeholder="TestBy ?"></form:input>
                        <div><form:errors path="testBy" Class="text-danger"/></div><br/>
                        <label for="selectbasic">Job Director</label>
                        <form:input class="form-control text-f" style="border-radius: 0px" path="jobDirector" placeholder="JobDirector ?"></form:input>
                        <div><form:errors path="jobDirector" Class="text-danger"/></div><br/>
                        <label for="selectbasic">Finish Date</label>
                        <form:input class="form-control text-f" style="border-radius: 0px" path="finishDate" placeholder="finishDate ?dd/mm/yyyy"></form:input>
                        <div><form:errors path="finishDate" Class="text-danger"/></div><br/>
                        <button  class="btn btn-primary"  style="margin-top: 5px;width: 40%;margin: 10px" type="submit">SAVE</button>
                        <a href="adminPannel"><button  class="btn btn-danger"  style="margin-top: 5px;width: 40%;margin: 10px" type="button" >CANCEL</button></a>
                      
                    </form:form>
                                        </fieldset>
                </div>
                <div class="col-md-9">
                    <div class='book'>
                        <br/>
                        <table class='table table-bordered book-table'>
                            <tr>
                                <th>Job Number</th>
                                <th>Tested By</th>
                                <th>Job Director</th>
                                <th>Finish Date</th>
                            </tr>
                            <c:forEach items="${jobFinishList}" var="result">
                                <tr>
                                    <td>${result.jobNumber.jobNumber}</td>
                                    <td>${result.testBy}</td>
                                    <td>${result.jobDirector}</td>
                                    <td>${result.finishDate}</td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
