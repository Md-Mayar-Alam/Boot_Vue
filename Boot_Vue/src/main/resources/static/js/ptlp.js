Vue.component("todo-item", {
	props: ["todo"],
	template: '<div class="hi">'+
				
	'</div>'
})

var vue= new Vue({
	el: "#ptlpDiv",
	data() {
		return {
			info: null
		}
	},
	mounted() {
		axios.
			get("/getJSONResponse")
			.then(response => (this.info= response.data))
			.catch(error => console.log(error))
	}
})

