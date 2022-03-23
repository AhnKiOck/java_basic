package m2m;
import java.net.*;
import java.io.*;

public class M2MReceiveThread  extends Thread{
	Socket client;
	M2MReceiveThread( Socket client ){
		this.client = client;
	}
	
	public void run() {
		//수신한 메시지를 콘솔에 출력한다
		BufferedReader reader = null;
		try {
			reader = new BufferedReader( 
						new InputStreamReader( 
								client.getInputStream() ) );
			while( true ) {
				String receive = reader.readLine();
				System.out.println( receive );
				if( receive.equals("bye") ) break;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
//			try { reader.close(); }catch(IOException e) {}
			try { client.close(); }catch(IOException e) {}
		}
		
	}
}
