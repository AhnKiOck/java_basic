package list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("사과");
		list.add("배");
		list.add("귤");
		printFruit(list);
		
		list.add(1, "메론");
		printFruit(list);
		
		list.remove(2);
		printFruit(list);
		
		list.add("바나나");
		printFruit(list);
	}
	static void printFruit(LinkedList<String> list) {
		//마지막으로 읽어온 데이터의 위치를 기억하자
		//그 다음번 데이터를 읽도록하는 기능을 가진 메소드 iterator()
		/*
		Iterator<String> iterator = list.iterator();
		String fruit = iterator.next();
		System.out.println(fruit);
		while( iterator.hasNext() ) {
			System.out.println(iterator.next());
		}
		*/
		for(String fruit : list) {
			System.out.println( fruit );
		}
//		for(int idx=0; idx<list.size(); idx++ ) {
//			System.out.println( list.get(idx) );
//		}
		System.out.println("--------");
	}
}
