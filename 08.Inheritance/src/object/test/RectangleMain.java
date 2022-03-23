package object.test;

public class RectangleMain {
	public static void main(String[] args) {
		//사각형 객체를 생성
		Rectangle r = new Rectangle(5, 10);
		//생성한 사각형의 너비와 높이를 출력한다
		System.out.println("사각형의 너비: " + r.getWidth());
		System.out.println("사각형의 높이: " + r.getHeight());
		
	}
}
