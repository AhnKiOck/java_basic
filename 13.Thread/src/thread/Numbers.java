package thread;

public class Numbers {
	//private < default < protected < public
	//protected : 같은패키지 내에서는 접근 가능
	//            다른패키지라면 상속받는경우 접근 가능
	//지정 범위내의 숫자를 출력하는 클래스
	protected void list(int begin, int end) {
		for( int no=begin; no<=end; no++ ) {
			System.out.println( no );
		}
	}
}
