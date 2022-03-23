package library;

public class LibraryMain03 {
	public static void main(String[] args) {
		
		Book book = new Book("883ㅇ32ㅍ2", "푸코의 진자", "움베르토 에코");
		//도서정보확인
		printBookInfo(book);
		
		//홍길동씨가 푸코의진자 도서를 대출했다
		try {
			book.checkOut("홍길동", "2021-11-01");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		//도서정보확인
		printBookInfo(book);
		
		try {
			book.checkOut("전우치", "2021-11-02");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void printBookInfo(Book book) {
		System.out.println("-------------");
		System.out.println("제목: " + book.title);
		if(  book.bookState == Lendable.STATE_BORROWED ) {
			System.out.println("대출상태: 대출중");
			System.out.println("대출인: " + book.borrower );
			System.out.println("대출일자: " + book.checkOutDate );
		}else {
			System.out.println("대출상태: 대출가능");
		}
		System.out.println("-------------");
	}
	
}
