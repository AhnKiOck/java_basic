package label;

public class Label implements Changable{
	String text; // 라벨에 쓸 문구
	int width, height; 
	String foreground, background, font;
	
	Label(String text, int width, int height
		, String foreground, String background, String font ){
		this.text = text;
		this.width = width;
		this.height = height;
		this.foreground = foreground;
		this.background = background;
		this.font = font;
	}
	
	public void setFont(String font) {
		this.font = font;
	}
	public void setForeground(String color) {
		this.foreground = color;
	}
	public void setBackground(String color) {
		this.background = color;
	}
	public void resize(int width, int height) {
		this.width = width;
		this.height = height;
	}
}
