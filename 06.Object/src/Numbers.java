//정수형 배열변수에 대해 배열의 합계와 평균을 구하는 클래스
public class Numbers {
	int no[];
	
	Numbers( int[] no ){
		this.no = no;
	}
	
	//합계를 구한다
	int getTotal() {
		int sum = 0;
		//일반  for문 
		//for(int idx=0; idx<no.length; idx++) {
		//	sum += no[idx];
		//}
		//향상된 for문
		//for( 새로운 변수선언 : 배열변수 ) {
		//}
		for(int item : no) {
			sum += item;
		}
		return sum;
	}
	
	//평균을 구한다
	int getAverage() {
		//평균 : 합계 / 갯수 
		int avg = getTotal() / no.length;
		return avg;
	}
	
}




