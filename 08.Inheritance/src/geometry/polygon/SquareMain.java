package geometry.polygon;

public class SquareMain{
	public static void main(String[] args) {
		Square s = new Square(5, 10, 10);
		System.out.printf( "제 1점 (%d, %d) \n" 
							, s.getX(0), s.getY(0));
		System.out.printf( "제 2점 (%d, %d) \n" 
							, s.getX(1), s.getY(1));
		System.out.printf( "제 3점 (%d, %d) \n" 
							, s.getX(2), s.getY(2));
		System.out.printf( "제 4점 (%d, %d) \n" 
							, s.getX(3), s.getY(3));
	}
}
