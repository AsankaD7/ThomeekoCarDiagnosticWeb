<%-- 
    Document   : index
    Created on : Apr 27, 2016, 7:25:58 PM
    Author     : asankad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="AsankaDJayasinghe" />
        <!-- css links -->
        <link rel="shortcut icon" href="images/tourse.png">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" media="all">
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" media="all" />
        <link rel="stylesheet" type="text/css" href="css/caption-hover.css" />
        <link rel="stylesheet" type="text/css" href="css/circle-hover.css" />
        <link href="css/slider.css" rel="stylesheet" type="text/css" media="all">
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all">
        <!-- /css links -->
        <link href='//fonts.googleapis.com/css?family=Raleway:400,100,200,300,500,600,700,800,900' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Poiret+One' rel='stylesheet' type='text/css'>
        <script src="js/SmoothScroll.min.js"></script>
        <script type="text/javascript" src="js/modernizr.custom.js"></script>
        <script src="js/jquery.js" type="text/javascript"></script>
        <title>JSP Page</title>

    </head>
    <body>
        <!-- Fixed navbar -->
        <nav class=" navbar-default navbar-fixed-top" >
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#myPage">Thomeeko Car Diagnostic</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#myPage">Home</a></li>
                        <li><a href="#about">About</a></li>
                        <li><a href="#services">Services</a></li>
                        <li><a href="#contact">Contact</a></li>
                        <li><a href="login">LogIn</a></li>
                    </ul>
                </div><!--/.nav-collapse -->
            </div>
        </nav>
        <!-- /Fixed navbar -->	
        <!-- Banner -->
        <div class="banner" id="myPage">
            <div id="content">
                <div id="slider">
                    <img src="images/i.jpg" alt="TOYOTA" data-url="#1">
                    <img src="images/a.jpg" alt="NISSAN" data-url="#2">
                    <img src="images/b.jpg" alt="HONDA" data-url="#3">
                    <img src="images/c.jpg" alt="BMW" data-url="#4">
                    <img src="images/d.jpg" alt="JAGUAR" data-url="#5">
                    <img src="images/e.jpg" alt="LAMBOGINI" data-url="#6">
                    <img src="images/f.jpg" alt="AUDI" data-url="#7">
                </div>
            </div>
            <section class="sri-lanka">
                <p class="welcome-to text-center">WELCOME TO THE WORLDS ONE OF <br>THE BEST VEHICLE REPAIR PLACE<br> CALLED Thomeeko Car Diagnostic</p>
<!--                <div class="text-center"><a href="login"><button class="btn btn-primary">LOG IN</button></a></div>-->
                <div class="text-center experience">     
                   One of the leading Auto Mobile service operator in Sri Lanka <p class="denzil">Thomeeko Car Diagnostic</p> ,Repair is to provide high quality, convenient and 
                   comprehensive auto repair at low cost. The most important aspect of our business is trust. It is the goal of our firm to have 100% customer satisfaction in regards to quality,
                   friendliness, time to completion and to discover new ways to exceed the expectations of our clients. 
                </div>
            </section>
        </div>
        <!-- /Banner -->  
        <!-- About -->
        <section class="about-us" id="about">
            <h3 class="text-center slideanim">About Us</h3>
            <div class="container">
                <div class="row">
                    <div class="col-lg-4 slideanim">
                        <p>Thomeeko Car Diagnostic is one of most trusted names in car repairing. When something feels 'off' 
                    with your vehicle do not hesitate to bring it to us. We assess your car and provide anything 
                    it needs with our certified technicians and latest technologies. </p>
                    </div>
                    <div class="col-lg-4 slideanim">
                        <p>You will be wondered of our 
                    service guarantee and fabulous offers and promotions. When you want your car to run 
                    newer,stronger,longer come to us. Our goal is to keep your car running healthy and you safe.</p>
                    </div>
                    <div class="col-lg-3 col-lg-offset-1 slideanim">
                        <img src="images/owner.jpg" alt="Owner" style="width:200px; height:250px;">
                    </div>
                </div>
            </div>
        </section>
        <section class="our-services" id="services">
            <h3 class="text-center slideanim">Our Services</h3>
            <ul class="ch-grid">
                <li>
                    <div class="ch-item ch-img-1 slideanim">				
                        <div class="ch-info-wrap">
                            <div class="ch-info">
                                <div class="ch-info-front ch-img-1"></div>
                                <div class="ch-info-back">
                                    <h5>Computer Diagnostics </h5>
                                </div>	
                            </div>
                        </div>
                    </div>
                    <h4 class="slideanim">Computer Diagnostics</h4>
                </li>
                <li>
                    <div class="ch-item ch-img-2 slideanim">
                        <div class="ch-info-wrap">
                            <div class="ch-info">
                                <div class="ch-info-front ch-img-2"></div>
                                <div class="ch-info-back">
                                    <h5>Safety Analysis</h5>
                                </div>
                            </div>
                        </div>
                    </div>
                    <h4 class="slideanim">Safety Analysis</h4>
                </li>
                <li>
                    <div class="ch-item ch-img-3 slideanim">
                        <div class="ch-info-wrap">
                            <div class="ch-info">
                                <div class="ch-info-front ch-img-3"></div>
                                <div class="ch-info-back">
                                    <h5>Drivability Problems </h5>
                                </div>
                            </div>
                        </div>
                    </div>
                    <h4 class="slideanim">Drivability Problems </h4>
                </li>
                <li>
                    <div class="ch-item ch-img-4 slideanim">
                        <div class="ch-info-wrap">
                            <div class="ch-info">
                                <div class="ch-info-front ch-img-4"></div>
                                <div class="ch-info-back">
                                    <h5>Air Conditioning</h5>
                                </div>
                            </div>
                        </div>
                    </div>
                    <h4 class="slideanim">Air Conditioning</h4>
                </li>
            </ul>
        </section>
        <!-- /Services -->
        <!-- Contact-Us -->
        <section class="contact-us" id="contact">
            <h3 class="text-center slideanim">Contact Us</h2>
                <div class="container">
                    <div class="row">
                        <div class="col-md-8 col-xs-12 slideanim">
                            <div id="map" style="height:300px;"></div>
                            <script>

                                // The following example creates complex markers to indicate beaches near
                                // Sydney, NSW, Australia. Note that the anchor is set to (0,32) to correspond
                                // to the base of the flagpole.

                                function initMap() {
                                    var map = new google.maps.Map(document.getElementById('map'), {
                                        zoom: 16,
                                        center: {lat: 6.770900, lng: 80.003800}
                                    });

                                    setMarkers(map);
                                }

                                function setMarkers(map) {
                                    // Adds markers to the map.

                                    // Marker sizes are expressed as a Size of X,Y where the origin of the image
                                    // (0,0) is located in the top left of the image.

                                    // Origins, anchor positions and coordinates of the marker increase in the X
                                    // direction to the right and in the Y direction down.
                                    var image = {
                                        url: 'images/location.png',
                                        // This marker is 20 pixels wide by 32 pixels high.
                                        size: new google.maps.Size(40, 40),
                                        // The origin for this image is (0, 0).
                                        origin: new google.maps.Point(0, 0),
                                        // The anchor for this image is the base of the flagpole at (0, 32).
                                        anchor: new google.maps.Point(0, 40)
                                    };
                                    var location = ['Denzil Lanka Tours', 6.770900, 80.003800, 1];
                                    var marker = new google.maps.Marker({
                                        position: {lat: location[1], lng: location[2]},
                                        map: map,
                                        icon: image,
                                        title: location[0],
                                        zIndex: location[3]
                                    });
                                }

                            </script>
                            <script async defer
                            src="https://maps.googleapis.com/maps/api/js?callback=initMap"></script>
                        </div>
                        <div class="col-md-4 col-xs-12 slideanim">
                            <p>Phone :0094-777-251-881 (Mr.Prasanna)</p>
                            <p>Email:<a href="mailto:dkrathna@gmail.com">dkrathna@gmail.com</a></p>
                            <p>Address:&nbsp;&nbsp; D.S. Denzil K. Rathnayaka <br />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; No.268 B,Mohottigoda, Koralaima,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                Gonapola Junction,Sri Lanka.<br />
                            <div class="clearfix"></div>
                        </div>
                    </div>
                    </section>
                    <!-- /Contact-Us -->
                    <!-- Contact-Form -->	
                    <section class="contact-form" id="contact-info">
                        <h3 class="text-center slideanim">Contact Form</h3>
                        <div class="container">
                            <div class="row">
                                <div class="col-lg-12 slideanim">
                                    <form role="form" action="MAILTO:dkrathna@gmail.com" method="post" enctype="text/plain">
                                        <div class="row">
                                            <div class="form-group col-lg-4">
                                                <label>Name</label>
                                                <input type="text" class="form-control">
                                            </div>
                                            <div class="form-group col-lg-4">
                                                <label>Email Address</label>
                                                <input type="email" class="form-control">
                                            </div>
                                            <div class="form-group col-lg-4">
                                                <label>Phone Number</label>
                                                <input type="tel" class="form-control">
                                            </div>
                                            <div class="clearfix"></div>
                                            <div class="form-group col-lg-12">
                                                <label>Message</label>
                                                <textarea class="form-control" rows="6"></textarea>
                                            </div>
                                            <div class="form-group col-lg-12">
                                                <button type="submit" href="#" class="btn btn-lg btn-outline">Submit</button>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </section>	
                    <!-- /Contact-Form -->
                    <!-- Footer -->
                    <footer class="text-center slideanim">
                        <div class="footer-above">
                            <div class="container">
                                <div class="row">
                                    <div class="footer-col col-md-4">
                                        <h4>Location</h4>
                                        <p>&nbsp;&nbsp; D.S. Denzil K. Rathnayaka <br />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; No.268 B,Mohottigoda, Koralaima,<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                            Gonapola Junction,Sri Lanka.<br /></p>
                                    </div>
                                    <div class="footer-col col-md-4">
                                        <h4>Around the Web</h4>
                                        <ul class="list-inline">
                                            <li>
                                                <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-facebook"></i></a>
                                            </li>
                                            <li>
                                                <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-google-plus"></i></a>
                                            </li>
                                            <li>
                                                <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-twitter"></i></a>
                                            </li>
                                            <li>
                                                <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-linkedin"></i></a>
                                            </li>
                                            <li>
                                                <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-dribbble"></i></a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="footer-col col-md-4">
                                        <h4>Thomeeko Car Diagnostic</h4>
                                        <p>One of the leading Auto Mobile service <br/>operator in Sri Lanka<br/></p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="footer-below">
                            <div class="container">
                                <div class="row">
                                    <div class="col-lg-12">
                                        <p>Copyright &copy; 2016 Thomeeko Car Diagnostic</p>
                                    </div>
                                </div>
                            </div>
                            <a href="#myPage" title="To Top">
                                <span class="glyphicon glyphicon-chevron-up"></span>
                            </a>
                        </div>
                    </footer>
                    <!-- js files -->
                    <script src="js/jquery.min.js"></script>
                    <script src="js/bootstrap.min.js"></script>
                    <script src="js/classie.js"></script>
                    <script src="js/TweenMax.min.js"></script>
                    <script src="js/index.js"></script>
                    <script src="js/index2.js"></script>
                    <script>
                                $(document).ready(function () {
                                    // Add smooth scrolling to all links in navbar + footer link
                                    $(".navbar a, footer a[href='#myPage']").on('click', function (event) {

                                        // Prevent default anchor click behavior
                                        event.preventDefault();

                                        // Store hash
                                        var hash = this.hash;

                                        // Using jQuery's animate() method to add smooth page scroll
                                        // The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area
                                        $('html, body').animate({
                                            scrollTop: $(hash).offset().top
                                        }, 900, function () {

                                            // Add hash (#) to URL when done scrolling (default click behavior)
                                            window.location.hash = hash;
                                        });
                                    });
                                })
                    </script>
                    <script>
                        $(window).scroll(function () {
                            $(".slideanim").each(function () {
                                var pos = $(this).offset().top;

                                var winTop = $(window).scrollTop();
                                if (pos < winTop + 600) {
                                    $(this).addClass("slide");
                                }
                            });
                        });
                    </script>
                    <!-- /js files -->
                    </body>
                    </html>
