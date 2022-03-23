
public class CastingEx {
	public static void main(String[] args) {
		byte no1 = 10; //-128 ~ 127
		int no2 = 10;
		no2 = (int)no1; //byte -> int 담고 있다: 자동형변환
		
		//byte = 1byte = 8bit
		//int = 4byte = 32bit
		//10 = 1010(2) = 1*2^3 + 0*2^2 + 1*2^1 + 0*2^0
		//1byte : 00001010
		//4byte : 00000000 00000000 00000000 00001010
		
		no2 = 50; //int 타입
		no1 = (byte)no2; 
		//int 타입의 그릇에 담긴 데이터를  byte타입의 그릇에 옮겨 담긴다.
		//더 작은 범위의 데이터타입에 더 넓은 범위의 데이터타입의 데이터를 옮겨담으려면
		//데이터 손실이 발생할 수 도 있다.
		//데이터 손실을 감수하더라도 옮겨담으려면 강제형변환(Casting) 해야만 한다.
		
		float no3 = no2; //int -> float
		double no4 = no3; //float -> double :  자동형변환 발생함 
		
		no4 = 3.14;
		System.out.println("double 타입의 no4: " + no4 );
		no2 = (int)no4; // double -> int : 강제형변환 해야 함 - 데이터손실 발생
		System.out.println("int 타입의 no2: " + no2 );
		
		no2 = 130; 
		short no5 = (short)no2; //int -> short: 강제형변환 해야 함
		System.out.println("short 타입의 no5의 130 : " + no5 );
		
		no1 = (byte)130; //-128 ~ 127
		System.out.println("byte 타입의  no1의 130 : " +  no1);
		//128: -128, 129: -127, 130: -126
		
	}
}
