package ext.cd;

public class MusicCD extends CD{
//	String registrationNo;
//	String title;
//	
//	CD(String registrationNo, String title){
//		this.registrationNo = registrationNo;
//		this.title = title;
//	}
	
//	아티스트
//	곡명[]
	String artist;
	String songName[];
	
//	생성자 : 4개의 필드를 초기화한다
	MusicCD(String registrationNo, String title
					, String artist, String songName[]){
		super(registrationNo, title);
		this.artist = artist;
		this.songName = songName;
	}
}
