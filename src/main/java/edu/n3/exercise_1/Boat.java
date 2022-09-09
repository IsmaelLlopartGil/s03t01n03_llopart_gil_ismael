package edu.n3.exercise_1;

public class Boat extends Vehicle {

	@Override
	public void start() {
		System.out.println("Arrancant el vaixell girant la clau!");
	}

	@Override
	public void speedUp(Direction direction) {
		System.out.println("Movent palanca endavant!");
		System.out.println("Conduint cap a " + direction.getString() + "!");
	}

	@Override
	public void brake() {
		System.out.println("Movent palanca cap enrere!");
	}
}
