package ex_extends.account;

public class MinusAccount extends Account{
	//예금주, 계좌번호, 잔고, 마이너스한도금액
	int minusLimit;
//	Account(String accountNo, String owner){
//		this.accountNo = accountNo;
//		this.owner = owner;
//	}
//	Account(String accountNo, String owner, int balance){
//		this(accountNo, owner);
//		this.balance = balance;
//	}
	MinusAccount(String accountNo, String owner, int minusLimit){
		super(accountNo, owner);
		this.minusLimit = minusLimit;
	}
	MinusAccount(String accountNo, String owner
					, int minusLimit, int balance){
//		super(accountNo, owner, balance);
//		this.minusLimit = minusLimit;
		
		this(accountNo, owner, minusLimit);
		this.balance = balance;
	}
	//입금한다. 출금한다.
	//출금한다
//	int withdraw(int amount) throws Exception {
//		if( balance < amount ) 
//				throw new Exception("잔고부족으로 출금불가!");
//		balance -= amount;
//		return amount;
//	}
	//메소드 오버라이딩(overriding)
	//: 상속관계가 있을때 수퍼클래스의 메소드를
	//  서브클래스에 메소드의 시그니처가 동일한 메소드를 재선언(재정의)하는 것

	// 메소드 오버라이딩 시 서브클래스의 메소드의 접근제한자를
	// 수퍼클래스의 접근제한자와 같거나 더 넓은 범위를 허용하는 접근제한자만 지정가능
	public int withdraw(int amount) throws Exception {
		if( balance+minusLimit < amount ) 
				throw new Exception("잔고부족으로 출금불가!");
		balance -= amount;
		return amount;
	}
	
//	//입금한다
//	void deposit(int amount) {
//		balance += amount;
//	}
	
}
