package library;

public class LibraryMain02 {
	public static void main(String[] args) {
		Lendable list[] = new Lendable[4];
		
		list[0] = new Book("883ㅇ32ㅍ2", "푸코의 진자", "움베르토 에코");
		list[1] = new Book("609.2ㄱ428ㅅ", "서양미술사", "곰브르치");
		list[2] = new Book("863?ㅂ774개", "개미", "베르나르 베르베르");
		list[3] = new AppendixCD("2021-1742", "자바프로그래밍 CD");
//		Lendable book1 = new Book("883ㅇ32ㅍ2", "푸코의 진자", "움베르토 에코");
//		Lendable book2 = new Book("609.2ㄱ428ㅅ", "서양미술사", "곰브르치");
//		Lendable book3 = new Book("863?ㅂ774개", "개미", "베르나르 베르베르");
//		Lendable cd1 = new AppendixCD("2021-1742", "자바프로그래밍 CD");

		//홍길동씨가 4개의 자료를 같은 날 대출한다
//		list[0].checkOut("홍길동", "2021-11-02");
//		list[1].checkOut("홍길동", "2021-11-02");
//		list[2].checkOut("홍길동", "2021-11-02");
//		list[3].checkOut("홍길동", "2021-11-02");
		checkOutAll( list, "홍길동", "2021-11-02" );
	}
	
	static void checkOutAll(Lendable[] list
							, String borrower, String date) {
		// 다형성에 의해 상속받는 수퍼클래스, 구현하는 인터페이스의 타입으로
		// 표현한다고 해서 생성된 객체 자체의 데이터타입이 바뀌지는 않는다
		for(int idx=0; idx<list.length; idx++) {
			try {
				list[idx].checkOut(borrower, date);
				//생성된 객체가 도서 라면 청구기호, 저자 정보를 확인할 수 있다
	//			list[idx].requestSymbol
	//			list[idx].author
	//			list[idx].borrower
	//			list[idx].checkOutDate
	//			list[idx].cdState
				
				if( list[idx] instanceof Book ) {
					Book book = (Book)list[idx];
					System.out.println("청구기호:"+ book.requestSymbol );
					System.out.println("저자:"+ book.author );
				}else if( list[idx] instanceof AppendixCD ) {
					AppendixCD cd = (AppendixCD)list[idx];
					System.out.println("CD대출상태: " + cd.cdState);
				}
				System.out.println();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
