
public class ExceptionEx02 {
	public static void main(String[] args) {
		int no[] = {5, 4, 3, 2, 1, 0}; //no.length: 3

		//100이란 수를 no의 각 요소로 나눗셈 연산을 한다
		//idx 0     1       ...  5      6          7
		//100/5:20  100/4:25     100/0  100/no[6]  100/no[7] 
		for( int idx=0; idx<10; idx++ ) {
			try {
				int result = 100 / no[idx];
				System.out.println("100 / " + no[idx] + ": " + result);
			}catch(java.lang.ArithmeticException e) {
				System.out.println(e.getMessage() 
							+ ": 숫자는 0으로 나눌수 없음");
			}catch(java.lang.ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage() 
							+ ": 인덱스범위 벗어남");
			}
		}
		
		
		
		
		
		System.out.println("-------------");
		//0         1          2          3<=3:T
		//no[0]출력   no[1]출력      no[2]출력     no[3]출력
		for(int idx=0; idx<=no.length; idx++) {
			try {
				System.out.println( no[idx] );
			}catch(java.lang.ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
				System.out.println("인덱스범위를 벗어났음");
			}
		}
		System.out.println("-------------");
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
