
public class ArrayEx04 {
	public static void main(String[] args) {
		//10, 20, 30, 40 데이터를 배열변수에 담는다.
		//int no[] = new int[4];
		//int no[];
		int[] no;
		no = new int[4];
//		int[] no1 = new int[4];
		
//		int n1;
//		n1 = 10;
//		int n2 = 10;
//		no[0] = 10; //10*1: 10*(index+1)
//		no[1] = 20; //10*2
//		no[2] = 30; //10*3
//		no[3] = 40; //10*4
		
		for( int idx=0; idx<no.length; idx++) {
			no[idx] = 10*(idx+1);
			System.out.printf("no[%d]: %d \n", idx, no[idx]);
		}
		for( int idx=0; idx<no.length; idx++) {
			System.out.printf("no[%d]: %d \n", idx, no[idx]);
		}
		System.out.println("---------");
		for( int idx=no.length-1; idx>=0; idx--) {
			System.out.printf("no[%d]: %d \n", idx, no[idx]);
		}
		System.out.println("---------");
		
		System.out.println("----------");
		int i=0;
		for(int value : no) {
			System.out.printf("no[%d]: %d \n", i++, value );
		}
		//10 + 20 + 30 + 40
		//no 에 담긴 데이터의 합을 구하여 출력한다.
		//일반적인  for문
		int sum = 0;
		for(int idx=0; idx<no.length; idx++) {
			//sum = sum + no[idx];
			sum += no[idx];
		}
		System.out.println("합: " + sum);
		
		//향상된  for문으로 no 에 담긴 데이터의 합을 구하여 출력한다
		sum = 0;
		for( int value : no ) {
			//sum = sum + value;
			sum += value;
		}
		System.out.println("합: " + sum);
		
		
	}
}
