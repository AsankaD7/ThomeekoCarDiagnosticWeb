<%-- 
    Document   : jobDone
    Created on : Apr 29, 2016, 10:09:43 AM
    Author     : asankad
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
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
                            <form action="getJobDone">
                                <legend>Job Done</legend>
                                <label for="selectbasic">Job Number</label>
                                <!--<input class="form-control text-f" style="border-radius: 0px" type="text" name="jobnumber" placeholder="jobnumber ?"><br/>-->

                                <select name="jobnumber" class="form-control text-f" style="border-radius: 0px">
                                <c:forEach items="${jobCardList}" var="result">
                                    <option value="${result.jobNumber}">${result.jobNumber}</option>
                                </c:forEach>
                            </select><br/>
                            <button  class="btn btn-primary"  style="margin-top: 5px;width: 90%;margin: 10px" type="submit">SELECT</button>
                            <!--<button  class="btn btn-danger"  style="margin-top: 5px;width: 40%;margin: 10px" type="button" >CANCEL</button>-->
                        </form>
                    </fieldset>    

                    <br/>
                    <br/>
                    <fieldset>
                        <form action="addJobDone">
                            <legend>Job Done</legend>
                            <label for="selectbasic">Job Complaint Nature</label>                       
                            <select name="complain" class="form-control text-f" style="border-radius: 0px">
                                <c:forEach items="${jobCardDone.complaintList}" var="result">
                                    <option value="${result.complaintId}">${result.nature}</option>
                                </c:forEach>
                            </select><br/>
                            <label for="selectbasic">Job Done Nature</label> 
                            <input class="form-control text-f" style="border-radius: 0px" type="text" name="nature" placeholder="nature ?"/><br/>
                            <label for="selectbasic">Amount</label> 
                            <input class="form-control text-f" style="border-radius: 0px" type="text" name="amount" placeholder="amount ?"/><br/>
                            <button  class="btn btn-primary"  style="margin-top: 5px;width: 40%;margin: 10px" type="submit">SAVE</button>
                            <a href="adminPannel"><button  class="btn btn-danger"  style="margin-top: 5px;width: 40%;margin: 10px" type="button" >CANCEL</button></a>
                        </form>
                    </fieldset>
                </div>
                <div class="col-md-9">
                    <div>
                        <br/>
                        <table class='table table-bordered book-table'>
                            <tr>
                                <th>Complaint Id</th>
                                <th>Nature</th>
                                <th>Instruction</th>
                            </tr>            
                            <c:forEach items="${jobCardDone.complaintList}" var="result">

                                <tr>
                                    <td>${result.complaintId}</td>
                                    <td>${result.nature}</td>
                                    <td>${result.instruction}</td>
                                </tr>
                            </c:forEach>  
                        </table>
                    </div>

                    <div>
                        <br/>
                        <table class='table table-bordered book-table'>
                            <tr>
                                <th>Complaint Id</th>
                                <th>JobDone Nature</th>
                                <th>Amount</th>
                            </tr>            
                            <c:forEach items="${jobDoneList}" var="result">

                                <tr>
                                    <td>${result.complaintId.complaintId}</td>
                                    <td>${result.nature}</td>
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
