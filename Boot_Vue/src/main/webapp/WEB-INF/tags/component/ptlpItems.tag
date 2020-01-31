
<div class="ptlpClass row">

	<div class="col-md-3">
		<h4 class="uni-cat-class">Categories</h4>
		<ul v-for="uni in unique">
			<a href="#" style="display: block; text-decoration: none;"
				:title="uni">{{uni}}</a>
		</ul>
	</div>

	<div class="col-md-9">
		<h4 class="ptlp-cat-class">Shop by Part Type</h4>
		<div class="row">
			<ptlp-category-pod v-for="partType in ptlpJson.PartTypes.PartTypes"
				:parttypename="partType.PartTypeName"
				:imageurl="partType.PartTypeImage" v-bind:key="partType.PartType"></ptlp-category-pod>
		</div>
	</div>
</div>
