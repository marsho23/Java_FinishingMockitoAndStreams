package com.qa.generics;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VehicleContainer<Car> carContainer = new VehicleContainer<Car>();
		Car c1= new Car();
		carContainer.addToList(c1);
		System.out.println(carContainer.vehicleList);
		
		carContainer.removeFromList(c1);
		System.out.println(carContainer.vehicleList);


	}

}
