//원
public class Circle {
	// 데이터를 보호하기 위해 외부에서 필드에의 접근을 제한
	// 필드에 접근제한자(접근제어자) private 를 지정
	private int radius; //반지름
	
	//생성자 선언문
	//클래스명과 동일하게
	//리턴타입이 없는 메소드의 형식
	Circle(int radius){
		this.radius = radius;
	}
	
	//반지름을 리턴한다.
	int getRadius() {
		return radius;
	}
	
	//원의 넓이를 구한다.
	double getArea() {
		// 파이 * 반지름^2
		double area = 3.14 * radius * radius;
		return area;
	}
	
	//원의 둘레를 구한다.
	double getCircumference() {
		//2 * 파이 * 반지름
//		double circum = 2 * 3.14 * radius;
//		return circum;
		return 2 * 3.14 * radius;
	}
	
}
