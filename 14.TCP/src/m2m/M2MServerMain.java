package m2m;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class M2MServerMain {
	public static void main(String[] args) {
		ServerSocket server = null;
		Socket client = null;
		try {
			server = new ServerSocket(9000);
			System.out.println("서버준비완료");
			
			client = server.accept();
			System.out.println("클라이언트와 연결완료");
			
			//데이터송수신
			//클라이언트로부터 수신
			Thread receive = new M2MReceiveThread( client );
			
			//서버가 클라이언트에게 송신
			Thread send = new M2MSendThread( client );
			
			receive.start();
			send.start();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}
		
		
	}
}
