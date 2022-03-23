package geometry;
//원
public class Circle {
	//필드: 반지름
	int radius;
	
	public Circle(int radius){
		this.radius = radius;
	}
	
	//넓이를 구한다
	public double getArea() {
		//3.14 * 반지름^2
		return  3.14 * radius * radius;
	}
	//둘레를 구한다
	double getCircumference() {
		//2 * 3.14 * 반지름
		return 2 * 3.14 * radius;
	}
}



