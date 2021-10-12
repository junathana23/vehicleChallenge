package com.qa.challenge;

public class GarageRunner {
public static void main(String [] args) {
	Vehicles Car1 = new Cars(301, "BMW", 5, 1.8, "Automatic", 5);
	Vehicles Bike1 = new MotorBikes(201, "yamaha", 1, 125, false, "Sport");
	
	
	
	Garage newGarage = new Garage();
	newGarage.AddVehicles(Bike1);
	System.out.println(newGarage);
	

	

	
	
	
	
}
}
