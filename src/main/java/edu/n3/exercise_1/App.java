package edu.n3.exercise_1;

public class App {

	private void runScenario() {
		Parking parking = new Parking();
		Car car = new Car();
		Bike bike = new Bike();
		Boat boat = new Boat();
		Plane plane = new Plane();

		parking.receiveVehicle(car);
		parking.receiveVehicle(bike);
		parking.receiveVehicle(boat);
		parking.receiveVehicle(plane);
		parking.returnVehicle(car);
		parking.returnVehicle(bike);
		parking.returnVehicle(boat);
		parking.returnVehicle(plane);
	}

	public static void main(String[] args) {
		new App().runScenario();
	}
}
