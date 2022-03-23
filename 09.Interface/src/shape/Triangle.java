package shape;

public class Triangle implements Shapable{
	int sideLength;
	
	Triangle(int sideLength){
		this.sideLength = sideLength;
	}
	
	public double calculateArea() {
		//밑변 * 높이 * 0.5
		//루트(3) / 4 * (한변*한변)
//		return Math.sqrt(3) / 4 * sideLength * sideLength;
		return Math.sqrt(3) / 4 * Math.pow(sideLength,2);
	}
	public double calculateCircum() {
		
		return sideLength * 3;
	}
}
