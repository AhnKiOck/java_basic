package math;

//import geometry.polygon.Rectangle;
//import geometry.polygon.Square;
import geometry.polygon.*;

public class PolygonMain {
	public static void main(String[] args) {
		//사각형, 정사각형 객체 생성
		Rectangle r = new Rectangle(2,3);
		Square s = new Square(5);
		
		if( r.getArea() > s.getArea() ) {
			System.out.println("사각형 넓이가 넓다");
		}else {
			System.out.println("정사각형 넓이가 넓다");
			
		}
		
	}
}
