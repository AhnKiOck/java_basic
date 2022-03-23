package m2m;
import java.io.IOException;
import java.net.*;

public class M2MClientMain {
	public static void main(String[] args) {
		Socket client = null;
		
		try {
			client = new Socket("192.168.1.157", 9000);
			System.out.println("서버와연결 완료");
			
			//클라이언트가 서버에게 송신하는 쓰레드
			Thread send = new M2MSendThread( client );
			//서버로부터의 메시지를 수신하는 쓰레드
			Thread receive = new M2MReceiveThread( client );
			send.start();	
			receive.start();	
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
