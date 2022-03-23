package map;

import java.util.HashMap;

public class HashMapMain02 {
	public static void main(String[] args) {
		//성과 이름을 따로 갖는 학생들의 성적 관리
		HashMap<Name, Integer> map
			= new HashMap<Name, Integer>();
			
		Name hong = new Name("홍", "길동");
		map.put( hong, 100 );
		map.put( new Name("심", "청"), 85 );
		map.put( new Name("박", "문수"), 93 );
		map.put( new Name("전", "우치"), 99 );
		
		
		//심청의 성적 확인
		Integer score = map.get(  new Name("심", "청") );
		System.out.println("심청의 성적: " + score );
		
		String s1 = new String("심청");
		String s2 = new String("심청");
		int hash1 = s1.hashCode();
		int hash2 = s2.hashCode();
		System.out.println(hash1 + " : " + hash2);
		
		Name n1 = new Name("심", "청");
		Name n2 = new Name("심", "청");
		hash1 = n1.hashCode();
		hash2 = n2.hashCode();
		System.out.println(hash1 + " : " + hash2);
		
		
		
		
		
		
	}
}
