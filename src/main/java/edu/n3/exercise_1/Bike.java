package edu.n3.exercise_1;

public class Bike extends Vehicle {

	@Override
	public void start() {
		System.out.println("Pujant a la bicicleta i traient la pota de cabra!");
	}

	@Override
	public void speedUp(Direction direction) {
		System.out.println("Pedalejant!");
		System.out.println("Conduint cap a " + direction.getString() + "!");
	}

	@Override
	public void brake() {
		System.out.println("Accionant frens!");
	}
}
