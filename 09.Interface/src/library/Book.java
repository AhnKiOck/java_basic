package library;

public class Book implements Lendable{
	//청구기호, 제목, 저자, 대출인, 대출일자, 대출상태
	String requestSymbol, title, author, borrower, checkOutDate;
	byte bookState; //0:대출가능, 1:대출중
	
	Book(String requestSymbol, String title, String author){
		this.requestSymbol = requestSymbol;
		this.title = title;
		this.author = author;
	}
	
	public void checkOut(String borrower, String checkOutDate) 
					throws Exception {
		if( bookState==STATE_BORROWED ) { 
			//return; //대출중이면 리턴
			throw new Exception( "[" + title + "] 대출중이라 대출불가");
		}
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		this.bookState = STATE_BORROWED;
		System.out.println( "[" + title + "] 대출되었습니다");
		System.out.println( "대출인: " + borrower);
		System.out.println( "대출일자: " + checkOutDate);
	}
	
	public void checkIn() {
		//대출정보를 초기화
		borrower = null;
		checkOutDate = null;
		bookState = STATE_NORMAL;
		System.out.println("[" + title + "] 반납되었습니다.");
	}
	
}
