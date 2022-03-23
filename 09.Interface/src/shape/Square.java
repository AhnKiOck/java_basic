package shape;

public class Square implements Shapable{
	int sideLength;
	
	Square(int sideLength){
		this.sideLength = sideLength;
	}
	
	public double calculateArea() {
		return sideLength * sideLength;
	}
	public double calculateCircum() {
		return sideLength * 4;
	}
}
