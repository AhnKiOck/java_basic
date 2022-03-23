package byte_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteIOMain {
	public static void main(String[] args) {
		//직접코드실습
		//1. 키보드로 구구단 몇 단 인지 단 수를 입력받아
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 몇 단? ");
		int dan = sc.nextInt();
		// 3 *1 = 3 .... 3*9=27
		//by:   1  2    .... 9
		//index 0  1         8 
		byte data[] = new byte[9];
		for(int idx=0; idx<data.length; idx++ ) {
			data[idx] = (byte)(dan * (idx+1) );
		}
//		for(int by=1; by<10; by++) {
//			data[by-1] = (byte)(dan * by);
//		}
		
		//   입력받은 단의 결과값을 배열변수에 담는다. 예)입력단? 3 
		//2. 배열에 담긴 데이터를 3단.dat 파일에 쓰기작업을 한 후
		String filename = dan + "단.dat";
		
		//데이터 입출력 단위: 문자, 바이트
		//문자 입출력: Reader/Writer
		//바이트 입출력: InputStream /OutputStream
		//파일로 문자 입출력: FileReader / FileWriter
		//파일로 바이트 입출력: FileInputStream / FileOutputStream
		FileOutputStream out = null;
		try {
			out = new FileOutputStream( filename );
			out.write( data );
			
		}catch(IOException e) {
		}finally {
			try{ out.close(); } catch(Exception e) {}
		}
		System.out.println("Writing Finished");
		
		//   쓰기 완료가 되면
		//3. 3단.dat 파일의 내용을 읽어서 출력하시오.
		FileInputStream in = null;
		try {
			in = new FileInputStream( filename );
			/*
			while( true ) {
				int no = in.read(); //읽어온  byte 데이터가 리턴
				if( no==-1 ) break;
				System.out.print( no + " " );
			}
			*/
			byte value[] = new byte[5];
			while( true ) {
				int no = in.read(value); //읽어온 byte 데이터의 갯수가 리턴
				if( no==-1 ) break;
				for(int idx=0; idx<no; idx++ ) {
					System.out.println( value[idx] );
				}
			}
		
		}catch(FileNotFoundException e) {
		}catch(IOException e) {
		}finally {
			try{ in.close(); }catch(Exception e) {}
		}
		
	}
}
