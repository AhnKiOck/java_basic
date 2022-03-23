package object_io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ObjectOutputMain {
	public static void main(String[] args) {
		String filename = "src/object_io/object.dat";
		ObjectOutputStream out = null;
		
		try {
			out = new ObjectOutputStream( 
					new FileOutputStream(filename) );
			
			GregorianCalendar gc = new GregorianCalendar();//2021-11-9
			out.writeObject( gc );
			
			gc = new GregorianCalendar(2021, 11, 9); //2021-12-9
			out.writeObject( gc );

			out.writeObject( 
					new GregorianCalendar(2022, 0, 1) ); //2022-1-1
			
		}catch(IOException e) {
			System.out.println("쓰기 오류" + e.getMessage());
		}finally {
			try{ out.close(); }catch(Exception e) {}
		}
		System.out.println("쓰기 완료");
		
		
		ObjectInputStream in = null;
		
		try {
			in = new ObjectInputStream( 
					new FileInputStream(filename) );
			while(true) {
				GregorianCalendar gc 
					= (GregorianCalendar) in.readObject();
				 System.out.print( gc.get(Calendar.YEAR) + "년 ");
				 System.out.print( gc.get(Calendar.MONTH)+1 + "월 ");
				 System.out.println( gc.get(Calendar.DATE) + "일");
			}
		}catch(FileNotFoundException e) {
			System.out.println("해당 파일 없음");
		}catch(EOFException e) {
			System.out.println("읽기 완료");
		}catch(IOException e) {
			System.out.println("읽기 오류");
		}catch(ClassNotFoundException e) {
			System.out.println("해당 레퍼런스타입이 없음");
		}finally {
			try{ in.close(); }catch(Exception e) {}
		}
		
		
	}
}
