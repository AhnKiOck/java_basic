package m2m;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class M2MSendThread extends Thread {
	Socket client;
	M2MSendThread(Socket client){
		this.client = client;
	}
	public void run() {
		//키보드로 입력한 문자열을 읽어들여 버퍼링한 후
		BufferedReader reader 
			= new BufferedReader( new InputStreamReader( System.in ) );

		PrintWriter writer = null;
		try {
			writer = new PrintWriter( client.getOutputStream() );
			while( true ) {
				String line = reader.readLine();
				writer.println( line );
				writer.flush();
				
				if( line.equals("bye") ) break;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
//			writer.close();
//			try { reader.close(); } catch (IOException e) {}
			try { client.close(); } catch (IOException e) {}
		}
		
	}
}



