package hello;
import java.net.*;
import java.io.*;
import java.util.*;

public class ClientMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//자신의  IP: localhost / 127.0.0.1 / 192.168.0.50
		Socket client = null;
		DataOutputStream out = null;
		DataInputStream in = null;
		try {
			client = new Socket("127.0.0.1", 9000);
			System.out.println("서버와 연결 완료");
			
			//서버에 메시지 전송하기
//			OutputStream os = client.getOutputStream();
//			//문자열을 쓰기작업
//			DataOutputStream out = new DataOutputStream( os );
			out = new DataOutputStream( client.getOutputStream() );
			in = new DataInputStream( client.getInputStream() );
			
			while( true ) {
				System.out.print("송신메시지> ");
				out.writeUTF( sc.nextLine() );
				out.flush(); //출력스트림 바로 내려보내기
				
				//서버로부터 수신한 메시지 출력
				String msg = in.readUTF();
				System.out.println("수신메시지> " + msg);
				if( msg.equals("bye") ) break;
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try{ out.close(); }catch(IOException e) {}
			try{ client.close(); }catch(IOException e) {}
		}
		
		sc.close();
	}
}
