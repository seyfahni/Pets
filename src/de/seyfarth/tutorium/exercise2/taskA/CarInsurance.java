package de.seyfarth.tutorium.exercise2.taskA;

public final class CarInsurance {

	private static final int[] FIXED_COST_TABLE = {33, 64, 85, 112};
	private static final double FACTOR = 0.5;

	public static double calculateInsurance(int crashAmount, int carValue) {
		return FIXED_COST_TABLE[crashAmount - 1] + FACTOR * carValue;
	}

	private CarInsurance() {
	}
}
