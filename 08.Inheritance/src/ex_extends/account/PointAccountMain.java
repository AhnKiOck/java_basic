package ex_extends.account;

public class PointAccountMain {
	public static void main(String[] args) {
		PointAccount park 
			= new PointAccount("222-33-4444", "박문수");
		System.out.println("계좌 잔액: "  + park.balance );
		System.out.println("포인트: "  + park.point );
		
		park.deposit(50000);
		System.out.println("계좌 잔액: "  + park.balance );
		System.out.println("포인트: "  + park.point );
		
		
	}
}
