import java.util.Scanner;

public class IfEx02 {
	public static void main(String[] args) {
		//어떤 수가 더 큰 수 인지, 같거나 작은수인지 판단하여 출력
		int no1 = 15, no2 = 10;
		if( no1 > no2 ) { //15>10: T
			System.out.printf("%d는 %d 보다 더 큰 수 \n", no1, no2);
		}else {
			System.out.printf("%d는 %d 와 같거나 더 작은 수 \n", no1, no2);
		}
	
		//어떤 수가 짝수인지 홀수인지 판단하여 출력
		int no = 19;
		if( no % 2 == 1 ) 
			System.out.println( no + "는 홀수" );
		else  
			System.out.println( no + "는 짝수" );
		
		
		//시험성적에 대해 성적이 90이상은 A등급 아니면  A등급 아님 으로 출력
		int score = 93;
		if( score >= 90 ) { //93 >= 90 : T
			System.out.println("성적은 90점 이상.");
			System.out.println("등급은 A등급");
		}else {
			System.out.println("성적은 90점 미만.");
			System.out.println("등급은 A등급이 아님");
		}
		
		//돈이 3300원 이상 있으면 택시를 타고, 아니면 버스를 탄다
		//상황에 따른 처리 결과가 다른 상황에 영향을 미칠 수도 있다
		int money = 2000;
		System.out.println("현재 가지고 있는 돈은 " + money );
		int arrivedTime; // 도착시각을 담을 변수
		if( money >= 3300 ) {
			System.out.println("택시를 탄다");
			arrivedTime = 1340;
		}else {
			System.out.println("버스를 탄다");
			arrivedTime = 1410;
		}
		
		//택시를 타는지 버스를 타는지에 따라 도착시각이 달라진다.
		//지각이 발생할 수도 있다. 
		//단위기간이 19일, 80%이상 출석, 결석이 20%미만 3.8일 
		//지각/조퇴 횟수로 12(4일)회이면 훈련수당 받을 수 없다, 
		//11회 이면 훈련수당 받을 수 있다 
		int late = 11; //현재까지의 지각횟수를 담을 변수
		if( arrivedTime > 1350 ) {
			System.out.println("오늘 지각함");
			//late = late + 1;
			//late += 1;
			++late;
			//late++;
		}
		
		if( late < 12 ) { //12 < 12 : F
			System.out.println("훈련수당이 지급됨");
		}else {
			System.out.println("훈련수당 지급 안 됨");
		}
		
		//직접코드실습
		//키보드로 숫자를 입력받아 : Scanner
		Scanner sc = new Scanner(System.in);
		//입력받은 수가 짝수인지 홀수인지 판단하여 출력하는 
		//if ~ else 문을 작성하세요
		System.out.println("짝수인지 홀수인지 판단할 수를 입력하세요");
		int input = sc.nextInt();
		if( input % 2 == 1 ) {
			System.out.println(input + "는 홀수");
		}else {
			System.out.println(input + "는 짝수");
		}
		//if ~ else 문은 삼항연산자로 바꿔볼 수 있다
		System.out.println( 
			input % 2 == 1 ? input + "는 홀수" : input + "는 짝수");
		
		sc.close();
	}
}
