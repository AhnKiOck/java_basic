package data_io;

import java.io.*;

public class DoubleIOMain {
	public static void main(String[] args) {
		//1. double 타입의 데이터 10개를 배열로 선언한다.
		double data[] = { 10.1, 20.2, 30.3, 40.4, 50.5
						, 60.6, 70.7, 80.8, 90.9, 100.0 };
		
		//2. 배열변수의 데이터를 double.dat 파일로 쓰기 작업을 한다.
		String filename = "double.dat";
		DataOutputStream out = null;
		
		try {
			out = new DataOutputStream(
					new FileOutputStream( filename ) );
			for( double value : data ) {
				out.writeDouble(value); 
			}
			
		}catch(IOException e) {
		}finally {
			try {
				out.close();
			}catch(Exception e) {}
		}
		System.out.println("쓰기 완료");
		//3. 쓰기작업을 완료한 후
		//   double.dat 파일의 내용을 읽어서 출력하시오.
		
		DataInputStream in = null;
		try {
			in = new DataInputStream( new FileInputStream(filename) );
			while( true ) {
				double value = in.readDouble();
				System.out.println( value );
			}
			
		}catch(FileNotFoundException e) {
		}catch(EOFException e) {
			System.out.println("읽기 완료");
		}catch(IOException e) {
		}finally {
			try{ in.close(); }catch(Exception e) {}
		}
		
		
	}
}
