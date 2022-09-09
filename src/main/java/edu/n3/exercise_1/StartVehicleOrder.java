package edu.n3.exercise_1;

public class StartVehicleOrder implements Order {

	Vehicle vehicle;

	public StartVehicleOrder(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void execute() {
		vehicle.start();
	}
}
