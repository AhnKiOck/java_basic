package ex_abstract.shape;

//직각삼각형
public class RightTriangle extends Shape{
	//밑변, 높이
	int bottom;
	
	RightTriangle(int height, int bottom){
		super(height);
		this.bottom = bottom;
	}
	
	double getArea() {
		//직각삼각형: 밑변*높이/2
		return bottom * height * 0.5; 
//		return (double)bottom * height / 2; 
	}
}
