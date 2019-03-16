package com.cg.via.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.cg.via.model.Vehicle;

class VehicleDaoImplTest {
	static VehicleDaoImpl vehicle;
	static Vehicle v;
	@BeforeAll
	public static void init()
	{
		vehicle = new VehicleDaoImpl();
		v = new Vehicle();
	}
	@Test
	void testRegister() {
		v.setVehicleNo(1);
		v.setVehicleType("2 Wheelers");
		v.setInsurancePeriod(3);
		v.setAadhaarNo(123412341234L);
		v.setMobileNo(9876543210L);
		v.setDateOfRegistration(Date.valueOf(LocalDate.now()));
		assertEquals(1, vehicle.register(v));
	}

	@Test
	void testValidityCheck() {
		v.setVehicleNo(1);
		v.setVehicleType("2 Wheelers");
		v.setInsurancePeriod(3);
		v.setAadhaarNo(123412341234L);
		v.setMobileNo(9876543210L);
		v.setDateOfRegistration(Date.valueOf(LocalDate.now()));
		v.setLastDate("15/03/2022");
		v.setNoOfDays(1095);
		vehicle.register(v);
		Vehicle v1 = vehicle.validityCheck(1);
		assertEquals(1095, v1.getNoOfDays());
	}

}
