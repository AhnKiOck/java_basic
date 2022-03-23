package data_io;

import java.io.*;

public class StringIOMain {
	public static void main(String[] args) {
		String filename = "string.txt";
		
		DataOutputStream out = null;
		
		try {
			out = new DataOutputStream( 
					new FileOutputStream(filename) );
			String sentence = 
				"수도권 사전청약 2차 공급지구의 평균 경쟁률이 10대 1을 기록했습니다.\r\n" + 
				"\r\n" + 
				"국토교통부는 경기 남양주 왕숙 2, 성남 신촌 등 수도권 사전청약 2차 공급지구에 대한 공공분양·신혼희망타운 접수 결과 총 1만 102가구 모집에 10만 1,528명이 신청했다고 오늘(8일) 밝혔습니다.\r\n" + 
				"\r\n" + 
				"공공분양은 15대 1(5,976가구 모집에 8만 9,614명 신청)의 경쟁률을 기록했고, 신혼희망타운은 2.9대 1(4,126가구 모집에 1만 1,914명 신청)로 마감됐습니다.\r\n" + 
				"\r\n" + 
				"공공분양은 남양주 왕숙2지구가 34.2대 1의 경쟁률을 보였고 특히 A3블록 전용 84㎡는 81.2대 1의 최고경쟁률을 나타냈습니다.\r\n" + 
				"\r\n" + 
				"수도권 관심 지역인 성남 신촌지구는 23.9대 1의 경쟁률을 나타냈습니다.\r\n" + 
				"\r\n" + 
				"2기 신도시인 인천 검단·파주 운정3지구는 각각 9.9대 1의 경쟁률을 기록했습니다.\r\n" + 
				"\r\n" + 
				"신혼희망타운 소규모(당해 100% 공급) 입지 중에서는 성남 낙생 전용 59㎡ 테라스형이 13.9대 1을 기록해 가장 높은 경쟁률을 나타냈습니다.\r\n" + 
				"\r\n" + 
				"국토부는 청약통장 적정 여부에 대한 확인을 거쳐 오는 25일 당첨자를 우선 발표하고, 소득·무주택 등의 기준에 맞는지를 추가로 심사한 뒤 최종 당첨자를 발표할 예정입니다.\r\n" + 
				"\r\n" + 
				"국토부는 오는 18일에는 3차 사전청약을 시작합니다. 하남 교산(1천56호), 과천 주암(1천535호), 시흥 하중(751호) 등에서 4,000여 가구의 입주자를 모집합니다.";
			
			for(int i=1; i<=10; i++) {
				sentence += sentence+ "\n-----------";
			}	
			out.writeUTF(sentence);
			
		}catch(IOException e) {
		}finally {
			try{ out.close(); }catch(Exception e) {}
		}
		System.out.println("쓰기 완료");
		
		
		DataInputStream in = null;
		try {
			in = new DataInputStream( 
					new FileInputStream(filename) );
			String data = in.readUTF();
			System.out.println( data );
			
		}catch(FileNotFoundException e) {
			System.out.println("해당 파일 없음");
		}catch(EOFException  e) {
			System.out.println("파일읽기 완료");
		}catch(UTFDataFormatException  e) {
			System.out.println("UTF로 인코딩 불가");
		}catch(IOException e) {
			System.out.println("읽기오류");
		}finally {
			try{ in.close(); }catch(Exception e) {}
		}
		
		
	}
}







