package library;

public interface Lendable {
	byte STATE_BORROWED = 1; 	//대출중인 상태
	byte STATE_NORMAL = 0; 		//대출가능한 상태
	
	void checkOut(String borrower, String date) throws Exception;  //대출한다
	void checkIn(); //반납한다
}
