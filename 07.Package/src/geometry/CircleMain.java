package geometry;

public class CircleMain {
	public static void main(String[] args) {
		Circle c = new Circle(5);
		System.out.println("반지름 : " + c.radius );
		System.out.printf("넓이: %.2f \n" , c.getArea() );
		System.out.printf("둘레: %.2f" , c.getCircumference() );
	}
}
