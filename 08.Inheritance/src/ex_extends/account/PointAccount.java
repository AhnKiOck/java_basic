package ex_extends.account;

public class PointAccount extends Account {
	//예금하는 금액에 대해 0.1% 포인트가 누적되는 통장
	int point;
	PointAccount(String accountNo, String owner){
		super(accountNo, owner);
	}
	PointAccount(String accountNo, String owner, int balance){
		super(accountNo, owner, balance);
		point += (balance * 0.001); 
	}
	
	//입금한다
	//메소드오버라이딩시 서브클래스에서 오버라이딩된 메소드에서 
	//수퍼클래스의 메소드를 호출할때 super.메소드명() 호출한다
	void deposit(int amount) {
		super.deposit(amount);
//		balance += amount;
		point += balance * 0.001;
	}
}
