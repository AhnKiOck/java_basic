package mail;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class EmailSender {
	//이메일 송신자 정보
	String email, password, name;
	EmailSender(String email, String password, String name ){
		this.email = email; //"ojink2@naver.com"
		this.password = password;
		this.name = name;
	}
	
	//파일첨부이메일전송
	void sendAttach(String email, String name) {//메일수신자 정보
		MultiPartEmail mail = new MultiPartEmail();
		
		mail.setHostName("smtp." 
				+ this.email.substring(this.email.indexOf("@")+1));
		mail.setCharset("utf-8");
		mail.setDebug(true);
		
		
		mail.setAuthentication(this.email, this.password);
		mail.setSSLOnConnect(true);
		
		try {
			mail.setFrom(this.email, this.name);
			mail.addTo(email, name);
			
			mail.setSubject("생일 축하 메시지-첨부파일확인요망");
			mail.setMsg(name + "님 생일 축하합니다 \n 생일 쿠폰 발급되었습니다\n 쿠폰함을 확인하세요");

			//파일첨부하기
			EmailAttachment file = new EmailAttachment();
			file.setPath("E:\\2021\\11\\10\\연락처.html"); //첨부파일선택
			mail.attach(file); //첨부하기버튼클릭
			
			file = new EmailAttachment();
			file.setURL( new URL("https://imgnews.pstatic.net/image/008/2021/11/16/0004670950_001_20211116100801036.jpg?type=w647") );
			mail.attach(file);

			mail.send();
			
		} catch (EmailException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}
	
	//기본이메일전송
	void sendEmail(String email, String name) {
		//메일수신자 정보
		
		//이메일 전송객체 생성
		SimpleEmail mail = new SimpleEmail(); 
		
		//메일서버지정: smtp.naver.com  smtp.gmail.com
		mail.setHostName( "smtp." +
			this.email.substring( this.email.indexOf("@")+1 ) );
		mail.setCharset("utf-8");
		mail.setDebug(true);
		
		//로그인하기 위한 아이디/비번 지정
		mail.setAuthentication(this.email, this.password);
		//로그인버튼클릭하여 로그인처리
		mail.setSSLOnConnect(true);
		
		try {
			//메일송신자 지정
			mail.setFrom(this.email, this.name);

			//메일수신자 지정
			mail.addTo(email, name);
//			mail.addTo("email주소", "이름");
			
			//메일제목
			mail.setSubject("생일 축하 메시지");
			//메일내용
			mail.setMsg(name + "님 생일 축하합니다! \n"
						+ "생일 쿠폰이 발급되었으니 \n"
						+ "당사 사이트 쿠폰함을 확인하세요~");
			//메일보내기버튼 클릭
			mail.send();
			
		} catch (EmailException e) {
			e.printStackTrace();
		}
	}
}
