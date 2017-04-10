package com.redhat.sapem;

import java.util.Date;


public class ProductQuery {
	
	private String[] productIds;
	private String fromPostcode;
	private String toPostcode;
	private String arrivalDate;
	
	public ProductQuery(String[] productIds, String fromPostcode, String toPostcode, String arrivalDate) {
		this.productIds = productIds;
		this.fromPostcode = fromPostcode;
		this.toPostcode = toPostcode;
		this.arrivalDate = arrivalDate;
	}
	
	public ProductQuery() {
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ids: ");
		for (String id : productIds) {
			sb.append(id + ", ");
		}
		sb.append("\nfroPostcode: ").append(fromPostcode);
		sb.append("\ntoPostcode: ").append(toPostcode);
		sb.append("\narrivalDate: ").append(arrivalDate);
		sb.append("\n");
		
		return sb.toString();
	}
	
	public String[] getProductIds() {
		return productIds;
	}
	public void setProductIds(String[] productIds) {
		this.productIds = productIds;
	}
	public String getFromPostcode() {
		return fromPostcode;
	}
	public void setFromPostcode(String fromPostcode) {
		this.fromPostcode = fromPostcode;
	}
	public String getToPostcode() {
		return toPostcode;
	}
	public void setToPostcode(String toPostcode) {
		this.toPostcode = toPostcode;
	}
	public String getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	

}
