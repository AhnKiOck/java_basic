package multi;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServerMain {
	public static void main(String[] args) {
		ServerSocket server = null;
		Socket client = null;
		
		try {
			server = new ServerSocket(9001);
			System.out.println("서버준비완료");
			
			while( true ) {
				client = server.accept();
				System.out.printf("클라이언트[%s][%s] 연결완료\n"
							, client.getInetAddress()
							, client.getInetAddress().getHostName() );
				
				//클라이언트로부터 받은 메시지를 모든 클라이언트에게 송신
				MultiClientThread send 
						= new MultiClientThread(client);
				send.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
