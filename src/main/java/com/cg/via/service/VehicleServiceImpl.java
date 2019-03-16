package com.cg.via.service;

import com.cg.via.dao.VehicleDao;
import com.cg.via.dao.VehicleDaoImpl;
import com.cg.via.model.Vehicle;

public class VehicleServiceImpl implements VehicleService {
	VehicleDao dao = new VehicleDaoImpl();
	public long register(Vehicle v) {
		// TODO Auto-generated method stub
		return dao.register(v);
	}
	public Vehicle validityCheck(long vehicleNo) {
		// TODO Auto-generated method stub
		return dao.validityCheck(vehicleNo);
	}
	public boolean isAadhaarNoValid(long aNo) {
		// TODO Auto-generated method stub
		if(Long.toString(aNo).length() == 12)
			return true;
		else
		return false;
	}
	public boolean isMobileNoValid(long mNo) {
		// TODO Auto-generated method stub
		if(Long.toString(mNo).length() == 10)
			return true;
		else
		return false;
	}

}
