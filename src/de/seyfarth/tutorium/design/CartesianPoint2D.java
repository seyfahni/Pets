package de.seyfarth.tutorium.design;

public class CartesianPoint2D {

	public double x;
	public double y;
	
	public CartesianPoint2D() {
		this.x = 0;
		this.y = 0;
	}

	public CartesianPoint2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Calculates the polar coordinates radius.
	 *
	 * @return the radius
	 */
	public double toPolarRadius() {
		return Math.sqrt(x*x + y*y);
	}
	
	/**
	 * Calculates the polar coordinates angle in radian.
	 *
	 * @return the angle in radian
	 */
	public double toPolarAngle() {
		double radius = toPolarRadius();
		if (radius > 0) {
			if(y >= 0) {
				return Math.acos(x/radius);
			} else {
				return 2*Math.PI - Math.acos(x/radius);
			}
		} else {
			return 0;
		}
	}
	
	public double distance(CartesianPoint2D point) {
		double deltaX = x - point.x;
		double deltaY = y - point.y;
		return Math.sqrt(deltaX*deltaX + deltaY*deltaY);
	}
}
