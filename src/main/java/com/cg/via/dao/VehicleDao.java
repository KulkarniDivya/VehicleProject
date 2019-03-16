package com.cg.via.dao;

import com.cg.via.model.Vehicle;

public interface VehicleDao {
	public long register(Vehicle v);
	public Vehicle validityCheck(long vehicleNo);
}
