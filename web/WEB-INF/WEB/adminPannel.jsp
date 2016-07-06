<%-- 
    Document   : adminPannel
    Created on : May 8, 2016, 3:01:20 PM
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

        <script>
            $(function () {
                $('#customer')
                        .mouseenter(function () {
                            $('#customer').attr('src' , 'IMAGE/manageCustomer1.jpg');
                        })
                        .mouseleave(function () {
                           $('#customer').attr('src' , 'IMAGE/manageCustomer.jpg');
                        })
                        .click(function () {

                        });
                $('#jobCard')
                        .mouseenter(function () {
                            $('#jobCard').attr('src' , 'IMAGE/manageJobCard1.jpg');
                        })
                        .mouseleave(function () {
                           $('#jobCard').attr('src' , 'IMAGE/manageJobCard.jpg');
                        })
                        .click(function () {

                        });
                $('#sparePart')
                        .mouseenter(function () {
                            $('#sparePart').attr('src' , 'IMAGE/addSparePart1.jpg');
                        })
                        .mouseleave(function () {
                           $('#sparePart').attr('src' , 'IMAGE/addSparePart.jpg');
                        })
                        .click(function () {

                        });                

                $('#viewCustomer')
                        .mouseenter(function () {
                            $('#viewCustomer').attr('src' , 'IMAGE/viewCustomer1.jpg');
                        })
                        .mouseleave(function () {
                           $('#viewCustomer').attr('src' , 'IMAGE/viewCustomer.jpg');
                        })
                        .click(function () {

                        });
                
                $('#viewCustomer')
                        .mouseenter(function () {
                            $('#viewCustomer').attr('src' , 'IMAGE/viewCustomer1.jpg');
                        })
                        .mouseleave(function () {
                           $('#viewCustomer').attr('src' , 'IMAGE/viewCustomer.jpg');
                        })
                        .click(function () {

                        }); 

                $('#jobDone')
                        .mouseenter(function () {
                            $('#jobDone').attr('src' , 'IMAGE/manageComplaint1.jpg');
                        })
                        .mouseleave(function () {
                           $('#jobDone').attr('src' , 'IMAGE/manageComplaint.jpg');
                        })
                        .click(function () {

                        });
                
                $('#cardDetail')
                        .mouseenter(function () {
                            $('#cardDetail').attr('src' , 'IMAGE/manageSparePart1.jpg');
                        })
                        .mouseleave(function () {
                           $('#cardDetail').attr('src' , 'IMAGE/manageSparePart.jpg');
                        })
                        .click(function () {

                        });
                
                $('#jobFinish')
                        .mouseenter(function () {
                            $('#jobFinish').attr('src' , 'IMAGE/completeJob1.jpg');
                        })
                        .mouseleave(function () {
                           $('#jobFinish').attr('src' , 'IMAGE/completeJob.jpg');
                        })
                        .click(function () {

                        });
                
                $('#viewJobCard')
                        .mouseenter(function () {
                            $('#viewJobCard').attr('src' , 'IMAGE/viewJobCard1.jpg');
                        })
                        .mouseleave(function () {
                           $('#viewJobCard').attr('src' , 'IMAGE/viewJobCard.jpg');
                        })
                        .click(function () {

                        });                
            });
        </script>
    </head>
    <body>
        <!--<img src="../RES/IMAGE/manageCustomer1.jpg" alt=""/>-->
        <div class="menu-top navbar-fixed-top" style="background-image: url(IMAGE/Black-denim-seamless-fabric-texture-tile-able-website-backgrounds.jpg);background-repeat: repeat-x;">
            <div class="container" >
                <a href="logout"><div class="login">LOG OUT</div></a>
                <a href="signIn"><div class="login" style="border-right: #e2e2e2 2px solid;">CREATE NEW ACCOUNT</div></a>
            </div>
        </div>
        <div style="width: 40px; margin-top: 175px;"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-3">
                    <a href="customer"><img class="main-image center-block" id="customer"  src="IMAGE/manageCustomer.jpg" alt=""/></a>
                </div>
                <div class="col-md-3">
                    <a href="jobCard"><img class="main-image center-block" id="jobCard" src="IMAGE/manageJobCard.jpg" alt=""/></a>
                </div>
                <div class="col-md-3">
                    <a href="sparePart"><img class="main-image center-block" id="sparePart" src="IMAGE/addSparePart.jpg" alt=""/></a>
                </div>
                <div class="col-md-3">
                    <a href="viewCustomer"><img class="main-image center-block" id="viewCustomer" src="IMAGE/viewCustomer.jpg" alt=""/></a>
                </div>
            </div>
        <div style="width: 40px; margin-top: 125px;"></div>
            <div class="row">
                <div class="col-md-3">
                    <a href="jobDone"><img class="main-image center-block" id="jobDone" src="IMAGE/manageComplaint.jpg" alt=""/></a>
                </div>
                <div class="col-md-3">
                    <a href="cardDetail"><img class="main-image center-block" id="cardDetail" src="IMAGE/manageSparePart.jpg" alt=""/></a>
                </div>
                <div class="col-md-3">
                    <a href="jobFinish"><img class="main-image center-block" id="jobFinish" src="IMAGE/completeJob.jpg" alt=""/></a>
                </div>
                <div class="col-md-3">
                    <a href="viewJobCard"><img class="main-image center-block" id="viewJobCard" src="IMAGE/viewJobCard.jpg" alt=""/></a>
                </div>
            </div>
        </div>
    </body>
</html>
