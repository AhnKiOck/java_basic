import java.util.Scanner;

public class IfEx05 {
	public static void main(String[] args) {
		//광주시내버스 요금은
		//어린이(7세이상 13세이하) 400원
		//청소년 (14세이상 19세이하)800원
		//일반(20세이상) 1250원
		//키보드로 입력한 나이에 따라 시내버스 요금을 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		
		//키보드로 입력한 데이터를 스캔해서
		//변수에 담는다
//		int age; //나이를 담을 변수
//		age = sc.nextInt();
		int age = sc.nextInt();
		int charge; //버스요금을 담을 변수
		String ageGroup; //적용 요금제 기준: 어린이, 청소년, 일반
		//7 <= age <= 13(X 안됨) &&(and) ||(or)
		if( age >= 20 ) {
			charge = 1250;
			ageGroup = "일반";
		}else if( age >= 14 ) {
			charge = 800;
			ageGroup = "청소년";
		}else if( age >= 7 ) {
			charge = 400;
			ageGroup = "어린이";
		}else {
			charge = 0;
			ageGroup = "소아";
		}
		
		/*
		if( age >= 7  && age <= 13) { //15 >= 7: T && 15 <= 13 : F --> F
			charge = 400;
			ageGroup = "어린이";
		}else if( age >= 14 && age <= 19 ) {//15>=14:T && 15 <= 19:T --> T
			charge = 800;
			ageGroup = "청소년";
		}else if( age >= 20 ) {
			charge = 1250;
			ageGroup = "일반";
		}else {
			charge = 0;
			ageGroup = "소아";
		}
		*/
		System.out.printf(
			"나이 %d세는  %s요금인 %d원", age, ageGroup, charge);
		
		
		
		
		sc.close();
	}
}
