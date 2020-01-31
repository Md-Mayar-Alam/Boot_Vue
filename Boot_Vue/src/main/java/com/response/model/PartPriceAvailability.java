package com.response.model;

import java.util.List;

//import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class PartPriceAvailability {
	
    protected String lineAbbrev;
   
    protected String partNumber;
    
    protected String tamsErrorMsg;
    
    protected String qtyOnHand;
    
   // @JacksonXmlElementWrapper(useWrapping= false)
    protected List<Price> price;
   
    protected String dcBalanceQty;

	public String getLineAbbrev() {
		return lineAbbrev;
	}

	public void setLineAbbrev(String lineAbbrev) {
		this.lineAbbrev = lineAbbrev;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getTamsErrorMsg() {
		return tamsErrorMsg;
	}

	public void setTamsErrorMsg(String tamsErrorMsg) {
		this.tamsErrorMsg = tamsErrorMsg;
	}

	public String getQtyOnHand() {
		return qtyOnHand;
	}

	public void setQtyOnHand(String qtyOnHand) {
		this.qtyOnHand = qtyOnHand;
	}
	
	public List<Price> getPrice() {
		return price;
	}

	public void setPrice(List<Price> price) {
		this.price = price;
	}

	public String getDcBalanceQty() {
		return dcBalanceQty;
	}

	public void setDcBalanceQty(String dcBalanceQty) {
		this.dcBalanceQty = dcBalanceQty;
	}
}

