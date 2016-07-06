<%-- 
    Document   : signIn
    Created on : Apr 29, 2016, 11:12:59 PM
    Author     : asankad
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    <body style="background-image: url(IMAGE/signIn.jpg);background-size: cover">
        <jsp:include page="MAIN/Top.jsp"></jsp:include>
            <br/>
            <br/>
            <br/>
            <br/>
            <div class="container">
                <div class="row">
                    <div class="col-md-8">
                        <div class="head-line">
                            <center>THOMEEKO CAR DIAGONASTIC</center>
                            <br/>
                        </div>
                    </div>
                </div>
            <form:form action="addSignIn" modelAttribute="userMap" method="POST">
                <div class="row">
                    <div class="col-md-4">   
                        
                        <div style="color: red">${error}</div>
                        <label for="selectbasic">User Name</label>
                        <form:input class="form-control text-f" style="border-radius: 0px" path="name" placeholder="Name ?"></form:input>
                            <label for="selectbasic">Password</label>
                        <form:input class="form-control text-f" style="border-radius: 0px" type="password" path="password" placeholder="Password ?"></form:input>
                            <label for="selectbasic">Confirm Password</label>
                            <input class="form-control text-f" style="border-radius: 0px" type="password" name="conpassword" placeholder="Confirm Password ?" value="${userConfirm}"/>
                        <input style="margin-top: 5px;width: 40%;margin: 10px"  type="submit" class="btn btn-primary" value="Done"/>
                        <a href="adminPannel"><button  class="btn btn-danger" type="button" style="margin-top: 5px;width: 40%;margin: 10px">CANCEL</button></a> 
                    </div>                     
                </div>
            </form:form>
        </div>
    </body>
</html>
