package hello;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {
	public static void main(String[] args) {
		ServerSocket server = null;
		DataInputStream in = null;
		DataOutputStream out = null;
		Socket client = null;
		Scanner sc = new Scanner(System.in);
		int portNo = 9000;
		try {
			server = new ServerSocket(portNo);
			System.out.println("서버준비 완료");
			
			//클라이언트로부터의 연결요청을 기다리다 요청이 들어오면
			//클라이언트와 1:1로 통신한 소켓을 하나 생성해서 연결한다
			client = server.accept();
			System.out.println("클라이언트와 연결 완료");
			
			//서버가 클라이언트로부터 연결요청을 받았다는 것은 무언가 데이터를 받았다는 것
			//데이터 입출력은 스트림형태, 소켓간의 데이터의 송수신 바이트타입으로 이루어진다
			//클라이언트용소켓은 외부로부터 들어온 스트림을 읽어들일 준비를 한다
//			InputStream is = client.getInputStream();
//			
//			//문자열 데이터를 주고 받게 되므로 
//			//바이트스트림을 문자열로 읽어들일 수 있는 DataInputStream 사용
//			DataInputStream in = new DataInputStream( is );
			in = new DataInputStream( client.getInputStream() );
			out = new DataOutputStream( client.getOutputStream() );

			while( true ) {
				//클라이언트로부터 수신한 메시지를 읽어서 출력
				String msg = in.readUTF();
				System.out.println("수신메시지> " + msg);
				if( msg.equals("bye") ) break;
				
				//서버도 클라이언트에게 메시지 보내기
				System.out.print("송신메시지> ");
				out.writeUTF( sc.nextLine() );
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try { out.close(); } catch (IOException e) { }
			try { in.close(); } catch (IOException e) { }
			try { client.close(); } catch (IOException e) { }
			try { server.close(); } catch (IOException e) { }
		}
		
	}
}
