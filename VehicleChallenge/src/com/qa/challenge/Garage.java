package com.qa.challenge;
import java.util.ArrayList;
import com.qa.challenge.Cars;

public class Garage {
private ArrayList<Vehicles> OwnedVehicles = new ArrayList<>();


public void AddVehicles(Vehicles vehicle) {
	OwnedVehicles.add(vehicle);
	
	
}

public void RemoveVehicles(Vehicles vehicle) {
	OwnedVehicles.remove(vehicle);
	
}

public void ClearVehicles() {
	OwnedVehicles.clear();
	
}

public void Invoice() {
	
}

@Override
public String toString() {
	return "Garage [OwnedVehicles=" + OwnedVehicles + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}



}


