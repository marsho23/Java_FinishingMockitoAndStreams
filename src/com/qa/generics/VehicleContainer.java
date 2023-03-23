package com.qa.generics;

import java.util.ArrayList;
import java.util.List;

public class VehicleContainer<T extends Vehicle> {
	public List<T> vehicleList = new ArrayList<>();

	public void addToList(T vehicle) {
		vehicleList.add(vehicle);
	}
	
	public void removeFromList(T vehicle) {
		vehicleList.remove(vehicle);
	}

}
