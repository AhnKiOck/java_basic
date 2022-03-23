package color;

public enum Color {
	YELLOW("노랑"), RED("빨강"), BLUE("파랑"), GREEN("초록");
	private final String name;
	Color(String name){
		this.name = name;
	}
	public String value() {
		return name;
	}
}
