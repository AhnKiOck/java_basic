package ex_poly.message;

public class SMSSender extends MessageSender{
	//발송자 전화번호
	String senderPhone;
	
	SMSSender(String title, String senderName
					, String message, String senderPhone){
		super(title, senderName, message);
		this.senderPhone = senderPhone;
	}
	
	void sendMessage(String receiver) {
		System.out.println("--- 문자 발송 ---");
		System.out.println("제목: " + title);
		System.out.printf(
			"보내는 이: %s [%s] \n", senderName, senderPhone );
//		System.out.println(
//				"보내는 이: " + senderName + "[" + senderPhone + "]");
		System.out.println("받는 이: " + receiver);
		System.out.println("문자 내용: " + message);
		System.out.println("--------------");
	}
}
