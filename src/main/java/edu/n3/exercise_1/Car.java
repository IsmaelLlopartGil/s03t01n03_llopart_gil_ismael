package edu.n3.exercise_1;

public class Car extends Vehicle {

	@Override
	public void start() {
		System.out.println("Arrancant el cotxe girant la clau!");
	}

	@Override
	public void speedUp(Direction direction) {
		System.out.println("Trepitjant l'accelerador!");
		System.out.println("Conduint cap a " + direction.getString() + "!");
	}

	@Override
	public void brake() {
		System.out.println("Trepitjant el fre!");
	}
}
