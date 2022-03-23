package ex_poly.message;

public class EmailSender extends MessageSender{
	//발송자 이메일주소
	String senderEmail;
	
	EmailSender(String title, String senderName
					, String message, String senderEmail){
		super(title, senderName, message);
		this.senderEmail = senderEmail;
	}
	
	void sendMessage(String receiver) {
		System.out.println("--- 이메일 발송 ---");
		System.out.println("제목: " + title);
		System.out.println(
			"보내는 이: " + senderName + "["+ senderEmail + "]");
		System.out.println("받는 이: " + receiver);
		System.out.println("이메일 내용: " + message);
		System.out.println("---------------");
	}
}
