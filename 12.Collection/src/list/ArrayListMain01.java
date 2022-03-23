package list;

import java.util.ArrayList;

public class ArrayListMain01 {
	public static void main(String[] args) {
		String data[] = new String[10];
		//data[0] = "문자1";
		//data[1] = null;
		//data[9] = "문자10";
		//
		//자료구조 ArrayList 로 문자열 데이터를 관리하고자 한다
		ArrayList<String> list 
				= new ArrayList<String>();
		//저장: add
		list.add( "사과" );
		list.add( "배" );
		list.add( "귤" );
		System.out.println("저장된 데이터의 갯수: " + list.size());
		
		//조회: get(인덱스)
		printFruit(list);
		
		//삽입저장: add(위치, 데이터)
		list.add(1, "메론");
		printFruit(list);
	
		//변경저장: set(위치, 데이터)
		list.set(2, "포도");
		printFruit(list);
		
		list.add( "딸기" );
		printFruit(list);
	
		//삭제: remove(위치)
		list.remove(1);
		printFruit(list);

		list.add("귤");
		printFruit(list);
		
		//삭제: remove(데이터) - 일치하는 첫번째 데이터만 삭제됨
//		list.remove("귤");
//		printFruit(list);
		
		//일치하는 모든 데이터를 삭제하고자 할때는 
		for(int idx=0; idx<list.size(); idx++) {
			if( list.get(idx).equals("귤") ) {
				list.remove(idx);
			}
		}
		printFruit(list);
		
		//데이터의 위치 찾기: indexOf(데이터)
		int idx = list.indexOf("포도");
		System.out.println("포도의 위치: " + idx);
	}
	
	static void printFruit(ArrayList<String> list) {
		for(int idx=0; idx<list.size(); idx++ ) {
			String fruit = list.get(idx);
			System.out.println( fruit );
		}
		System.out.println("---------");
	}
	
	
}
