
public class ArrayEx05 {
	public static void main(String[] args) {
		int no[][] = new int[2][3]; //2행3열
//		1(1,1):no[0][0]	2(1,2):no[0][1]	3(1,3):no[0][2]
//		4(2,1):no[1][0]	5(2,2):no[1][1]	6(2,3):no[1][2]
		//1행
		no[0][0] = 1;
		no[0][1] = 2;
		no[0][2] = 3;
		//2행
		no[1][0] = 4;
		no[1][1] = 5;
		no[1][2] = 6;

//		int arr1[][] = new int[2][3]; 의 형태 - 2행3열
		int arr1[][] = { {11, 12, 13}, {21, 22, 23} }; 
//		int arr2[][] = new int[3][2]; 의 형태 - 3행2열
		int[][] arr2 = { {11, 12}, {21, 22}, {31, 32} };
		
		System.out.println("행의 길이: "+ arr1.length + "행");
		System.out.println("1행의 길이: " + arr1[0].length + "열");
		System.out.println("2행의 길이: " + arr1[1].length + "열");
		System.out.println("행의 길이: "+ arr2.length + "행");
		System.out.println("1행의 길이: " + arr2[0].length + "열");
		System.out.println("2행의 길이: " + arr2[1].length + "열");
		
		//각 행마다 열의 갯수가 동일한 형태 : 정방형
		//2차원 배열 arr1 의 데이터 출력하기(2행3열)
		//row: 0         1
		//col: 0 1 2     0 1 2
		for( int row=0; row<arr1.length; row++ ) {
			//1행 : {11, 12, 13} -3열
			for( int col=0; col<arr1[row].length; col++ ) {
				System.out.printf("%d행 %d열: %d \n"
								, row+1, col+1, arr1[row][col]);
			}
		}
		
		
		//각 행마다 열의 갯수가 다른 형태 : 비정방형
		int arr3[][] 
			= { {11, 12, 13}, {21, 22}, {31, 32, 33, 34} }; 
			//3행: 1행3열, 2행2열, 3행4열
		
		for( int row=0; row<arr3.length; row++ ) {
			for( int col=0; col<arr3[row].length; col++ ) {
//				System.out.printf("%d행%d열: %d \n"
//								, row+1, col+1, arr3[row][col]);
				System.out.printf("(%d,%d): %d \t"
								, row+1, col+1, arr3[row][col]);
			}
			System.out.println();
			/*
			//1행3열
			for( int col=0; col<arr3[0].length; col++ ) {
			}
			//2행2열
			for( int col=0; col<arr3[1].length; col++ ) {
			}
			//3행4열
			for( int col=0; col<arr3[2].length; col++ ) {
			}
			*/
		}
		System.out.println("------------");
		
		//1차원 배열을 만들어서 2차원배열에 할당할 수 있다
		int n1[] = {1, 2, 3};
		int n2[] = {10, 20, 30, 40};
		int n3[][] = new int[2][];
		n3[0] = n1; 
		n3[1] = n2;
		System.out.printf("n3: %d 행 \n", n3.length);
		
		for( int row=0; row<n3.length; row++ ) {
			for( int col=0; col<n3[row].length; col++ ) {
				System.out.printf("(%d, %d): %d \t"
							, row+1, col+1, n3[row][col] );
			}
			System.out.println();
			/*
			//{1, 2, 3}
			for( int col=0; col<n3[0].length; col++ ) {
			}
			//{10, 20, 30, 40}
			for( int col=0; col<n3[1].length; col++ ) {
			}
			*/
		}
		
		
		
		
		
		
		
	}
}
