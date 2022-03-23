package ex_access.circle;

public class CircleMain {
	public static void main(String[] args) {
		Circle c = new Circle(5);
//		System.out.println("반지름: " +  c.radius );
		System.out.println("반지름: " +  c.getRadius() );
		System.out.println("넓이: " + c.getArea() );
		System.out.printf("둘레: %.2f" , c.getCircumference() );
	}
}
