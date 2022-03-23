
public class MethodEx08 {
	public static void main(String[] args) {
		//학생들의 성적에 대한 평균과 학점을 출력
		//박문수, 홍길동, 전우치 4과목성적
		int hong[] = { 81, 90, 87, 95 };
		int[] park = { 97, 94, 85, 89 };
		int jeon[] = { 78, 82, 72, 76 };
		
		//박문수씨 성적의 평균
		printAverageAndGrade("박문수", park);
//		double average = averageOfScore(park);
//		char grade = gradeOfAverage(average);
//		System.out.printf("박문수씨: %.1f점  %c학점 \n", average, grade);
		
		//홍길동씨 성적의 평균
		printAverageAndGrade("홍길동", hong);
//		average = averageOfScore(hong);
//		grade = gradeOfAverage(average);
//		System.out.printf("홍길동씨: %.1f점  %c학점 \n", average, grade);
		
		//전우치씨 성적의 평균
		printAverageAndGrade("전우치", jeon);
//		average = averageOfScore(jeon);
//		grade = gradeOfAverage(average);
//		System.out.printf("전우치씨: %.1f점  %c학점 \n", average, grade);
	}
	
	static void printAverageAndGrade(String name, int[] score) {
		double average = averageOfScore(score);
		char grade = gradeOfAverage(average);
		System.out.printf("%s씨: %.1f점  %c학점 \n", name, average, grade);
	}
	
	//평균에 대한 학점을 리턴하는 메소드
	static char gradeOfAverage(double average) {
		char grade;
		if( average >= 90 ) {
			grade = 'A';
		}else if( average >= 80 ) {
			grade = 'B';
		}else if( average >= 70 ) {
			grade = 'C';
		}else if( average >= 60 ) {
			grade = 'D';
		}else {
			grade ='F';
		}
		return grade;
	}
	
	//성적에 대한 평균을 리턴하는 메소드
	static double averageOfScore( int[] score ) {
		int sum = 0;
		for( int idx=0; idx<score.length; idx++ ) {
			//sum = sum + score[idx];
			sum += score[idx];
		}
//		double average = (double)sum / score.length;
//		return average;
		return  (double)sum / score.length;
	}
	
}
