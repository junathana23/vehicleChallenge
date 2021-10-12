package com.qa.challenge;

public class Cars extends Vehicles {

private String transmission;
private int doors;
public float invoiceCosts;

public Cars(int VIN, String Manufacturer, int Seats, double EngineSize, String transmission, int doors) {
	super(VIN, Manufacturer, Seats, EngineSize);
	this.transmission = transmission;
	this.doors = doors;
}

public String getTransmission() {
	return transmission;
}

public void setTransmission(String transmission) {
	this.transmission = transmission;
}

public int getDoors() {
	return doors;
}

public void setDoors(int doors) {
	this.doors = doors;
}

public void Invoice() {
	if (doors <= 3) {
	  	invoiceCosts = 2.5f;
	}
}

@Override
public String toString() {
	return "Cars [transmission=" + transmission + ", doors=" + doors + ", VIN=" + VIN + ", Manufacturer=" + Manufacturer
			+ ", Seats=" + Seats + ", EngineSize=" + EngineSize + "]";
}


}
