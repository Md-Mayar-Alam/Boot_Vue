<div class="row">
			<div class="col-md-12"
				style="height: 40px; border: 1px black; margin-top: 12px;">
				<div class="panel panel-default">
					<div class="panel-heading">
						<i class="fa fa-car fa-lg"></i> Select a vehicle for <b>exact</b>
						fit parts <a href="#" data-toggle="collapse" data-target="#vsm"
							aria-expanded="false">Select New Vehicle <span
							class="glyphicon glyphicon-chevron-up"></span> <span
							class="glyphicon glyphicon-chevron-down"></span>
						</a>
					</div>
					<div class="panel-body collapse in" id="vsm">
						<div class="row">
							<div class="col-md-12">
								<strong>Select New Vehicle</strong>
							</div>
						</div>

						<div class="form-group row " style="margin-top: 15px;">

							<div class="col-md-3">
								<label for="vehicleType">Vehicle Type</label>
								<div class="input-group">
									<input type="text" class="form-control"
										placeholder="Select Type" id="vehicleType"
										aria-describedby="selectVehicleType" list="vehicleTypeList" v-model="vehicleType">
										
										<datalist id="vehicleTypeList">
											<option value="Auto/Light Trucks">
											<option value="Drive Line">
											<option value="Medium/Heavy Duty">
											<option value="Off Highway/Industrial">
											<option value="Recreational/Marine">
										</datalist>
										 
										<span class="input-group-btn">
											<button class="btn btn-default">
												<span class="glyphicon glyphicon-chevron-down"></span>
											</button>
										</span>
								</div>
							</div>

							<div class="col-md-2">
								<label for="year">Year</label>
								<div class="input-group">
									<input type="text" class="form-control"
										placeholder="Select Year" id="year" list="vehicleYear" v-model="year"> <!-- disabled -->
										
										<datalist id="vehicleYear">
											<option value="2016">
											<option value="2017">
											<option value="2018">
											<option value="2019">
										</datalist>
										
										<span
										class="input-group-btn">
										<button class="btn btn-default">
											<span class="glyphicon glyphicon-chevron-down"></span>
										</button>
									</span>
								</div>
							</div>

							<div class="col-md-2">
								<label for="make">Make</label>
								<div class="input-group">
									<input type="text" class="form-control"
										placeholder="Select Make" id="make" list="vehicleMake" v-model="make"> <!-- disabled -->
										
										<datalist id="vehicleMake">
											<option value="Honda">
											<option value="Hyundai">
											<option value="Acura">
											<option value="Audi">
										</datalist>
										
										<span
										class="input-group-btn">
										<button class="btn btn-default">
											<span class="glyphicon glyphicon-chevron-down"></span>
										</button>
									</span>
								</div>
							</div>

							<div class="col-md-2">
								<label for="model">Model</label>
								<div class="input-group">
									<input type="text" class="form-control"
										placeholder="Select Model" id="model" list="vehicleModel" v-model="model"> <!-- disabled --> 
										
										<datalist id="vehicleModel">
											<option value="City">
											<option value="Civic">
											<option value="A8">
										</datalist>
										
										<span
										class="input-group-btn">
										<button class="btn btn-default">
											<span class="glyphicon glyphicon-chevron-down"></span>
										</button>
									</span>
								</div>
							</div>
							<div class="col-md-2">
								<label for="submit"></label> 
								<input type="button"
									class="form-control"
									style="color: black; font-weight: 700; margin-top: 4px;"
									value="SELECT VEHICLE" id="submit" v-on:click="changeVehicle"/> <!-- disabled -->
							</div>
						</div>




					</div>
				</div>
			</div>
		</div>
