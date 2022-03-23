package ex_abstract.message;

//	메시지발송 클래스
abstract public class MessageSender {
//	제목, 발송자이름, 메시지내용
	String title, senderName, message;
	
	MessageSender(String title, String senderName, String message){
		this.title = title;
		this.senderName = senderName;
		this.message = message;
	}
	
//	메시지를 보낸다
	//이메일로 메시지를 보내는 처리와 문자로 메시지를 보내는 처리가 서로 다르므로
	//메소드 본체에 구체적으로 로직을 구현할 수 없다
	abstract void sendMessage(String receiver);
}
