package com.cg.via.dao;

import java.sql.Date;
import java.util.HashMap;

import com.cg.via.model.Vehicle;

public class VehicleDaoImpl implements VehicleDao {
	HashMap<Long, Vehicle> insuranceEntry = new HashMap<Long, Vehicle>();
	public long register(Vehicle v) {
		// TODO Auto-generated method stub
		insuranceEntry.put(v.getVehicleNo(), new Vehicle(v.getVehicleNo(),v.getVehicleType(),v.getInsurancePeriod(),v.getAadhaarNo(),v.getMobileNo(),v.getDateOfRegistration()));
		if(v.getVehicleNo() == insuranceEntry.get(v.getVehicleNo()).getVehicleNo())
		return v.getVehicleNo();
		else
			return 0;
	}
	public Vehicle validityCheck(long vehicleNo) {
		// TODO Auto-generated method stub
		Vehicle v = insuranceEntry.get(vehicleNo);
		String date = v.getDateOfRegistration().toString();
		String[] date1 = date.split("-");
		date1[2] = Integer.toString((Integer.parseInt(date1[2])-1));
		date1[0] = Integer.toString((Integer.parseInt(date1[0])+v.getInsurancePeriod()));
		v.setLastDate(date1[2]+"/"+date1[1]+"/"+date1[0]);
		v.setNoOfDays(365*v.getInsurancePeriod());
		return v;
	}
}
