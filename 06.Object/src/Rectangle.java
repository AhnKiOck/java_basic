
public class Rectangle {
	//필드: 너비, 높이
	//조건: 외부에서의 접근을 제한하도록 지정
	private int width, height;
	
	//생성자: 너비, 높이를 초기화한다.
	//조건: 너비나 높이가 0이하 이면 사각형을 생성할 수 없도록
	//     Exception 을 발생시킨다
	Rectangle(int width, int height) throws Exception{
		if( width<=0  || height<=0 ) { 
			throw new Exception(
				"너비가 0이하인 형태는 직사각형이 아니므로 사각형 생성 불가");
		}
		this.width = width;
		this.height = height;
	}
	
	//메소드: 너비를 리턴하는 메소드, 높이를 알려주는 메소드
	//       넓이를 구한다 메소드, 둘레를 구한다 메소드
	//너비를 알려주는 메소드,
	int getWidth() {
		return width;
	}
	
	//파라미터로 받은 데이터값으로 필드를 변경한다.
	void setWidth(int width) {
		this.width = width;
	}
	
	//높이를 알려주는 메소드
	int getHeight() {
		return height;
	}
	
	//넓이를 구한다 메소드,
	int getArea() {
//		int area = width * height;
//		return area;
		return width * height;
	}
	
	//둘레를 구한다 메소드
	int getCircumference() {
		return (width + height)*2;
	}
	
}
