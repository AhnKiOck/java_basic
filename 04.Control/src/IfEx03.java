
public class IfEx03 {
	public static void main(String[] args) {
		//두 수 중 어떤 수가 더 큰 수 인지 판단하여 출력
		int no1 = 45, no2 = 25;
		if( no1 > no2 ) { //45 > 25 : T
			System.out.printf("%d는 %d 보다 더 큰 수 \n", no1, no2);
		}else if( no1 < no2 ) { 
			System.out.printf("%d는 %d 보다 더 작은 수 \n", no1, no2);
		}else {
			System.out.printf("%d 와 %d 는 같은 수 \n", no1, no2);
		}
		
		if( no1 > no2 ) {//45 > 25: T
			System.out.printf("%d는 %d 보다 더 큰 수 \n", no1, no2);
		}
		if( no1 < no2 ) {//45 < 25: F
			System.out.printf("%d는 %d 보다 더 작은 수 \n", no1, no2);
		}
		if( no1 == no2 ){//45 == 25 : F
			System.out.printf("%d 와 %d 는 같은 수 \n", no1, no2);
		}
		
		//if ~ else if ~ else 를 if ~ else  만으로 표현할 수도 있다.
		if( no1 > no2 ) {//15 > 25: F
			System.out.printf("%d는 %d 보다 더 큰 수 \n", no1, no2);
		}else { // <=
			if( no1 < no2 ) {//15 < 25: T
				System.out.printf("%d는 %d 보다 더 작은 수 \n", no1, no2);
			}else {
				System.out.printf("%d 와 %d 는 같은 수 \n", no1, no2);
			}
		}
		
		if( no1 > no2 ) {//15 > 25: F
			System.out.printf("%d는 %d 보다 더 큰 수 \n", no1, no2);
		}else { // <=
			if( no1 < no2 ) {//15 < 25: T
				System.out.printf("%d는 %d 보다 더 작은 수 \n", no1, no2);
			}else if( no1 == no2 ){
				System.out.printf("%d 와 %d 는 같은 수 \n", no1, no2);
			}
		}
		
		System.out.println("Finished.");
	}//main  끝
}//class 끝
