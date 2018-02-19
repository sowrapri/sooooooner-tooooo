<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<body>
<head>
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
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
      <li class="active"><a href="${pageContext.request.contextPath}/contact.htm">CONTACTUS</a></li>
      <li ><a href="${pageContext.request.contextPath}/job.htm">JOB</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> SIGNUP</a></li>
      <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> LOGIN</a></li>
    </ul>
  </div>
</nav>
<div>

	<div class="contact">
		<div class="main-title">
			<h1>Contact us</h1>
			<div class="title-line"></div>
		</div>
		<div class="contact-content">
			<div class="message">
				<h2>Send Us A Message</h2>
				<br />
				<p id="status"></p>

				<form name="messageForm" action="./sample.html" method="POST"
					class="form-horizontal">

					<div class="form-group">
						<div class="col-sm-12">
							<input type="text" class="form-control " name="firstName"
								id="firstName" value="" placeholder="First Name"><br />
							<p id="firstName_error"></p>
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-12">
							<input type="text" class="form-control " name="lastName"
								id="lastName" value="" placeholder="Last Name"><br />
							<p id="lastName_error"></p>
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-12">
							<input type="email" class="form-control " name="email" id="email"
								value="" placeholder="Email"><br />
							<p id="email_error"></p>
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-12">
							<input type="text" class="form-control " name="subject"
								id="subject" value="" placeholder="Subject"><br />
							<p id="subject_error"></p>
						</div>
					</div>

					<div class="form-group message-field">
						<div class="col-sm-12">
							<textarea class="form-control " name="message" id="message"
								placeholder="Your Message" rows="5"></textarea>
							<br />
							<p id="message_error"></p>
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-9">
							<input type="submit" class="btn btn-primary" name="submit"
								value="Submit" id="submit">
						</div>
					</div>

				</form>

			</div>
			<div class="contact-info">
				<h2>Contact Info</h2>
				<div class="map">
					<img src="${pageContext.request.contextPath}/images/contact-gmap-loc.png" alt="map">
				</div>
				<div class="contact-details">
					<div class="address">
						<img src="${pageContext.request.contextPath}/images/contact-address-icon.png" alt="address">
						<div class="details">
							<h4>Office One</h4>
							<p>WeGift, Madhapur, Hyderabad</p>
						</div>
					</div>
					<div class="email">
						<img src="${pageContext.request.contextPath}/images/contact-email-icon.png" alt="email">
						<div class="details">
							<h4>Email Address</h4>
							<p>
								<a href="mailto:luckyfortech@gmail.com">contact@wegift.com</a>
							</p>
						</div>
					</div>
					<div class="phone">
						<img src="${pageContext.request.contextPath}/images/contact-phone-icon.png" alt="phone">
						<div class="details">
							<h4>Phone Number</h4>
							<p>+91 9090909090</p>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="spacer"></div>
	</div>
	<footer class="text-center" style="color: red; margin-top: 270px">
		Copyrights @madhapur.2018 </footer>
	<script type="text/javascript"></script>
	<script type="text/javascript">
		function validate() {
			clear();

			var data = {};
			var http;

			var inputFeilds = document.querySelectorAll("input[type='text']");
			var emailFeild = document.querySelectorAll("input[type='email']")
			var textareaFeilds = document.querySelectorAll("textarea");
			var errorFeilds = document.querySelectorAll("p");

			for (var i = 0; i < inputFeilds.length; i++) {
				data[inputFeilds[i].name] = inputFeilds[i].value;
			}
			for (var i = 0; i < emailFeild.length; i++) {
				data[emailFeild[i].name] = emailFeild[i].value;
			}
			for (var i = 0; i < textareaFeilds.length; i++) {
				data[textareaFeilds[i].name] = textareaFeilds[i].value;
			}

			data = JSON.stringify(data);
			//alert(data);

			var url = document.forms['messageForm'].action;
			//alert(url);
			var requestMethod = document.forms['messageForm'].method;
			//alert(requestMethod);

			http = new XMLHttpRequest();

			http.onreadystatechange = function() {
				if (http.readyState == 4) {
					//alert(http.status);
					if (http.status == 200) {
						var details = JSON.parse(http.responseText);
						document.getElementById("status").innerHTML = details;
						document.getElementById("status").style.color = "green";
						document.getElementById("status").style.fontFamily = "arial";
						document.getElementById("status").style.fontSize = "22px";
					} else {
						var errorAll = JSON.parse(http.responseText);
						//alert(errorAll.errors);
						//alert(errorAll.errors[0].errorMessage);
						for (var i = 0; i < errorAll.errors.length; i++) {
							document
									.getElementById(errorAll.errors[i].fieldName
											+ "_error").innerHTML = errorAll.errors[i].errorMessage;
							document
									.getElementById(errorAll.errors[i].fieldName
											+ "_error").style.color = "red";
							/* document
									.getElementById(errorAll.errors[i].fieldName).style.borderColor = "yellow"; */
						}
					}
				}
			}

			http.open(requestMethod, url, true);
			http.setRequestHeader("Content-Type", "application/json")
			http.send(data);
		}
	</script>
</div>
</body>