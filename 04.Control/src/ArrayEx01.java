
public class ArrayEx01 {
	public static void main(String[] args) {
		int no1 = 5;
		int no2 = 10;
		int no3 = 15;
		int no4 = 20;
		int no5 = 25;
		
		// 1. 배열변수 선언
		// 데이터타입 배열변수명[];
		// 데이터타입[] 배열변수명;
		int no[];
		int[] arr;
		
		// 2. 배열생성식 - index 를 갖는데 0부터 시작 ~ 배열의길이-1
		// new 배열변수의 데이터타입[갯수];
		no = new int[5];
		
		// 3. 배열변수의 초기화
		//    인덱스를 통해 데이터를 초기화한다.
		no[0] = 5;
		no[1] = 3;
		no[2] = 2;
		no[3] = 7;
		no[4] = 84;
		for( int i=0; i<no.length; i++ ) {
			System.out.println( no[i] );
		}
		
		//5의 배수의 데이터를 5*1 의 값부터 5*5 까지의 값을 
		//no 라는 배열변수에 대입하라
		for( int i=0; i<no.length; i++ ) {
			no[i] = 5 * (i+1); 
		}
	
		
		//index     0->1   1->2    2->3    3->4   4->5
		//no[index] 5:5*1   10:5*2   15:5*3   20:5*4  25:5*5   
		//          5*어떤수 : 5*(index+1)
		
		for(int idx=0; idx<no.length; idx++) {
			no[idx] = 5*(idx+1);
		}
		for(int idx=1; idx<=no.length; idx++) {
			no[idx-1] = 5*idx;
		}
		
		
		//1. 배열변수 선언과 생성
		//int arr1[] = new int[5];
		int[] arr1 = new int[5];
		//2. 배열변수 초기화
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		arr1[4] = 5;
	
		//1. 배열변수 선언과 함께 초기화
		int arr2[] = { 10, 20, 30 };
		System.out.println( "arr2[0]: " + arr2[0] );
		System.out.println( "arr2[1]: " + arr2[1] );
		System.out.println( "arr2[2]: " + arr2[2] );
	
		//배열변수는 길이를 갖는다:  length
		System.out.println("no 배열변수 길이: " + no.length );
		System.out.println("arr2 배열변수 길이: " + arr2.length );
		
		System.out.println( "no 배열변수 주소: " + no );
		System.out.println( "arr2 배열변수 주소: " + arr2 );
	
		
	}
}












