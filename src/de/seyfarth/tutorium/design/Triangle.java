package de.seyfarth.tutorium.design;

public class Triangle {

	private final CartesianPoint2D a;
	private final CartesianPoint2D b;
	private final CartesianPoint2D c;

	public Triangle(CartesianPoint2D a, CartesianPoint2D b, CartesianPoint2D c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getCircumference() {
		return a.distance(b) + b.distance(c) + c.distance(a);
	}
	
	public double getArea() {
		double s = getCircumference() / 2;
		return Math.sqrt(s * (s-a.distance(b)) * (s-b.distance(c)) * (s-c.distance(a)));
	}
}
