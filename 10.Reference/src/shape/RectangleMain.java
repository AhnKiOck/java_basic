package shape;

public class RectangleMain {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 20);
		//r1: 주소값1
		Rectangle r2 = r1;
		//r2: 주소값1
		System.out.printf("r1: %d X %d \n", r1.width, r1.height);
		System.out.printf("r2: %d X %d \n", r2.width, r2.height);
		
		r2.width = 20;
		System.out.printf("r1: %d X %d \n", r1.width, r1.height);
		System.out.printf("r2: %d X %d \n", r2.width, r2.height);
		
		r1 = null;
		if( r1==null )
			System.out.println("참조변수 r1이 가리키는 객체가 없다");
		System.out.printf("r2: %d X %d \n", r2.width, r2.height);
		
		
	}
}
