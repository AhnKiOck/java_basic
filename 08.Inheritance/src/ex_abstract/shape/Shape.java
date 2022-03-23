package ex_abstract.shape;

abstract public class Shape {
//	 높이
	int height;
	
	Shape(int height){
		this.height = height;
	}
	
//	 넓이를 구한다
	abstract double getArea();
}
