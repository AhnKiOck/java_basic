package map;

import java.util.HashMap;

public class HashMapMain01 {
	public static void main(String[] args) {
		//HashMap<K, V>
		//학생의 성적을 자료구조로 관리해 본다
		HashMap<String, Integer> map 
				= new HashMap<String, Integer>();
		//16개의 상자를 갖는다
		//데이터 저장: put( 키, 데이터 )
		map.put("홍길동", 95); //AutoBoxing
		map.put("심청", 100);
		map.put("박문수", 85);
		map.put("전우치", 93);
		
		//데이터 조회: get(키)
		Integer score = map.get("심청");
		System.out.println("심청의 성적: " + score);
		
		//데이터 삭제: remove(키)
		map.remove("박문수");
		score = map.get("박문수");
		System.out.println("박문수의 성적: " + score);
		
		
		//데이터 변경: put(키, 데이터)
		map.put("심청", 99);
		score = map.get("심청");
		System.out.println("심청의 성적: " + score);
		
		
	}
}
