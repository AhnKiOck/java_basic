package shape;

public class ShapeMain {
	public static void main(String[] args) {
		int length = 10;
		Circle c = new Circle(length);
		System.out.printf("원 반지름: %d, 넓이: %.2f, 둘레: %.2f \n"
			, c.radius, c.calculateArea(), c.calculateCircum() );
		
		Square s = new Square(length);
		System.out.printf("정사각형 한변: %d, 넓이: %.2f, 둘레: %.2f \n"
			, s.sideLength, s.calculateArea(), s.calculateCircum() );

		Triangle t = new Triangle(length);
		System.out.printf("정삼각형 한변: %d, 넓이: %.2f, 둘레: %.2f \n"
			, t.sideLength, t.calculateArea(), t.calculateCircum() );
		
		
		
	}
}
