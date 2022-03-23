package ex_access.account;

class Account {
	String accountNo, owner;
	int balance;
	
	private Account(String accountNo, String owner){
		this.accountNo = accountNo;
		this.owner = owner;
	}
	Account(String accountNo, String owner, int balance){
		this(accountNo, owner);
//		this.accountNo = accountNo;
//		this.owner = owner;
		this.balance = balance;
	}
	
}
