package multi;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MultiClientMain {
	public static void main(String[] args) {
		System.out.println("대화자명: " + args[0]);
		Socket client = null;
		try {
			client = new Socket("192.168.4.50", 9001);
			//서버에 메시지를 송신
			Thread send = new MultiSendThread( client, args[0] );
			//서버로부터 받은 메시지를 수신
			Thread receive = new MultiReceiveThread( client );
			
			send.start();
			receive.start();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
