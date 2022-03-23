package ex_abstract.shape;

//직사각형
public class Rectangle extends Shape {
	//너비, 높이
	int width;
	
	Rectangle( int height, int width ){
		super(height);
		this.width = width;
	}

	double getArea() {
		//직사각형 : 너비 *높이 : 10 * 20
		int area = width * height;
		return area;
	}
}
