package account;

public class Account {
	String accountNo, owner;
	int balance;
	
	Account(String accountNo, String owner, int balance){
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}
	void deposit(int money) {
		balance += money;
	}
	int withdraw(int money) {
		if( balance < money ) return 0;
		balance -= money;
		return money;
	}
}

