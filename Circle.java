package sam1_L2;

public class Circle {
	private double radius;
	private static final double pi = 3.142;
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return pi * radius * radius;
	}
	
	public double getCircumference() {
		return 2 * pi * radius;
	}

}















