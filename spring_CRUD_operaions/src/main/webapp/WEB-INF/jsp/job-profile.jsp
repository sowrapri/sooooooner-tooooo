<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags"  prefix="spring"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/3/w3.css">
<link rel="stylesheet" href="contact.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
.margin {
	margin-right: 15px;
}

.color {
	background-color: #ccc;
}
</style>
<body class="contact">
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">HISM</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="${pageContext.request.contextPath}/about-us.htm">ABOUTUS</a></li>
      <li class="active"><a href="${pageContext.request.contextPath}/job-profile.htm">JOBPROFILE</a>
      </li>
      <li><a href="${pageContext.request.contextPath}/statistics.htm">STATISTICS</a></li>
      <li><a href="${pageContext.request.contextPath}/contact.htm">CONTACTUS</a></li>
      <li><a href="${pageContext.request.contextPath}/job.htm">JOB</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> SIGNUP</a></li>
      <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> LOGIN</a></li>
    </ul>
  </div>
</nav>
	<c:if test="${result}">
		<div class="alert-success text-center">
			<p class="text-center">Job details has been saved successfully, JOB ID: <b>${jobId}</b></p>
		</div>
	</c:if>
	<form class="form-group" id="jobRegistrationCommand"
		action="${pageContext.request.contextPath}/stationary" method="post">
		<h2 class="h2">JOB PROFILE :</h2>
		<div
			style="width: 50%; margin: 0 auto; border: 3px solid #73AD21; text-align: center; padding-top: 20px; padding-bottom: 100px"
			class="container">
			<div style="padding-bottom: 20px" class="row">
				<b class="margin text-primary text-uppercase">DTP:</b> <input
					type="radio" style="margin-left: 50px" name="dtp" id="dtp"
					value="true" checked="checked" /><b class="margin">YES</b> <input
					type="radio" class="margin" name="dtp" id="dtp" value="false" /><b
					class="margin">NO</b> <select name="dtpDays" id="dtpDays"
					class="margin input-sm">
					<option selected disabled>days</option>
					<option value="1">1</option>
					<option value="2">2</option>
				</select> <select name="dtpHours" id="dtpHours" class="margin input-sm">
					<option selected disabled>hours</option>
					<option value="1">1</option>
					<option value="2">2</option>
				</select> <input type="radio" class="margin" name="dtpCompletedFlag" id="dtpCompletedFlag"
					value="true" checked="checked" /><i class="margin">Completed</i> <input
					type="radio" name="dtpCompletedFlag" id="dtpCompletedFlag" value="false" /><i
					class="margin">pending</i><br>
			</div>
			<div style="padding-bottom: 20px" class="row">
				<b class="margin text-primary text-uppercase">Nomination:</b> <input
					type="radio" name="nomination" id="nomination" value="true"
					checked="checked" /><b class="margin">YES</b> <input type="radio"
					name="nomination" id="nomination" value="false" /><b class="margin">NO</b> <select
					name="nominationDays" id="nominationDays" class="margin input-sm">
					<option selected disabled>days</option>
					<option value="1">1</option>
					<option value="2">2</option>
				</select> <select name="nominationHours" id="nominationHours" class="margin input-sm">
					<option selected disabled>hours</option>
					<option value="1">1</option>
					<option value="1">2</option>
				</select> <input type="radio" name="nominationCompletedFlag" id="nominationCompletedFlag"
					value="true" checked /><i class="margin">Completed</i> <input
					type="radio" name="nominationCompletedFlag" id="nominationCompletedFlag" value="false" /><i
					class="margin">pending</i><br>
			</div>
			<div style="padding-bottom: 20px" class="row">
				<b class="margin text-primary text-uppercase">Printing:</b> <input
					type="radio" style="margin-left: 25px;" name="printing" id="printing"
					value="true" checked="checked" /><b class="margin">YES</b> <input
					type="radio" name="printing" id="printing" value="false" /><b
					class="margin">NO</b> <select name="printingDays" id="printingDays"
					class="margin input-sm">
					<option selected disabled>days</option>
					<option value="1">1</option>
					<option value="2">2</option>
				</select> <select name="printingHours" id="printingHours" class="margin input-sm">
					<option selected disabled>hours</option>
					<option value="1">1</option>
					<option value="2">2</option>
				</select> <input type="radio" name="printingCompletedFlag" id="printingCompletedFlag"
					value="true" checked="checked" /><i class="margin">Completed</i>
				<input type="radio" name="printingCompletedFlag" id="printingCompletedFlag" value="false" /><i
					class="margin">pending</i><br>
			</div>
			<div style="padding-bottom: 20px" class="row">
				Job No: <input type="text" name="jobNo" id="jobNo" disabled>
			</div>

			<div style="padding-bottom: 20px" class="row">
				Contact Number: <input type="text" name="contactNumber" id="contactNumber"
					class="margin"><br>
			</div>

			<div style="padding-bottom: 20px" class="row">
				Description: <input type="text" name="description" id="description"><br>
			</div>

			<div style="padding-bottom: 20px" class="row">
				Expected date of complete: <input type="date"
					name="edc" id="edc"><br>
			</div>

			<div style="padding-bottom: 20px" class="row">
				Delay: <input type="text" id="delay" name="delay"><br>
			</div>

			<button class="btn" style="margin-left: 250px; margin-top: 20px"
				type="submit" value="Submit">Submit</button>
	</form>
	<form action="./sample3.html" method="get"
		style="float: right; margin-top: 20px; margin-right: 250px">
		<button class="btn" type="submit" value="Cancel">Cancel</button>
	</form>
	</div>
	<footer class="text-center" style="color: red; margin-top: 270px">
		Copyrights @madhapur.2018 </footer>
</body>
</html>