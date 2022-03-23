package math;

import geometry.Circle;
import geometry.polygon.Rectangle;
//import 선언문 자동완성: ctrl + shift + o 
//import geometry.Circle;
//import geometry.polygon.Rectangle;


public class GeometryMain {
	public static void main(String[] args) {
		Circle c;
		c = new Circle(5);
		
		Rectangle r = new Rectangle(2, 3);
		
		//원과 사각형중에 넓이가 더 큰지 출력
		if( c.getArea() > r.getArea() ) {
			System.out.println("원이 넓다");
			
		}else {
			System.out.println("사각형이 넓다");
			
		}
		
		
	}
}
