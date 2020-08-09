<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>About Us</title>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/fontawesome/4.7.0/css/font-awesome.min.css"/>

<!------ Include the above in your HEAD tag ---------->

<link href='https://fonts.googleapis.com/css?family=Roboto' rel='stylesheet'>

<style>
body{
background-color: #d6d6c2;
}
#titre-nav{

color:#9999ff;
}
nav
{
color:grey;
}
#title-nav{
color:#c2c2a3;
}

}



.aboutus-section {
    padding: 90px 0;
}
.aboutus-title {
    font-size: 30px;
    letter-spacing: 0;
    line-height: 32px;
    margin: 0 0 39px;
    padding: 0 0 11px;
    position: relative;
    text-transform: uppercase;
    color: #000;
}
.aboutus-title::after {
    background: #fdb801 none repeat scroll 0 0;
    bottom: 0;
    content: "";
    height: 2px;
    left: 0;
    position: absolute;
    width: 54px;
}
.aboutus-text {
    color: #606060;
    font-size: 13px;
    line-height: 22px;
    margin: 0 0 35px;
}

* {
	margin: 0;
	padding: 0;
}

html, body {
	height: 100%;
}

#gauche {
	width: 70%;
	height: 87%;
	float: left;

}
body
{
background-color: #d6d6c2;
}
#droite {
	width: 30%;
	height: 87%;
	float: left;
	
}
/*============ Service Features style ============*/
.service-heading-block{
	display:block;
	margin-bottom:30px;
	
	}
.title {
  display: block;
  font-size: 30px;
  font-weight: 200;
  margin-bottom: 10px;
}
.sub-title {
  font-size: 18px;
  font-weight: 100;
  line-height: 24px;
}
.feature-block {

  background-color: #fff;
  border-radius: 2px;
  padding: 15px;
  box-shadow: 0 2px 2px 0 rgba(0, 0, 0, 0.14), 0 3px 1px -2px rgba(0, 0, 0, 0.2), 0 1px 5px 0 rgba(0, 0, 0, 0.12);
  margin-bottom: 15px;
  transition:all ease .5s
}
.ms-feature:hover, 
.ms-feature:focus {
  background-color: #fafafa;
  box-shadow: 0 3px 4px 3px rgba(0, 0, 0, 0.14), 0 3px 3px -2px rgba(0, 0, 0, 0.2), 0 1px 8px 3px rgba(0, 0, 0, 0.12);
}
.fb-icon {
  border-radius: 50%;
  display: block;
  font-size: 36px;
  height: 80px;
  line-height: 80px;
  text-align:center;
  margin:1rem auto;
  width: 80px;
  transition: all 0.5s ease 0s;
}
.feature-block:hover .fb-icon,
.feature-block:focus .fb-icon {
  box-shadow: 0 4px 5px 0 rgba(0, 0, 0, 0.14), 0 1px 10px 0 rgba(0, 0, 0, 0.12), 0 2px 4px -1px rgba(0, 0, 0, 0.2);
  transform: rotate(360deg);
}
.fb-icon.color-info {
  background-color: #5bc0de;
  color: #fff;
}
.fb-icon.color-warning {
  background-color: #eea236;
  color: #fff;
}
.fb-icon.color-success {
  background-color: #5cb85c;
  color: #fff;
}
.fb-icon.color-danger {
  background-color: #d9534f;
  color: #fff;
}
.feature-block h4 {
  font-size: 16px;
  font-weight: 500;
  margin: 3rem 0 1rem;
}
.color-info {
  color: #46b8da;
}
.color-warning {
  color: #f0ad4e;
}
.color-success {
  color: #4cae4c;
}
.color-danger {
  color: #d43f3a;
}
.btn-custom{
  border: medium none;
  border-radius: 2px;
  cursor: pointer;
  font-size: 14px;
  font-weight: 500;
  letter-spacing: 0;
  margin: 10px 1px;
  outline: 0 none;
  padding: 8px 30px;
  position: relative;
  text-decoration: none;
  text-transform: uppercase;
  
}

.line2
{

	
margin-right:-17%;
margin-left:17%;	

}

.line1
{
	margin-left:5%;
	margin-top:5%;
	
}



h1 {
	font-size: 30px;
	font-weight: 700;
	text-shadow:0 1px 4px rgba(0,0,0,.2);
	text-align:center;
}

form {
position:relative;
width:305px;
margin:15px auto 0 auto;
text-align:center;

}

input {
width:270px;
height:42px;
margin-top:25px;
padding:0 15px;
background:#2d2d2d;
background:rgba(45,45,45,.15);
-moz-border-radius: 6px;
-webkit-border-radius:6px;
text-align:center;
border-radius:6px;
border:1px solid #3d3d3d;
border:1px solid rgba(255,255,255,.15);
-moz-box-shadow:0 2px 3px 0 rgba(0,0,0,.1) inset;
-webkit-box-shadow: 0 2px 3px 0 rgba(0,0,0,.1) inset;
box-shadow: 0 2px 3px 0 rgba(0,0,0,.1) inset;
font-family: 'PT Sans', Helvetica, Arial, sans-serif;
font-size:16px;
color:#fff;
text-shadow:0 1px 2px rgba(0,0,0,.1);
-o-transition: all .2s;
-moz-transition: all .2s;
-webkit-transition: all .2s;
-ms-transition: all .2s;
}

input:-moz-placeholder { color: #fff; }
input:-ms-input-placeholder { color: #fff; }
input::-webkit-input-placeholder { color: #fff; }

input:focus {
outline:none;
-moz-box-shadow:
        0 2px 3px 0 rgba(0,0,0,.1) inset,
        0 2px 7px 0 rgba(0,0,0,.2);
-webkit-box-shadow:
        0 2px 3px 0 rgba(0,0,0,.1) inset,
        0 2px 7px 0 rgba(0,0,0,.2);
box-shadow:
        0 2px 3px 0 rgba(0,0,0,.1) inset,
        0 2px 7px 0 rgba(0,0,0,.2);
}

button {
cursor:pointer;
width:300px;
height:44px;
margin-top:25px;
padding:0;
background:#007e9e;
-moz-border-radius: 6px;
-webkit-border-radius: 6px;
border-radius: 6px;
border:1px solid #007e9e;
-moz-box-shadow:
        0 15px 30px 0 rgba(255,255,255,.25) inset,
        0 2px 7px 0 rgba(0,0,0,.2);
-webkit-box-shadow:
        0 15px 30px 0 rgba(255,255,255,.25) inset,
        0 2px 7px 0 rgba(0,0,0,.2);
box-shadow:
        0 15px 30px 0 rgba(255,255,255,.25) inset,
        0 2px 7px 0 rgba(0,0,0,.2);
font-family:'PT Sans', Helvetica, Arial, sans-serif;
font-size:14px;
font-weight:700;
color:#fff;
text-shadow:0 1px 2px rgba(0,0,0,.1);
-o-transition: all .2s;
    -moz-transition: all .2s;
    -webkit-transition: all .2s;
    -ms-transition: all .2s;
}

button:hover {
    -moz-box-shadow:
        0 15px 30px 0 rgba(255,255,255,.15) inset,
        0 2px 7px 0 rgba(0,0,0,.2);
    -webkit-box-shadow:
        0 15px 30px 0 rgba(255,255,255,.15) inset,
        0 2px 7px 0 rgba(0,0,0,.2);
    box-shadow:
        0 15px 30px 0 rgba(255,255,255,.15) inset,
        0 2px 7px 0 rgba(0,0,0,.2);
}

button:active {
    -moz-box-shadow:
        0 15px 30px 0 rgba(255,255,255,.15) inset,
        0 2px 7px 0 rgba(0,0,0,.2);
    -webkit-box-shadow:
        0 15px 30px 0 rgba(255,255,255,.15) inset,
        0 2px 7px 0 rgba(0,0,0,.2);
    box-shadow:        
        0 5px 8px 0 rgba(0,0,0,.1) inset,
        0 1px 4px 0 rgba(0,0,0,.1);

    border: 0px solid #ef4300;
}



.navbar {
    overflow: hidden;
    background-color: #333;
    font-family: Arial;
}

.navbar a {float: left;font-size: 16px;color: white;text-align: center;padding: 14px 16px;text-decoration: none;}

.dropdown {float: left;overflow: hidden;}

.dropdown .dropbtn {font-size: 16px;border: none;outline: none;color: white;padding: 14px 16px;background-color: inherit;}


.dropdown-content {display: none;position: absolute;background-color: #f9f9f9;width: 160px;box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);z-index: 1;}

.dropdown-content a {float: none;color: black;padding: 12px 16px;text-decoration: none;display: block;text-align: left;}

.dropdown-content a:hover {background-color: #ddd;}

.dropdown:hover .dropdown-content {display: block;}

.formulaire{

	margin-left:-20%;
	margin-top:10%;
}

.aboutus-more {
    border: 1px solid #fdb801;
    border-radius: 25px;
    color: #99b3ff;
    display: inline-block;
    font-size: 14px;
    font-weight: 700;
    letter-spacing: 0;
    padding: 7px 20px;
    text-transform: uppercase;
}
.feature .feature-box .iconset {
    background: #fff none repeat scroll 0 0;
    float: left;
    position: relative;
    width: 18%;
}
.feature .feature-box .iconset::after {
    background: #3A758E none repeat scroll 0 0;
    content: "";
    height: 150%;
    left: 43%;
    position: absolute;
    top: 100%;
    width: 1px;
    
}

.feature .feature-box .feature-content h4 {
    color: #99b3ff;
    font-size: 18px;
    letter-spacing: 0;
    line-height: 22px;
    margin: 0 0 5px;
}


.feature .feature-box .feature-content {
    float: left;
    padding-left: 28px;
    width: 78%;
}
.feature .feature-box .feature-content h4 {
    color: #99b3ff;
    font-size: 18px;
    letter-spacing: 0;
    line-height: 22px;
    margin: 0 0 5px;
}
.feature .feature-box .feature-content p {
    color: #606060;
    font-size: 13px;
    line-height: 22px;
    
}
.icon {
    color : #99b3ff;
    padding:0px;
    font-size:40px;
    border: 1px solid #99b3ff;
    border-radius: 100px;
    color: #99b3ff;
    font-size: 28px;
    height: 70px;
    line-height: 70px;
    text-align: center;
    width: 70px;
    
}

.aboutus-section
{
margin-top:5%;
}
}
</style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark" >
  <a class="navbar-brand" href="#"><span id="titre-nav" ><strong>PDF-Generator</strong></span></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item">
        <a class="nav-link" href="/adminGUI/UserInterface.jsp""><span id="titre-nav1" >Home</span> <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/adminGUI/UserInterfaceEdit.jsp""><span id="titre-nav1" >Edit Info</span></a>
      </li>
     
      <li class="nav-item active">
        <a class="nav-link " href="/adminGUI/UserInterfaceAboutUs.jsp" ><span id="titre-nav1" >About US</span></a>
      </li>
    </ul>
    
  </div>
</nav>

<div class="aboutus-section">
        <div class="container">
            <div class="row">
                <div class="col-md-3 col-sm-6 col-xs-12">
                    <div class="aboutus">
                        <h2 class="aboutus-title" style="color:#99b3ff;"><strong>About Us</strong></h2>
                        <p class="aboutus-text">This Application is provided by the National School of Computer Science , it is an engineering School laying in Manouba,Tunisia </p>
                        <p class="aboutus-text">PDF-Generator is a tool designed to help ENSI's Students in their academic course by facilitating their Paper Transactions </p>
                        
                    </div>
                </div>
                <div class="col-md-3 col-sm-6 col-xs-12">
                    <div class="aboutus-banner">
                        
                    </div>
                </div>
                <div class="col-md-5 col-sm-6 col-xs-12">
                    <div class="feature">
                        <div class="feature-box">
                            <div class="clearfix">
                                <div class="iconset" style="background-color:#d6d6c2;">
                                    <span class="glyphicon glyphicon-heart icon"></span>
                                </div>
                                <div class="feature-content">
                                    <h4><strong>Work with heart</strong></h4>
                                    <p>This Application is allways developed and upgaraded to satisfy the needs of our students .</p>
                                    <br>
                                </div>
                            </div>
                        </div>
                        <div class="feature-box">
                            <div class="clearfix">
                                <div class="iconset" style="background-color:#d6d6c2;">
                                    <span class="glyphicon glyphicon-cog icon"></span>
                                </div>
                                <div class="feature-content">
                                    <h4><strong>Reliable services</strong></h4>
                                    <p>Reliable Services is our priority , our Application is a number one product of our school .</p>
                                    <br>
                                </div>
                            </div>
                        </div>
                        <div class="feature-box">
                            <div class="clearfix">
                                <div class="iconset" style="background-color:#d6d6c2;">
                                    <span class="glyphicon glyphicon-plus icon"></span>
                                </div>
                                <div class="feature-content">
                                    <h4><strong>Great support</strong></h4>
                                    <p>Our Team is working 24/7 to guarantee a flawless experiance . </p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>