
//은행계좌 클래스
public class Account {
	//직접 필드, 메소드 선언하기
	//필드: 계좌번호, 예금주, 잔액
	//111-22-3333
	//필드는 초기화하지 않아도   초기값을 갖고 있다.
	//데이터타입에 맞는   default 값을 갖는데
	//수치형타입: 0, 논리형(boolean): false, reference타입: null
	String accountNo, owner;
	int balance;
	
	//default생성자
	Account(){}
	
	//파라미터2개짜리 생성자 선언, 모든 필드를 초기화하는 생성자 선언
	Account(String accountNo, String name){
		this.accountNo = accountNo;
		owner = name;
	}
	Account(String no, String name, int money) throws Exception{
		//생성자에서 생성자 호출시
		//반드시 생성자 호출문부터 선언한다.
		this(no, name);
		//통장객체 생성시(통장 개설시) 잔액이 마이너스인 통장은 개설 불가(객체생성불가)
		if( money < 0 ) throw new Exception("통장객체 생성 불가");
//		accountNo = no;
//		owner = name;
		balance = money;
	}
	
	
	//메소드: 예금한다. 출금한다
	//예금: 입금한 금액만큼 잔액이 증가.
	void deposit(int money) {
		//balance = balance + money;
		//if( money > 0) return;
		balance += money;
	}
	//출금: 출금한 금액만큼 잔액이 감소
	int withdraw(int money) throws Exception {
		//잔고보다 출금요청액이 크면 돈은 출금되지 않는다
		//강제로 익셉션을 발생시킨다: throw new Exception()
		//이런 처리가 되어 있는 메소드는 반드시 익셉션을 호출한곳으로 던지는 처리를 한다.
		//메소드 본체 시작 전에  throws Exception 을 지정
		if( balance < money ) 
				throw new Exception("잔고부족으로 출금불가!");
//		if( balance < money ) return 0;
//		if( balance < money ) money = 0;
		balance -= money;
		return money;
	}
}
