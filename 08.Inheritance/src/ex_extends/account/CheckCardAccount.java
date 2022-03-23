package ex_extends.account;

public class CheckCardAccount extends Account{
	//예금주, 계좌번호, 잔고, 카드번호
	String cardNo;
	
//	CheckCardAccount(){
//		//this: 현재 객체 자신
//		//수퍼클래스의 생성자호출: super
//		super();
//		System.out.println("CheckCardAccount 생성자");
//	}
	
	CheckCardAccount(String accountNo, String owner, String cardNo){
		//수퍼클래스의 생성자 호출이 이루어져야 함.
		//생성자 호출문 부터 작성한다
		super(accountNo, owner);
//		this.accountNo = accountNo;
//		this.owner = owner;
		this.cardNo = cardNo;
	}
//	Account(String accountNo, String owner){
//		this.accountNo = accountNo;
//		this.owner = owner;
//	}
//	Account(String accountNo, String owner, int balance){
//		this(accountNo, owner);
//		this.balance = balance;
//	}
	CheckCardAccount(String accountNo, String owner
						, String cardNo, int balance){
		this(accountNo, owner, cardNo);
		this.cardNo = cardNo;
	}
//	CheckCardAccount(String accountNo, String owner
//			, String cardNo, int balance){
//		super(accountNo, owner, balance);
//		this.cardNo = cardNo;
//	}
	
	
	
	//입금한다. 출금한다.
	
	//지불(결제)한다.
	//체크카드번호와 계좌에 연결된 카드번호가 일치하면 결제금액을 잔고에서 빼서 지불됨
	int pay(String cardNo, int amount) throws Exception {
		if( ! cardNo.equals(this.cardNo) ) {
			throw new Exception("결제불가 카드!");
		}
//		if( balance < amount ) {
//			throw new Exception("잔고부족으로 결제불가!");
//		}
//		balance -= amount;
//		return amount;
		return withdraw(amount);
	}
	
	
}
