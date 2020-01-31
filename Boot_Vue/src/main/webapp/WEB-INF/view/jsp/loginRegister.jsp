<%@ taglib prefix="component" tagdir="/WEB-INF/tags/component" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
		<link rel="stylesheet"
			href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
			integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
			crossorigin="anonymous">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
		<link rel="stylesheet" href="css/ptlpTest.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
	</head>

	<body>
		<div class="main-container">
			<div class="header-container">
				<component:header />
			</div>
			
			<div class="body-container">
				<div class="login-reg-container">
					<div class="row">
						<div class="col-md-6">
							<h4 class="bold-font font-21">Sign In To Your NAPA Online Account</h4>
							
							<form:form id="loginForm" modelAttribute="loginRequest" method="post" action="/login">
								<div class="login-reg-div">
									<label for="email" class="login-reg-font">Email Address*</label>
									<form:input path="email" class="fullWidth login-reg-tb"/>
								</div>
								
								<div class="login-reg-div">
									<label for="password" class="login-reg-font">Password*</label>
									<form:password path="password" class="fullWidth login-reg-tb"/>
								</div>
								
								<div class="row">
									<div class="col-md-7">
										<div class="alr-rew-mem">
											<a href="#" class="italic-font">Already have a NAPA Reward Membership?</a>
										</div>
									</div>
									<div class="col-md-5 forgot-login-div">
										<a href="#" class="bold-font forgot-pwd">Forgot Password?</a>
										<form:button class="login-button bold-font">Sign In</form:button>
									</div>
								</div>
							</form:form>
						</div>				
						
						<div class="col-md-6">
							<h4 class="bold-font font-21">Create A New NAPA Online Account</h4>
							<p class="italic-font">Create an account to earn and redeem NAPA Rewards, enjoy faster checkout and save your order history.
							
							<form:form modelAttribute="registerRequest" method="post" action="/register">
								<div class="login-reg-div">
									<label for="firstName" class="login-reg-font">First Name</label>
									<form:input path="firstName" class="fullWidth login-reg-tb"/>
								</div>
								
								<div class="login-reg-div">
									<label for="lastName" class="login-reg-font">Last Name</label>
									<form:input path="lastName" class="fullWidth login-reg-tb"/>
								</div>
								
								<div class="login-reg-div">
									<label for="email" class="login-reg-font">Email Address</label>
									<form:input path="email" class="fullWidth login-reg-tb"/>
								</div>
								
								<div class="login-reg-div">
									<label for="confirmEmail" class="login-reg-font">Confirm Email</label>
									<form:input path="confirmEmail" class="fullWidth login-reg-tb"/>
								</div>
								
								<div class="login-reg-div">
									<label for="phoneNo" class="login-reg-font">Phone number (used for order only)</label>
									<form:input path="phoneNo" class="fullWidth login-reg-tb"/>
								</div>
								
								<div class="row">
									<div class="col-md-6">
										<div class="login-reg-div">
											<label for="password" class="login-reg-font">Password</label>
											<form:password path="password" class="fullWidth login-reg-tb"/>
										</div>
										<div class="login-reg-div">
											<label for="confirmPassword" class="login-reg-font login-reg-div">Confirm Password</label>
											<form:password path="confirmPassword" class="fullWidth login-reg-tb"/>
										</div>
									</div>
									<div class="col-md-6">
										<p class="bold-font">Password Requirements</p>
										<p>At least eight (8) characters long</p>
										<p>At least one (1) number, one (1) upper case letter and one (1) lower case letter</p>
									</div>
								</div>
							
								<div>
								<p class="bold-font">NAPA Rewards</p>
									<p>Earn points and get $5 off per purchase for every 100 points earned!</p>
									<form:checkbox path="enrollInNapaRewards"/>	
									<label for="enrollInNapaRewards">Yes! Enroll me in NAPA Rewards!</label>
								</div>
								
								<p class="bold-font">Email Language Preference</p>
								<div>
									<form:radiobutton id="en" path="languagePreference" value="en" checked="true"/>
									<label for="en">English</label>
								</div>
								<div>
									<form:radiobutton id="es" path="languagePreference" value="es"/>
									<label for="es">Spanish</label>
								</div>
								
								<div>
									<form:checkbox path="receivePromotionEmails"/>
									<label for="receivePromotionEmails">I would like to receive emails on upcoming promotions</label>
								</div>
								
								<div class="row">
									<form:button class="create-acc-button bold-font pull-right">Create Account</form:button>
								</div>
							</form:form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>