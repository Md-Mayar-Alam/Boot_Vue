<html>
	<head>
		<link >
	</head>

	<body>
			<div id="ptlpDiv">
				<todo-item
					v-for= "item in info.PartTypes.PartTypes"
					v-bind:todo= "item"
					v-bind:key= "item.PartType"
				>
				</todo-item>
			</div>
			<script src="https://cdn.jsdelivr.net/npm/vue@2.6.0"></script>
			<script src="https://cdn.jsdelivr.net/npm/axios@0.12.0/dist/axios.min.js"></script>
			<script type="text/javascript" src="js/ptlp.js"></script>
	</body>
</html>