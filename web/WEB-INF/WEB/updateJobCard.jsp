<%-- 
    Document   : updateJobCard
    Created on : May 9, 2016, 1:32:02 AM
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
                        <form:form action="addUpdateJobCard" modelAttribute="jobCard" method="POST">
                            <legend>Update Job Card</legend>
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


                            <form:hidden class="form-control text-f" style="border-radius: 0px" path="jobNumber" value='<%= request.getParameter("jobNum") %>' placeholder="JobNumber ?"/>
                                <label for="selectbasic">Vehicle Number</label>
                            <form:input class="form-control text-f" style="border-radius: 0px" path="vehicleNumber" placeholder="vehicleNumber ?"></form:input>
                            <div><form:errors path="vehicleNumber" Class="text-danger"/></div><br/>
                            <label for="selectbasic">Date</label>
                            <form:input class="form-control text-f" style="border-radius: 0px" path="date" placeholder="Date ?"></form:input>
                            <div><form:errors path="date" Class="text-danger"/></div><br/>
                            <label for="selectbasic">Model</label>
                            <form:input class="form-control text-f" style="border-radius: 0px" path="model" placeholder="Model ?"></form:input>
                            <div><form:errors path="model" Class="text-danger"/></div><br/>
                            <label for="selectbasic">Group Leader</label>
                            <form:input class="form-control text-f" style="border-radius: 0px" path="groupLeader" placeholder="GroupLeader ?"></form:input>
                            <div><form:errors path="groupLeader" Class="text-danger"/></div><br/>
                            <button  class="btn btn-primary"  style="margin-top: 5px;width: 100%;margin: 10px" type="submit">UPDATE</button>
                                <!--<button  class="btn btn-danger"  style="margin-top: 5px;width: 40%;margin: 10px" type="button" >CANCEL</button>-->
                        </form:form>
                        <form action="jobCard"><input class="btn btn-danger"  style="margin-top: 5px;width: 100%;margin: 10px" type="submit" value="ADD JOBCARD"/></form>
                    </fieldset>
                </div>
            </div>
        </div>
    </body>
</html>
