package etc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class StudentMain {
	public static void main(String[] args) {
		//직접코드실습
		//버퍼를 이용해 문자를 읽는 BufferedReader 클래스를 사용해
		String title[] = { "성명 : ", "성별 : ", "연락처 : ", "이메일 : "};
		BufferedReader reader = null;
		try {
			reader = new BufferedReader( 
					new FileReader("src/etc/student.txt") );
			while( true ) {
				//student.txt 파일에서 데이터를 한 줄씩 읽어온다
				String line = reader.readLine();
				if( line==null ) break;
				
				StringTokenizer token 
						= new StringTokenizer(line, ",");
				String data[] = new String[token.countTokens()];
				for(int idx=0; idx<data.length; idx++ ) {
					data[idx] = token.nextToken();
				}
				if( data[0].equals("조성빈") ) {
					for(int idx=0; idx<data.length; idx++) {
						System.out.println(
							title[idx] + data[idx] );
					}
				}
				
				/*
				//조성빈,남,010-2845-9040,whtjdqls@gmail.com
				String data[] = line.split(",");
				if( data[0].equals("조성빈") ) {
					//한 줄씩 읽어온 데이터 중에서 본인의 정보를 다음과 같이 출력하세요.
					//출력결과
					//성명 : 홍길동
					//성별 : 남
					//연락처 : 010-1234-5678
					//이메일 : hong@naver.com
					System.out.println("성명 : "+ data[0]);
					System.out.println("성별 : "+ data[1]);
					System.out.println("연락처 : "+ data[2]);
					System.out.println("이메일 : "+ data[3]);
				//data[0]:조성빈
				//data[1]:남
				//data[2]:010-2845-9040
				//data[3]:whtjdqls@gmail.com
				}
				*/
			}
			
			
		}catch(FileNotFoundException e) {
			System.out.println("해당 파일 없음");
		}catch(IOException e) {
			System.out.println("읽기 오류");
		}finally {
			try{ reader.close(); }catch(Exception e) {}
		}
		
		
		
		
		
	}
}
