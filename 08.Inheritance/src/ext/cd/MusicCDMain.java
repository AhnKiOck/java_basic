package ext.cd;

public class MusicCDMain {
	public static void main(String[] args) {
		//음악CD 객체를 생성
		String iu[] = { "01.이 지금", "02.팔레트", "03.이런 엔딩" 
						, "04.사랑이 잘"};
		MusicCD iu4 =
		new MusicCD("IU4-1704", "아이유4집-Palette", "아이유", iu);
		//생성한 음악CD 정보출력 - 메소드 호출
		printMusicCD(iu4);
		
		//음악CD 객체를 생성
		String monkey_songs[] = {"01.가을밤에 든 생각", "02.한걸음"
				, "03.그밤 그밤", "04.늙은 개"};
		MusicCD monkey = 
		new MusicCD("MKM-2011", "잔나비 소곡집", "잔나비", monkey_songs);
		//생성한 음악CD 정보출력 - 메소드 호출
		printMusicCD(monkey);
		
	}
	//메소드를 선언
	static void printMusicCD(MusicCD cd) {
		System.out.println("-----------");
		System.out.println("관리번호: " + cd.registrationNo);
		System.out.println("제목: " + cd.title);
		System.out.println("노래: " + cd.artist);
//		for(int idx=0; idx<iu.length; idx++) {
//			System.out.println(iu[idx]);
//		}
		for( String song : cd.songName ) {
			System.out.println(song);
		}
		System.out.println("-----------");
	}
}
