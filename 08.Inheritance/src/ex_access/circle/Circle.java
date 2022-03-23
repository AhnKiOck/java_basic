package ex_access.circle;

public class Circle {
	private int radius;
	
	Circle(int radius){
		this.radius = radius;
	}
	
	int getRadius() {
		return radius;
	}
	
	double getArea() {
		return 3.14 * radius * radius;
	}
	
	double getCircumference() {
		return 2 * 3.14 * radius;
	}
	
}
