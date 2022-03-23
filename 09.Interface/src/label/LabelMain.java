package label;

public class LabelMain {
	public static void main(String[] args) {
		Label hello
		= new Label("안녕하세요~", 100, 30, "blue", "yellow", "굴림체");
		printLabel( hello );
		
		hello.resize(50, 30);
		printLabel( hello );
		
		hello.setBackground("white");
		hello.setForeground("black");
		printLabel( hello );
		
		hello.setFont("나눔고딕체");
		printLabel( hello );
		
	}
	static void printLabel(Label label) {
		System.out.printf("%s: %d X %d 배경색(%s) 전경색(%s) 폰트(%s) \n"
				, label.text, label.width, label.height
				, label.background, label.foreground, label.font);
	}
}
