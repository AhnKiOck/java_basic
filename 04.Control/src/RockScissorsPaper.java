import java.util.Random;

public class RockScissorsPaper {
	public static void main(String[] args) {
		//가위 > 보 ,  바위 > 가위,   보 > 바위
		//가위 :0,  바위:1,   보:2
		System.out.println("가위바위보!");
		Random r = new Random();
		int hong = r.nextInt(3);  //홍길동
		int park = r.nextInt(3);  //박문수
		
		System.out.println(
			"홍길동 " + (hong==0 ? "가위" : (hong==1 ? "바위" : "보") ) );
		System.out.println(
			"박문수 " + (park==1 ? "바위" : (park==2 ? "보" : "가위") ) );
		
		//홍길동 승, 박문수 승, 무승부 로 출력되는 if문
		//가위0 > 보2 ,  바위1 > 가위0,   보2 > 바위1
		if( hong==park ) {
			System.out.println("무승부");
		}else if( hong==0 && park==2 ||  hong==1 && park==0 || hong==2 && park==1 ) {
			System.out.println("홍길동 승");
		}else {
			System.out.println("박문수 승");
		}
		
		/*
		if( hong==0 && park==2 ||  hong==1 && park==0 || hong==2 && park==1) {
			System.out.println("홍길동 승");
		}else if(park==0 && hong==2 || park==1 && hong==0 || park==2 && hong==1) {
			System.out.println("박문수 승");
		}else {
			System.out.println("무승부");
		}
		*/
		
/*		
		if( hong==0 && park==2) {
			System.out.println("홍길동 승");
		}else if( hong==1 && park==0) {
			System.out.println("홍길동 승");
		}else if( hong==2 && park==1) {
			System.out.println("홍길동 승");
			
		}else if( park==0 && hong==2) {
			System.out.println("박문수 승");
		}else if( park==1 && hong==0) {
			System.out.println("박문수 승");
		}else if( park==2 && hong==1) {
			System.out.println("박문수 승");
		}else if( park==1 && hong==1 ) {
			System.out.println("무승부");
			
//		}else if( park==0 && hong==0 ) {
//			System.out.println("무승부");
//		}else if( park==2 && hong==2 ) {
//			System.out.println("무승부");
//		}
		
		}else {
			System.out.println("무승부");
		}
		*/
		
		/*
		if( hong==0 ) {
			if(park==0) {
				System.out.println("무승부");
			}else if(park==1) {
				System.out.println("박문수 승");
			}else {
				System.out.println("홍길동 승");
			}
		}else if( hong==1 ) {
			if(park==0) {
				System.out.println("홍길동 승");
			}else if(park==1) {
				System.out.println("무승부");
			}else {
				System.out.println("박문수 승");
			}
		}else if( hong==2 ) {
			if(park==0) {
				System.out.println("박문수 승");
			}else if(park==1) {
				System.out.println("홍길동 승");
			}else {
				System.out.println("무승부");
			}
			
		}
		*/
		
		
	}
}
