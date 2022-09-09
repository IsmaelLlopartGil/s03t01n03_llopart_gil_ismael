package edu.n3.exercise_1;

public class MoveVehicleOrder implements Order {

	StartVehicleOrder startVehicleOrder;
	SpeedUpVehicleOrder speedUpVehicleOrder;
	BrakeVehicleOrder brakeVehicleOrder;

	public MoveVehicleOrder(Vehicle vehicle, Direction direction) {
		super();
		startVehicleOrder = new StartVehicleOrder(vehicle);
		speedUpVehicleOrder = new SpeedUpVehicleOrder(vehicle, direction);
		brakeVehicleOrder = new BrakeVehicleOrder(vehicle);
	}

	@Override
	public void execute() {
		startVehicleOrder.execute();
		speedUpVehicleOrder.execute();
		brakeVehicleOrder.execute();
	}
}
