package object.test;

//접근제어에 대한 이해
public class Rectangle {
	//필드: 너비, 높이 - 모두 접근제한자 private 으로 지정하기
	private int width, height;
	
	//생성자 선언 - 두 필드를 모두 초기화하도록 한다
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	int getWidth() {
		return width;
	}
	int getHeight() {
		return height;
	}
}
