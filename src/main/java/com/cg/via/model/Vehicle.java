package com.cg.via.model;

import java.util.Date;

public class Vehicle {
	private long vehicleNo;
	private String vehicleType;
	private int insurancePeriod;
	private long aadhaarNo;
	private long mobileNo;
	private Date dateOfRegistration;
	private String lastDate;
	private int noOfDays;
	public Vehicle()
	{
		
	}
	public Vehicle(long vehicleNo, String vehicleType, int insurancePeriod, long aadhaarNo, long mobileNo,
			Date dateOfRegistration) {
		// TODO Auto-generated constructor stub
		this.vehicleNo = vehicleNo;
		this.vehicleType = vehicleType;
		this.insurancePeriod = insurancePeriod;
		this.aadhaarNo = aadhaarNo;
		this.mobileNo = mobileNo;
		this.dateOfRegistration = dateOfRegistration;
	}
	public long getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(long vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}
	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getInsurancePeriod() {
		return insurancePeriod;
	}
	public void setInsurancePeriod(int insurancePeriod) {
		this.insurancePeriod = insurancePeriod;
	}
	public long getAadhaarNo() {
		return aadhaarNo;
	}
	public void setAadhaarNo(long aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getLastDate() {
		return lastDate;
	}
	public void setLastDate(String lastDate) {
		this.lastDate = lastDate;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
}
