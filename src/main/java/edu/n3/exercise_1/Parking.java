package edu.n3.exercise_1;

public class Parking {

	public Parking() {
	}

	public void receiveVehicle(Vehicle vehicle) {
		moveVehicle(vehicle, Direction.INSIDE);
	}

	public void returnVehicle(Vehicle vehicle) {
		moveVehicle(vehicle, Direction.OUTSIDE);
	}

	private void moveVehicle(Vehicle vehicle, Direction direction) {
		MoveVehicleOrder moveVehicleOrder = new MoveVehicleOrder(vehicle, direction);
		moveVehicleOrder.execute();
	}
}
