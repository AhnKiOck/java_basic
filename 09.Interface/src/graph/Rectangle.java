package graph;

public class Rectangle implements Transformable{
	int width, height, x, y;
	
	Rectangle(int width, int height, int x, int y){
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	
	public void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void moveBy(int x, int y) {
//		this.x = this.x + x;
		this.x += x;
		this.y += y;
	}
	
	public void resize(int width, int height) {
		this.width = width;
		this.height = height;
	}
}
