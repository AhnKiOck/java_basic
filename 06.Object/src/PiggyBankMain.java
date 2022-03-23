
public class PiggyBankMain {
	public static void main(String[] args) {
		//객체 생성문:  new 클래스명(); <- 생성문 호출문
		PiggyBank hong = null;
		System.out.println("hong는 사용불가" + hong);
		
		hong = new PiggyBank(); // default 생성자 호출문
		//필드에 데이터를 담아 객체에 특성을 지어준다
		hong.owner = "홍길동";
		System.out.println( "저금통 주인: " + hong.owner );
		System.out.println( "총액: " + hong.total );
		
		int no = 0;
		//System.out.println("no는 사용불가" + no);
		no = 10;
		
		//PiggyBank hong = new PiggyBank();
		
		PiggyBank jeon;
		jeon = new PiggyBank("전우치");
		
		//참조변수 에는 생성된 객체의 주소값이 있다
		//참조변수값을 통해 객체의 구성요소에 접근한다.
		//참조변수.필드명, 참조변수.메소드명
		//jeon.owner = "전우치";
		System.out.println("저금통 주인:" + jeon.owner);
		System.out.println("저금통 총액:" + jeon.total);
				
		int money = 3000;
		jeon.inputMoney(money); //메소드호출문
		System.out.println("현재 총액: " + jeon.total);
		
		money = 1000;
		jeon.inputMoney(money); 
		System.out.printf("%d원을 넣어 총액 %d원 \n"
								, money, jeon.total );
		
		money = 2000;
		jeon.outputMoney(money);
		System.out.printf("%d원을 빼내 총액 %d원 \n"
							, money, jeon.total );
		
		

		
	}
}
