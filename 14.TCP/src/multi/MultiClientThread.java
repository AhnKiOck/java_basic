package multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MultiClientThread extends Thread{
	Socket client;
	PrintWriter writer;
//	static ArrayList<PrintWriter> list	
//						= new ArrayList<PrintWriter>() ;
	static List<PrintWriter> list 
			= Collections.synchronizedList( 
					new ArrayList<PrintWriter>() );
	
	MultiClientThread(Socket client){
		this.client = client;
		// 새로운 클라이언트와 연결될때마다 출력스트림을 만들어둔다
		try {
			writer = new PrintWriter( client.getOutputStream() );
			list.add( writer );
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void run() {
		String name = null;
		
		//클라이언트로부터 수신한 메시지를 송신
		try {
			BufferedReader reader
				= new BufferedReader( 
						new InputStreamReader( 
								client.getInputStream() ) ) ;
			name = reader.readLine();
			sendAll( name + " 님이 입장했습니다." );
			
			while( true ) {
				String send = reader.readLine();
				if( send == null ) break;
				//연결된 모든 클라이언트의 출력스트림에 메시지를 송신
				StringBuffer msg = new StringBuffer();
				msg.append( name ).append("\n").append(send)
					.append("\n---------------------");
				sendAll( msg.toString() );
//				for(PrintWriter writer : list ) {
//					writer.println( send );
//					writer.flush();
//				}
//				writer.println( send );
//				writer.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//클라이언트의 연결이 끊겨 소켓을 닫을때는 
			//출력스트림 목록에서 해당 클라이언트의 스트림을 삭제
			list.remove( writer );
			sendAll( name + " 님이 퇴장했습니다." );
			try{ client.close(); }catch (IOException e) { }
		}
	}
	
	void sendAll(String send) {
		for(PrintWriter writer : list ) {
			//모든 클라이언트에게 전송하되 자신에게는 전송되지 않게
			if( writer == this.writer ) continue;
			writer.println( send );
			writer.flush();
		}
	}
}
