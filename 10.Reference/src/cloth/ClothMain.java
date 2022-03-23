package cloth;

public class ClothMain {
	public static void main(String[] args) {
		
		Cloth shirt 
			= new Cloth("T01", "반팔 티셔츠", "면100%", Season.SUMMER);
		System.out.println("상품코드: " + shirt.code);
		System.out.println("상품명: " + shirt.name);
		System.out.println("상품소재: " +shirt.material);
		System.out.println("계절: " + shirt.season.value());
		
		//생성된 의류관리 객체를 문자열로 바꿔 데이터를 확인하기
		String str = shirt.toString();
		System.out.println( str );
	}
}
