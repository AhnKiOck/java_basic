//방명록
//글번호가 자동으로 부여되는 방명록 클래스
public class Board {
	//필드: 번호,제목,작성자,작성일자, 내용
	static int seqNo;
	int no;
	String title, writer, writeDate, content;
	
	//생성자
	/*
	Board(String writer){
		this.writer = writer;
	}
	Board(String writer, String title){
		this(writer);
		this.title = title;
	}
	Board(String writer, String title, String writeDate){
		this(writer, title);
		this.writeDate = writeDate;
	}
	*/
	Board(String writer, String title
					, String writeDate, String content){
//		++no; // no = no + 1;
//		this.no = ++seqNo;
		no = ++seqNo;
		this.writer = writer;
		this.title = title;
		this.writeDate = writeDate;
		this.content = content;
	}
}
