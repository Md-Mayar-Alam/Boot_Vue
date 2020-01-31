Vue.component('ptlp-category-pod',{
	props:['parttypename', 'imageurl'],
	template: '<div class="ptlp-cat-pod col-md-3">'+
	'		<a href="#" style="display:block;" :title="parttypename">' +
	'			<div class="ptlp-cat-pod-img":style="{ backgroundImage: `url(${imageurl})` }">' +
	'		</div></a>' +
	'		<a href="#" style="display:block;" :title="parttypename">' +
	'			<div class="vue-loading"><center>{{parttypename}}</center></div>' +
	'		</a>' +
	'</div>',
})

var ptlpApp= new Vue({
	el: "#nikita",
  data(){
    return{
    	ptlpJson: null,
			unique: null,
			searchTerm: document.querySelector("input[name=searchTerm]").value,
			vehicleType: null,
			year: null,
			make: null,
			model: null
    }
  },
  mounted(){
		axios.get('/getJSONResponse/'+this.searchTerm)
		.then(response => {
			   this.ptlpJson= (response.data)
				 this.unique= this.findUnique(response.data)
				 console.log(this.searchTerm)
			}).catch(error =>{
				console.log(error)
			})
  		},
  		
  		methods: {
  			findUnique: function(data){
  				var values = [];
  			     
  		      var partTypes = data.PartTypes.PartTypes;
  		      for(var i=0;i<partTypes.length;i++)
  		      {
  		    	var value = partTypes[i].Category.ConditionEndecaValue;
  		    	if (values.indexOf(value) === -1) {
  		              values.push(value);
  		          }
  		      }
  		      return values;
				},
				changeVehicle: function(event){
					console.log("Search term "+ this.searchTerm)
					console.log("Vehicle Year "+ this.year)
					console.log("Vehicle Make "+ this.make)
					console.log("Vehicle Model "+ this.model)

					console.log('/getJSONResponse/'+this.year + '+' +this.make+ '+' +this.model+ '+' +this.searchTerm)

					axios.get('/getJSONResponse/'+this.year + '+' +this.make+ '+' +this.model+ '+' +this.searchTerm)
						.then(response => {
								this.ptlpJson= (response.data)
								this.unique= this.findUnique(response.data)
								console.log(this.searchTerm)
						})
						.catch(error =>{
								console.log(error)
						})
				}
  		}
  
})