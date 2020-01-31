<%@ taglib prefix= "component" tagdir="/WEB-INF/tags/component" %>

<html>
	<head>
		<link rel="stylesheet"
			href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
			integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
			crossorigin="anonymous">
		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
		<link rel="stylesheet" href="css/ptlpTest.css">
		
		<input type="hidden" name="searchTerm" value="${searchTerm }" />
	</head>

	<body>
		<div class="main-container">
			<div class="header-container">
				<component:header />
			</div> 
			
			<div id="nikita" class="body-container">
				<component:vsm />
				<component:ptlpItems />
			</div>
			
			<script src="https://unpkg.com/vue@2.5.8/dist/vue.js"></script>
			<script src="https://unpkg.com/axios@0.17.1/dist/axios.min.js"></script>
			<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  			<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  			<script src="js/ptlpTest.js"></script>
		</div>
	</body>
</html>