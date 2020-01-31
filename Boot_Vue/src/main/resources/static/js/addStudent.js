var vue= new Vue({
	el: "myDiv",
	data () {
		return{
			info: null
		}
	},
	mounted () {
		axios
			.get("/json")
			.then(response => (this.info = response.data))
			.catch(error => console.log(data))
	}
})