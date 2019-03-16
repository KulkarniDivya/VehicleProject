package com.cg.via.service;

import com.cg.via.dao.VehicleDao;
import com.cg.via.dao.VehicleDaoImpl;
import com.cg.via.model.Vehicle;

public class VehicleServiceImpl implements VehicleService {
	VehicleDao dao = new VehicleDaoImpl();
	
	//Method to Register
	public long register(Vehicle v) {
		// TODO Auto-generated method stub
		return dao.register(v);
	}
	
	//Method to check the validity
	public Vehicle validityCheck(long vehicleNo) {
		// TODO Auto-generated method stub
		return dao.validityCheck(vehicleNo);
	}
	
	//Method to check if Aadhaar no is correct or not
	public boolean isAadhaarNoValid(long aNo) {
		// TODO Auto-generated method stub
		if(Long.toString(aNo).length() == 12)
			return true;
		else
		return false;
	}
	
	//Method to check if Mobile no is correct or not
	public boolean isMobileNoValid(long mNo) {
		// TODO Auto-generated method stub
		if(Long.toString(mNo).length() == 10)
			return true;
		else
		return false;
	}

}
