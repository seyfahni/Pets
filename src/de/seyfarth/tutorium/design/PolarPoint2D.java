package de.seyfarth.tutorium.design;

public class PolarPoint2D {
	double radius;
	double angle;
	
	/**
	 * Calculates the cartesian coordinates x-coordinate.
	 *
	 * @return the x-coordinate
	 */
	public double toCartesianX() {
		return radius * Math.cos(angle);
	}
			
	/**
	 * Calculates the cartesian coordinates y-coordinate.
	 *
	 * @return the y-coordinate
	 */
	public double toCartesianY() {
		return radius * Math.sin(angle);
	}
}
