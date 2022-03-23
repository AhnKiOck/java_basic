package multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class MultiReceiveThread extends Thread{
	Socket client;
	MultiReceiveThread( Socket client ){
		this.client = client;
	}
	
	public void run() {
		try {
			BufferedReader reader
				= new BufferedReader( 
						new InputStreamReader( 
								client.getInputStream() ) );
			while( true ) {
				String receive = reader.readLine();
				if( receive==null ) break;
				System.out.println( receive );
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try { client.close(); } catch (IOException e) { }
		}
		
	}
}
