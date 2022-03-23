package geometry.polygon;

public class Rectangle {
	//필드: 너비(가로), 높이(세로)
	public int width, height;
	
	public Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	//넓이를 구한다
	public int getArea() {
		return width * height;
	}
	
	//둘레를 구한다
	public int getCircumference() {
		return ( width +  height )*2;
	}
}
