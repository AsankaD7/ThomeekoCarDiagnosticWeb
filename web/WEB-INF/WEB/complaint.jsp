<%-- 
    Document   : complaint
    Created on : Apr 28, 2016, 11:19:41 AM
    Author     : asankad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
                <div class="col-md-4">
                    <fieldset>

                        <form:form  action="addComplaint" modelAttribute="complaint" method="POST">
                            <legend>Complaint Add</legend>
                            <label for="selectbasic">Select Job Number</label>
                            <form:select path="jobNumber" class="form-control text-f" style="border-radius: 0px">
                                <c:forEach items="${jobCards}" var="result">
                                    <form:option value="${result.jobNumber}">${result.jobNumber}</form:option>
                                </c:forEach>
                            </form:select>

                            <form:input class="form-control text-f" style="border-radius: 0px" type="hidden" path="complaintId" value="0" placeholder="complaintId ?"></form:input><br/>
                            <label for="textinput">Nature</label>
                            <form:input class="form-control text-f" style="border-radius: 0px" path="nature" placeholder="nature ?"></form:input>
                            <div><form:errors class="text-danger" path="nature" /></div><br/>                            
                            <label for="textinput">Instruction</label>
                            <form:input class="form-control text-f" style="border-radius: 0px" path="instruction" placeholder="instruction ?"></form:input>
                            <div><form:errors class="text-danger" path="instruction" /></div><br/>

                                <button  class="btn btn-primary"  style="margin-top: 5px;width: 40%;margin: 10px" type="submit">SAVE</button>
                                <a href="adminPannel"><button  class="btn btn-success"  style="margin-top: 5px;width: 40%;margin: 10px" type="button" >FINISH JOB CARD</button></a>
                        </form:form>
                    </fieldset>
                </div>
                <div class="col-md-8">
                    <div class='book'>
                        <br/>
                        <table class='table table-bordered book-table'>

                            <tr>
                                <th>Job Number</th>
                                <th>Nature</th>
                                <th>Instruction</th>
                            </tr>
                            <c:forEach items="${ComplaintList}" var="result">
                                <tr>
                                    <td>${result.jobNumber.jobNumber}</td>
                                    <td>${result.nature}</td>
                                    <td>${result.instruction}</td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
