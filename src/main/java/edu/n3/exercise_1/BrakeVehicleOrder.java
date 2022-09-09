package edu.n3.exercise_1;

public class BrakeVehicleOrder implements Order {
	Vehicle vehicle;

	public BrakeVehicleOrder(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void execute() {
		vehicle.brake();
	}
}
