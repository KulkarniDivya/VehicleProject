package com.cg.via.Vehicle;

import java.time.LocalDate;
import java.sql.Date;
import java.util.Scanner;

import com.cg.via.model.Vehicle;
import com.cg.via.service.VehicleService;
import com.cg.via.service.VehicleServiceImpl;
import com.cg.via.utiity.InvalidAadhaarNoException;
import com.cg.via.utiity.InvalidMobileNoException;
import com.cg.via.utiity.NotRegisteredException;

public class MainUI {
	static Scanner sc = new Scanner(System.in);
	static Vehicle v = new Vehicle();
	static VehicleService service = new VehicleServiceImpl();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true)
		{
			System.out.println("Menu");
			System.out.println("1.Vehicle Insurance Registration");
			System.out.println("2.Insurance Validity check");
			System.out.println("3.Exit");
			int n = sc.nextInt();
			switch(n)
			{
			case 1: setInfo();
			if(v.getAadhaarNo() != 0 && v.getMobileNo() != 0)
			{
				long no = service.register(v);
				if(no != 0)
				System.out.println("Vehicle no "+no+" is registered");
				else
				{
					try {
						throw new NotRegisteredException();
					} catch (NotRegisteredException e) {
						// TODO Auto-generated catch block
					}
				}
			}
				
			break;
			case 2: v = service.validityCheck(v.getVehicleNo());
				System.out.println("your insurance expires on "+v.getLastDate());
				System.out.println(v.getNoOfDays()+" days left for renewal");
			break;
			case 3:System.out.println("Thank You");
				System.exit(0);
			default: System.out.println("Give proper input");
			}
		}
	}
	private static void setInfo() {
		// TODO Auto-generated method stub
		System.out.println("Enter the vehicle no");
		v.setVehicleNo(sc.nextLong());
		System.out.println("Enter the Vehicle Type(eg. 2 wheeler)");
		sc.nextLine();
		v.setVehicleType(sc.nextLine());
		System.out.println("Enter Insurance period in years");
		v.setInsurancePeriod(sc.nextInt());
		System.out.println("Enter Aadhaar No");
		long aNo = sc.nextLong();
		if(service.isAadhaarNoValid(aNo))
		{
			v.setAadhaarNo(aNo);
			System.out.println("Enter Mobile Number");
			long mNo = sc.nextLong();
			if(service.isMobileNoValid(mNo))
			{
				v.setMobileNo(mNo);
				v.setDateOfRegistration(Date.valueOf(LocalDate.now()));
			}
			else
			{
				try {
					throw new InvalidMobileNoException();
				} catch (InvalidMobileNoException e) {
					// TODO Auto-generated catch block
				}
			}
		}
		else
		{
			try {
				throw new InvalidAadhaarNoException();
			} catch (InvalidAadhaarNoException e) {
				// TODO Auto-generated catch block
			}
		}
	}

}
