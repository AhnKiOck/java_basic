package multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MultiSendThread extends Thread{
	Socket client;
	String name;
	MultiSendThread(Socket client, String name){
		this.client = client;
		this.name = name;
	}
	
	public void run() {
		//키보드로 입력한 문자열을 읽어서 송신한다
		BufferedReader reader
			= new BufferedReader( new InputStreamReader( System.in ) );
		
		try {
			PrintWriter writer 
				= new PrintWriter( client.getOutputStream() );
			//대화자명을 먼저 보낸다
			writer.println( name );
			writer.flush();
			
			while( true ) {
				String send = reader.readLine();
				if( send.equals("bye") ) break;
				writer.println( send );
				writer.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try{ client.close(); } catch (IOException e) {}
		}
		
		
		
		
		
		
		
		
	}
}
