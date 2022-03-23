package library;

//부록 CD
public class AppendixCD extends CD implements Lendable{
	String borrower, checkOutDate;
	byte cdState;
	
	AppendixCD(String registrationNo, String title){
		super(registrationNo, title);
	}
	
	public void checkOut(String borrower, String checkOutDate)
			throws Exception {
		if( cdState==STATE_BORROWED ) 
				throw new Exception("["+ title +"] 대출중이라 대출불가");
		this.borrower = borrower;
		this.checkOutDate = checkOutDate;
		this.cdState = STATE_BORROWED;
		System.out.println("["+ title +"] CD가 대출되었습니다");
		System.out.println("대출인: " + borrower);
		System.out.println("대출일자: " + checkOutDate);
	}
	public void checkIn() {
		cdState = STATE_NORMAL;
		checkOutDate = null;
		borrower = null;
		System.out.println("["+ title +"] 반납되었습니다.");
	}
	
}
