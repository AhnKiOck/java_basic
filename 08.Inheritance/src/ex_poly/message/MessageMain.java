package ex_poly.message;

public class MessageMain {
	public static void main(String[] args) {
		EmailSender email
		= new EmailSender("생일 축하합니다", "고객센터"
				, "할인쿠폰이 발송되었습니다", "admin@hrd.go.kr");
		
		SMSSender sms
		= new SMSSender("생일 축하합니다", "고객센터"
				, "할인쿠폰이 발송되었습니다", "1588-7777");
//		email.sendMessage("hong@gmail.com");
//		sms.sendMessage("010-4567-9841");
		send("hong@gmail.com", email);
		send("010-4567-9841", sms);
	}
	
	static void send(String receiver, MessageSender sender) {
		sender.sendMessage(receiver);
	}
	
	//다형성에 의해 EmailSender, SMSSender 객체를 
	//MessageSender  타입으로 선언하더라고
	//객체 자체의 타입이 바뀐 것은 아니다
	
}
