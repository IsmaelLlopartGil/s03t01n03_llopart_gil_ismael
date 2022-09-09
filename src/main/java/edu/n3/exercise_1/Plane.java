package edu.n3.exercise_1;

public class Plane extends Vehicle {

	@Override
	public void start() {
		System.out.println("Arrancant l'avió girant la clau!");
	}

	@Override
	public void speedUp(Direction direction) {
		System.out.println("Movent palanca endavant!");
		System.out.println("Conduint cap a " + direction.getString() + "!");
	}

	@Override
	public void brake() {
		System.out.println("Trepitjant el fre!");
	}
}
