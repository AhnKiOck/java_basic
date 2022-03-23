
public class BoardMain {
	public static void main(String[] args) {
		System.out.println("번호    제목     작성자   작성일자            내용");
		
		Board hong 
			= new Board( "홍길동", "하~이", "2021/10/25", "안녕~");
		
		Board jeon 
			= new Board( "전우치", "방가", "2021/10/26", "즐거운 하루 되삼~");

		Board park 
			= new Board( "박문수", "헬로우", "2021/10/26", "방가방가");

		Board board1 
		= new Board( "홍길동", "하~이", "2021/10/25", "안녕~");
	
		Board board2
			= new Board( "전우치", "방가", "2021/10/26", "즐거운 하루 되삼~");
	
		Board board3 
			= new Board( "박문수", "헬로우", "2021/10/26", "방가방가");

		//여러 개의 주소값을 담을 배열변수 선언한다.
//		int no[] = new int[10];
//		no[0] = 1;
//		no[1] = 2;
		Board list[] = new Board[10];
		list[0] = hong;
		list[1] = jeon;
		list[2] = park;
		list[3] = board1;
		list[4] = board2;
		list[5] = board3;
		//방명록 글 조회
		// 0 ~ 9 : 0 ~ 5까지 주소가 담겨있다
		printBoard(list);
		
		Board board4
		= new Board( "박문수", "헬로우", "2021/10/26", "방가방가");
		list[6] = board4;
		printBoard(list);
		
//		printBoard(hong);
//		printBoard(jeon);
//		printBoard(park);
//		printBoard(board1);
//		printBoard(board2);
//		printBoard(board3);
		
		
		//번호    제목     작성자   작성일자            내용
		//1    하~이     홍길동   2021/10/25    안녕~
		//2	   방가	  전우치   2021/10/26    즐거운 하루 되삼~
		//3	  Hello  박문수   2021/10/26    방가방가
	}
	
	
	//방명록 글 조회처리
	
	static void printBoard(Board list[]) {
		/*
		String no[] = {"1","2","3","4","5", null, null, null, null};
		for( int idx=0; idx<10; idx++ ) {
			if( no[idx]==null ) continue;
			System.out.println( no[idx] );
		}
		for(String value : no) {
			if( value == null ) continue;
			System.out.println( value );
		}
		*/
		/*
		for(int idx=0; idx<list.length; idx++ ) {
			if( list[idx] == null ) continue;
			printBoard( list[idx] );
//			if( list[idx] != null ) {
//				printBoard( list[idx] );
//			}
		}
		*/
		//위 반복문을 향상된  for문으로 변경한다.
		for( Board board : list ) {
			if( board==null ) continue;
			printBoard( board );
		}
	}
	
	static void printBoard(Board board) {
		System.out.printf( "%02d. ",  board.no );
		System.out.printf( "%-10s ", board.title );
		System.out.printf( "%-5s ", board.writer );
		System.out.printf( "%s ", board.writeDate);
		System.out.println( board.content );
	}
	
}
