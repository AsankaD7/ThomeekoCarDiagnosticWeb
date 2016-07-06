<%-- 
    Document   : login
    Created on : Apr 29, 2016, 11:04:32 PM
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
        <link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:700|Raleway|Open+Sans' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Indie+Flower' rel='stylesheet' type='text/css'>
        <title>JSP Page</title>
    </head>
    <body style="background-image: url(IMAGE/bcground.jpg);background-size: cover">
        <jsp:include page="MAIN/LognInTop.jsp"></jsp:include>
        <!--<img src="../RES/IMAGE/bcground.jpg" alt=""/>-->
        <%--<jsp:include page="MAIN/LogInTop.jsp"></jsp:include>--%>
        <br/>
        <br/>
        <br/>
        <br/>
        <div class="container">
            <div class="head-line"><center>THOMEEKO CAR DIAGNOSTIC</center></div>
            <br/>
            <div class="row">
                <div class="col-md-12">
                    <div class="login-div">
                        <div class="member-login">Member Login</div>

                        <br/>
                        <form action="addLogIn" method="POST">
                            <label for="selectbasic">User Name</label>
                            <input name="username" type="text"  class="form-control text-f" style="border-radius: 0px" placeholder="Name ?"/>
                            <label for="selectbasic">Password</label>
                            <input name="password" type="password" class="form-control text-f" style="border-radius: 0px" placeholder="Password ?" />
                            <input style="margin-top: 5px;width: 100%;margin: 10px"  type="submit" class="btn btn-primary" value="Login">
                        </form>
                        <br/>
                        <!--<a href="signIn">Create new account?</a>-->
                        <br/>
                        <br/>
                    </div>
                </div>
            </div>
        </div>


        <jsp:include page="MAIN/Bottom.jsp"></jsp:include>
    </body>
</html>
