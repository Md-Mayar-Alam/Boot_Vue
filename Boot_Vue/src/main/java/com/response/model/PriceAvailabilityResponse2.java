package com.response.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class PriceAvailabilityResponse2 {
	@JsonIgnore
    protected String storeID;
    
	@JsonIgnore
    protected String statusCode;
	
	@JsonIgnore
    protected String statusMessage;
    
   // @JacksonXmlElementWrapper(useWrapping= false)
    protected List<PartPriceAvailability> partPriceAvailability;

	public String getStoreID() {
		return storeID;
	}

	public void setStoreID(String storeID) {
		this.storeID = storeID;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public List<PartPriceAvailability> getPartPriceAvailability() {
		return partPriceAvailability;
	}

	public void setPartPriceAvailability(List<PartPriceAvailability> partPriceAvailability) {
		this.partPriceAvailability = partPriceAvailability;
	}
}
