
public class AccountMain02 {
	public static void main(String[] args) {
		try {
			Account park = new Account("111-22-3333", "박문수", 50000);
			System.out.printf("%s 계좌[%s] 잔액: %d \n"
					 , park.owner, park.accountNo, park.balance);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
		try {
			Account jeon = new Account("222-33-4444", "전우치", -50000);
			System.out.printf("%s 계좌[%s] 잔액: %d \n"
					, jeon.owner, jeon.accountNo, jeon.balance);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
