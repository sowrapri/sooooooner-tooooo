<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<html>
<meta charset="UTF-8"><meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/3/w3.css">
<link rel="stylesheet" href="contact.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<body bgcolor="#E6E6FA">
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">HISM</a>
    </div>
    <ul class="nav navbar-nav">
      <li ><a href="${pageContext.request.contextPath}/about-us.htm">ABOUTUS</a></li>
      <li><a href="${pageContext.request.contextPath}/job-profile.htm">JOBPROFILE</a>
      </li>
      <li><a href="${pageContext.request.contextPath}/statistics.htm">STATISTICS</a></li>
      <li><a href="${pageContext.request.contextPath}/contact.htm">CONTACTUS</a></li>
      <li class="active"><a href="${pageContext.request.contextPath}/job.htm">JOB</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> SIGNUP</a></li>
      <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> LOGIN</a></li>
    </ul>
  </div>
</nav>

  <h1>Job</h1>
	
	
	<select name="type">
		<option value="DTP">DTP</option>
		<option value="NOMINATION">NOMINATION</option>
		<option value="PRINTING">PRINTING</option>
	</select>
	
	</body>
<footer class="text-center" style="color:red;margin-top:600px">
	Copyrights @madhapur.2018
</footer>
</html>