<html>
	<body>
		<h1>Simple to-do item Example</h1>
		<div id="asd">
			<ol>
				<todo-item></todo-item>
			</ol>
		</div>
		
	</body>
	
	<script src="https://cdn.jsdelivr.net/npm/vue@2.6.0"></script>
		<script>
			Vue.component("todo-item", {
				template: "<li>This is a todo</li>"
			})
		
			var app= new Vue({
				el: "#asd"
			})
			
		</script>
</html>