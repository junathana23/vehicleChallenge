package com.qa.challenge;

public abstract class Vehicles {

	int VIN;
	String Manufacturer;
	int Seats;
	double EngineSize;
	
	public abstract void Invoice();
	
	
	public Vehicles(int VIN, String Manufacturer, int Seats, double EngineSize ) {
		super();
		this.VIN = VIN;
		this.Manufacturer = Manufacturer;
		this.Seats = Seats;
		this.EngineSize = EngineSize;
	
	
}



	
}
