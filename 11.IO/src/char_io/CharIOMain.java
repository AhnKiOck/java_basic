package char_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharIOMain {
	public static void main(String[] args) {
		System.out.println("문장을 한 줄 입력하세요");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		sc.close();
		
		char data[] = new char[line.length()];
		//문자를 한 개씩 배열변수에 담는다
		for( int idx=0; idx<line.length(); idx++ ) {
			data[idx] = line.charAt(idx);
		}
		
		String filename = "chario.txt";
		//문자 쓰기 
		FileWriter writer = null;
		try {
			writer = new FileWriter( filename );
			writer.write( data ); //배열 데이터 한번에 쓰기
		}catch(IOException e) {
			System.out.println("쓰기 오류:"+ e.getMessage());
		}finally {
			try {
				writer.close();
			}catch(Exception e) {}
		}
		System.out.println("쓰기 완료");
		
		
		FileReader reader = null;
		try{
			reader = new FileReader( filename );
			//1. 한 문자씩 읽기 
			/*
			while( true ) {
				int ch = reader.read();//읽어온 문자가 리턴됨
				if( ch==-1 ) break;
				System.out.print( (char)ch );
			}
			*/
			/*
			int ch;
			while( (ch = reader.read()) != -1 ) {
				System.out.print( (char)ch );
			}
			*/
			while( true ) {
				char ch[] = new char[5];
				int no = reader.read( ch ); //읽어온 데이터갯수 리턴
				if( no==-1 ) break;
				String str = String.valueOf( ch ).trim();
				System.out.print( str );
			}
			
			
		}catch(FileNotFoundException e) {
			System.out.println("해당 파일 없음"+ e.getMessage());
		}catch(IOException e) {
			System.out.println("읽기 오류" + e.getMessage());
		}finally {
			try {
				reader.close();
			}catch(Exception e) {}
		}
		
		
		
		
	}
}
