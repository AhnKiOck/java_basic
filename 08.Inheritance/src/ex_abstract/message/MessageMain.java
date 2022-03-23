package ex_abstract.message;

public class MessageMain {
	public static void main(String[] args) {
		EmailSender email 
		= new EmailSender(
			"생일을 축하합니다", "고객센터"
			, "10% 할인쿠폰이 발행되었습니다.", "admin@hrd.go.kr");
		
		SMSSender sms
		= new SMSSender("생일을 축하합니다", "고객센터"
			, "10% 할인쿠폰이 발행되었습니다.", "02-1234-7887");
		
		email.sendMessage("hong@naver.com");
		sms.sendMessage("010-5678-9876");
		
	}
}
