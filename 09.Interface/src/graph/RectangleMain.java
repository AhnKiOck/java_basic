package graph;

public class RectangleMain {
	public static void main(String[] args) {
		// 10 * 20의 세로로 긴 사각형을 원점에 위치하게 한다
		Rectangle r = new Rectangle(10, 20, 0, 0);
		System.out.printf( "크기: %d X %d, 위치 (%d, %d) \n"
				, r.width, r.height, r.x, r.y );
		
		r.moveTo(5, 10);
		System.out.printf( "크기: %d X %d, 위치 (%d, %d) \n"
				, r.width, r.height, r.x, r.y );
		
		r.moveBy(5, 5);
		System.out.printf( "크기: %d X %d, 위치 (%d, %d) \n"
				, r.width, r.height, r.x, r.y );
		
		r.resize(20, 15);
		System.out.printf( "크기: %d X %d, 위치 (%d, %d) \n"
				, r.width, r.height, r.x, r.y );
		
	}
}
