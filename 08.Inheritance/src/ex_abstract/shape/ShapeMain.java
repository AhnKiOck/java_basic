package ex_abstract.shape;

public class ShapeMain {
	public static void main(String[] args) {
		int width = 7, height = 5;
		Rectangle r = new Rectangle(height, width);
		System.out.printf(
			"너비: %d, 높이: %d 인 사각형의 넓이: %.1f \n" 
				, width, height, r.getArea() );
		
		RightTriangle t = new RightTriangle(height, width);
		System.out.printf(
				"밑변: %d, 높이: %d 인 직각삼각형의 넓이: %.1f \n" 
				, width, height, t.getArea() );
		
		//new Account("", "", "");
		//접근제한자가 default 인 경우 다른 패키지에서는 접근 불가
	}
}
