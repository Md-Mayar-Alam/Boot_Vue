var vu= new Vue({
	el: "#vue-method",
	data: {
		firstName: "Mohammad",
		lastName: "Alam",
		address: "Noida"
	},
	methods: {
		mydetails: function(){
			return "I am "+ this.firstName + " " + this.lastName;
		}
	}
})