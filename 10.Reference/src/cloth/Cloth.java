package cloth;

//의류정보 클래스
public class Cloth {
	String code, name, material;
//	enum Season {
//		SPRING, SUMMER, FALL, WINTER
//	}
	Season season;
//	int season;
	
//	static final int SPRING = 1;
//	static final int SUMMER = 2;
//	static final int FALL = 3;
//	static final int WINTER = 4;
	
	
	Cloth(String code, String name, String material, Season season){
		this.code = code;
		this.name = name;
		this.material = material;
		this.season = season;
	}
	
	public String toString() {
		String info = "상품코드: " + code + ", 상품명: " + name
				+ ", 소재: " + material + ", 계절: " + season;
		return info;
	}
	
	
	
	
	
	
	
	
	
}
