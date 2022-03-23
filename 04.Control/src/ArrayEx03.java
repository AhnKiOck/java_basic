import java.util.Scanner;

public class ArrayEx03 {
	public static void main(String[] args) {
		//직접코드실습
		//1. 정수 3개를 저장할 수 있는 배열을 선언하고,
		//   반복문으로 각 항목에 10,20,30 을 저장한 후 
		//   반복문으로 각 배열요소의 데이터를 출력하는 프로그램을  작성
//		int first[];
//		first = new int[3];
		int[] first = new int[3];
		//index  0->1(index+1) 1->2(index+1)  2->3(index+1)
		//       10:10*1       20:10*2        30:10*3
		for(int idx=0; idx<first.length; idx++) {
			first[idx] = 10*(idx+1);
			System.out.printf("index[%d]: %d \n", idx, first[idx] );
		}
		
		
		//2. 1부터 10까지의 정수를 반복문으로 배열요소에 담은 후,
		//   각 항목의 데이터 중 홀수의 합을 구해서 출력하는 반복문 프로그램 작성
		int second[] = new int[10];
		//index 0  1 ....   9 
		//      1  2        10: index+1
		int sum = 0;
		for(int idx=0; idx<second.length; idx++) {
			second[idx] = idx + 1;
			if( second[idx]%2==1 ) {
				//sum = sum + second[idx];
				sum += second[idx];
			}
		}
		System.out.printf("1~%d까지의 합: %d \n", second.length, sum);
		
		//3. 4과목의 성적을 반복문으로 키보드로 입력받아 배열요소에 저장하고,
		//   성적에 대한 평균점수를 90점 이상 A학점, 80점 이상 B학점
		//   ,70점 이상 C학점, 60점 이상 D학점 그 외는  F학점으로 출력
		//   반복문과 if 문을 사용하여 작성
		Scanner sc = new Scanner(System.in);
		int score[] = new int[4];
		String subject[] = {"국어", "영어", "수학", "과학"};
		//index  0  1  2  3
		//과목번호  1  2  3  4
		sum = 0;
		for(int idx=0; idx<score.length; idx++) {
			System.out.println( subject[idx] + " 과목의 성적을 입력하세요");
//			System.out.println( (idx+1) + " 과목의 성적을 입력하세요");
//			int test = sc.nextInt();
//			score[idx] = test;
			score[idx] = sc.nextInt();
			//sum = sum + score[idx];
			sum += score[idx];
			System.out.printf("%s성적: %d \n", subject[idx], score[idx] );
		}
		
		//int average = sum / score.length;
		double average = sum / (double)score.length;
		char grade;
		if( average >= 90 )
//			System.out.println(average + "점은 A학점");
			//System.out.printf("평균 %.1f 점은 A학점 \n", average);
			grade = 'A';
		else if( average >= 80 )
//			System.out.println(average + "점은 B학점");
			grade = 'B';
//			System.out.printf("평균 %.1f 점은 B학점 \n", average);
		else if( average >= 70 )
			grade = 'C';
//			System.out.println(average + "점은 C학점");
//			System.out.printf("평균 %.1f 점은 C학점 \n", average);
		else if( average >= 60 )
			grade = 'D';
//			System.out.println(average + "점은 D학점");
//			System.out.printf("평균 %.1f 점은 D학점 \n", average);
		else {
			grade = 'F';
//			System.out.printf("평균 %.1f 점은 F학점 \n", average);
//			System.out.println(average + "점은 F학점");
		}
		System.out.printf("평균 %.1f 점은 %c학점 \n", average, grade);
		sc.close();
		
		//4. 다음의 배열 데이터에서 최대값과 최소값을 찾아서 출력하는  프로그램을 작성
		//   반복문과  if문 사용하여 작성
		int[] no = {5, 2, 1, 10, 17, 20, 0, 30, 28, -5};
		//max  5  5  10  17
		//min  2  1  1   1
		int max = no[0], min = no[0];
//		if( no[0] < no[1] ) {
//			min = no[0];
//			max = no[1];
//		}else {
//			min = no[1];
//			max = no[0];
//		}
//		for(int i=2; i<no.length; i++) {
//			
//		}
			
		//       0   1    2    3   4    5      6    7     8    9
        //max 	5<5 5<2  5<1 5<10 10<17	17<20 20<0 20<30 30<28 30<-5
		//    5  5  5    5    10  17    20    20   30    30    30
		//min판단 5>5 5>2 2>1  1>10 1>17 1>20   1>0  0>30  0>28  0>-5
		//min 5  5   2   1   1    1     1      0   0     0     -5
		for(int idx=0; idx<no.length; idx++) {
			if( max < no[idx] ) {
				max = no[idx];
			}else if( min > no[idx] ) {
				min = no[idx];
			}
		}
		System.out.println("최대값: "+ max + ", 최소값: " + min);
		
	}
}
