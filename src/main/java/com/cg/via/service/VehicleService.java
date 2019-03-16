package com.cg.via.service;

import com.cg.via.model.Vehicle;

public interface VehicleService {
	public long register(Vehicle v);
	public Vehicle validityCheck(long vehicleNo);
	public boolean isAadhaarNoValid(long aNo);
	public boolean isMobileNoValid(long mNo);
}
