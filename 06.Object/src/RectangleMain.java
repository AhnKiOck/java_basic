
public class RectangleMain {
	public static void main(String[] args) {
		//너비 10, 높이 20인 Rectange 객체를 생성한 후
		Rectangle r1 = null;
		try {
			r1 = new Rectangle(10, 20);
			// 너비, 높이, 넓이, 둘레 를 출력
			System.out.println("너비: " + r1.getWidth() 
			+" 높이: " +  r1.getHeight() );
			System.out.println("넓이: " + r1.getArea() 
			+ " 둘레: " + r1.getCircumference());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//너비 -5, 높이 20인 Rectange 객체를 생성한 후
		// 너비, 높이, 넓이, 둘레 를 출력
		Rectangle r2 = null;
		try {
			r2 = new Rectangle(-5, 20);
			r2.setWidth(10);
			
			System.out.println("너비: " + r2.getWidth() 
				+" 높이: " +  r2.getHeight() );
			System.out.println("넓이: " + r2.getArea() 
				+ " 둘레: " + r2.getCircumference());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
