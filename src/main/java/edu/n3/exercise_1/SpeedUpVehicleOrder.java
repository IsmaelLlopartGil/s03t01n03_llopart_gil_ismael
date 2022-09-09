package edu.n3.exercise_1;

public class SpeedUpVehicleOrder implements Order {

	Vehicle vehicle;
	Direction direction;

	public SpeedUpVehicleOrder(Vehicle vehicle, Direction direction) {
		this.vehicle = vehicle;
		this.direction = direction;
	}

	@Override
	public void execute() {
		vehicle.speedUp(direction);
	}
}
