package com.qa.challenge;

public class MotorBikes extends Vehicles {

private boolean pillion;
private String bikeTrim;

	public MotorBikes(int VIN, String Manufacturer, int Seats, double EngineSize, boolean pillion, String bikeTrim) {
	super(VIN, Manufacturer, Seats, EngineSize);
	this.pillion = pillion;
	this.bikeTrim = bikeTrim;
}

	public boolean isPillion() {
		return pillion;
	}


	public void setPillion(boolean pillion) {
		this.pillion = pillion;
	}


	public String getBikeTrim() {
		return bikeTrim;
	}


	public void setBikeTrim(String bikeTrim) {
		this.bikeTrim = bikeTrim;
	}
	
	 








	@Override
	public void Invoice() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "MotorBikes [pillion=" + pillion + ", bikeTrim=" + bikeTrim + ", VIN=" + VIN + ", Manufacturer="
				+ Manufacturer + ", Seats=" + Seats + ", EngineSize=" + EngineSize + "]";
	}
	
	
}
