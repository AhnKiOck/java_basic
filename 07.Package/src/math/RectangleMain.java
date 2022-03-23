package math;
import geometry.polygon.Rectangle;

public class RectangleMain {
	public static void main(String[] args) {
//		geometry.polygon.Rectangle r 
//			= new geometry.polygon.Rectangle(2, 3);
		Rectangle r = new Rectangle(2, 3);
		System.out.println("너비: " + r.width );
		System.out.println("높이: " + r.height );
		System.out.println("넓이: " + r.getArea() );
		
		Rectangle r2 = new Rectangle(2, 3);
		
		
	}
}
