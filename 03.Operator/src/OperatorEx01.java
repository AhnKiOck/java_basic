
public class OperatorEx01 {
	public static void main(String[] args) {
		int no1 = 5;
		System.out.println("no1: " + no1);
		char ch = '봄'; // 문자표현: '', 문자열표현: ""
		System.out.println("ch: " + ch);
		no1 = ch; // char -> int : 자동형변환
		System.out.println("no1: " + no1);

		// 대입연산자 에 의해 대입된 결과를 다시 대입해서 사용할 수 있다
		int no2 = (no1 = 5) + 10;
		System.out.println("no1: " + no1);
		System.out.println("no2: " + no2);

		int no3 = no2 = no1;
		System.out.println("no1: " + no1);
		System.out.println("no2: " + no2);
		System.out.println("no3: " + no3);

		// 복사해서 붙여넣기: crtl+alt+방향키
		// 출력문: syso + ctrl+space바
		// 라인 이동하기: alt+방향키
		// 라인 삭제하기: ctrl+d
		// 주석처리: ctrl+shift+c

		no1 = 7;
		no2 = 2;
		System.out.println("7 / 2 의 몫: " + no1 / no2);
		System.out.println("7 / 2 의 나머지: " + no1 % no2);

		double no4 = 2.0;
		no4 = no1 / no4; // 7 / 2.0
		System.out.println("7 / 2.0의 몫: " + no4);

		// 사칙연산의 우선순위: *,/ > +,- , 우선순위지정()
		no1 = 7 / 2 + 3; // 6
		System.out.println("7 / 2 + 3 : " + no1);
		no1 = 7 / (2 + 3); // 7 / 5 : 1
		System.out.println("7 / (2 + 3) : " + no1);

		no1 = 100 + 200;
		long no5 = 100 + 200L;
		System.out.println(no5);

		// 정수데이터의 기본형은 int, 실수데이터의 기본형은 double
		// int 보다 더 적은 byte(1), short(2)
		// 연산시 기본형인 int 로 연산된다. : 연산결과도 int
		byte no6 = 2, no7 = 5, no8;
		// no8 = no6 + no7; //byte + byte 가 byte 에 담길수 없다
		no1 = no6 + no7;

		// 부호연산자: +1 * 변수, -1 * 변수
		no1 = +no1;
		System.out.println("no1: " + no1);

		// no6 = -no6; // -1 * no6: 연산이 발생하여 결과가 int, byte에 못 담음
		no1 = -no6;
		no6 = (byte) -no6;
		// int -> byte : byte 타입으로 강제형변환(Casting) 하면 담을수 있다

	}
}
