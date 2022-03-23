package cloth;

public enum Season {
//	SPRING, SUMMER, FALL, WINTER;
	SPRING("봄"), SUMMER("여름"), FALL("가을"), WINTER("겨울");
//	//enum 상수 외의 구성요소 선언시 enum 상수끝에 ; 을 선언
//
	private final String name;
//	
	Season(String name){
		this.name = name;
	}
	
	String value() {
		return name;
	}
	
}
