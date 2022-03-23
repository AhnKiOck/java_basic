package ex_poly.account;

//abstract public class Account {
public class Account {
	//계좌번호,예금주,잔고
	String accountNo, owner;
	int balance;
	
//	Account(){
//		System.out.println("Account 생성자");
//	}
	Account(String accountNo, String owner){
		this.accountNo = accountNo;
		this.owner = owner;
	}
	Account(String accountNo, String owner, int balance){
		this(accountNo, owner);
		this.balance = balance;
	}
	
	//출금한다
	protected int withdraw(int amount) throws Exception {
		if( balance < amount ) 
				throw new Exception("잔고부족으로 출금불가!");
		balance -= amount;
		return amount;
	}
	//입금한다
	void deposit(int amount) {
		balance += amount;
	}
}
