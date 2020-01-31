package com.response.model;

public class Price {
    protected String priceType;
    
    protected String listPrice;
    
    protected String yourCost;

	public String getPriceType() {
		return priceType;
	}

	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	public String getListPrice() {
		return listPrice;
	}

	public void setListPrice(String listPrice) {
		this.listPrice = listPrice;
	}

	public String getYourCost() {
		return yourCost;
	}

	public void setYourCost(String yourCost) {
		this.yourCost = yourCost;
	}
}
