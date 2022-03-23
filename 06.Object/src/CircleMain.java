
public class CircleMain {
	public static void main(String[] args) {
		//반지름 10인 원 생성
		Circle c = new Circle(10);
		double area = c.getArea();
//		c.radius = 5; //필드에 직접 접근해 데이터를 변경해서는 안 되겠다
//		System.out.println("반지름: " + c.radius );
		System.out.println("반지름: " + c.getRadius() );
		System.out.println("원의 넓이: " + area );
	}
}
