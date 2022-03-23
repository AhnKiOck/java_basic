package shape;

public class RectangleMain02 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 20);
		Rectangle r2 = new Rectangle(20, 10);
		Rectangle r3 = new Rectangle(10, 20);
		
		System.out.printf("r1: %d X %d \n", r1.width, r1.height);
		System.out.printf("r2: %d X %d \n", r2.width, r2.height);
		
		if( r1 == r2 )
			System.out.println("같은 인스턴스");
		else
			System.out.println("다른 인스턴스");
		
		if( r1.equals(r2) )
			System.out.println("같은 사각형");
		else
			System.out.println("다른 사각형");
		
		if( r1.equals(r3) )
			System.out.println("같은 사각형");
		else
			System.out.println("다른 사각형");
		//같은 사각형으로 출력될 수 있도록  Rectangle 클래스를 수정하세요 
		
	}
}
