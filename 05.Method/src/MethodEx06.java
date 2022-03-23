
public class MethodEx06 {
	
	//두 정수 사이의 정수를 출력하는 메소드를 선언
	static void betweenNumbers(int no1, int no2) {
		//1, 5 -> 1,2,3,4,5
		if( no1 > no2 ) {
			//5, 1
			for(int i=no1; i>=no2; i--) {
				System.out.print( i + " ");
			}	
		}else {
			for(int i=no1; i<=no2; i++) {
				System.out.print( i + " ");
			}
		}
		System.out.println();
	}
	
	//두 정수 사이의 정수를 반환하는 메소드를 선언
	static String betweenNumbers2(int no1, int no2) {
		String result = "";
		if( no1 > no2 ) {
			int tmp = no1;
			no1 = no2;
			no2 = tmp;
		}
		
		for(int i=no1; i<=no2; i++) {
			//result += i + " ";
			result += (result==""? "" : ", ") + i ;
		}
		//1, 2, 3, 4, 5
		return result;
	}
	
	
	public static void main(String[] args) {
		betweenNumbers(5, 1);
		System.out.println("-------");
		betweenNumbers(5, 15);
		int n1=25, n2=15;
		System.out.println( n1 + " ~ " + n2 + "까지의 수: " 
							+ betweenNumbers2(n1, n2)	);
		
	}
	
}
