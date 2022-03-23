import java.util.Scanner;

public class ArrayEx02 {
	public static void main(String[] args) {
		int no[] = new int[10]; // int[] no = new int[10];
		// 1~10까지의 데이터로 초기화
		for(int idx=0; idx<10; idx++) {
			no[idx] = idx + 1;
		}
		
		for(int idx=0; idx<no.length; idx++) {
			System.out.printf("no[%d]: %d \n", idx, no[idx] );
		}
		System.out.println("-----------------");
		
		//길이가 9인 배열변수에 3의 배수(3~27)로 초기화하기 (구구단 3단)
		int third[] = new int[9];
		for(int idx=0; idx<third.length; idx++) {
			third[idx] = 3*(idx+1);
		}
		for(int idx=0; idx<third.length; idx++) {
			System.out.printf("3*%d=%d \n", idx+1, third[idx]);
		}
		System.out.println("--------------");
		
		
		// 5개 과목의 시험성적에 대해 합계 와 평균 구하기
		// int 타입의 데이터 5개를 담은 배열변수  score 선언
		int score[] = {90, 85, 96, 73, 88};
		int sum = 0;
		for(int idx=0; idx<score.length; idx++) {
			//sum = score[idx] + sum;
			sum += score[idx];
		}
		System.out.println("시험성적의 합계: " + sum );
		System.out.println("시험성적의 평균: " + sum/score.length );
		System.out.println("시험성적의 평균: " + sum/(double)score.length );
		//index   0     1        2          3	           4                5(5<5?F)
		//score[] 90    85       96         73             88
		//sum     0+90  0+90+85  0+90+85+96 0+90+85+96+73  0+90+85+96+73+88  
		
		// 배열의 길이를 키보드로 입력받아 정하고,
		// 1. 입력받은 배열의 길이까지의 데이터를 배열변수로 선언하여 
		//    각 index(배열요소) 에 데이터를 담은 후
		// 2. 각 index  의 데이터 중에 짝수의 합을 구해서 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 어디까지의 합을 구할것인가?");
		int end = sc.nextInt();
		int data[] = new int[end];
		for(int idx=0; idx<data.length; idx++) {
			data[idx] = idx + 1;
		}
		
		int total = 0;
		for(int idx=0; idx<data.length; idx++) {
			if( data[idx]%2 == 0 ) {
				//total = total + data[idx];
				total += data[idx];
			}
		}
		System.out.printf("1부터 %d까지의 수 중 짝수의 합: %d", end, total);
		
		
		sc.close();
		
		
	}
}
