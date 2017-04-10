package com.redhat.sapem;

import java.time.LocalTime;
import java.util.Date;

public class ProductInfo {

	private String productId;
	private String dayId;
	private String dayOfWeek;
	private String startTime;
	private String endTime;
	private String type;
	private String tsId;
	private String description;
	private Date dispatchDate;
	private Date arrivalDate;
	private String arrivalDayOfWeek;
	
	public ProductInfo() {
		
	}
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getDayId() {
		return dayId;
	}
	public void setDayId(String dayId) {
		this.dayId = dayId;
	}
	public String getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTsId() {
		return tsId;
	}
	public void setTsId(String tsId) {
		this.tsId = tsId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDispatchDate() {
		return dispatchDate;
	}
	public void setDispatchDate(Date dispatchDate) {
		this.dispatchDate = dispatchDate;
	}
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public String getArrivalDayOfWeek() {
		return arrivalDayOfWeek;
	}
	public void setArrivalDayOfWeek(String arrivalDayOfWeek) {
		this.arrivalDayOfWeek = arrivalDayOfWeek;
	}

	
	
	
}
