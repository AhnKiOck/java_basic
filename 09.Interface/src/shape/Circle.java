package shape;

public class Circle implements Shapable {
	int radius;
	
	Circle(int radius){
		this.radius = radius;
	}
	public double calculateArea() {
		return 3.14 * radius * radius;
	} 
	public double calculateCircum() {
		return 2 * 3.14 * radius;
	} 
}
