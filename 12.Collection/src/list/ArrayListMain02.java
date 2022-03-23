package list;

import java.util.ArrayList;

public class ArrayListMain02 {
	public static void main(String[] args) {
		// int 타입의 데이터를 자료구조로 관리
		ArrayList<Integer> list = new ArrayList<Integer>();
		Integer no = new Integer(10);
		list.add( no );
		list.add( new Integer(20) );
		int su = 30;
		list.add( su );  //int -> Integer : AutoBoxing
		list.add( 40 ); 
		for(int idx=0; idx<list.size(); idx++) {
			Integer data = list.get(idx);
			int value = data; //Integer -> int : Unboxing
			System.out.println( list.get(idx) );
		}
		
		list.get(10);
		
		
		String s1 = "10";
		String s2 = "20";
		// s1 + s2 1020
		//String -> int
		//Integer.parseInt :  int 타입으로 리턴
		//Integer.valueOf : Integer 타입으로 리턴
		
		int no1 = Integer.parseInt(s1);
		Integer no2 = Integer.valueOf(s2);
		int no3 = no2; //Integer -> int : Unboxing
		
		Integer no4 = no1; //int -> Integer : AutoBoxing
		
	}
}
