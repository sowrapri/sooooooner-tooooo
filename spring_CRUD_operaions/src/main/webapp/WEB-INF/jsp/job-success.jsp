<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
<body onload="return findGetParameter()">
	Information Saved succesfully
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">HISM</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="${pageContext.request.contextPath}/about-us.htm">ABOUTUS</a></li>
      <li><a href="${pageContext.request.contextPath}/job-profile.htm">JOBPROFILE</a>
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
	<p id="data1"></P>
	<p id="data2"></P>
	<p id="data3"></P>
	<p id="data4"></P>
	<p id="data">${DTP} ${dtp-days} ${completed1}</P>

	<script type="text/javascript">
		window.onload = function() {
			//window.alert("alert!");
			//console.log("ajsd");
			findGetParameter();
		};

		function findGetParameter() {
			var result = "";
			tmp = [];
			location.search.substr(1).split("&").forEach(function(item) {
				tmp = item.split("=");
				console.log("KEY : " + tmp[0] + " VALUE : " + tmp[1]);
				result = result + tmp[0] + " :" + tmp[1] + "</br>";
				//alert(result);
				document.getElementById("data1").innerHTML = result;
				//if (tmp[0] === parameterName) result = decodeURIComponent(tmp[1]);
			});
			return result;
		}
	</script>
</body>
</html>