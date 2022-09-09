package edu.n3.exercise_1;

public enum Direction {

	INSIDE("la plaça"), OUTSIDE("la sortida");

	private String cap;

	private Direction(String cap) {
		this.cap = cap;
	}

	public String getString() {
		return cap;
	}
}
